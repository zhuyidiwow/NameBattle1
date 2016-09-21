package Skills;

/**
 * Created by HKLLC on 2016/9/20.
 */
public abstract class Skills {
    String name;
    int damage;

    public Skills (String a, int b) {
        this.name = a;
        this.damage = b;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
}
