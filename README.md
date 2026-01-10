### 📅 Week 3: Introduction of Data Structures

---

### Week 3 Day 01 – Data Structures Overview & Linked Lists


- 📘 Topics Covered
- Understood the fundamentals of Data Structures:
  - Learned how data structures organize and store data efficiently.
  - Explored their role in optimizing operations like searching, sorting, and updating.
  - Studied common examples such as Arrays, Stacks, Queues, Linked Lists, Trees, and Graphs.
  - Identified Linked Lists as a key structure for dynamic memory management.
- Explored Key Features of Data Structures in Java:
- Predefined and Custom Implementations:
  - Used Java Collections Framework (Lists, Maps, Sets).
  - Designed custom data structures using classes and objects.
- Dynamic Memory Allocation:
  - Learned how structures like Lists and Maps grow and shrink dynamically.
- Generics Support:
  - Ensured type safety and reduced runtime errors.
- Thread-Safe Options:
  - Studied concurrent collections such as ConcurrentHashMap and CopyOnWriteArrayList.
- Studied Types of Data Structures in Java:
- Linear Data Structures:
  - Array (fixed-size, contiguous memory).
  - Linked List (dynamic node-based structure).
  - Stack (LIFO).
  - Queue (FIFO).
    
- Hierarchical Data Structures:
  - Tree, Binary Tree, Binary Search Tree (BST).
  - Heap for priority-based operations.
    
- Graph Data Structures:
  - Directed and undirected graphs representing relationships.
- Hash-Based Data Structures

