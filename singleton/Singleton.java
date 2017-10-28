/**
 * https://sourcemaking.com/design_patterns/singleton/java/1
 */
public class Singleton {
  private int counter = 0;
  
  // Private constructor prevents instantiation from other classes
  private Singleton() {
    System.out.println( "Singleton created" );
  }

  public int getCounter() {
    return this.counter;
  }

  public void incrementCounter() {
    this.counter++;
  }
 
  /**
   * SingletonHolder is loaded on the first execution of Singleton.getInstance() 
   * or the first access to SingletonHolder.INSTANCE, not before.
   */
  private static class SingletonHolder { 
    private static final Singleton INSTANCE = new Singleton();
  }

  public static Singleton getInstance() {
    return SingletonHolder.INSTANCE;
  }
}