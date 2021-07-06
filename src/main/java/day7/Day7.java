package day7;

/**
 * Created by Ibrahim Chowdhury on 6 July, 2021
 *
 * Today we run a task on a single thread
 */

public class Day7 {
    public static void main(String[] args) {
        Runnable runnableTask = ()->{
          String threadTitle = Thread.currentThread().getName();
            System.out.println("This "+threadTitle+" has run.");
        };

        Thread thread = new Thread(runnableTask);
        thread.setName("Custom thread - 1");

        thread.start();
        System.out.println("Done!");
    }
}
