
package lesson9.shapes.Monsterexample;

public class Zombie implements Monster {

    private String name;
    public Zombie(String n){
        name = n;
    }
    @Override
    public void attack() {
        System.out.println("I am eating your brains");
    }

    @Override
    public String indentify() {
        return("I am " + name +" the zombie");
    }
    
}
