public class Archer extends Hero implements Mortal {
    public int health = 60;
    private final int DAMAGE = 10;

    public Archer(String name) {
        super(name);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
        if (enemy.isAlive()) {
            System.out.printf("Лучник %s стреляет. Нанесеный урон: %d. Остаток здоровья у врага: %d \n", getName(), DAMAGE, enemy.getHealth());
        } else {
            System.out.println("Враг повержен.");
        }

    }

    @Override
    public boolean isAlive() {
        boolean alive = this.health > 0;
        System.out.println("Жив ли герой " + getName() + "? " + alive);
        return alive;
    }
}

