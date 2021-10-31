# Java Technical Questionnaire

These are the theoretical questions that will most likely be asked during the project defenses and during the technical part of your job interviews. The idea of these questions is for them to act like a learning guide and provide the student an accurate way of measuring their understanding of the key concepts behind each course and module. As you can see, they are separated into two groups.

**1.   The first group are questions that we expect you know the answer of in great details and could answer and explain additional questions regarding them. These questions are related to the material we have covered during our onsite classes.**

**2.   The second set consists of questions that we expect you to know about and can give a basic answer, without diving deep into the subject. These questions are usually based on additional resources we provide inside the Learning Management System. You should research those topics in your spare time.**

## Core Programming

#### Questions that you must be able to answer in detail

- What is Java?
 
  --- **Java** is high level,class based, objected-oriented programming language with general purpose.write once,run anywhere(WORA)),meaning  that  compiled Jаva code can run on all platform that suport Java without the need for recompillation.Java was originally developed by Jams Gosling at Sun Microsystems.
 
  --- **Джава** е на високо ниво,клас-базиран,обектно-ориентиран език за програмиране с общо преднзначение(напиши веднъж,изпълни навсякъде),което означава,че компилираният Джава код може да работти на всякакви платфорни,които поддържат Джава,без нужда от прекомпилиране.Първоначално Джава е разработена от Джеймс Гослинг от Сън Миркосистем.
