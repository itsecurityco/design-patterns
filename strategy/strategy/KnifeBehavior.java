package strategy;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Attacking with Knife \uD83D\uDD2A!");
    }
}
