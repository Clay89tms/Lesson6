package DZ6_2;
//Класс DZ6_2.HDD имеет поля "название", "объем" и "тип" (внешний или
//        внутренний).

public class HDD {
    String name;     //фирма DZ6_2.HDD
    int volume;         //объем памяти
    String type;        //тип внеш внутр
    double size;           //размер

    public HDD() {
    }

    public HDD(String name, int volume, String type, double size) {
        this.name = name;
        this.volume = volume;
        this.type = type;
        this.size = size;
    }

    public String hddSC() {
        return "{Производитель: " + name + "; Объем памяти: " + volume +
                "Gb; Установка: " + type + "; Размер: " + size + "\"}";
    }
}
