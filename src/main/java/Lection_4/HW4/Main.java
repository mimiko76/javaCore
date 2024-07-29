package Lection_4.HW4;


public class Main {
    public static void main(String[] args) {
        Buyer buyer1 = new Buyer("Иван","Иванов","Иванович",(short)1990,(short) 5,(short) 23,89706655654L, Gender.MEN);
        Buyer buyer2 = new Buyer("Иван","Петров","Петровчи",(short)1985,(short) 2,(short) 23,89705675654L, Gender.WOMAN);
        Buyer[] buyers = {buyer1, buyer2};
        Product[] products = {
                new Product("Шарик",23),
                new Product("Ракета",34),
                new Product("Машинка",55),
                new Product("Обувь",33),
                new Product("Домино",21)};
        Order[] orders = new Order[5];
        Order order = Order.makeOrder(buyers,products,buyer1,products[0],23);
        System.out.println(order);



    }
}
