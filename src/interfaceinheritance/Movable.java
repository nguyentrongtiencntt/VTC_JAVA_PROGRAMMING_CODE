package interfaceinheritance;

public interface Movable {
    void crew();
    default int sum(){
        return 0;
    }
}
