import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name1 = "Juli";
        String[] classmembers = new String[2];
        classmembers[0]="Jani";
        classmembers[1]="Peti";
        String[] classmembers2 = {
                "Jani",
                "Peti",
                "Juli",
        };
        String[] combinedArray =  new String[classmembers.length + classmembers2.length];
        for (int i = 0; i < classmembers.length; i++){
            combinedArray[i] = classmembers[i];
        }
        for (int i = 0; i < classmembers2.length; i++){
            combinedArray[i] = classmembers2[i];
        }
        System.out.println(Arrays.toString(combinedArray));
    }
}
