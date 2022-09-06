public class Television {

  //every instance of class Television, will have the band and volume attributes
  //instance variables / fields
  private String brand; // brand name
  private int volume;  // current volume

  public void turnOn(){
    // Concatenation, a single string that is a concatenation of The + brand + text + volume)
    //invoke helper function. Verify internet question
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " television is on, with a volume of " + volume);
  }

  public void turnOff(){
    // Concatenation
    System.out.println("The " + brand + " television is off");
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  private boolean verifyInternetConnection(){
    return true;
  }
  public String toString() {
    return "Television{" + "brand=" + getBrand() + ", volume=" + getVolume() + "}";
  }
}