package activity5;

public class Main {

  public static void main(String[] args) {

    //VehicleChassis test objects
    VehicleChassis myChassis = new VehicleChassis();
    VehicleChassis yourChassis = new VehicleChassis("cn");

    //VehicleFrame test objects
    VehicleFrame myFrame = new VehicleFrame();
    VehicleFrame yourFrame = new VehicleFrame("Ladder Frame");

    //ManufacturedEngine test objects
    ManufacturedEngine myEngine = new ManufacturedEngine();
    ManufacturedEngine yourEngine = new ManufacturedEngine("Honda",
        new java.util.Date(), "H-series", "H23A1", "88 AKI",
        4, "2WD: Two-Wheel Drive");

    //InteriorFeature test objects
    InteriorFeature myInFeature = new InteriorFeature();
    InteriorFeature yourInFeature = new InteriorFeature("Climate Control");

    //ExteriorFeature test objects
    ExteriorFeature myExFeature = new ExteriorFeature();
    ExteriorFeature yourExFeature = new ExteriorFeature("Fog Lamps");

    /*VehicleChassis print statements
    System.out.println(myChassis.toString());
    System.out.println(yourChassis.toString());*/

    /*VehicleFrame print statements
    System.out.println(myFrame.toString());
    System.out.println(yourFrame.toString());*/

    /*ManufacturedEngine print statements
    System.out.println(myEngine.toString());
    System.out.println();
    System.out.println(yourEngine.toString());*/

    /*InteriorFeature print statements
    System.out.println(myInFeature);
    System.out.println(yourInFeature);*/

    //ExteriorFeature print statements
    System.out.println(myExFeature);
    System.out.println(yourExFeature);
  }
}
