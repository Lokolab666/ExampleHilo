import java.time.LocalTime;

public class RunThread {
    public static void main(String[] args){
        /*System.out.println("INICIO DEL PROGRAMA");

        ExampleThread thOne = new ExampleThread("Hilo uno");
        ExampleThread thTwo = new ExampleThread("Hilo dos");

        thOne.start();
        thTwo.start();

        System.out.println("FIN DEL PROGRAMA");



        ExampleRunnable runOne = new ExampleRunnable("Hilo uno");
        ExampleRunnable runTwo = new ExampleRunnable("Hilo dos");

        Thread thOne = new Thread( runOne );
        Thread thTwo = new Thread( runTwo );

        thOne.start();
        thTwo.start();*/

        new Thread( new ExampleRunnable()).start();
        new Thread( new ExampleRunnable()).start();

        new Thread(() -> {
            while (true){
                LocalTime time = LocalTime.now();
                System.out.printf("%d:%d:%d\n", time.getHour(), time.getMinute(), time.getSecond());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }



}
