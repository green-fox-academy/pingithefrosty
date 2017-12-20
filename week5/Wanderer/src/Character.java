import java.awt.*;

public class Character {
  private Image image;
  private String fileName;
  protected int maxHP;
  protected int HP;
  protected int DP;
  protected int SP;
  protected int level = 1;
  protected int x;
  protected int y;
  protected Boolean isDead;

  int rollDice() {
    return (int)(Math.random() * 5) + 1;
  }

  public void levelUp (){
    this.maxHP += rollDice();
    this.DP += rollDice();
    this.SP += rollDice();
  }

  public void attack (Character enemy) {

  }

  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  public void draw (Graphics graphics) {
    graphics.drawImage(image, x, y, null);
  }
}
