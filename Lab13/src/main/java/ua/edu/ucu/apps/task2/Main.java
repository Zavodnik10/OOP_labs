package ua.edu.ucu.apps.task2;

public class Main {
    public static void main(String[] args) {
        Auth authClient = new Auth();
        DataBase db = new DataBase();
        

        if (authClient.login(db)) {
            ReportBuilder reportBuilder = new ReportBuilder(db);
            System.out.println(reportBuilder.getDb() instanceof DataBase);
        }
    }
}
