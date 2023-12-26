import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.task1.*;
import ua.edu.ucu.apps.task2.*;

public class Lab13Tests {

    @Test
    void testTask1() {
        List<MyUser> users = Arrays.asList(new MyFacebookUser(new FacebookUser("first", "UA", LocalDateTime.now())),new MyTwitterUser(new TwitterUser("second", "FP", LocalDateTime.now().minusHours(2))));
        MessageSender messageSender = new MessageSender();
        int ukrainians = messageSender.send("Find", users, "UA");
        assertEquals(ukrainians, 1);
    }

    @Test
    void testTask2() {
        DataBase db = new DataBase();
        Auth authClient = new Auth();
        if (authClient.login(db)) {
            ReportBuilder reportBuilder = new ReportBuilder(db);
            assertTrue(reportBuilder.getDb() instanceof DataBase);
        }
    }
}
