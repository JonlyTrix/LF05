import java.util.Random;

public class DummyProgram {
  public static void main(String[] args) {
    // Print a welcome message
    System.out.println("Welcome to the Dummy Program!\n");

    // Do some "important work"
    System.out.println("Doing some important work...");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Still working...\n");

    // Calculate the sum of the first 100 positive integers
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    System.out.println("Calculating the sum of the first 100 positive integers...");
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("The sum is: " + sum + "\n");

    // Generate and print 10 random numbers
    Random random = new Random();
    for (int i = 0; i < 20; i++) {
      System.out.println("Generating a random number...");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      int randomInt = random.nextInt(10000);
      System.out.println(randomInt);
      if (randomInt % 2 == 0) {
        System.out.println(randomInt + " is even.");
      } else {
        System.out.println(randomInt + " is odd.");
      }
    }
       

    // Calculate the factorial of 42
    long factorial = 1;
    for (int i = 1; i <= 42; i++) {
      factorial *= i;
    }
    System.out.println("\nCalculating the factorial of 42....");
    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("The factorial of 42 is: " + factorial);
    System.out.println("\nAll done!");
  }
}
