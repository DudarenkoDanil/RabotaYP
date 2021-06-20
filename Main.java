package Rabota;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Sotrydnik s1 = new Sotrydnik();
        Sotrydnik s2 = new Sotrydnik("Никита", "Аксёнов", "Иванович", "Заведующий Отделения", " отсутствует", 110000);
        Sotrydnik s3 = new Sotrydnik("Владислав", "Кирсанов", "Игоревич", "Хирург", " 500 человек", 130000);
        Sotrydnik s4 = new Sotrydnik("Александр", "Кабыченко", "Сергеевич", "Главный врач", " 400 человек", 80000);
        Raschet r1 = new Raschet(1000, 64999.98, "был выполнен", 13);

        Scanner a = new Scanner(System.in);
        Scanner m = new Scanner(System.in);

        int a3 = 0;

        do{

            System.out.println("\nВас приветствует программа KAVA.");
            System.out.println("1. Вывести информацию о сотрудниках.\n2. Выполнить расчёт за месяц."
                    + "\n3. Добавление нового сотрудника.\n4. Вывести новых сотрудников. \n5. Выход.");
            int a1 = a.nextInt();

            do {

                if (a1 == 1) {
                    s1.printAboutObject();
                    System.out.println();
                    s2.printAboutObject();
                    System.out.println();
                    s3.printAboutObject();
                    System.out.println();
                    s4.printAboutObject();
                    System.out.println();
                } else if (a1 == 2) {
                    r1.printAboutObject();
                    System.out.println();
                } else if (a1 == 3) {

                    do {
                        Scanner userUnput = new Scanner(System.in);

                        String famil;
                        System.out.print("Введите фамилию: ");
                        famil = userUnput.next();

                        String name;
                        System.out.print("Введите имя: ");
                        name = userUnput.next();

                        String otchestvo;
                        System.out.print("Введите отчество: ");
                        otchestvo = userUnput.next();

                        String Dolgnost;
                        System.out.print("Введите должность: ");
                        Dolgnost = userUnput.next();

                        String kolk;
                        System.out.print("Введите количество пациентов за месяц: ");
                        kolk = userUnput.next();

                        int zar;
                        System.out.print("Введите зарплату: ");
                        zar = userUnput.nextInt();

                        try (FileWriter writer = new FileWriter("SotrudnikList.txt", true)) {
                            writer.write("Имя сотрудника: " + name + "\nФамилия сотрудника: " + famil
                                    + "\nОтчество сотрудника: " + otchestvo + "\nДолжность: " + Dolgnost + "\nКоличество пациентов за месяц: "
                                    + kolk + "\nЗарплата: " + zar + "₽\n\n");
                            //writer.close();
                            writer.flush();
                        } catch (IOException ex) {
                            System.out.println(ex.getMessage());
                        }

                        System.out.print("\nЕсли хотите продолжить введить любую цифру, иначе введите 0: ");
                        a1 = a.nextInt();

                    } while (a1 != 0);
                } else if (a1 == 4) {
                    try (FileReader reader = new FileReader("SotrudnikList.txt")) {
                        char[] buf = new char[1000000];
                        int c;
                        while ((c = reader.read(buf)) > 0) {

                            if (c < 1000000) {
                                buf = Arrays.copyOf(buf, c);
                            }

                            System.out.println(buf);
                        }
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                else
                {

                }


                System.out.println("Введите другое число для повторного вывода информации.");
                System.out.println("Введите 0 для возврата в меню.");

                a3 = m.nextInt();
            } while (a3 != 0);

            System.out.println("Введите 0 для выхода.");
            System.out.println("Введите другое число для возврата в меню.");
            //0 для выхода из программы
            //другое число для возврата в меню

            a3 = m.nextInt();
        } while (a3 != 0);
    }
}
