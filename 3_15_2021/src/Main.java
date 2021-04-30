import Items.Modifiers;
import Items.Weapons;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        // Membuat berbagai macam obj yang dibutuhkan
        Modifiers mo = new Modifiers(null,null, 0);
        Weapons we = new Weapons(null, null, 0);
        Battle battle = new Battle();

        // Deklarasi Variabel
        Weapons[] weapons = {mo.myrtenaster(), mo.destruc(), mo.kneiv()};
        int choice = 0;
        boolean c = true;


        do {
            System.out.print("Pick a weapon FAST : \n1. Myrtenaster \n2. Destructeur \n3. Kniv \n: ");
            String s = S.nextLine();
            if(s.equalsIgnoreCase("myrtenaster")){
                System.out.println
                        ("\"The Myrtenaster, it is said to be one of the most unique rapiers in this realm, \nthe Nix family have been using this weapon since the establishment of Sirius Empire.\nAm I really going to use this ? \" ");
                we.setweapon(mo.myrtenaster());
                we.weapons.DisplayWeapons();
                choice = 1;
                c = false;
            }
            else if(s.equalsIgnoreCase("destructeur")){
                System.out.println
                        ("\"Destructeur D'etoiles, legend has it that it has the ability to even destroy an ancient star\nIt was Juno's weapon of choice, it was given to him back in Rigel\n Your death will not be in vain my friend....\nAm I really going to use this ? \"");
                we.setweapon(mo.destruc());
                we.weapons.DisplayWeapons();
                choice = 2;
                c = false;
            }
            else if(s.equalsIgnoreCase("kniv")){
                System.out.println
                        ("\"Kniv, it's swedish for knife, I remembered I held the same exact knife back on earth.\nBut this feels different, it has a strong dark energy surging inside of it\nAm I really going to use this ? \"");
                we.setweapon(mo.kneiv());
                we.weapons.DisplayWeapons();
                choice = 3;
                c = false;
            }else {
                System.out.println("Stop joking around, TAO will destroy this realm ANY MINUTE NOW IF YOU DON'T TAKE THIS SERIOUSLY" );
                continue;
            }
            System.out.println("Are you sure you want to use this weapon ?");
            System.out.print("Yes / No : ");
            String Na = S.next();
            S.nextLine();
            if(Na.equalsIgnoreCase("no")){
                c = true;
            }else{
                System.out.println("\nGood luck Anwyll, just... don't die ok?\n");
            }
        }while (c);


        battle.BattleSystem(S,weapons[choice - 1]);

        battle.BattleSystem_Phase2(S,weapons[choice - 1]);
    }

}
