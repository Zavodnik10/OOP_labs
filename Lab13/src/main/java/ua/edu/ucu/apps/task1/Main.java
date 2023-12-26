package ua.edu.ucu.apps.task1;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {
        List<MyUser> users = Arrays.asList(new MyFacebookUser(new FacebookUser("first", "UA", LocalDateTime.now())),new MyTwitterUser(new TwitterUser("second", "FP", LocalDateTime.now().minusHours(2))));
        MessageSender messageSender = new MessageSender();
        messageSender.send("Find", users, "UA");
    }
}
