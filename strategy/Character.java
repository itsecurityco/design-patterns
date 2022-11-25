import strategy.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;

    public Character() {}

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
