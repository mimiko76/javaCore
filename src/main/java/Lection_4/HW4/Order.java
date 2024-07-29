package Lection_4.HW4;

import lombok.Data;

@Data
public class Order {
    Buyer buyer;
    Product product;
    private short quantity;


    public static boolean isInArray(Object[] arr, Object o){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(o))return true;
        }
        return false;
    }
    public static Order makeOrder(Buyer[] buyers, Product[] products, Buyer who, Product what, int howMuch) {
        try {
            if (!isInArray(buyers, who)) {
                throw new CustomerException();
            }
            if (!isInArray(products, what)) { // Исправлено на products
                throw new ProductException();
            }
            if (howMuch < 0 || howMuch > 100) {
                throw new AmountException();
            }
            Order order = new Order();
            order.setBuyer(who);
            order.setProduct(what);
            order.setQuantity((short) howMuch);
            return order;
        } catch (CustomerException | ProductException | AmountException e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public String toString(){
        return String.format("Заказ - Покупатель: %s,%n" +
                "Товар - %s %n" +
                "Колличество - %s ",buyer,product,quantity);
    }
}
