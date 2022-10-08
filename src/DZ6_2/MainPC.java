package DZ6_2;

import java.util.Scanner;

public class MainPC {
    public static void main(String[] args) {
        String modelN = "";
        Integer model = null;
        Integer category = null;
        PC pc = null;
        HDD hdd = new HDD("Samsung", 500, "Внутрь", 3.5);
        RAM ram = new RAM("Kingstone", 32);

        do {
            System.out.println("\nМодели: \n1)Asus; 2)Dell\n0)Для выхода");
            Scanner scm = new Scanner(System.in);
            System.out.print("Введите Модель: ");
            if (scm.hasNextInt()) {

                model = scm.nextInt();
                if ((model == 1) || (model == 2)) {
                    System.out.print("\tСборка: \n\t1) Полная; 2) без DZ6_2.HDD и DZ6_2.RAM\n\tВыбор : ");
                }

                switch (model) {
                    case (0):
                        System.out.println("Выход.");
                        model = 0;
                        break;
                    case (1):
                        modelN = "Asus";
                        if (scm.hasNextInt()) {
                            category = scm.nextInt();
                            switch (category) {
                                case (1):
                                    pc = new PC(1581, modelN, ram, hdd);
                                    System.out.println("\n" + pc.screenFull());
                                    break;
                                case (2):
                                    pc = new PC(1231, modelN);
                                    System.out.println("\n" + pc.screenHalf());
                                    break;
                                default:
                                    System.out.println("Не указали Сборку!!!");
                                    break;
                            }
                        } else {
                            System.out.println("Указанно не число...");
                        }
                        break;
                    case (2):
                        modelN = "Dell";
                        if (scm.hasNextInt()) {
                            category = scm.nextInt();
                            switch (category) {
                                case (1):
                                    pc = new PC(984, modelN, ram, hdd);
                                    System.out.println("\n" + pc.screenFull());
                                    break;
                                case (2):
                                    pc = new PC(734, modelN);
                                    System.out.println("\n" + pc.screenHalf());
                                    break;
                                default:
                                    System.out.println("Не указали Сборку!!!");
                                    break;
                            }
                        } else {
                            System.out.println("Указанно не число...");
                        }
                        break;
                    default:
                        System.out.println("НЕТ ТАКОЙ МОДЕЛИ!!!");
                        model = 0;
                }
            } else {
                System.out.println("Указанно не число...");
                model = 0;
            }
            scm.close();
        } while (model != 0);
    }

}