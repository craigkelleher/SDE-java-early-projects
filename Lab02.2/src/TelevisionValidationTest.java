public class TelevisionValidationTest {

  public static void main(String[] args) {
    Television tv = new Television();

    tv.setVolume(0);            // should stick
    System.out.println(tv);

    tv.setVolume(100);          // should stick
    System.out.println(tv);

    tv.setVolume(-1);           // error message
    tv.setVolume(101);          // error message
    System.out.println(tv);     // should still have volume 100, from before

    System.out.println();

    tv.setBrand("Samsung");     // should stick
    System.out.println(tv);

    tv.setBrand("LG");          // should stick
    System.out.println(tv);

    tv.setBrand("Sony");        // should stick
    System.out.println(tv);

    tv.setBrand("Toshiba");     // should stick
    System.out.println(tv);

    tv.setBrand("INVALID");     // error message
    System.out.println(tv);     // should still be Toshiba, from before

    tv.setBrand("DELL");        // error message
    System.out.println(tv);     // should still be Toshiba, from before
  }
}
