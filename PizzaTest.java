public class PizzaTest {
    public static void main(String[] args) {
        PizzaOrder p1 = new PizzaOrder("Пепперони", PizzaOrder.Size.SMALL, false, "ул. Герцена, 2");
        System.out.println(p1);
        p1.order();
        p1.cancel();
        p1.cancel();
        p1.setSize(PizzaOrder.Size.BIG);
        p1.setNeedSouce(true);
        System.out.println(p1);
        p1.order();
        p1.order();
        System.out.println(p1.getAdress());
    }
}
