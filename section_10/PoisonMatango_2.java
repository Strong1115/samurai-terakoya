public class PoisonMatango_2 extends Matango10_q10_3 {
    int poisonAttack = 5;
    int hp = 80;

    public PoisonMatango_2(char suffix) {
        super(suffix);
        System.out.println("お化け毒キノコ" + this.suffix + "誕生!");
    }

    public void attack(Hero hero) {
        super.attack(hero);

        for (int poisonAttack = 1; poisonAttack <= 6; poisonAttack++) {

            if (this.poisonAttack > 0) {

                System.out.println("さらに毒の胞子をばらまいた!");
                int dmg = hero.hp / 5;
                System.out.println(dmg + "ポイントのダメージ!");
                this.poisonAttack--;
                System.out.println("攻撃可能回数残り:" + this.poisonAttack + "回");

            } else {
                System.out.println("攻撃できません");

            }
        }
    }
}
