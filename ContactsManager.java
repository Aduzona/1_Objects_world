class ContactsManager {
   // Fields:

   // Stores array of contacts
   Contact [] myFriends;


  /*
    help us know where in the array was the last contact added so we can continue to add more contacts into the array
  */

   int friendsCount;
   // Constructor:
   ContactsManager(){
     /*
      The friendsCount starts from 0 and will increment every time we add a new contact later.
     */
      this.friendsCount = 0;

      /*
        The Contact array myFriends (just like any array) needs to be initialized using the new keyword and we chose to reserve enough space in the array to store up to 500 contacts.
      */
      this.myFriends = new Contact[500];
   }


  // Adds a Contact object to the Contact array myFriends:

  void addContact(Contact contact){
    /**
      takes a Contact object as an input parameter, and uses the friendsCount value to fill that slot in the array with the contact that was passed into the method
    **/

    myFriends[friendsCount]= contact;

    // increment friends count
    friendsCount++;
  }

  /*
    method searchContact of type Contact search through the array using a name String and return a Contact object once a match is found
  */

  Contact searchContact(String searchName){

    /*
      This method loops over the array, and for each element myFriends[i] it compares the name field to the searchName 
    */

    for(int i=0; i<friendsCount; i++){
      if(myFriends[i].name.equals(searchName)){
        return myFriends[i];
      }
    }
    return null;
  }
  
}