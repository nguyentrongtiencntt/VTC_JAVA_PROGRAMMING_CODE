package Advance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        // Khai báo một Thread Pool thông qua newSingleThreadExecutor() của Executors
        ExecutorService executorService
                = Executors.newSingleThreadExecutor();

        // Khai báo 10 Runnable, và "quăng" chúng vào Thread Pool vừa khai báo
        for (int i = 1; i <= 10; i++) {
            MyRunnable myRunnable
                    = new MyRunnable("Runnable " + i);
            executorService.execute(myRunnable);
        }

        // Phương thức này sẽ được nói sau ở ExecutorService
        executorService.shutdown();
    }

}
