public class Main {
    static int numberToIncrement = 5;
    public static void main(String[] args) {
        incrementIntegerBy10(numberToIncrement);
        System.out.println(numberToIncrement);
        int incrementThis = 6;
        incrementThis = incrementIntegerby10AndReturn(incrementThis);
        System.out.println("incrementThis: " + incrementThis);
    }
    public static void incrementIntegerBy10(int numberToIncrement){
        Main.numberToIncrement += 10;
    }
    public static int incrementIntegerby10AndReturn (int numberToIncrement){
        return numberToIncrement + 10;
    }
}
