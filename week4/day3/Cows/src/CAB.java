import java.util.Random;
import java.util.Scanner;

public class CAB {
  private int target;
  private boolean inGame;
  private int counter;
  private int guess;

  public CAB(int target, boolean inGame, int counter, int guess) {
    Random random = new Random();
    this.target = random.nextInt(9000) + 1000;
    this.inGame = true;
    this.counter = 0;
    this.guess = guess;
  }

  public int getTarget() {
    return target;
  }

  public void setTarget(int target) {
    this.target = target;
  }

  public boolean isInGame() {
    return inGame;
  }

  public void setInGame(boolean inGame) {
    this.inGame = inGame;
  }

  public int getCounter() {
    return counter;
  }

  public void setCounter(int counter) {
    this.counter = counter;
  }

  public int getGuess() {
    return guess;
  }

  public void setGuess(int guess) {
    this.guess = guess;
  }

  public void main(String[] args) {
    Random random = new Random();
    int target = random.nextInt(9000) + 1000;
    int numberOfGuesses = 0;
    while (state(guess(target),target).equals("playing")){
      guess(target);
      numberOfGuesses = numberOfGuesses + 1;
      System.out.println(numberOfGuesses);
      System.out.println(state(guess(target),target).toString());
    }
    System.out.println("You guessed it in " + numberOfGuesses + " guesses.");
  }

  public static int guess (int target) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    String first = Integer.parseInt(Integer.toString(input).substring(0, 1)) == Integer.parseInt(Integer.toString(target).substring(0, 1)) ? "cow " : "bull ";
    String second = Integer.parseInt(Integer.toString(input).substring(1, 2)) == Integer.parseInt(Integer.toString(target).substring(1, 2)) ? "cow " : "bull ";
    String third = Integer.parseInt(Integer.toString(input).substring(2, 3)) == Integer.parseInt(Integer.toString(target).substring(2, 3)) ? "cow " : "bull ";
    String fourth = Integer.parseInt(Integer.toString(input).substring(3, 4)) == Integer.parseInt(Integer.toString(target).substring(3, 4)) ? "cow" : "bull";
    String result = first + second + third + fourth;
    System.out.println(result);
    return input;
  }

  public static String state (int input, int target) {
    if (input == target) {
      return "finished";
    } else return "playing";
  }
}