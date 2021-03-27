package generic;

import java.time.LocalDate;

public class Student {

    private int diemToan;
    private int diemVan;
    private LocalDate dateSX;
    private LocalDate dateHH;

    public Student(LocalDate dateSX) {
        if(dateSX.isAfter(LocalDate.now())){
            dateSX = LocalDate.now();
        } else {
            this.dateSX = dateSX;
        }


    }

    public Student(int diemToan, int diemVan) {
        if(diemToan>10||diemToan<0){
            this.diemToan = 0;
        } else{
            this.diemToan= diemToan;
        }


    }

    public double  diemTB(){
        return (diemToan+ diemVan)/2;
    }
}