-
 **What is JDK, JRE and JVM?**
 
 ---There are 3 core technology packeges used in Java programming: JDK, JRE, JVM.

   1.**Java Mirtual Machine**  loads,verifies and executes Java programming code to  bytecode.It`s known as interpretor or core because executes Java programing.JVM is specifically responsible for converting bytecode to machine-specific code and performs many functions like memory management and security.JVM can run pragrams written in other programming languages that have been translated to Java bytecode.
    
  **JVM components:** \
  1.Class Loader Subsystem is resposible for loading,linking and initializing a Java class file\
  2.Runtime Data Areas contain method areas,PC registers,stack areas and threads.\
  3.Execution Engine contains an interpreter,compiler and garbage collection area.

   **The Java Development Kit (JDK)** е среда за разработка на софтуер, използвана за разработване на Java приложения.Tой включва Java Runtime Environment (JRE), интерпретатор/товарач (Java), компилатор (javac), архиватор (jar), генератор на документация (Javadoc) и други инструменти, необходими при разработването на Java  


  **JRE** Средата за изпълнение на Java или JRE е софтуерен слой, който работи върху софтуера на операционната система на компютъра и предоставя библиотеките на класовете и други ресурси, от които се нуждае конкретна Java програма.
-     
- Why is `import` in Java?

- What is Generic type in Java? Can you give an example?
- Is data passed by *Reference* or by *Value* in Java?
- **What is the difference between `==` and `equals()`?**
- **What is the difference between `static` and `final` variables in Java?**
- Describe the meaning of the `final` keyword when applied to a *class*, *method*, *field* or a *local variable*.
- **What are the differences between `local`, `static` and `instance` variables?**
- **What is the difference between primitive and reference type?**
- What is autoboxing and unboxing?
- What is the difference between `String`, `StringBuilder` and `StringBuffer` in Java?
- What is Java String Pool?
String Pool is a storage area in Java heap
- How many ways are there to create a `String` Object in Java?
- Is `String` a *Primitive* or a *Derived* Type?
- What are the benefits of strings Being *Immutable*?
- What does immutable mean? How can you design it?
- **When comparing strings, what’s the difference between `str1 == str2` and `str1.еquals(str2)`?**
- How can we convert `String` to `Integer` and `Integer` to `String` in Java?
- What is `String.format()` used for?
- How can we convert a String to a Character array?
- What is try-with–resources block in Java?
- How does Java allocate stack and heap memory?
- What is bytecode in Java?
- What is method signature in Java?
- What is return type of methods in Java?
- What are varargs?
- What is lambda expression? Give some examples of lambda expressions.
- What is a functional interface?
- When to use comparable vs comparator vs comparison with lambdas in Java?
- What are we using lambdas and method reference for?
- What is the difference between checked and unchecked exceptions?
- What are multiple catch blocks in Java?
- Is `finally` block always executed?
- How is the compiler working?
- If you have class with two methods that have the same name, but different signatures, will the class compile?
- What is the difference between Error & Exception? Why is it preferable not to catch and work with Errors?
- What is the difference between Heap & Stack memory?
- What is File? How can you read a file?
- What is Stream API in Java?
- Explain stream operations with an example?
- How many types of Stream operations are there?

#### Questions you should have general knowledge of and should answer in a few words

- Is Java code managed or unmanaged code?
- What is the role of the JVM?
- What is Ahead-of-time (AOT) compilation and bytecode in Java?
- What are functional interfaces in Java?
- How can we create our custom pool of objects, like the String Pool?
- How does garbage collector work?
- What do you know about threads?
- Can you use streams with primitives?

****

## Object Orientated Programming

#### Questions that you must be able to answer in detail
**OOP** -модел на програмиране ,който организирва софтуерния дизаин около данни и обекти ,а не функции и логика,които прави големи и сложни системи бързо,като се разделя на малки и прости компоненти и така става по лесно за подръжка
- **What are 4 OOP Principles?**\
-Polymorrphism,Encapsulation,Inheritence,Abstraction\
-Полиморфизъм,Капсулиране,Наследяване,Абстракция
- **What is a class?**\
-Templates used to create objects and to define objects data types and methods.\
-Шаблон,който се използва за създаване на обекти и тяхното дефиниране на типове данни и методи на обекти.\

- **What is an object?**
- **Обекта** е инстанция на класа и е реален обект от света.Тои пазпределя място в паметта когато е създадех и се използва думата **new** за създаване на нов обект

 - What are the access modifiers in Java?
 - **private** , **protected** , **public** ,**default** 

- Explain *static initializers* in Java?
- **Explain *overloading* in Java?**
- What is data *encapsulation*?
- Explain *inheritance*? Is there *multiple inheritance* in Java?
- **What is *polymorphism* in Java?**
- What is *abstraction* in Java?
- **Explain *overriding* in Java?**
- **What is `abstract class` and `interface`? What is the difference between them? What do they have in common?**
- How do we achieve strong cohesion and loose coupling?
- What is *composition*?
- What are `final` classes in Java?
- **What do we use `new`, `this` and `super` for?**
- Can we change the access modifier of a method, while overriding it?
- How many constructors one class can have? What are the differences between them?
- When do we want to make a constructor `private`?
- Can a method, inherited from a interface, have a `private` access modifier?

#### Questions you should have general knowledge of and should answer in a few words

- What are annotations in Java?
- What are covariant return types in Java? Why we can use them with overriding?

****

## Data Structures and Algorithms

#### Questions that you must be able to answer in detail

- What are data structures?
- What is a linear data structure?
- What operations can we perform on data structures?
- Explain what is a linked-list?
- Explain what is a stack?
- Explain what are queues?
- **What is the difference between `Array`, `ArrayList` and `LinkedList` in Java?**
- **`ArrayList` vs `LinkedList` which is better for different operations?**
- **What is the difference between `HashMap` and `TreeMap`?**
- **What is the implementation of the `HashMap`? How does it handle collisions?**
- What is hashing?
- Describe how hash map work. Provide some pseudo code.
- What is algorithm?
- What is algorithm analysis?
- Why do we need to do algorithm analysis?
- What are asymptotic notations?
- What is a recursive function?
- **What is linear searching?**
- **What is binary searching?**
- **What is a tree?**
- What is post-order, pre-order, in-order traversal?
- **What is a binary tree?**
- **What is a binary search tree?**
- Describe how heaps work. Write some pseudo code
- Think about and evaluate complexity of different search and sort algorithms. Explain when using array is better in some cases.

#### Questions you should have general knowledge of and should answer in a few words

- What is a graph? Provide practical examples of graphs.
- How does depth-first traversal work?
- Provide a practical example of DFS. Explain it.
- How does breadth-first traversal work?
- Provide a practical example of BFS. Explain it.
- What is interpolation search?
- How do you choose between `HashSet` vs. `TreeSet`?
- **Explain divide and conquer algorithms?**
- What is dynamic programming?
- What is Red/Black tree?

****

## High-Quality Code

#### Questions that you must be able to answer in detail

- **What is the purpose of unit tests?**
- What other types of testing do you know?
- **What makes a unit test high-quality?**
- **Give some clean code practices examples?**
- **What is SOLID?**
- Give a real-life example of Open for extension / closed for modification?
**- Explain Dependency Inversion principle and give example.**
- What is Dependency Injection? How does it work? Give a real-life example of Dependency Injection?

In software engineering, dependency injection is a technique in which an object receives other objects that it depends on, called dependencies. Typically, the receiving object is called a client and the passed-in ('injected') object is called a service.

#### Questions you should have general knowledge of and should answer in a few words

- How do dependency injection containers work under the hood?
- What is Singleton pattern and how to design it in your class structure?
- What is lazy and eager initialization?

****

## Spring and web

#### Questions that you must be able to answer in detail

- What is **Spring**?
  
  --- **Spring Framework** e framework(рамка,по голямо от библиотека,изградено върху някакъв език ,което ни позволя чрез набор от правила ,които трябва да спазваме да изграждаме приложения),с отворен код,които ни предоставя много функции,които ни улеснява да изграждаме приложение от POJO,като трябва да спазваме определени правила,определени от framework.
  


- What are some of the core modules in Spring?
  1. **Core Container**
  
  a.**Core** В core се намира логиката,която се грижи за създаването и достъпването на Beans.Имаме Beanfactory за създаването  им или чрез config files.Грижи се за сетването на полета и управление на Dependancies.  
  
  b.**Beans** Класове ,който енкапсулират дуги обекти  в един обект Bean,те могат да бъдат серилизарани имат конструктор без параментри и дават дотъп до полета чрез getters and setters.Целата е да се създадат преизползваеми софтуерни компуненти за Java


- What is JDBC and Hibernate and what is the difference?

--- **Hibernate** performs an object-relation mapping framework and its data gase independentt,same code will work for all data bases ,while JDBC is simply a database connectivity API and query must be data base specific.

--- **Hibernate**  изпълнява рамка за картографиране на обекти и нейнита база данни независимо,един и същ код ще работи за всички бази данни,докато JDBS е просто API за свързване на бази данни и заявките трябва да е специфична за пазата данни.
- What is transaction and why do we use it?

  ---Пренос на информация от или към Базата Данни.Група от логически опрации или само една операция.Или всички минават или всички се считат за   невалидни.Update or Delete имат Rollback(cancel operation) and Commit(apply oeration).

  Transfer of information from or to Databases.The group of logical operations or only one. Or all operations pass or all are considered unsuccessful.Update and Delete have Rollback and Commit.
- **What is HTTP?**
  
  ---HyperText Transfer Protocol.Application protocol for transfering resources across the Internet.
  
  ---Набор от правила за обмен на ресусрси по Интернет.
- 
**Which are the main HTTP methods?**
 ---**GET** извличане на ресурси от сървъра.Няма тяло.GET /users ще върне всички users.
   Method-GET
   Target-Адреса ,от който ще търсим данните(примерно google.com)
   Headers-Каква форма ще върне отговора,Browsers ги генерира.
   Body-няма!
  
---**POST** изпращане на данни до API сървъра за създаване или обновяване на ресурс.Има странични ефекти
   
---**PUT** изпращане на данни до API сървъра за създаване или обновяване на ресурс.Води до един и същ резултат.
   
---**DELETE** изтриване(премахване) на ресурс.
   
---**PATCH** използвасе да промени само дадена част на ресурса.
- **Which are the HTTP response codes?**
- ---1xx(информационен характер) заявката е получена от сървъра и я обработва,продължаване на процеса.
- ---2xx заявката е успешно получена,разбрана и приета.
- ---3xx пренасочване
- ---400 Грешката идва от клиента,грешен синтаксис или няма такава.
- ---500 Грешката идва от сървъра !

- What is the difference between `HTTP GET` and `HTTP POST`?
- What is the difference between `HTTP PUT` and `HTTP POST`?
- What HTTP method you’d use if you had to get resource from the server, but to do so you need to send lots of data?
- **What is the format of a HTTP request and response?**
- What is REST service?
 --- **Representational State Transfer** Взаймодействие между клиент и сървър,осъществено по време на трансфера на данни.Архитектурен подход за API,набор от правила


- What is API and how can you use it?

---Interface ,които позволява нашата програма да контактува с други програми.Набор ot end-point  които предоставяме.Приложение ,което се ралолага на  сървъра и през него контактува с клиентите.

- Explain the MVC design pattern?
- What is template engine and where do we use it?
- What is the difference between dynamic web pages and single page application (SPA)?
- What are transactions in MariaDB /Spring?

#### Questions you should have general knowledge of and should answer in a few words

- What is the role of “enabled” column in Spring Security Users table?
- What is Aspect Oriented Programming (AOP)?
- How does Spring Security work under the hood?
- What is database migration?

****

## Practical Tasks

- Write function to print Fibonacci numbers up to N.
- Write function to find substring in string.
- Write a function that takes a String and reverses it?
- Write a function to check if a String is a palindrome or not?
- Write a function to check if two Strings are anagrams in Java?
- Write function to print all Character permutations in given string.
- Write a function to count the number of occurrences of a given Character in a String?
- Which data structure you’d use to check whether two strings are palindromes?
- What is the fastest way of mirroring a number? 12 -> 21
- Write function to find a number in binary search tree.
- Given a string containing just the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid. An input string is valid if:
  - Open brackets must be closed in the correct order.
  - Open brackets must be closed by the same type of brackets.
- Write function `mergeStrings("abc", "defg")` ... = `"adbecfg"`
- You have defined “weight” of a string. Get the lightest string with this “weight”.
- You have several strings. How would you check whether each of them contains all letters from the alphabet?
- Find the count of unique numbers in an array. `[1,3,3,4,4,4] -> 2`

***

## Logical Tasks

- You are given two eggs, and access to a 100-storey building. Both eggs are identical. The aim is to find out the highest floor from which an egg will not break when dropped out of a window from that floor. If an egg is dropped and does not break, it is undamaged and can be dropped again. However, once an egg is broken, that’s it for that egg. If an egg breaks when dropped from floor n, then it would also have broken from any floor above that. If an egg survives a fall, then it will survive any fall shorter than that. The question is: What strategy should you adopt to minimize the number egg drops it takes to find the solution?. (And what is the worst case for the number of drops it will take?)
