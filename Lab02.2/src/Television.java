public class Television {
  //every instance of class Television, will have the band and volume attributes
  //instance variables / fields
  String brand; // brand name
  int volume;  // current volume

  //method
  void turnOn(){
    // Concatenation, a single string that is a concatenation of The + brand + text + volume)
    System.out.println("The " + brand + " television is on, with a volume of " + volume);
  }

  void turnOff(){
    // Concatenation
    System.out.println("The " + brand + " television is off");
  }
}