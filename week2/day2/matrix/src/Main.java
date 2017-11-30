public class Main {
    public static void main(String[] args) {
        int[][] loop1 = new int [4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == j) {
                        loop1[i][j] = 1;
                    } else {
                        loop1[i][j] = 0;
                    }
                    System.out.print(loop1[i][j] + " ");
                }
                System.out.println("");
            }
    }
}
