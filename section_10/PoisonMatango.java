public class PoisonMatango extends Matango10_q10_3 {
    int poisonAttack = 5;
    int hp = 80;

    public PoisonMatango(char suffix) {
        super(suffix);
        this.suffix = suffix;
    }

    public void attack(Hero h) {
        super.attack(h);
        if (this.poisonAttack > 0) {

            System.out.println("さらに毒の胞子をばらまいた!");
            h.hp = h.hp / 5;
            System.out.println(h.hp + "ポイントのダメージ!");
            this.poisonAttack -= 1;
            System.out.println("攻撃可能回数残り:" + this.poisonAttack + "回");

        }

    }

    // 逃げる
    public void run() {
        System.out.println("お化け毒キノコ" + this.suffix + "は逃げ出した!");
    }
}
