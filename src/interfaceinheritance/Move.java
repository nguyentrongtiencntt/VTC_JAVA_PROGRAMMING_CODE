package interfaceinheritance;

public class Move implements Movable{
    private Movable movable;
    public Move() {
    }

    public Move(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void crew() {
        System.out.println("Do crew!");
    }
    public void start(){
        System.out.println("Start running!");
    }
}
