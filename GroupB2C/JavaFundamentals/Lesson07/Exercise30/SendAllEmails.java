import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.Set;

public class SendAllEmails {
    
   public static void main (String [] args) throws Exception {
        ArrayDeque<String> queue = new ArrayDeque<>();

        FileReader fileReader = new FileReader(args[0]);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try (CSVReader reader = new CSVReader(bufferedReader)) {
            String[] row;
            while ((row = reader.readRow()) != null) {
                User user = User.fromValues(row);

                // Enqueue email to send to
                queue.offer(user.email);

                sendEmailWhenReady(queue);

                // Simulate slow reading from file
                Thread.sleep(100);
            }
        }

        // Drain the queue
        while (!queue.isEmpty()) {
            sendEmailWhenReady(queue);
            // Wait before checking again
            Thread.sleep(500);
        }
        while(Thread.activeCount() >7)
             Thread.sleep(100);
       System.out.println("Finished !!!");
       System.exit(0);
    }

    private static void sendEmailWhenReady(ArrayDeque<String> queue) throws Exception {
        System.out.print("\nSending email from main Thread \n");
        new EmailSender(queue.poll()).start();
        Set<Thread> threads = Thread.getAllStackTraces().keySet();
        for (Thread t : threads) {
            String name = t.getName();
            Thread.State state = t.getState();
            int priority = t.getPriority();
            String type = t.isDaemon() ? "Daemon" : "Normal";
            System.out.printf("%-20s \t %s \t %d \t %s\n", name, state, priority, type);
        }
        }

}
