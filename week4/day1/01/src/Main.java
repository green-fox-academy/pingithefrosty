import java.awt.*;

public class Main {
  public static void main(String[] args) {
    PostIt postIt1 = new PostIt();
    postIt1.setBackgroundColor(Color.orange);
    postIt1.setTextColor(Color.blue);
    postIt1.setText("Idea 1");

    PostIt postIt2 = new PostIt();
    postIt1.setBackgroundColor(Color.pink);
    postIt1.setTextColor(Color.black);
    postIt1.setText("Awesome");

    PostIt postIt3 = new PostIt();
    postIt1.setBackgroundColor(Color.yellow);
    postIt1.setTextColor(Color.green);
    postIt1.setText("Superb!");
  }
}
