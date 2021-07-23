import java.util.Random;

public class ExampleThread extends Thread{
    private String labelThread;

    public ExampleThread(String labelThread) {
        this.labelThread = labelThread;
    }

    @Override
    public void run(){
        for ( int i = 1; i <= 10; i++ ){
            System.out.println( labelThread + "----->" + i );
            try {
                //sleep(500);
                sleep( new Random().nextInt(2081));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
