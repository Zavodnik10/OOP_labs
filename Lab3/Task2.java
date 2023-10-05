import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt(); // <- 93

        Man man = new Man(); // Create a Man instance
        System.out.println(man.sayAge()); // prints '0'
        changeAge(man, age);
        System.out.println(man.sayAge()); // prints '93'
    }

    public static void changeAge(Man a, int age){
        a.setAge(age); // Set the age using the setAge method in the Man class
    }
}

class Man {
    private int age;

    public Man(){
        age = 0;
    }

    public Man(int age){
        this.age = age;
    }

    public int sayAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                '}';
    }
}
