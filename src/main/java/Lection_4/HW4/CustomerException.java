package Lection_4.HW4;

public class CustomerException extends Exception {
    public CustomerException() {
        super(String.format("Проверьте данные о покупателе."));
    }
}
