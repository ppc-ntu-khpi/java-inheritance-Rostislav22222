
package domain;

public class Dragon  extends Animal {
    
    public Dragon(String name, int age) {
        super(name,age);
    }
    public void cave() {
        System.out.println("i'm in a cave");
    }
}
