package Observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random rand = new Random();
    private  int num;



    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void execute() throws InterruptedException {
        for(int i = 0; i<10;i++){
            num = rand.nextInt(10);
            super.notifyObserver();
            Thread.sleep(200);
        }
    }


}
