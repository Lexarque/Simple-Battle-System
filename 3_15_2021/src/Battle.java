import Entity.*;
import Items.*;
import java.util.Scanner;

public class Battle extends Main{

    Enemy TAO = new Enemy("The Ancient One", 3000, 140);
    Player player = new Player("Anwyll Polaris", 3500, 300);
    int amount_SHP = 3;
    int amount_MHP = 2;
    int amount_LHP = 1;

    public void BattleSystem(Scanner S, Weapons weapons) {

        do{

            System.out.println("What action do you want to do ? : ");
            System.out.println("1. Attack | 2. Defense | 3. Heal | 4. Inspect");
            System.out.print(": ");

            int choice = S.nextInt();
            S.nextLine();

            if (choice == 1) {
                System.out.println("You attacked and deals : " + weapons.att + " damage");
                TAO.health -= weapons.att;
                System.out.println("The Ancient One attacked and deals " + TAO.pow + " damage");
                player.health -= TAO.pow;

            } else if (choice == 2) {
                System.out.println("You blocked some of it's attack");
                int Odamage = (player.defense - TAO.pow) / 2;
                System.out.println("The ancient one deals " + Odamage + " damage");
                player.health -= Odamage;

            } else if (choice == 3) {
                System.out.println("1. Small Health Potions : " + amount_SHP + "\n2. Medium Health Potions " + amount_MHP
                + "\n3. Large Health Potions : " + amount_LHP + "\n4. Cancel");
                System.out.print(": ");
                String choice2 = S.nextLine();
                if(choice2.equalsIgnoreCase("1")){
                   if(amount_SHP > 0 ){
                       System.out.println("You recovered 100HP !");
                       player.health += 100;
                       amount_SHP--;
                   }
                   else {
                       System.out.println("You are out of small health potions ! ");
                   }
                }
                else if(choice2.equalsIgnoreCase("2")){
                    if(amount_MHP > 0 ){
                        System.out.println("You recovered 250HP !");
                        player.health += 250;
                        amount_MHP--;
                    }
                    else {
                        System.out.println("You are out of medium health potions ! ");
                    }
                }
                else if(choice2.equalsIgnoreCase("3")){
                    if(amount_LHP > 0 ){
                        System.out.println("You recovered 500HP !");
                        player.health += 500;
                        amount_LHP--;
                    }
                    else {
                        System.out.println("You are out of Large health potions ! ");
                    }
                }

            } else if(choice == 4){
                System.out.println("1. " + player.name + "\n2. " + TAO.name + "\n3. Cancel");
                System.out.print(": ");
                String choice3 = S.nextLine();
                if(choice3.equalsIgnoreCase("1")){
                    System.out.println("Health : " + player.health + "\nDefense : " + player.defense
                    + "\nAttack : " + weapons.att + "\nWeapon name : " + weapons.name + "\nWeapon Element : "
                    + weapons.element);
                }
                else if(choice3.equalsIgnoreCase("2")){
                    System.out.println("Health : " + TAO.health + "\nAttack : " + TAO.pow);
                }
            }
        }while(TAO.health > 1500);

        System.out.print("\n\"Suddenly you felt something, you can't quite define what it is,\n");
        System.out.print("it's something similar to the feeling you had in Magnolia. And suddenly\n");
        System.out.print(",it came, the very thing that every single living thing on this universe feared came true.\n");
        System.out.print("The Ancient One true form, you can't grasp what it is, it has many familiar forms\n");
        System.out.print(",yet you can't quite picture what it is, it has many tentacles\n");
        System.out.print(",yet every single one of it doesn't resemble any animals on the sea\n");
        System.out.print(",you can't move, your legs are trembling, you feel lightheaded,\n");
        System.out.print("but as a hero, you must do anything possible to save this universe.\"\n");

    }

