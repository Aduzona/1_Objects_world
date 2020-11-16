class Contact{
  /**

  Used for storing contact information of a single person

  We used String to store phone number because:
  a. In Integer,0 and 001 and 1 are same while is it different for String.

  b. Laregest possible integer value is 2,147,483,647, so as 10 digit number starting with a 9 cannot be stored in a single integer.
  
  **/

  String name;
  String email;
  String phoneNumber;
}