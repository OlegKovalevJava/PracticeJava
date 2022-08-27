public class Hero extends FantasyCharacter {
    public Hero(String name, int health, int agility, int strength, int experience, int gold) {
        super(name, health, agility, strength, experience, gold);
    }

    public void say() {
        System.out.println("I'm a HERO!!!");
    }
}