    public void BattleSystem_Phase2(Scanner S, Weapons weapons){

        System.out.println("\nThe Ancient one power is greatly increased !");
        TAO.pow += 360;
        TAO.health += 1000;

        if(weapons.att == 350){
            System.out.println("\nYou suddenly felt a gentle breeze of cold wind, it's..... calming");
            System.out.println("You recovered some health !");
            player.health += 500;
        } else if(weapons.att == 200){
            System.out.println("\nYou heard a familiar voice calling out your name, you felt more determined");
            System.out.println("Your attack is increased ! ");
            System.out.println("You recovered some health ! ");
            weapons.att += 150;
            player.health += 250;
        } else if(weapons.att == 180){
            System.out.println("\n\"KNIV !!!, KNIV !!!, JAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
            System.out.println("You remembered something from earth, you chuckled");
            System.out.println("Your attack is greatly increased ! ");
            weapons.att += 480;
        }

        do {

            System.out.println("What action do you want to do ? : ");
            System.out.println("1. Attack | 2. Defense | 3. Heal | 4. Inspect");
            System.out.print(": ");

            int choice = S.nextInt();
            S.nextLine();

            if (choice == 1) {
                System.out.println("You attacked and deals : " + weapons.att + " damage");
                TAO.health -= weapons.att;
                System.out.println("The Ancient One attacked and deals " + TAO.pow + " damage");
                player.health -= TAO.pow;

            } else if (choice == 2) {
                System.out.println("You blocked some of it's attack");
                int Odamage = (TAO.pow - player.defense) / 2;
                System.out.println("The ancient one deals " + Odamage + " damage");
                player.health -= Odamage;

            } else if (choice == 3) {
                System.out.println("1. Small Health Potions : " + amount_SHP + "\n2. Medium Health Potions " + amount_MHP
                        + "\n3. Large Health Potions : " + amount_LHP + "\n4. Cancel");
                System.out.print(": ");
                String choice2 = S.nextLine();
                if(choice2.equalsIgnoreCase("1")){
                    if(amount_SHP > 0 ){
                        System.out.println("You recovered 100HP !");
                        player.health += 100;
                        amount_SHP--;
                    }
                    else {
                        System.out.println("You are out of small health potions ! ");
                    }
                }
                else if(choice2.equalsIgnoreCase("2")){
                    if(amount_MHP > 0 ){
                        System.out.println("You recovered 250HP !");
                        player.health += 250;
                        amount_MHP--;
                    }
                    else {
                        System.out.println("You are out of medium health potions ! ");
                    }
                }
                else if(choice2.equalsIgnoreCase("3")){
                    if(amount_LHP > 0 ){
                        System.out.println("You recovered 500HP !");
                        player.health += 500;
                        amount_LHP--;
                    }
                    else {
                        System.out.println("You are out of Large health potions ! ");
                    }
                }

            } else if(choice == 4){
                System.out.println("1. " + player.name + "\n2. " + TAO.name + "\n3. Cancel");
                System.out.print(": ");
                String choice3 = S.nextLine();
                if(choice3.equalsIgnoreCase("1")){
                    System.out.println("Health : " + player.health + "\nDefense : " + player.defense
                            + "\nAttack : " + weapons.att + "\nWeapon name : " + weapons.name + "\nWeapon Element : "
                            + weapons.element);
                }
                else if(choice3.equalsIgnoreCase("2")){
                    System.out.println("Health : " + TAO.health + "\nAttack : " + TAO.pow);
                }
            }
            if (player.health < 0){
                System.out.println("_________________GAME OVER___________________");
                System.out.println("          Would you like to try again ?      ");
                break;
            }
            else if(TAO.health < 0){
                System.out.print("\n\" You have battled for a while, but The Ancient One doesn't show signs of weakness,\n");
                System.out.print("it only keeps getting stronger. You know what have to be done. The next attack\n");
                System.out.print("you're going to use is like gambling with death itself, you may survive, but you\n");
                System.out.print("don't know what you will lose, you may lose your sanity or body, but at least this\n");
                System.out.print("universe is safe\"\n");

                System.out.println("\nA combination of every elements that exist envelops your weapon, you brace yourself");
                System.out.println("on what's going to happen next, you're scared, but it's the only way...to end this");

                System.out.println("\nAnwyll : \"Get ready to be wiped from this universe\"");
            }

        }while(TAO.health > 0);

    }

}




