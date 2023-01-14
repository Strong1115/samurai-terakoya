public class Main10_q10_4 {
    public static void main(String[] args) {
        Hero_2 hero = new Hero_2("ほのか");

        Matango10_q10_4 matango = new Matango10_q10_4('A');
        System.out.println("お化けキノコ" + matango.suffix + "誕生!");

        PoisonMatango_4 poisonMatango = new PoisonMatango_4('B');

        /*
         * 勇者勝ちパターン
         * hero.attack(matango);
         * hero.attack(poisonMatango);
         * 
         * matango.attack(hero);
         * poisonMatango.attack(hero);
         * 
         * hero.attack(matango);
         * hero.attack(poisonMatango);
         * 
         * poisonMatango.attack(hero);
         * 
         * hero.attack(matango);
         * hero.attack(matango);
         * hero.attack(matango);
         * 
         * poisonMatango.run();
         */

        // 勇者負けパターン
        matango.attack(hero);
        poisonMatango.attack(hero);

        hero.attack(matango);
        hero.attack(poisonMatango);

        matango.attack(hero);
        poisonMatango.attack(hero);

        hero.attack(matango);
        hero.attack(poisonMatango);

        matango.attack(hero);
        poisonMatango.attack(hero);

        hero.attack(matango);
        hero.attack(poisonMatango);

        matango.attack(hero);
        poisonMatango.attack(hero);

    }

}
