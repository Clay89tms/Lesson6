package DZ6_2;//Класс Computer должен иметь два конструктора:
//        - первый - с параметрами стоимость и модель,
//        - второй - со всеми полями.
//в этом классе должны быть поля: стоимость, модель(строковый тип), DZ6_2.RAM и DZ6_2.HDD.

public class PC {
    int coast;
    String model;
    RAM ram;
    HDD hdd;
    String ramN, hddN;


    public PC(int coast, String model) {
        this.coast = coast;
        this.model = model;
        ram = null;
        hdd = null;
    }

    public PC(int coast, String model, RAM ram, HDD hdd) {
        this.coast = coast;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String screenHalf() {
        if ((ram == null) && (hdd == null)) {
            ramN = hddN = "<нет данных>";

        }
        return "\t\tЦена: " + coast + "$;\n\t\tМодель: " + model + ";\n\t\tАЗУ: "
                + ramN + ";\n\t\tВинестер: " + hddN + ".";
    }

    public String screenFull() {
        return "\t\tЦена: " + coast + "$;\n\t\tМодель :" + model + ";\n\t\tАЗУ :"
                + ram.ramSC() + ";\n\t\tВинестер: " + hdd.hddSC() + ".";
    }
}
