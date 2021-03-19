package IUH_Exercises;

public class TamGiac {
    private int ma;
    private int mb;
    private int mc;

    public TamGiac() {
    }

    public TamGiac(int ma, int mb, int mc) {
        this.ma = ma;
        this.mb = mb;
        this.mc = mc;
    }

    @Override
    public String toString() {
        String mas = String.format("%5d",ma);
        String mbs = String.format("%5d",mb);
        String mcs = String.format("%5d",mc);

        return mas + mbs + mcs;
    }
}
