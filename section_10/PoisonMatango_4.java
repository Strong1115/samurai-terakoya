public class PoisonMatango_4 extends Matango10_q10_4 {
    int poisonAttack = 5;
    int hp = 80;

    public PoisonMatango_4(char suffix) {
//        System.out.println("お化け毒キノコ" + this.suffix + "誕生!");
        super("お化け毒キノコ", suffix);
    }

    public void attack(Hero_2 hero) {

        System.out.println("【" + "お化け毒キノコ" + this.suffix + "】" + "の攻撃");
        System.out.println("毒の胞子をばらまいた!");
        hero.hp -= 20;
        System.out.println(hero.name + "に20ポイントのダメージをあたえた!");
        this.poisonAttack--;

        if (hero.hp <= 0) {
            System.out.println("モンスターに負けました");
            System.out.println("<GAME OVER>");

        } else {
/*            System.out.println("お化け毒キノコ" + this.suffix + "の攻撃");
            System.out.println("毒の胞子をばらまいた!");
            hero.hp -= 20;
            System.out.println(hero.name + "に20ポイントのダメージをあたえた!");
            this.poisonAttack--;*/
            System.out.println(hero.name + "のHPは残り" + hero.hp);

        }
        System.out.println();

    }

    // 逃げる
    public void run() {
        System.out.println("お化け毒キノコ" + this.suffix + "は逃げ出した!");
    }
}