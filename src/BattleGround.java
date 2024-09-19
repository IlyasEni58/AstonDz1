public class BattleGround {
    public static void main(String[] args) {
        Hero hero1 = new Archer("Toha");
        Hero hero2 = new Warrior("Sanya");
        Hero hero3 = new Mage("Danil");
        Enemy enemy = new Enemy(100);

        hero1.attackEnemy(enemy);
        hero2.attackEnemy(enemy);
        hero3.attackEnemy(enemy);
        hero1.isAlive();
        hero2.isAlive();
        hero3.isAlive();
        enemy.attackHero(hero1);
        enemy.attackHero(hero2);
        enemy.attackHero(hero3);

    }
}
