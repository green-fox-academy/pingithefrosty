import java.util.ArrayList;

public class Fleet {
  private ArrayList<ToDo> things;

  public Fleet() {
    things = new ArrayList<>();
  }

  public void add(ToDo thing) {
    things.add(thing);
  }

  public ArrayList<ToDo> getThings() {
    return things;
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < things.size(); i++) {
      result += (i+1) + ". " + things.get(i) + "\n";
    }
    return result;
  }
}