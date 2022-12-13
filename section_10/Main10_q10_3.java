public class Main10_q10_3 {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.hp = 100;
        h.name = "ほのか";

        Matango10_q10_3 m = new Matango10_q10_3('A');
        PoisonMatango pm = new PoisonMatango('B');

        System.out.println("勇者" + h.name + "誕生!");
        System.out.println("お化け毒キノコ" + pm.suffix + "が現れた!");

        pm.attack(h);

    }

}
