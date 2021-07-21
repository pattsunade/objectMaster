public class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;
    private String name;
    private int muerte = 0;
    

    public Human() {

    }
    public Human (String name) {
        setName(name);
}
   
    //getter/setter
    
    public int getHealth() {
        return health;
    }
    public int getMuerte() {
        return muerte;
    }
    public void setMuerte(int muerte) {
        this.muerte = muerte;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public void attack(Human human) {
        human.health -= this.strength;
        System.out.println(this.getName() + " Fue atacado por " + human.getName() +  " y su vida es de " + human.getHealth());

 }
    


    
}
