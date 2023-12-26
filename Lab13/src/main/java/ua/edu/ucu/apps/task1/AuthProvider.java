package ua.edu.ucu.apps.task1;

import java.time.LocalDateTime;

public class AuthProvider {
    public static MyUser authenticate(String email, String country, SocialNetwork socialMedia) {
        switch (socialMedia) {
            case FACEBOOK:
                return MyUserFactory.createFacebookUser(email, country, LocalDateTime.now());
            case X:
                return MyUserFactory.createFacebookUser(email, country, LocalDateTime.now());
            case TWITTER:
                return MyUserFactory.createTwitterUser(email, country, LocalDateTime.now());
        }
    }
}