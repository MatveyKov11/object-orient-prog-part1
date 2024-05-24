public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone("80000000000", "Samsung Galaxy A55", "122g");
        Phone p2 = new Phone("81234567890", "Iphone 10");
        Phone p3 = new Phone();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p1.receiveCall("Матвей");
        System.out.println(p2.getNumber());
        p3.receiveCall("Матвей", "80987654321");
        String[] numbers = {"81111111111", "82222222222", "83333333333"};
        p3.sendMessage(numbers);
    }
}
