public class Student extends Person implements Cloneable{
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public static void main(String[] args) throws CloneNotSupportedException {
    Student john = new Student("John Doe", 20, "male", "BME");
    Student johnTheClone = (Student) john.clone();
    System.out.println(john.toString());
    System.out.println(johnTheClone.toString());
  }

  public void introduce(){
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + "from "
        + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getGoal(){
    System.out.println("My goal is: Be a junior software developer.");
  }

  public void skipDays(int numberOfDays){
    this.skippedDays = skippedDays + numberOfDays;
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }
}