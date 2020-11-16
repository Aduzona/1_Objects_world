//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

class Main {
  public static void main(String[] args) {

    //contactCall();
    //bookCall("Choice modelling","Koppelman and Bhat");

    vehicleCall();



  }
  public static void contactCall(){
    //create the ContactManager object myContactManager and thus ready to be used
  
    ContactsManager myContactManager = new ContactsManager();

    //  Contact first contact instance
    Contact contact1= new Contact();
    contact1.name="Diego";
    contact1.phoneNumber="015219478126";

    myContactManager.addContact(contact1);

    // 2nd Contact
       Contact contact2=new Contact();
    contact2.name="Rose";
    contact2.phoneNumber="015220478126";

    myContactManager.addContact(contact2);

    // Now let's try to search of a contact and display their phone number

    //remember search contact returns type is Contact
    Contact contactSearched= myContactManager.searchContact("Diego");

    System.out.println("Contact searched "+ contactSearched.phoneNumber);


  }

  public static void bookCall(String name, String author){
    Book book = new Book (name, author);

    // Display title of the book
    System.out.println("Book name is "+ book.title);
    boolean bookBorrowed= book.isBookBorrowed();
    System.out.println(bookBorrowed);

    // Borrow book now becomes true
    book.borrowBook();
    //bookBorrowed=book.borrowBook();

    bookBorrowed=book.isBookBorrowed();
    System.out.println(bookBorrowed);


    //Access the name and author of the book
    System.out.println(book.nameAuthor());

    // Setting field
    book.numberOfPages=234;
    System.out.println("The number of pages for book "+ book.title+ " is " +book.numberOfPages);

  }

  public static void vehicleCall(){

    Vehicle myCar= new Vehicle();
    myCar.object_name="myCar";
    myCar.color="blue";
    myCar.power= 160;
    myCar.seats= 2;

    Vehicle oldBus=new Vehicle();
    oldBus.object_name="oldBus";
    oldBus.color="black";
    oldBus.power= 330	;
    oldBus.seats= 14;
   
    Vehicle myDreamCar=new Vehicle();
    myDreamCar.object_name= "myDreamCar";
    myDreamCar.color="purple";
    myDreamCar.power= 260	;
    myDreamCar.seats= 5;
   
    Vehicle theBeast=new Vehicle();
    theBeast.object_name="theBeast";
    theBeast.color="red";
    theBeast.power= 2000	;
    theBeast.seats= 2;
    

    VehicleManager manager= new VehicleManager();
    manager.addVehicle(myCar);
    manager.addVehicle(oldBus);
    manager.addVehicle(myDreamCar);
    manager.addVehicle(theBeast);

    Vehicle vehicleDisplay= manager.searchVehicle("myCar");
    System.out.println("Vehicle Added "+ vehicleDisplay.color);

    manager.vehicleString();
  }
}