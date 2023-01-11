public class Hero {
    String name;
    int hp = 100;

    public Hero(String name) {
        this.name = name;
        System.out.println("勇者" + this.name + "誕生!");
    }

    // 戦う
    public void attack(Matango10_q10_3 m) {
        System.out.println(this.name + "の攻撃!");
        m.hp -= 5;
        System.out.println("お化けキノコ" + m.suffix + "に5ポイントのダメージをあたえた!");
    }

    public void attack(PoisonMatango pm) {
        System.out.println(this.name + "の攻撃!");
        pm.hp -= 5;
        System.out.println("お化け毒キノコ" + pm.suffix + "に5ポイントのダメージをあたえた!");
    }

    // 逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した!");
    }

}