- 🔗 Code Link:[Day 01 – Scenario-Based OOP Programs (Encapsulation & Polymorphism)](https://github.com/Ansh-Gupta18/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-code-base/JavaDsaConcepts/src/com/linkedlist)

--- 
###  Week 3 Day 02 – Stack, Queue & Hashing Fundamentals


- 📘 Topics Covered
- Studied Stack Data Structure (LIFO):
  - Understood core operations: push, pop, peek, isEmpty.
- Explored real-world use cases:
  - Function call stack in recursion.
  - Undo/Redo operations.
  - Expression evaluation and parenthesis matching.
- Implemented Balanced Parentheses Checker using Stack:
  - Validated proper nesting of (), {}, and [].
  - Applied stack-based traversal and matching logic.
- Analyzed:
  - Time Complexity: O(n)
  - Space Complexity: O(n)
  - Learned Queue Data Structure (FIFO):

- Understood key operations: offer, poll, peek, isEmpty.
- Explored Java Queue implementations:
  - LinkedList
  - PriorityQueue
  - ArrayDeque
  - Implemented Ticket Counter Management System:
  - Enqueued customers as they arrived.
  - Dequeued customers in order of service.
- Studied queue usage in:
  - Task scheduling.
  - BFS traversal.
  - Request handling systems.
- Explored HashMap & Hashing Concepts:
  -  Understood key-value pair storage using HashMap.
  - Learned core methods: put, get, remove, containsKey.
  - Implemented word frequency counting using HashMap.
- Studied internal working of HashMap:
  - Hashing and bucket indexing.
  - Collision handling using separate chaining.
  - Load factor (default: 0.75) and resizing.
- Compared:
  - HashMap vs LinkedHashMap
  - HashMap vs ConcurrentHashMap
  - Learned Hashing Functions in Java:
  - Understood hashCode() and its role in hash-based collections.
  - Studied rules for overriding hashCode() and equals().
  - Implemented custom hashCode() for user-defined classes.
  - Learned best practices to minimize collisions and ensure consistency.
    
- Focused on:
 - Choosing the right data structure based on problem requirements.
  - Understanding internal mechanics for interview readiness.
  - Writing clean, efficient, and safe data-structure-based code.
- 🔗 Code Link:[ Day 02 – Stack, Queue ](https://github.com/Ansh-Gupta18/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-code-base/JavaDsaConcepts/src/com/stackandqueue)
- 🔗 Code Link:[ Day 02 – HashMap Implementations ](https://github.com/Ansh-Gupta18/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-code-base/JavaDsaConcepts/src/com/hashmap)

---
### 📅 Week 3 Day 03 – Sorting Algorithms (Core & Advanced)


- 📘 Topics Covered
- Studied the importance of Sorting Algorithms:
  - Organizing data efficiently for faster searching, processing, and analysis.
  - Compared algorithms based on time complexity, space usage, and stability.
- 🔹 Core Sorting Algorithms
 - Bubble Sort
- Concept: Repeatedly swaps adjacent elements; largest element bubbles to the end.
 - Time Complexity:
 - Best: O(n)
 - Average/Worst: O(n²)
 - Space Complexity: O(1)
 - Stable: Yes
 - Use Case: Small or nearly sorted datasets.
 - Insertion Sort

- Concept: Builds the sorted array incrementally by inserting elements in correct positions.
  - Time Complexity:
  - Best: O(n)
  - Average/Worst: O(n²)
  - Space Complexity: O(1)
  - Stable: Yes
  - Use Case: Small datasets, adaptive sorting, nearly sorted data.
  - Merge Sort (Divide & Conquer)

- Concept: Recursively divides the array and merges sorted halves.
  - Time Complexity: O(n log n) in all cases.
  - Space Complexity: O(n)
  - Stable: Yes
  - Use Case: Large datasets, linked lists, when stability is required.
  - Quick Sort (Divide & Conquer)

- Concept: Partition-based sorting using a pivot element.
  - Time Complexity:
  - Best/Average: O(n log n)
  - Worst: O(n²) (poor pivot selection)
  - Space Complexity: O(log n)
  - Stable: No
  - Use Case: High-performance systems, large datasets with randomized pivot.
- 🔗 Code Link:[Day 03 – Sorting Algorithms Implementations](https://github.com/Ansh-Gupta18/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-code-base/JavaDsaConcepts/src/com/sorting)

---

### Week 3 day 4 This document covers essential Java classes for string handling, file reading, and basic searching algorithms.
- These are fundamental for efficient Java programming and data processing.
- Topics Covered
  - StringBuilder

- Mutable sequence of characters; allows modification without creating a new object.
- Efficient for concatenating strings in loops or frequent modifications.
  - StringBuffer

- Similar to StringBuilder but thread-safe (synchronized).
- Ideal for multithreaded environments where multiple threads modify the same string.
  - FileReader

- Reads character files; suitable for reading text data.
- Works with BufferedReader for efficient reading of large files line by line.
  - InputStreamReader

- Bridges byte streams to character streams.
- Commonly used with System.in to read input from the console.
  - Linear Search

- Sequentially checks each element in a list until the target is found.
- Simple but inefficient for large datasets (O(n) time complexity).
  - Binary Search

- Efficient searching algorithm for sorted arrays.
- Divides the search space in half repeatedly (O(log n) time complexity).
- 🔗 Code Link: [day 4 This document covers essential Java classes for string handling, file reading, and basic searching algorithms](https://github.com/Ansh-Gupta18/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-code-base/JavaDsaConcepts/src/com/linearandbinarysearch)

--- 

### Week 3 day 5 scenario-based Java programming questions

- 📅 (Date: 09-Jan-2026) Solved 3 scenario-based Java programming questions Focused on applying Object-Oriented Programming (OOP) concepts to real-world problems Strengthened logical thinking and problem decomposition skills
- 🔗 Code Link : [Day 5   scenario-based Java programming questions](https://github.com/Ansh-Gupta18/BridgeLabz-Training/tree/java-oops-practice/java-oops-practice/scenario-based-codebase/oopsScenarioBased/src/com/oopsScenarioBased)

---

### Week 3 day 6 – Runtime Analysis & Big-O Notation and Scenario-Based Practice
- 📅 (Date: 07-Jan-2026) Learned Runtime Analysis to evaluate algorithm efficiency Studied Big-O Notation to measure time and space complexity Analyzed common algorithms with best, average, and worst-case scenarios Practiced identifying complexity using real Java code examples Focused on writing optimized and scalable Java programs Solved 3 scenario-based Java programming questions Focused on applying Object-Oriented Programming (OOP) concepts to real-world problems Strengthened logical thinking and problem decomposition skills
- 🔗 Code Link : [Runtime Analysis & Big-O Notation and Scenario-Based Practice](https://github.com/Ansh-Gupta18/BridgeLabz-Training/tree/dsa-practice/dsa-practice/gcr-code-base/JavaDsaConcepts/src/com/algorithmanalysis)
