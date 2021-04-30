package Items;

public class Weapons {

    public Weapons weapons;
    public int att;
    public String name, element;

    public Weapons(String name, String element, int att){
        this.name = name;
        this.att = att;
        this.element = element;
    }
    public void setweapon(Weapons weapons){
        this.weapons = weapons;
    }
    public void DisplayWeapons(){
        System.out.println("Name : " + name + "\nAttack : " + att + "\nElement : "
                + element);
    }

}
