# grokking-low-level-design

What is object-oriented design?

Object-oriented design (OOD) uses the object-oriented methodology to design a computational problem and its solution. It allows the application of a solution, based on the concepts of objects and models. OOD works as a component of the object-oriented programming (OOP) lifecycle. While designing a software solution, it is necessary to have less software development time and high code accuracy. OOD helps achieve this, since the design process involves objects communicating with each other and displaying the behavior of a program.

About this course

A typical object-oriented design (OOD) interview is hard. You never know what design problem you’ll be asked, and there are so many of them. Moreover, the interviewer expects you to design a near-perfect solution to the given problem that covers all the edge cases.

This course is about getting familiar with the fundamentals of object-oriented design with an extensive set of real-world problems usually asked in an object-oriented design (OOD) interview.

We’ll start with the introduction of the cornerstones of object-oriented programming and object-oriented design with an overview of different types of UML diagrams. We will also review a well-known object-oriented design principle, SOLID, followed by the definition and explanation of some of the most widely used design patterns. We’ll also illustrate 21 real-world design problems mostly asked in FAANG interviews.

The purpose of providing foundational knowledge about object-oriented programming, object-oriented design, design principles, and design patterns before diving deep into the actual design problems is to equip our learners with the essential conceptual foundation. This is so that they don't get lost while designing a problem during the interview.

In each design problem, we have presented a detailed discussion of the problem requirements. We’ve modeled the findings with the help of use cases, as well as class, sequence, and activity diagrams for each problem. For the benefit and ease of our learners, we have also provided the code implementation of these design problems in five different programming languages (Java, C#, Python, C++, and JavaScript). We have included multiple interactive elements, including challenges and illustrations to develop your understanding of the problem.

![img.png](img.png)

Intended audience

If you aim to ace the object-oriented design (OOD) interview for your dream job, this course is for you. Here's how object-oriented design can help you advance in the tech industry:

- Software developers: Object-oriented design benefits software developers to design their systems efficiently. The object-oriented design allows code to be reusable in a way that reduces redundancy leading to shorter, more readable code. Therefore, employing object-oriented design allows for easier collaborations, which increases productivity and leads to faster development of software.

- Project/product managers: A big challenge in project or product management is to build systems that scale well and perform effectively over time. Managers that are aware of object-oriented design can design systems much more efficiently.

- Object-oriented design learners: Individuals in tech domains can greatly benefit from learning object-oriented design. This course helps a learner understand how different real-world problems can be developed through the object-oriented model.

- Interview preparation: Object-oriented design is becoming an important part of software development interviews. This course helps software engineers prepare for interviews in big tech companies including FAANG.

Prerequisites for this course
We assume that you know the fundamental concepts of object-oriented design. We’ve discussed topics like object-oriented programming, design concepts, design principles, and patterns in this course. However, we strongly believe that a high-level understanding of these concepts will be beneficial for the learner and will expedite the learning process. We also assume that you are well-versed in the syntax of object-oriented programming for any of the following programming languages:

- java

Structure of the course

This course consists of 28 chapters. These chapters can be segmented into the four sections listed below:

- Foundational: The foundational section is composed of three chapters. The first chapter introduces the course and its key features. The second chapter talks about object-oriented programming and its four paradigms. The third chapter introduces UML notations, and in this chapter, we focus on four widely used UML diagrams in object-oriented design.

- Design patterns: There are two chapters in the design patterns section. The first chapter introduces the five design principles widely used in object-oriented software development called SOLID. The second chapter discusses the three design patterns: creational, structural, and behavioral.

- Real-world design problems: There are twenty-one chapters in this section. The first chapter explains a typical object-oriented design interview process. In particular, this chapter discusses the steps involved in solving a design problem. Chapters 6–27 describe and solve the 21 real-world design problems in detail. We have dedicated a chapter for each problem in which we walk the learner through all the phases of designing an object-oriented problem. These chapters include requirement gathering, use case diagrams, class designs, sequence and activity diagrams, as well as the skeleton code implementation in five popular languages.

- Wrapping up: This section provides interview tips for the reader and wraps up this course.

Background of Object-oriented Programming (OOP)

Definition

We use programming to solve real-world problems, and it won’t make much sense if one can’t model real-world scenarios using programming languages. This is where object-oriented programming comes into play. Object-oriented programming, also called OOP, is a programming model that is dependent on the concept of objects and classes.

OOP is a programming style, not a tool, so despite being old, it’s vastly popular and established. This programming style involves dividing a program into pieces of objects that can communicate with each other. Every object has its own unique set of properties. These properties are later accessed and modified through the use of various operations.

Check out the illustration below. It shows a real-life example of an employee record, where every employee can be considered an “object”. Since every employee has a name, age, salary, and designation, all these can be considered as the properties of each employee.

![img_1.png](img_1.png)

Building blocks of OOP

The following are the essential concepts of object-oriented programming:

- Attributes

- Methods

- Classes

- Objects

Classes and objects

In the real world, we can find many objects around us like cars, buildings, and humans. What are the characteristics of these objects? All these objects have some state and behavior.

Let's take an example of a calculator. It has a state, i.e., either it is on or off. It also has behaviors, i.e., we can perform addition, subtraction, multiplication, division, and many other operations on numbers. Therefore, we can say that objects have state(s) and behavior(s).

Interesting, isn’t it? However, the question is, “where do the objects come from?”

The answer to the question above is classes. A class can be thought of as a blueprint for creating objects.

Attributes

Attributes are variables that represent the state of the object. In other words, if you were to implement the calculator object below in a computer program, variables could represent its state.

Methods

Methods are like functions that represent the behavior of the object. In other words, if you were to implement the calculator object below in a computer program, functions could represent its behavior. Methods have access to a class's attributes (and other methods). They can accept parameters, return values, and are used to perform an action on an object of a class.

The illustration below shows what a Calculator class should look like:

![img_2.png](img_2.png)

Principles of OOP
The following are the four principles of object-oriented programming:

- Encapsulation

- Abstraction

- Inheritance

- Polymorphism

Encapsulation

Data hiding

Data hiding is an essential concept in object-oriented programming. In simple terms, it can be defined as masking a class's internal operations and only providing an interface through which other entities can interact with the class without being aware of what is happening within.

The goal is to implement classes in a way that prevents unauthorized access to or modification of the original contents of a class by its instances (or objects). The underlying algorithms of one class need not be known to another class. The two classes can still communicate, though.

Components of data hiding

Data hiding can be divided into two primary components:

- Encapsulation

- Abstraction

When used together, they allow us to make efficient classes for further use in our application.







