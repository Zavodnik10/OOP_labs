package ua.edu.ucu.apps.task1;

import java.time.LocalDateTime;

public interface MyUser {
    LocalDateTime getLastActiveTime();
    String getEmail();
    String getCountry();

}
