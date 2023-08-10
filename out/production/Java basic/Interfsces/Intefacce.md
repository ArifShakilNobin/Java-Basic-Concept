# Interface in Java

An interface in java is a blueprint of a class.

1. It has static constants and abstract method. 
2. The interface in java is a mechanism to achieve abstraction. 
3. There can be only abstract method in the interface, not method body. 
4. It is used to achieve abstraction and multiple inheritance in java.
5. Interface has no constructor.

### Why use Interface

1. In industry, architect level people create interfaces, and then it is given to developers for writing 
    classes by implementing interfaces provided.
2. Using interfaces is the best way to expose our projects API to some other project.
   For example, HDFC bank can expose methods or interfaces to various shopping carts.
3. Programmers use interface to customize features of software differently for different objects.
4. It is used to achieve fully abstraction.
5. By using interface, we can achieve the functionality of multiple inheritance.

### Features of Interface in Java

There are following features of the interface in Java. They are as follows:

1. Interface provides pure abstraction in java. It also represents the Is-A relationship.

2. We cannot create an object of interface in Java.

3. All the methods declared in interface are by default abstract and public. 
   So, there is no need to write abstract or public modifiers before them.

4. The fields (data members) declared in an interface are by default public, static, and final. Therefore, they are just public constants.
   So, we cannot change their value by implementing class once they are initialized.

5. Interface cannot have constructor.

6. It can be compiled but cannot run.

7. The interface is the only mechanism which allows achieving multiple inheritance in java.

8. A Java class can implement any number of interfaces by using keyword implements.

9. Interface can extend an interface and can also extend multiple interfaces.

10. If you add any new method in interface, all concrete classes which implement that interface must provide imp
    newly added method because all methods in interface are by default abstract.
    23:21
