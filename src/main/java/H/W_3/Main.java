package H.W_3;

import lombok.Data;

import java.util.Date;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Worker misha = new Worker("misha", "figin", "worker", 89601431345L, 23433, (short) 1969,(short)12,(short) 25);
        Worker ivan = new Worker("ivan", "figin", "worker", 89601432333L, 23433, (short)2000,(short)10,(short) 12);
        Director tema = new Director("tema", "figin", "director", 89601433578L, 65055, (short) 1994,(short)9,(short) 15);
        Worker andrey = new Worker("andrey", "figin", "driver", 89678656778L, 30000, (short) 1998,(short)5,(short) 5);
        Worker masha = new Worker("masha", "figin", "accountant", 8960786656L, 45000, (short) 1967,(short)2,(short) 9);
        Worker[] company = {misha,ivan,tema,andrey,masha};
        Worker.infoAboutCompany(company);
        Director.salaryIncreases(company,0,10000);
        Worker.infoAboutCompany(company);
        Worker.averageSalaryInCompany(company);
        Worker.averageAgeInCompany(company);
        System.out.println(Worker.comparDates(1200,12,23,1998,12,32));
    }
}
