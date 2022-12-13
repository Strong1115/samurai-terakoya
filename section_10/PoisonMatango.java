public class PoisonMatango extends Matango10_q10_3 {
    int poisonAttack = 5;

    public PoisonMatango(char suffix) {
        super('A');
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
}
