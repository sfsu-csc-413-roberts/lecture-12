public class Main {
  public static void main( String[] args ) {
    // This is illegal
    // Singleton illegal = new Singleton();
    // Main.java:4: error: Singleton() has private access in Singleton

    Singleton first = Singleton.getInstance();
    System.out.println( "First count is " + first.getCounter() );

    for( int i = 0; i < 5; i ++ ) {
      first.incrementCounter();
    }
    System.out.println( "First count is " + first.getCounter() );

    Singleton second = Singleton.getInstance();
    System.out.println( "Second count is " + second.getCounter() );
  }
}