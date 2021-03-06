package activity5;

import java.util.Date;

public class ManufacturedEngine implements Engine {

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  public ManufacturedEngine() {
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineType = "Generic";
    this.engineCylinders = 0;
    this.driveTrain = "2wd: Two-Wheel Drives";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate,
      String engineMake, String engineModel, String engineType, int engineCylinders,
      String driveTrain) {
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  public void setEngineManufacturer(String engineManufacturer) {
    this.engineManufacturer = engineManufacturer;
  }

  public void setEngineManufacturedDate(Date engineManufacturedDate) {
    this.engineManufacturedDate = engineManufacturedDate;
  }

  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  public String toString() {
    return
        "Engine Manufacturer : " + engineManufacturer + "\n" +
        "Engine Manufactured : " + engineManufacturedDate + "\n" +
        "Engine Make         : " + engineMake + "\n" +
        "Engine Model        : " + engineModel + "\n" +
        "Engine Type         : " + engineType + "\n" +
        "Engine Cylinders    : " + engineCylinders + "\n" +
        "Drive Train         : " + driveTrain;
  }
}
