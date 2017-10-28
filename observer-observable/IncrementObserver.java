public class IncrementObserver implements Observer {
  private String name;

  public IncrementObserver( String name ) {
    this.name = name;
  }

  public void update( Observable observable ) {
    System.out.println( 
      name + " observer sees " +  
      ((IncrementObservable) observable ).getIncrement() 
    );
  }
}