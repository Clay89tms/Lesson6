package DZ6_2;

//Класс DZ6_2.RAM имеет поля "название" и "объем".
public class RAM {
    String name; //Имя
    int volume; // Объем памяти


    public RAM() {
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String ramSC() {
        return "{Производитель: " + name + "; Объем памяти: " + volume + "Gb}";
    }
}
