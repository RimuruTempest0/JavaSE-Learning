package Practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class birthDatePractice {

    public static void main(String[] args) {
        //计算活了多少天
        //JDK8
        LocalDate ld1 = LocalDate.of(1999,3,29);
        LocalDate ld2 = LocalDate.now();

        long days = ChronoUnit.YEARS.between(ld1, ld2);
        System.out.println(days);
    }
}
