package jobsheet10.Tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        if (level == 1) {
            health += 0.1 * health;
        } else if (level == 2) {
            health += 0.3 * health;
        } else if (level == 3) {
            health += 0.4 * health;
        }
    }

    @Override
    public void destroyed() {
        health -= 0.02 * health;
    }

    @Override
    public String getZombieInfo() {
        String info = "Walking Zombie Data =\n";
        info += super.getZombieInfo() + "\n";
        return info;
    }
}
