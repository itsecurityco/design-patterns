package strategy;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Attacking with Bow and Arrow \uD83C\uDFF9!");
    }
}
