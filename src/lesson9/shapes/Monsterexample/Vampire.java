
package lesson9.shapes.Monsterexample;

public class Vampire implements Monster {

    private String name;
    
    public Vampire(String n){
    name = n;
    }
    @Override
    public void attack() {
        System.out.println("I am biting your neck");
    }

    @Override
    public String indentify() {
        return("I am "+ name + " vampire!");
    }
    
}
