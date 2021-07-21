public class Ninja extends Human {
    public Ninja(String name) {
        setName(name);
    }
public Ninja() {
    this.setStealth(getStealth() + 10);
}

public void steal(Human human) {
    human.setHealth(human.getHealth() - this.getStealth());
    this.setHealth(this.getStealth() + this.getStealth());
    System.out.println(this.getName() + " ha robado a "+ human.getName() + this.getStealth() + " Puntos");
}
public void runAway() {
    this.setHealth(getHealth() - 10);
    System.out.println(this.getName() + " ha huido y tiene " + this.getHealth() + " puntos de vida");
}
 
 }

