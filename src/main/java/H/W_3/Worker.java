package H.W_3;

import lombok.Data;
import lombok.Getter;

import java.util.Calendar;

@Data
public class Worker {
    private String firstName;
    private String secondName;
    private String post;
    private Long phoneNumber;
    private int salary;
    private short yearOfBirth;
    private short monthOfBirth;
    private short dayOfBirth;
    static Calendar today = Calendar.getInstance();
    static int currentYear = today.get(Calendar.YEAR);
    static int currentMonth = today.get(Calendar.MONTH) + 1; // Месяцы начинаются с 0
    static int currentDay = today.get(Calendar.DAY_OF_MONTH);

    Worker(String firstName, String secondName, String post, Long phoneNumber, int salary,
           short yearOfBirth, short monthOfBirth,short dayOfBirth){
        this.firstName = firstName;
        this.secondName = secondName;
        this.post = post;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = yearOfBirth;
        this.dayOfBirth = dayOfBirth;
    }

    Worker(){

    }



    /**
     * Выводит инфу о конкретном работнике
     * @param worker работник о котором выведится инфа
     * @return
     */
    public static String infoFromWorker(Worker worker) {
        return String.format("Name: %s %n Second name: %s %n Post: %s %n Phone number: %d %n Salary: %d %n Age: %d %n",
                worker.getFirstName(), worker.getSecondName(), worker.getPost(),
                worker.getPhoneNumber(), worker.getSalary(),(currentYear - worker.getYearOfBirth()));
    }

    /**
     * Выведется инфа о компании
     * @param company массив сотрудников в компании
     */
    public static void infoAboutCompany(Worker[] company) {
        for (int i = 0; i < company.length; i++) {
            System.out.printf(infoFromWorker(company[i]));
        }
    }

    /**
     * Выведет средний возраст в компании
     * @param company массив сотрудников в компании
     */
    public static void averageAgeInCompany(Worker[] company){
        int averageAge;
        int allAge = 0;
        for (int i = 0; i < company.length; i++) {
            allAge += (currentYear - company[i].getYearOfBirth());
        }
        averageAge = allAge / company.length;
        System.out.printf("the average age in the company: %d %n", averageAge);
    }

    /**
     *  Выводит среднюю зп в компании
     * @param company массив сотрудников в компании
     */
    public static void averageSalaryInCompany(Worker[] company){
        int averageSalary;
        int allSalary = 0;
        for (int i = 0; i < company.length; i++) {
            allSalary += company[i].getSalary();
        }
        averageSalary = allSalary / company.length;
        System.out.printf("the average salary in the company: %d %n",averageSalary);
    }

    /**
     * Сравнивает две даты
     * @param year1
     * @param moth1
     * @param day1
     * @param year2
     * @param moth2
     * @param day2
     * @return возвращает разницу в днях
     */
    public static int comparDates(int year1, int moth1, int day1, int year2, int moth2, int day2) {
        // Преобразуем даты в единую величину для сравнения
        return (year1 - year2) * 365 + (moth1 - moth2) * 30 + (day1 - day2);
    }
}
