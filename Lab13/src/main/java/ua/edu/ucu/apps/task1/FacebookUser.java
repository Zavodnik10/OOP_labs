package ua.edu.ucu.apps.task1;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.ToString;
import lombok.AllArgsConstructor;

@Data
@ToString
@AllArgsConstructor
public class FacebookUser {
    private String email;
    private String country;
    private LocalDateTime userActiveTime;
}
