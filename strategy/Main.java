import strategy.KnifeBehavior;

public class Main {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();

        Character queen = new Queen();
        queen.fight();
        queen.fight();
    }
}