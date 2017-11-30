public class Main {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= 8;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f3 = (f1 > f2);
        System.out.println(f3);

        int g1 = 350;
        int g2 = 200;
        boolean g3 = ((g2 * 2) > g1);
        System.out.println(g3);

        int h = 135798745;
        boolean h1 = (h % 11 == 0);
        System.out.println(h1);

        int i1 = 10;
        int i2 = 3;
        boolean i3 = (i1 > i2 * i2 && i1 < i2 * i2 * i2);
        System.out.println(i3);

        int j = 1521;
        boolean j1 = j % 3 == 0 || j % 5 == 0;
        System.out.println(j1);

        String k = "Apple";
        k = "AppleAppleAppleApple";
        System.out.println(k);
    }
}