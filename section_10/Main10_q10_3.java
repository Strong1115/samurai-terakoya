public class Main10_q10_3 {
    public static void main(String[] args) {
        Hero hero = new Hero("ほのか");

        Matango10_q10_3 matango = new Matango10_q10_3('A');
        PoisonMatango poisonMatango = new PoisonMatango('B');

        System.out.println("勇者" + h.name + "誕生!");
        System.out.println("お化けキノコ" + m.suffix + "が現れた!");
        System.out.println("お化け毒キノコ" + pm.suffix + "が現れた!");

        matango.attack(hero);
        poisonMatango.attack(hero);

        hero.attack(matango);
        hero.attack(poisonMatango);

        matango.run();
        poisonMatango.run();

    }

}
