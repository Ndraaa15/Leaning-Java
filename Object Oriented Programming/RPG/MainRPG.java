package src.OOP_C.RPG;


import java.util.Random;

class Hero {
    public String name;
    public int hp;
    public int def;
    public int baseAtk;
    public int level;
    public Weapon weapon;

    //Constructor
    public Hero(String name, int hp, int def, int baseAtk, int level, Weapon weapon) {
        this.name = name;
        this.hp = hp;
        this.def = def;
        this.baseAtk = baseAtk;
        this.level = level;
        this.weapon = weapon;
    }

    public void attack (Enemy enemy){
        int atk = (this.level * this.baseAtk) + this.weapon.atk;
        atk = atk - (enemy.def + this.weapon.randomAtk(this.weapon));
        this.weapon.use();
        enemy.hp -= atk;
    }
    public void defense (){
        this.def += this.baseAtk * (this.level / 2);
    }
    public void heal (){
        hp = 100;
    }

}

class Enemy{
    public String name;
    public int hp;
    public int def;
    public int baseAtk;
    public int level;
    public Weapon weapon;

    public Enemy(String name, int hp, int def, int baseAtk, int level, Weapon weapon) {
        this.name = name;
        this.hp = hp;
        this.def = def;
        this.baseAtk = baseAtk;
        this.level = level;
        this.weapon = weapon;
    }

    public void  attack (Hero hero){
        int atk = (this.level * this.baseAtk) + this.weapon.atk;
        atk = atk - (hero.def + this.weapon.randomAtk(this.weapon));
        this.weapon.use();
        hero.hp -= atk;
    }

    public void defense (){
        this.def += this.baseAtk * (this.level / 2);
    }
    public void remedy (){
        hp = 100;
    }

}

class Weapon{
    public int atk;
    public String name;
    public boolean isBroken;
    public int condition;
    public Weapon(int atk, String name, boolean isBroken, int condition) {
        this.atk = atk;
        this.name = name;
        this.isBroken = isBroken;
        this.condition = condition;
    }
    public void repair (){
        condition = 100;
    }

    public void use (){
        this.condition -= 10;
    }

    public int randomAtk (Weapon weapon){
        Random num = new Random();
        int randomNum = num.nextInt(4);
        double percentAtk = 0;
        if (randomNum == 1){
            percentAtk = 0.1;
        } else if (randomNum == 2) {
            percentAtk = 0.2;
        } else if (randomNum == 3) {
            percentAtk = 0.3;
        }
        return (int) (Math.round(percentAtk * weapon.atk));
    }

}


public class MainRPG {
    public static void main(String[] args) {

        Weapon Excalibur = new Weapon(5, "Exalibur", false, 100);
        Weapon BlackMagic = new Weapon(6, "BlackMagic", false, 90);

        Hero LightSaber = new Hero("LightSaber", 200, 0, 15, 17, Excalibur);
        Enemy DarkSoul = new Enemy("DarkSoul", 175, 0, 15, 18, BlackMagic);

        LightSaber.attack(DarkSoul);

        DarkSoul.defense();

        DarkSoul.attack(LightSaber);

        LightSaber.defense();

        DarkSoul.remedy();

        LightSaber.heal();

        Excalibur.repair();

        BlackMagic.repair();
    }
}
