package datastructure;

public class MainHocVien {
    private static HocVien Head;
    public static void main(String[] args) {
        HocVien hv = new HocVien(1,"Quang Minh",true,9.5);
        InsertBeginning(hv);
        HocVien hv1 = new HocVien(2,"Quang Minh",true,9.5);
        InsertBeginning(hv1);

    }
    private static void InsertBeginning(HocVien hv){

        if(Head ==null) {
            Head = hv;
        }
        else{
                hv.Next = Head;
                Head = hv;
            }
        }

    }

