package Lection_4.HW4;

import lombok.Data;

import java.time.LocalDate;


@Data
public class Buyer {
    private String name;
    private String secondName;
    private String lastName;
    private short yearOfBirth;
    private short monthOfBirth;
    private short dayOfBirth;
    private long numberPhone;
    private Gender gender;
    public Buyer(){

    }
    public Buyer(String name,String secondName,String lastName, short yearOfBirth,short monthOfBirth,short dayOfBirth,long numberPhone,Gender gender){
        this.name = name;
        this.secondName =secondName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.numberPhone = numberPhone;
        this.gender = gender;
    }
    public static void congratulation(Buyer[] buyers) {
        LocalDate currentDate = LocalDate.now();
        if (currentDate.getMonthValue() == 3 && currentDate.getDayOfMonth() == 8) {
            System.out.println("Сегодня 8 марта! Поздравляем!");
            for (Buyer buyer : buyers) {
                if (buyer.getGender() == Gender.WOMAN) {
                    System.out.println("Поздравляем, " + buyer.getName() + " " + buyer.getSecondName() + "!");
                }
            }
        } else if (currentDate.getMonthValue() == 2 && currentDate.getDayOfMonth() == 23) {
            System.out.println("Сегодня 23 февраля! Поздравляем!");
            for (Buyer buyer : buyers) {
                if (buyer.getGender() == Gender.MEN) {
                    System.out.println("Поздравляем, " + buyer.getName() + " " + buyer.getSecondName() + "!");
                }
            }
        }
    }
}
