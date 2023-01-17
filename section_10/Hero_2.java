public class Hero_2 {
    String name;
    int hp = 100;

    public Hero_2(String name) {
        this.name = name;
        System.out.println("勇者" + this.name + "誕生!");
    }

    // 戦う
    public void attack(Matango10_q10_4 matango) {

        System.out.println("【" + this.name + "】" + "の攻撃!");
        matango.hp -= 15;
        System.out.println("お化けキノコ" + matango.suffix + "に15ポイントのダメージをあたえた!");

        if (matango.hp <= 0) {
//            System.out.println("お化け毒キノコ" + matango.suffix + "のHPは0になった");
            System.out.println("お化けキノコ" + matango.suffix + "のHPは0になった");
            System.out.println("お化けキノコ" + matango.suffix + "を倒した!");

        } else {
/*            System.out.println(this.name + "の攻撃!");
            matango.hp -= 15;
            System.out.println("お化けキノコ" + matango.suffix + "に15ポイントのダメージをあたえた!");*/
            System.out.println("お化けキノコ" + matango.suffix + "のHPは残り" + matango.hp);
        }
        System.out.println();
    }

    public void attack(PoisonMatango_4 poisonMatango) {

        System.out.println("【" + this.name + "】" + "の攻撃!");
        poisonMatango.hp -= 10;
        System.out.println("お化け毒キノコ" + poisonMatango.suffix + "に10ポイントのダメージをあたえた!");

        if (poisonMatango.hp <= 0) {
            System.out.println("お化け毒キノコ" + poisonMatango.suffix + "のHPは0になった");
            System.out.println("お化け毒キノコ" + poisonMatango.suffix + "を倒した!");

        } else {
            /*System.out.println(this.name + "の攻撃!");
            poisonMatango.hp -= 10;
            System.out.println("お化け毒キノコ" + poisonMatango.suffix + "に10ポイントのダメージをあたえた!");*/
            System.out.println("お化け毒キノコ" + poisonMatango.suffix + "のHPは残り" + poisonMatango.hp);
        }
        System.out.println();
    }

    // 逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した!");
    }

}
