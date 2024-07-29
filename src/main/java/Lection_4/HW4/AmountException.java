package Lection_4.HW4;

public class AmountException extends Exception{
    AmountException(){
        System.out.println("Ошибка");
    }
    AmountException(short quantity){
        super(String.format("Нельзя ввести колличество больше 100, вы ввели %s",quantity));
    }
}
