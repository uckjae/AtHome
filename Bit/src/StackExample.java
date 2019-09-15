import javax.swing.*;
import java.util.Stack;

class Coin{
    private int value;

    Coin(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

public class StackExample {
    public static void main(String[] args){
        Stack<Coin> coinBox = new Stack<Coin>();

        //동전케이스에 동전을 끼움
        //100원,50원,500원,10원 순서로 넣는다.
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while(!coinBox.isEmpty()){
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전: " + coin.getValue()+"원");
        }
    }
}
