package Items;

public class Modifiers extends Weapons{

    public Modifiers(String name, String element, int att) {
        super(name, element, att);
    }
    public Weapons myrtenaster(){
        this.name = "The Myrtenaster";
        this.att = 350;
        this.element = "Ice";
        Weapons w = new Weapons(this.name, this.element, this.att);
        this.weapons = w;
        return w;
    }
    public Weapons destruc(){
        this.name = "Desturcteur D'etoiles";
        this.att = 200;
        this.element = "Fire";
        Weapons w = new Weapons(this.name, this.element, this.att);
        weapons = w;
        return w;
    }
    public Weapons kneiv(){
        this.name = "KNEIV KNEIV JAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        this.att = 180;
        this.element = "void";
        Weapons w = new Weapons(this.name, this.element, this.att);
        weapons = w;
        return w;
    }
}
