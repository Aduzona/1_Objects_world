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
      if(vehicleArray[i].color.equals(searchVeh)){

        return vehicleArray[i];
      } 
    }
    
    return null;

  }

}