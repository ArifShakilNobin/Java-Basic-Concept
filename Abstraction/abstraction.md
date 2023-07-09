# Abstract Concept



### There are two ways to achieve abstraction in java:

1. Abstract class(0 to 100%) এটা দিয়ে ১০০% Abstraction তৈরি করা যায় না
2. Interface(100%) এটা দিয়ে ১০০% Abstraction তৈরি করা যায়

###  Key Point:
1. We can not create an object of this class. Only objects of its non-abstract(or concrete) subclasses can be created.
2. It can have zero or more abstract methods which are not allowed in a non-abstract class(concrete class)
3. We can't create abstract method in non-abstract class.
4. We can create abstract & non-abstract method in abstract class.
5. Abstract এটা কোন access modifier না 
6. Abstract method কখনো **static and private.** হতে পারবে না
7. Abstract class এর কোন object তৈরি করা যায় না । Abstract class কে যেই Non-Abstract class inherit করে সেই class এর object তৈরি করে কাজ করতে হয় ।
8. 