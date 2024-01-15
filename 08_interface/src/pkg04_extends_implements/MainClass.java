package pkg04_extends_implements;

public class MainClass {

  public static void main(String[] args) {
    
    Domestic domestic = new SeoulTravel();
    domestic.vehicle();
    ((SeoulTravel) domestic).sightseeing();
    
    Travel travel = new SeoulTravel();
    travel.sightseeing();
    ((SeoulTravel) travel).vehicle();
    
    SeoulTravel seoulTravel = new SeoulTravel();
    seoulTravel.vehicle();
    seoulTravel.sightseeing();

  }

}
