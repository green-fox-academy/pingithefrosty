public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public Sponsor() {
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    this.hiredStudents = 0;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public void setHiredStudents(int hiredStudents) {
    this.hiredStudents = hiredStudents;
  }

  public String getCompany() {
    return company;
  }

  public int getHiredStudents() {
    return hiredStudents;
  }

  public void introduce(){
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " +
        company + " and hired " + hiredStudents + " students so far.");
  }

  public void getGoal(){
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public void hire(){
    this.hiredStudents = hiredStudents + 1;
  }
}
