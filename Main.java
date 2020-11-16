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
    myCar.color="blue";
    myCar.power= 160;
    myCar.seats= 2;


    VehicleManager manager= new VehicleManager();
    manager.addVehicle(myCar);

    Vehicle vehicleDisplay= manager.searchVehicle("blue");
    System.out.println("Vehicle Added "+ vehicleDisplay.color);
  }
}