public class Mentor extends Person{
  private String level;

  public void setLevel(String level) {
    this.level = level;
  }

  public String getLevel() {
    return level;
  }

  public Mentor() {
    this.level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public void introduce(){
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " " + level + " mentor.");
  }

  public void getGoal(){
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }
}
