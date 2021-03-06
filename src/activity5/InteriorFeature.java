package activity5;

import java.sql.SQLOutput;

public class InteriorFeature {

  private String interiorFeature;

  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String getFeature() {
    return interiorFeature;
  }

  public void setFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  public String toString() {
    return "Interior [" + interiorFeature + "]";
  }
}
