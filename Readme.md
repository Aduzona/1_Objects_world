# World of Objects

## Introduction

Objects
* Fields
  * primitive variables
  * Object variables 
  * Example:

  ```java 
       class Book{
        protected String title;
        private String author;
        protected int numberOfPages;
  ``` 

* Methods
  * primitive variables
  * Object variables 
  * Example:
    ```java 
       class Book{
         ...
         isBorrowed();
         borrowedBook();
         returnBook();
         isBookBorrowed();
       }
    ``` 


**Variable types**

Primitive Data types: 
  - Primitive types are predefined (already defined) in Java.
  - short, int, long, float, double, boolean and char
  - Example
  ```java 
       int age=10 
  ```

Objects (Non Primitive Data types):
  - are called reference types because they refer to objects. 
  - Strings, Arrays,Classes(user defined), Interfaces
  - As seen above, book variable stores "Title" and "author"
  - Book can also perform actions using Methods as seen above.

## Fields
* To access a Fields
An object of Book "book" was created. This is then used to access the properties of the Book variable.

  ```java
   // Access the title of the book
    book.title;
    book.numberOfPages=234;
  ```

* Setting Fields
    ```java
      // Setting the numberOfPages
      book.numberOfPages=234;
    ```

## Methods
* Calling and setting a Method
  ```java
    bookCall("Choice modelling","Koppelman and Bhat");
  ```


## Objects & Classes
in Java, Everything is an Object. There are classes that wraps around primitives.

|Class  | Primitive type  |
|-------|-----------------|
|Integer|int|
|Double |double|
|Long   | long|
|Character| char|
|String| char[] |

Vehicle Example

# Main Method

```java
public static void main(String [] args){
   // Start my program here
}

```

Let's break it down:

* public: Is an Access Modifier which makes the method runable from anywhere in java program.

* static: Means it doesn't need an object to run, which is why the computer starts with this method before even creating any objects (we will also talk more about static methods later on)
* void: Means the main method doesn't return anything, it just runs when the program starts, and once it's done the program terminates
* main: Is the name of the method
* String [] args : Is the input parameter (array of strings) which we will cover how to use it later in this lesson as well! 
* [source](https://classroom.udacity.com/courses/ud283) from Udacity Object Oriented Programming, Most of my sources are also from here.


## Constructors
Constructors are like methods with class name. Remeber how an object of Book "book" was used to access fields and Methods, This object was enabled by Contructor. E.g 

**Default Constructor**
* Every class has a default constructor, you don't need to create it. 
* But can be used to initialize variables
* Does not take parameters
```java

  class Book{
    ...
    protected int numberOfPages;
    // Default constructor
    Book(){
      numberOfPages=0;
    }
  }
```


**Parameterized Constructor**
* This takes parametarized input

```java
    class Book{
    ...
    protected String title;
    private String author;
    private boolean isBorrowed;

    Book(String title, String author){
      ...
    }
```

**Accessing a Constructor**
* We create an Object of a class with the help of the new keyword.
```java
// will have initial numberOfPages to be zero
 Book bookd = new Book ();

// parametarized
// Instantiated with title and Author's name and isBorrowed= false 
  Book book = new Book ("Choice modelling","Koppelman and Bhat");
```

## Self reference
* "this" keyword references the current object.

```java

  class Book{

    protected String title;
    private String author;
    private boolean isBorrowed;

    protected int numberOfPages;

    public Book(String title, String author){

    this.title=title;
    this.author = author;
    this.isBorrowed = false;
    }
  }

```

* In the code above, this.title signifies that we are referign to field named "title" rather than input parameter title.

## Adding Method
contact class example, there are 2 classes Contact and ContactsManager.


|object_name| name | email | PhoneNumber|
|:----------|:----:|:-----:|:----------:|
|contact1|Diego|...|05219478126|
|contact2|Rose|...|05220478126|

* contact class:
Defines the field, thus this is like datatype just like int.

```java
  class Contact{

    String name;
    String email;
    String phoneNumber;
  }
```

* ContactsManager class:

```java
  class ContactsManager{

    // Stores array of contacts
    Contact [] myFriends;

    //counts added contact
    int friendsCount;

    // adds contacts.
    void addContact(Contact contact);

    // searches for contacts in contact array myFriends.
    Contact searchContact(String searchName);
  }
```

## Access Modifier

There are four types of Java access modifiers:

1. Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

2. Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
3. Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
4. Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

* [javatpoint](https://www.javatpoint.com/access-modifiers) checkout examples for mor details. You will see some concepts of importing a package and also inheritance.


## Lets Solve:

* There will be 2 classes, Vehicle and VehicleManager


|object_name| color | power | seats|
|:----------|:----:|:-----:|:----------:|
|myCar|blue|160|2|
|oldBus|black|330|14|
|myDreamCar|purple|260|5|
|theBeast|red|2000|2|

* Vehicle class:
Defines the field, thus this is like datatype just like int.

```java
  class Vehicle{

    String color;
    String power;
    String seats;
  }

```
* VehiclessManager class:
hint same concept as contact.
