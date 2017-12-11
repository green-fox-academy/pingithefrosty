public class Counter {
  int fieldValue;
  int fieldInitial;

  public Counter(){
    this(0);
  }

  public Counter(int fieldValue) {
    this.fieldValue = fieldValue;
    this.fieldInitial = fieldValue;
  }

  public void add(){
    this.fieldValue += 1;
  }

  public void add(int number){
    this.fieldValue = fieldValue + number;
  }

  public int get(){
    return this.fieldValue;
  }

  public void reset(){
    this.fieldValue = fieldInitial;
  }

}