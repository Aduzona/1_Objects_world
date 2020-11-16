// Methods (public vs private)

class Person{
   private String userName;
   private String SSN;


   /*
      The private methods are usually known as helper methods, since they can only be seen and called by the same class, they are usually there to organize your code and keep it simple and more readable.
   */

   private String getId(){
     /*
        This method was also set to private so that no other class can know the social security number of any person.
     */

      return SSN + "-" + userName;
   }
   public String getUserName(){
      return userName;
   }

   // The parameter has a person object. Just like ContactManager class.

   public boolean isSamePerson(Person p){
     /*
       getID() accessed internally when comparing this person with another person object in the isSamePerson(Person p) method
     */


      if(p.getId().equals(this.getId())){
         return true;
      }
      else{
         return false;
      } 
   }
}
