public class TelevisionClient {

  // type psvm to get this whole thing.
  public static void main(String[] args) {

    Television tv1 = new Television();
    tv1.setBrand("Samsung");
    tv1.setVolume(125);
    tv1.setDisplay(DisplayType.LED);
    tv1.turnOn();
    tv1.turnOff();
    //System.out.println(tv1.toString());
    System.out.println(tv1);

    //invoking a static method by invoking name of class, instead of instance.
    System.out.printf("%d Television instances created%n", Television.getInstanceCount());

    Television tv2 = new Television("Sony", 50);
    // tv2.setBrand("Sony");
    // tv2.setVolume(50);
    tv2.turnOn();
    tv2.turnOff();
    //System.out.println(tv2.toString());
    System.out.println(tv2);
    System.out.printf("%d Television instances created%n", Television.getInstanceCount());

    Television tv3 = new Television("LG");
    tv3.turnOn();
    tv3.turnOff();
    System.out.println(tv3);
    System.out.printf("%d Television instances created%n", Television.getInstanceCount());

  }
}
