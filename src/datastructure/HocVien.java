package datastructure;

public class HocVien {
    public int ID;
    public String Name;
    public boolean Gender;
    public double Mark;

    public HocVien(int ID, String name, boolean gender, double mark) {
        this.ID = ID;
        Name = name;
        Gender = gender;
        Mark = mark;
    }
    public HocVien Next;
}
