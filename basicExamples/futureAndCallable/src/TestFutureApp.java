import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class TestFutureApp {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<?> future = executor.submit(new Callable<Void>() {

            @Override
            public Integer call() throws Exception {
                System.out.println("Starting...");
                Random random = new Random();
                int duration = random.nextInt(4000);
                if (duration > 2000) {
                    throw new IOException("Sleeping for too long.");
                }
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Finished.");
                return null;
            }
        });

        executor.shutdown();
        future.can
        try {
            System.out.println("Result is: " + future.get());
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (ExecutionException e) {
            System.out.println(e);
        }
    }
}
