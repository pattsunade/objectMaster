public class Samurai extends Human {
    public Samurai(String name) {
        setName(name);
    }
public Samurai() {
        this.setHealth(getHealth() + 200);
        
    }

    public void deathBlow(Human human) {
        human.setHealth(human.getHealth() - human.getHealth());
        this.setHealth(this.getHealth() / 2);
        this.setMuerte(this.getMuerte()+1);
        System.out.println(this.getName() + " asesino a " + human.getName());
    }

    public void meditate() {
        this.setHealth(this.getHealth() + this.getHealth() / 2);
        System.out.println(this.getName() + " descanso y se recupero: " + this.getHealth()/2 + " puntos de Salud");
    }

    public void howMany() {
    System.out.println("La posicion de " + this.getName() +" es de "+ this.getMuerte());
}

}
