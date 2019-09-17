package Observer;

public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        int size = generator.getNum();
        System.out.println("GraphObserver: ");
        for(int i=0; i<size;i++){
            System.out.print("*" );
        }
        System.out.println();
    }
}
