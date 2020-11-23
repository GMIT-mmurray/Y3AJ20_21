import java.util.Random;

public class EmailSender extends Thread {
    String email;
    public EmailSender(String user) {
        this.email = user;
    }

    public  void run () {
        System.out.printf("Sending email to %s from %s\n",email,Thread.currentThread().getName());
        // Let's take some time to send the email
         try {
             Thread.sleep(new Random().nextInt(500));
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         System.out.printf("Email sent to %s!\n",email);
    }

}