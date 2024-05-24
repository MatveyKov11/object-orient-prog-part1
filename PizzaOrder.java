public class PizzaOrder {
    String name;
    enum Size{SMALL, MEDIUM, BIG};
    Size size;
    boolean isNeedSouce;
    String adress;
    boolean isTaken;
    public PizzaOrder(String name, Size size, boolean isNeedSouce, String adress){
        this.name = name;
        this.size = size;
        this.isNeedSouce = isNeedSouce;
        this.adress = adress;
    }

    public void order(){
        if (isTaken){
            System.out.println("Заказ уже принят");
        }else{
            isTaken = true;
            String s = "Заказ принят. ";
            if(size == Size.BIG){
                s += "Большая ";
            } else if (size == Size.MEDIUM) {
                s += "Средняя ";
            }else {
                s += "Маленькая ";
            }
            s += "пицца "+name+" ";
            if (isNeedSouce){
                s += "с соусом ";
            }else {
                s += "без соуса ";
            }
            s += "на адрес " + adress;
            System.out.println(s);
        }
    }
    public void cancel(){
        if(isTaken){
            isTaken = false;
            System.out.println("Заказ отменён");
        }else {
            System.out.println("Заказ уже отменён");
        }
    }

    public String getName() {
        return name;
    }
    public Size getSize() {
        return size;
    }

    public boolean isNeedSouce() {
        return isNeedSouce;
    }

    public String getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setNeedSouce(boolean needSouce) {
        isNeedSouce = needSouce;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String toString(){
        String s = "Заказ: ";
        if(size == Size.BIG){
            s += "Большая ";
        } else if (size == Size.MEDIUM) {
            s += "Средняя ";
        }else {
            s += "Маленькая ";
        }
        s += "пицца "+name+" ";
        if (isNeedSouce){
            s += "с соусом ";
        }else {
            s += "без соуса ";
        }
        s += "на адрес " + adress;
        return s;
    }
}
