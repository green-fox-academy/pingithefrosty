public class Main {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        System.out.println(60 - currentSeconds + (60 - currentMinutes) * 60 + (24 - currentHours) * 3600);
    }
}
}