public class Main {
  public static void main( String[] args ) {
    IncrementObservable observable = new IncrementObservable();

    for( int i = 0; i < 5; i++ ) {
      observable.addObserver( new IncrementObserver( "Blarg " + i ));
    }

    observable.increment();
    observable.increment();

    System.out.println( "** I just incremented twice." );

    observable.increment();
  }
}