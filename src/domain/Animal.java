package domain;

public class Animal {

    protected String name;

    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }

    public void eat() {
        System.out.println("I am eating");
    }
    
    public void run() {
        System.out.println("I am runing");
    }
}
