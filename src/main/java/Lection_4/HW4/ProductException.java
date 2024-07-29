package Lection_4.HW4;

public class ProductException extends Exception{
    public ProductException(){
        super(String.format("Проверьте данные о товаре"));
    }
}
