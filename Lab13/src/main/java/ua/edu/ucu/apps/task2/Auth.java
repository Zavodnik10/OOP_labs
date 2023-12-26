package ua.edu.ucu.apps.task2;

public class Auth extends Authorization {
    public boolean login(DataBase db) {return authenticate(db);}
}
