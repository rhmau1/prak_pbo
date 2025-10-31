package jobsheet10.Tugas;

public abstract class Zombie implements Destroyable {
    int health;
    int level;

    public abstract void heal();

    public abstract void destroyed();

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}
