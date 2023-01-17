public class Matango10_q10_4 {
    int hp = 50;
    char suffix;

    public Matango10_q10_4(char suffix) {
//        this.suffix = suffix;
        this("お化けキノコ", suffix);
    }

    public Matango10_q10_4(String name, char suffix) {
        this.suffix = suffix;
        System.out.println(name + this.suffix + "誕生!");
    }

    public void attack(Hero_2 hero) {

        System.out.println("【" + "お化けキノコ" + this.suffix + "】" + "の攻撃");
        System.out.println(hero.name + "に10のダメージをあたえた!");
        hero.hp -= 10;

        if (hero.hp <= 0) {
            System.out.println("モンスターに負けました");
            System.out.println("GAME OVER");

        } else {
            /*System.out.println("お化けキノコ" + this.suffix + "の攻撃");
            System.out.println(hero.name + "に10のダメージをあたえた!");
            hero.hp -= 10;*/
            System.out.println(hero.name + "のHPは残り" + hero.hp);

        }
        System.out.println();
    }

    // 逃げる
    public void run() {
        System.out.println("お化けキノコ" + this.suffix + "は逃げ出した!");
    }

}
