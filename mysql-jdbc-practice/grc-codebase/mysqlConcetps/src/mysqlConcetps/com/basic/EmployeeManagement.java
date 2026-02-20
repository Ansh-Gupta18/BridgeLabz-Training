-- Creating an Employee table'
CREATE DATABASE Employee1;
CREATE TABLE Employee2 (
    id INT ,
    name VARCHAR(50),
    age INT,
    salary INT
);


-- Inserting data in employee table
insert into Employee2 (id,name,age,salary)
values(1,"Ansh Gupta",22,50000),
(2,"Md Sagir",22,50000),
(3,"Karan Nagesh", 21,55000),
(4,"Rahul",34,67000),
(5,"pranshi",43,70000);


-- Printing all the records from employee table
Select * from Employee2;


-- Updating the salary of employee by id
update Employee
set salary = 100000
where id = 1;


-- Deleting the record of employee by id
delete from Employee
where id = 3;

-- Searching employee by  name
select * from Employee
Where name = "Ansh Gupta";