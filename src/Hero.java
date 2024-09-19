    public abstract class Hero implements Mortal{

        private String name;

        public Hero(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


        public abstract void takeDamage(int damage);

        public abstract void attackEnemy(Enemy enemy);

    }


