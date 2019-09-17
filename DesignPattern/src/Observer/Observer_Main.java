package Observer;

public class Observer_Main {
    public static void main(String[] args) throws InterruptedException {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer);
        generator.execute();

        generator.addObserver(observer2);
        generator.execute();
    }
}
