@FunctionalInterface
public interface MyFirstFunctionalInterface
{
    public void firstWork();

    default void doSomeMoreWork1(){
        //Method body
    }

    @Override
    public String toString();
}