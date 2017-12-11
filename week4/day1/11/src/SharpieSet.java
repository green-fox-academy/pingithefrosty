import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> sharpies;

  public SharpieSet (){
    this.sharpies = new ArrayList<>();
  }

  public void add(Sharpie sharpie){
    sharpies.add(sharpie);
  }

  public int countUsable (){
    int usable = 0;
    for (Sharpie sharpie : this.sharpies){
      if (sharpie.getInkAmount() != 0){
        usable++;
      }
    }
    return usable;
  }

  public void removeTrash (){
    for (int i = 0; i < sharpies.size(); i++) {
      if (sharpies.get(i).getInkAmount() == 0){
        sharpies.remove(i);
      }
    }
  }

}

/*
it contains a list of Sharpie
countUsable() -> sharpie is usable if it has ink in it
removeTrash() -> removes all unusable sharpies
 */