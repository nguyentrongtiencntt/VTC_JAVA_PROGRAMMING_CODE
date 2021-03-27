package generic;

public class NumberList<S> {
    private S obj;
    public void add(S value){
        this.obj = value;
    }
    public S get(){
        return obj;
    }

}
