package strategy;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Attacking with Axe \uD83E\uDE93!");
    }
}
