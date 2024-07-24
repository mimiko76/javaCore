package H.W_3;

import java.util.Objects;

public class Director extends  Worker{

    Director(String firstName, String secondName, String post, Long phoneNumber, int salary,
             short yearOfBirth, short monthOfBirth,short dayOfBirth){
        super(firstName,secondName,post,phoneNumber,salary,yearOfBirth,monthOfBirth,dayOfBirth);
    }
    /**
     * Метод повышает ЗП сотруникам старше введенного возраста
     * @param company массив сотрудников
     * @param age всем работникам возрастом выше указанного будет повышана ЗП
     * @param increase сумма на сколько за повысется
     */
    public static void salaryIncreases(Worker[] company,int age,int increase){

        for (int i = 0; i < company.length; i++) {
            if(!Objects.equals(company[i].getPost(), "director")){
                if(currentYear - company[i].getYearOfBirth() >= age) {
                    company[i].setSalary(company[i].getSalary()+increase);
                }
            }
            else System.out.println("Директор не может поднять себе ЗП");
        }
    }
}
