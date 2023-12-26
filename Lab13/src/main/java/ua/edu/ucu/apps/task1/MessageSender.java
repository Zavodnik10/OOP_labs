package ua.edu.ucu.apps.task1;
import java.util.List;
import java.time.LocalDateTime;

public class MessageSender {
    public int send(String text, List<MyUser> users, String country) {
        LocalDateTime lastHour = LocalDateTime.now().minusHours(1);

        long numberOfSentMessages = users.stream().filter(user -> user.getCountry().equals(country) && user.getLastActiveTime().isAfter(lastHour)).peek(user -> {
            String platform = (user instanceof MyFacebookUser) ? "Facebook" : "Twitter";
            System.out.println("Sending message to " + platform + " User with email: " +user.getEmail() +", and last active time: " +user.getLastActiveTime().toString());}).count();
        return (int) numberOfSentMessages;
    }
}
