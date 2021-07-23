import java.util.Random;

public class ExampleRunnable implements Runnable{

    @Override
    public void run() {
        for ( int i = 1; i <= 10; i++ ){
            System.out.println( "----->" + i );
            try {
                Thread.sleep(new Random().nextInt(2081));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
