public class HumanTest {
    public static void main(String[] args) {
        
        Ninja ninja = new Ninja("Naruto");
        Samurai samurai = new Samurai("Sakura");
        Wizard wizard = new Wizard("Hinata");

        ninja.attack(samurai);
        ninja.attack(wizard);
        wizard.heal(ninja);
        samurai.deathBlow(wizard);
        samurai.deathBlow(wizard);
        samurai.deathBlow(wizard);
        wizard.heal(samurai);
        wizard.attack(ninja);
        ninja.steal(samurai);
        ninja.runAway();
        samurai.meditate();
        samurai.howMany();

        
        
        
	}
        
    }
