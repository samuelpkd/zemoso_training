// Online Java Compiler
// Use this editor to write, compile and run your Java code online

abstract class Rodent {
    
    Rodent() {
        System.out.println("Rodent Constructor called");
    }
    abstract void eat();
    abstract void reproduce();
    abstract void communicate();
    
    void sleep() {
        System.out.println("Rodent is sleeping");
    } 
}

class Gerbil extends Rodent{
    
    Gerbil() {
        System.out.println("Gerbil Constructor called");
    }
    
    @Override
    void eat() {
        System.out.println("Gerbil eats");    
    }
    
    @Override
    void reproduce() {
        System.out.println("Gerbil reproduces");    
    }
    
    @Override
    void communicate() {
        System.out.println("Gerbil communicates");    
    }
}    
class Mouse extends Rodent{
    
    Mouse() {
        System.out.println("Mouse Constructor Called");
    }
    
    @Override
    void eat() {
        System.out.println("Mouse eats");    
    }
    
    @Override
    void reproduce() {
        System.out.println("Mouse reproduces");    
    }
    
    @Override
    void communicate() {
        System.out.println("Mouse communicates");    
    }
}    

class Hamster extends Rodent{
    
    Hamster() {
        System.out.println("Hamster Constructor called");
    }
    
    @Override
    void eat() {
        System.out.println("Hamster eats");    
    }
    
    @Override
    void reproduce() {
        System.out.println("Hamster reproduces");    
    }
    
    @Override
    void communicate() {
        System.out.println("Hamster communicates");    
    }
    
    @Override
    void sleep() {
        System.out.println("Hamster sleeping");    
    }
}    

class RodentCaller {
    public static void main(String[] args) {
        
        Mouse mouse = new Mouse();
        Hamster hamster = new Hamster();
        Gerbil gerbil = new Gerbil();
        Rodent rodent_array[] = {mouse,hamster,gerbil};
        for(Rodent rodent : rodent_array) {
            rodent.eat();
            rodent.reproduce();
            rodent.communicate();
            rodent.sleep();
        }
    }    
} 

   
