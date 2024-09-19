public class Enemy implements Mortal {
    private int health;
    private final int DAMAGE = 80;

    public Enemy(int health) {
        if (health < 0) {
            throw new IllegalArgumentException("Здоровье должно быть положительным!!!");
        }
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }


    public void attackHero(Hero hero) {
        hero.takeDamage(this.DAMAGE);
        if (hero instanceof Archer) {
            System.out.println("Враг бьет лучника");
        } else if (hero instanceof Warrior) {
            System.out.println("Враг бьет война");
        } else {
            System.out.println("Враг бьет мага");
        }
    }


    @Override
    public boolean isAlive() {
        return this.health > 0;
    }


}


