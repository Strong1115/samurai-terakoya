public class Main10_q10_3 {
    public static void main(String[] args) {
        Hero h = new Hero("ほのか");

        Matango10_q10_3 m = new Matango10_q10_3('A');
        PoisonMatango pm = new PoisonMatango('B');

        System.out.println("勇者" + h.name + "誕生!");
        System.out.println("お化けキノコ" + m.suffix + "が現れた!");
        System.out.println("お化け毒キノコ" + pm.suffix + "が現れた!");

        m.attack(h);
        pm.attack(h);

        h.attack(m);
        h.attack(pm);

        m.run();
        pm.run();

    }

}
