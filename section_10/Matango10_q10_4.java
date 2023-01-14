public class Matango10_q10_4 {
    int hp = 50;
    char suffix;

    public Matango10_q10_4(char suffix) {
        this.suffix = suffix;
    }

    public void attack(Hero_2 hero) {

        if (hero.hp <= 0) {
            System.out.println("モンスターに負けました");
            System.out.println("GAME OVER");

        } else {
            System.out.println("お化けキノコ" + this.suffix + "の攻撃");
            System.out.println(hero.name + "に10のダメージをあたえた!");
            hero.hp -= 10;
            System.out.println(hero.name + "のHPは残り" + hero.hp);

        }
    }

    // 逃げる
    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した!");
    }

}
