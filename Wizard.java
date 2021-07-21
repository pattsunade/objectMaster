public class Wizard extends Human {
    public Wizard(String name) {
        setName(name);
        this.setHealth(50);
        this.setIntelligence(8);

    }
 public void heal(Human human) {
        human.setHealth(human.getHealth() + this.getIntelligence());
        System.out.println(this.getName() + " curo a " + human.getName() + "en " + this.getIntelligence() + " puntos");
    }
    public void fireBall(Human human) {
        human.setHealth(human.getHealth() - this.getHealth() * 3);
        System.out.println(human.getName() + "ha lanzado un sharigan " + human.getName() + " ha restado " +  this.getIntelligence()*3 + " ya");
    }


}
