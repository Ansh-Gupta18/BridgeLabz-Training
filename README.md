### Week 5 : Java8 features

---

### Week 5 Day 1 – Lambda Expressions & Method References in Java

- Focused on understanding functional-style programming in Java using lambda expressions and method references. Practiced writing concise, readable code by replacing anonymous classes with lambdas and explored how Java infers types using target typing.

Covered key concepts including:
- Lambda expression syntax (no parameter, single parameter, multiple parameters)
- Functional interfaces and target typing
- Type inference in lambda expressions
- Closures and effectively final variables
- Difference between lambda expressions and anonymous inner classes
- Using lambdas with Streams, Predicate, Comparator, and Runnable
  
🔗 Code Link: [Day - 1 - Lambda Expressions & Method References in Java](https://github.com/Ansh-Gupta18/BridgeLabz-Training/tree/java8-practice/java8-practice/gcr-code-base/java8concepts/src/com/lambdaexpression)

---

### Week 5 day 2 – Java Stream API & Parallel Streams

- Practiced functional-style data processing using the Java Stream API.

Covered:
Stream pipeline structure (source → intermediate → terminal)
Intermediate operations: filter, map, sorted, distinct
Terminal operations: collect, forEach, count
Lazy evaluation and stateless vs stateful operations
Ordered vs unordered streams

Parallel Streams:
parallelStream() vs sequential stream
ForkJoinPool and multi-threaded execution
Order handling with forEachOrdered()
Performance considerations and best practices

Also practiced forEach() with lambdas and method references.

🔗 Code Link:[day -2 - Java Stream API & Parallel Streams](https://github.com/Ansh-Gupta18/BridgeLabz-Training/tree/java8-practice/java8-practice/gcr-code-base/java8concepts/src/com/streamAPI)


---

### Week 5 day 3 – Collectors in Java Stream API

Explored the role and capabilities of Collectors used with the Stream.collect() method for data aggregation and transformation.


Covered:

Converting streams to collections using toList(), toSet(), toMap()
Transforming and aggregating stream data
Grouping elements using groupingBy()
Partitioning data using partitioningBy()
Joining stream elements into strings with joining()
Generating statistics using summarizingInt()

🔗 Code Link: [ day - 3 – Collectors in Java Stream API](https://github.com/Ansh-Gupta18/BridgeLabz-Training/tree/java8-practice/java8-practice/gcr-code-base/java8concepts/src/com/collectors)


---

### Week 5 Day 4 – Functional Interfaces in Java

-  Topics Covered
Concept and importance of Functional Interfaces
@FunctionalInterface annotation and compile-time safety
Built-in interfaces from java.util.function
Creating custom functional interfaces
Lambda expressions vs anonymous classes
Functional interface composition (andThen, compose, and, or, negate)
Method references for cleaner implementations
Integrating functional interfaces with Streams API


🔗 CodeLink: [Day 02 – Functional Interfaces](https://github.com/Ansh-Gupta18/BridgeLabz-Training/tree/java8-practice/java8-practice/gcr-code-base/java8concepts/src/com/functionalinterface)
