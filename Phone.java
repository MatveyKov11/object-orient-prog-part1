public class Phone {
    String number;
    String model;
    String weight;
    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }
    public String getNumber(){
        return number;
    }
    public Phone(String number, String model, String weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
        this.weight = "140g";
    }
    public Phone(){
        this.number = "88005553535";
        this.model = "Nokia 3310";
        this.weight = "140g";
    }
    public void receiveCall(String name, String number){
        System.out.println("Звонит " + name + ", " + number);
    }
    public void sendMessage(String[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
    public String toString(){
        return "Номер телефона: " + number + ", модель: " + model + ", вес: " + weight;
    }
}
