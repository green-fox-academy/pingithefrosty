public class Task {
  private String description;
  private static int counter = 1;

  public Task(String description) {
    this.description = description;
    counter++;
  }

  public static int getCounter() {
    return counter;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
