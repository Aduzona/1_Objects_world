class VehicleManager{

  Vehicle [] vehicleArray;

  int countVehicle;

  VehicleManager(){
    this.countVehicle=0;

    this.vehicleArray=new Vehicle [4];
  }

  void addVehicle(Vehicle  addSomeVeh){

    vehicleArray[countVehicle]= addSomeVeh;
    countVehicle++;
  }

  public Vehicle searchVehicle(String searchVeh){
    for(int i=0; i<countVehicle; i++){
      if(vehicleArray[i].object_name.equals(searchVeh)){

        return vehicleArray[i];
      } 
    }
    
    return null;

  }

  public void vehicleString(){
    System.out.println("object_name "+" color "+ " power " + " seats ");
    for(int i=0; i<countVehicle; i++){
      String display  = " "+ vehicleArray[i].object_name +"   "+ vehicleArray[i].color + "  "+ vehicleArray[i].power+ "  "+ vehicleArray[i].seats ;

      System.out.println(display);
   } 
    
    //return display;
  }

}