public class IncrementObservable extends Observable {
  private int counter;
  
  public IncrementObservable() {
    this.counter = 0;
  }

  public int getIncrement() {
    return this.counter;
  }

  public void increment() {
    this.counter++;
    this.notifyObservers();
  }
}