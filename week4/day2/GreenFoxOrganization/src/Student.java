public class Student extends Person {
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

  public void introduce(){
    System.out.println("Hi, I'm " + getName() + " , a " + getAge() + " year old " + getGender() + "from "
        + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  public void getgoal(){
    System.out.println("Be a junior software developer.");
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
