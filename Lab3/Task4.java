import java.util.Scanner;

interface Learnable {
    
}

abstract class Human {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Human implements Learnable {
    private String name;
    private String gender;

    public Student() {
        // Default constructor
    }

    public Student(int age, String name, String gender) {
        setAge(age);
        setName(name);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{age=" + getAge() + ", name='" + getName() + "', gender='" + getGender() + "'}";
    }
}

public class Task4 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = sc.nextInt();
        Student st;
        if (choice == 0) {
            st = new Student();
            System.out.println((st instanceof Learnable) && (st instanceof Human));
        } else if (choice == 1) {
            st = new Student(18, "Oleh", "male");
            System.out.println(st);
        } else if (choice == 2) {
            Human hm = new Student();
            System.out.println(hm.getAge());
        }
    }
}
