package ooppf03;

public class Teacher extends Object{


    private int MaPoint;
    private int LitPoint;

    public Teacher(int maPoint, int litPoint) {
        if(maPoint<0 || maPoint>10) MaPoint = 0;
        else
            MaPoint = maPoint;

        if(litPoint<0 || litPoint>10) LitPoint = 0;
        else
            LitPoint = litPoint;

    }

    @Override
    public String toString() {

        return String.format("LitPoint %d, MaPoint %d"
                ,LitPoint, MaPoint);

    }
}

