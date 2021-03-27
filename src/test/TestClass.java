package test;

import java.time.LocalDate;

public class TestClass {
    public LocalDate ngay;

    public TestClass(LocalDate ngay) {
        this.ngay = ngay;
        if(ngay.isAfter(LocalDate.now())){

        }
    }
}
