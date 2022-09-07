public class Television {

  private String brand; // brand name
  private int volume;  // current volume

  //constant because it is a static final
  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  // use case for a mutable static field. instanceCounter
  private static int instanceCount = 0;

  // constructor, because its named after the class without a return class
  public Television() {
    instanceCount++;
  }

  public Television(String brand) {
    this(); // will invoke constructor that takes 0 parameters
    setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand);  //invoking television that just takes a string, by this(brand)
    setVolume(volume);
  }

  public void turnOn() {
    // Concatenation
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " television is on, with a volume of " + volume);
  }

  public void turnOff() {
    System.out.println("The " + brand + " television is off");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    switch (brand) {
      case "Samsung":
      case "LG":
      case "Sony":
      case "Toshiba":
        this.brand = brand;
        break;
      default:
        System.out.println(brand + "The only valid brands are Samsung, LG, Sony, and Toshiba!");
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      //printf is for formatted string, to format it a particular way
      // 1st %d corresponds to volume, 2nd Min, 3rd Max volume
      // %n /n works the same, but %n is operating system inclusive
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n", volume,
          MIN_VOLUME, MAX_VOLUME);
    } else {
      this.volume = volume;
    }
  }

  private boolean verifyInternetConnection() {
    return true;
  }

  public String toString() {
    return "Television{" + "brand=" + getBrand() + ", volume=" + getVolume() + "}";
  }
}