public class Warrior extends Hero implements Mortal {
    private int health = 120;
    private final int DAMAGE = 70;

    public Warrior(String name) {
        super(name);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }


    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE);
        if (enemy.isAlive()) {
            System.out.printf("Воин %s атакует врага. Нанесеный урон: %d. Остаток здоровья у врага: %d \n", getName(), DAMAGE, enemy.getHealth());
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

