public class Main10_q10_3 {
    public static void main(String[] args) {
        Hero hero = new Hero("ほのか");

        Matango10_q10_3 matango = new Matango10_q10_3('A');
        System.out.println("お化けキノコ" + matango.suffix + "誕生!");

        PoisonMatango_2 poisonMatango = new PoisonMatango_2('B');

        matango.attack(hero);
        poisonMatango.attack(hero);

        hero.attack(matango);
        hero.attack(poisonMatango);

        matango.run();
        poisonMatango.run();

    }

}
