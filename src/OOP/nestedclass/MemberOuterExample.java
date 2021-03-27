package OOP.nestedclass;

public class MemberOuterExample {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
    }

    public static void main(String[] args) {

        MemberOuterExample obj
                = new MemberOuterExample();

        MemberOuterExample.Inner
                in = obj.new Inner();
        in.msg();
    }

    private int a(){
        Inner in = new Inner();
        in.msg();
        return 0;
    }
}
