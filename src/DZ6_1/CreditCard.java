package DZ6_1;

//Создать класс DZ6_1.CreditCard c полями номер счета, текущая сумма на счету.
public class CreditCard {
    String name;
    double money;


    public CreditCard() {
    }

    public CreditCard(String name, double money) {
        this.name = name;
        this.money = money;
    }
//Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    public void plus(double plus) {
        double i = this.money + plus;
        System.out.println("Зачисление Д/С (+" + plus + ") на карту : " + this.name + "\tИтоговая сумма: " + i);
    }
//Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    public void minus(double minus) {
        if (this.money >= minus) {
            double i = this.money - minus;
            System.out.println("Снятие Д/С (-" + minus + ") с карты : " + this.name + "\tИтоговая сумма: " + i);
        } else System.out.println("Недопустимо снять такую сумму...");
    }

    public void print() {
        System.out.println("Card : " + this.name + "; Money : " + this.money);

    }
}