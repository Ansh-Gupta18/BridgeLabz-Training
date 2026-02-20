package mysqlConcetps.com.basic;

-- LIBRARY MANAGEMENT SYSTEM (SQL)
-- Advanced Features with Single-Line Comments

-- ---------- DATABASE ----------
CREATE DATABASE library_db;
USE library_db;

-- ---------- BOOK INVENTORY TABLE ----------
CREATE TABLE books (
    book_id INT PRIMARY KEY AUTO_INCREMENT,     
    title VARCHAR(200),                         
    author VARCHAR(100),                          
    category VARCHAR(50),                         
    publisher VARCHAR(100),                       
    total_copies INT,                             
    available_copies INT                          
);

-- ---------- STUDENT TABLE ----------
CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,  
    name VARCHAR(100),                          
    department VARCHAR(50),                    
    email VARCHAR(100)                            
);

-- ---------- BORROW RECORDS ----------
CREATE TABLE borrow_records (
    borrow_id INT PRIMARY KEY AUTO_INCREMENT,    
    student_id INT,                              
    book_id INT,                                 
    borrow_date DATE,                           
    due_date DATE,                              
    return_date DATE,                           
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (book_id) REFERENCES books(book_id)
);

-- ---------- FINE TABLE ----------
CREATE TABLE fines (
    fine_id INT PRIMARY KEY AUTO_INCREMENT,      
    borrow_id INT,                               
    fine_amount DECIMAL(6,2),                    
    paid BOOLEAN DEFAULT FALSE,                  
    FOREIGN KEY (borrow_id) REFERENCES borrow_records(borrow_id)
);

-- ---------- INSERT SAMPLE DATA ----------
INSERT INTO books (title, author, category, publisher, total_copies, available_copies)
VALUES ('DBMS', 'Korth', 'Computer Science', 'McGraw Hill', 10, 10);

INSERT INTO students (name, department, email)
VALUES ('Ansh', 'CSE', 'ansh@gmail.com');

-- ---------- BORROW BOOK (TRANSACTION) ----------
START TRANSACTION;                                -- Start transaction

INSERT INTO borrow_records (student_id, book_id, borrow_date, due_date)
VALUES (1, 1, CURDATE(), DATE_ADD(CURDATE(), INTERVAL 14 DAY));  -- Borrow entry

UPDATE books
SET available_copies = available_copies - 1
WHERE book_id = 1 AND available_copies > 0;      -- Reduce available copies

COMMIT;                                           -- Commit transaction

-- ---------- RETURN BOOK (TRANSACTION) ----------
START TRANSACTION;                                -- Start transaction

UPDATE borrow_records
SET return_date = CURDATE()
WHERE borrow_id = 1;                              -- Update return date

UPDATE books
SET available_copies = available_copies + 1
WHERE book_id = 1;                                -- Increase available copies

COMMIT;                                           -- Commit transaction

-- ---------- FINE CALCULATION ----------
-- Rule: ₹5 per late day

SELECT 
    br.borrow_id,                                
    s.name,                                       
    b.title,                                     
    DATEDIFF(CURDATE(), br.due_date) AS late_days,
    CASE
        WHEN CURDATE() > br.due_date
        THEN DATEDIFF(CURDATE(), br.due_date) * 5
        ELSE 0
    END AS fine_amount
FROM borrow_records br
JOIN students s ON br.student_id = s.student_id
JOIN books b ON br.book_id = b.book_id
WHERE br.return_date IS NULL;                     -- Not returned books

-- ---------- INSERT FINE ----------
INSERT INTO fines (borrow_id, fine_amount)
SELECT borrow_id, DATEDIFF(CURDATE(), due_date) * 5
FROM borrow_records
WHERE CURDATE() > due_date
AND return_date IS NULL;                          -- Late returns only

-- ---------- SEARCH QUERIES ----------
SELECT * FROM books;                              -- View all books

SELECT * FROM books
WHERE available_copies > 0;                       -- Available books only

SELECT * FROM books
WHERE title LIKE '%db%'                           -- Search by title
AND author LIKE '%korth%';                        -- Search by author

SELECT * FROM books
WHERE category = 'Computer Science'
AND available_copies > 0;                         -- Filter by category + availability

-- ---------- STUDENT BORROW HISTORY ----------
SELECT s.name, b.title, br.borrow_date, br.due_date
FROM borrow_records br
JOIN students s ON br.student_id = s.student_id
JOIN books b ON br.book_id = b.book_id
WHERE s.student_id = 1;                           -- Borrow history of one student

-- ---------- PENDING FINES REPORT ----------
SELECT s.name, f.fine_amount
FROM fines f
JOIN borrow_records br ON f.borrow_id = br.borrow_id
JOIN students s ON br.student_id = s.student_id
WHERE f.paid = FALSE;                             -- Unpaid fines

-- ---------- MOST BORROWED BOOKS ----------
SELECT b.title, COUNT(*) AS borrow_count
FROM borrow_records br
JOIN books b ON br.book_id = b.book_id
GROUP BY b.title
ORDER BY borrow_count DESC;                       -- Popular books
