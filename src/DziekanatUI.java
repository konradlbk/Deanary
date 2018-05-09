import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DziekanatUI extends Dziekanat {

    Dziekanat dziekanacik = new Dziekanat();


    public void start() {
        for (int i = 0; i < studentList.size(); i++) {
            dziekanacik.addStudent(studentList.get(i));
        }

        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.println("MENU");
            System.out.println("Aby dodać studentów, wpisz 1");
            System.out.println("Aby wyswietlic studentów, wpisz 2");
            System.out.println("Aby usunąć studenta, wpisz 3");
            System.out.println("Aby wybrać studenta po numerze indeksu, wpisz 4");
            System.out.println("Aby wybrać studentów po roku studiów, wpisz 5");
            System.out.println("Aby zakończyć, wpisz 6");
            input = scanner.nextLine();

            if (input.equals("1")) {
                String indeks = "";
                int rok = 0;
                double srednia = 0;
                String imie = "";
                String nazwisko = "";
                System.out.println("Podaj nr indeksu");
                indeks = scanner.nextLine();


                while (true) {
                    System.out.println("Podaj rok studiów");
                    try {

                        rok = scanner.nextInt();

                    } catch (InputMismatchException e) {
                        System.out.println("Podałeś nieprawidlowy znak");
                        scanner.next();
                        continue;


                    }


                    if ((rok == 1 || rok == 2 || rok == 3 || rok == 4)) {
                        scanner.nextLine();
                        while (true) {
                            System.out.println("Podaj srednia ocen");
                            try {
                            srednia = scanner.nextDouble();
                            scanner.nextLine();

                            } catch (InputMismatchException e){
                                System.out.println("Podales nieprawidlowy znak");
                                scanner.next();
                                continue;
                            }

                        break;
                        }
                            System.out.println("Podaj imie");
                            imie = scanner.nextLine();
                            System.out.println("Podaj nazwisko");
                            nazwisko = scanner.nextLine();

                        } else{

                            System.out.println("Podano błędną wartość");
                            continue;
                        }


                        Student nowyStudent = new Student(indeks, rok, srednia, imie, nazwisko);
                        dziekanacik.addStudent(nowyStudent);
                        dziekanacik.printAllStudents();
                        break;

                            }
            }


                if (input.equals("2")) {

                    dziekanacik.printAllStudents();

                }

                if (input.equals("3")) {
                    String id = "";
        boolean isntDeleted=true;
                    while (isntDeleted) {
                        System.out.println("Podaj nr indeksu do usunięcia studenta");
                        id = scanner.nextLine();
                       for (int i = 0; i < dziekanacik.studentList.size(); i++) {
                            if (dziekanacik.studentList.get(i).getId().contains(id)) {
                                System.out.println("Usunięto studenta: ");
                                System.out.println(dziekanacik.studentList.get(i));
                    dziekanacik.usunStudenta(id);
                    isntDeleted=false;
                                break;
                            } else {
                                System.out.println("Nie znaleziono studenta ");
                                break;


                            }
                        }



                    }

            System.out.println("Pozostali studenci: ");
                    dziekanacik.usunieci();
            System.out.println("Wpisz cokolwiek, aby wyjść do menu");
            String sth=scanner.nextLine();
            if (true){
                    dziekanacik.poUsunieciu=dziekanacik.studentList;
                continue;
            }
                }


                if (input.equals("4")) {
                    String id = "";
                    System.out.println("Podaj nr indeksu, aby wyszukac studenta");
                    id = scanner.nextLine();
                    dziekanacik.chooseStudent(id);

                }
                if (input.equals("5")) {
                    System.out.println("Podaj rok");
                    int rok = scanner.nextInt();
                    scanner.nextLine();
                    dziekanacik.wybierzStudentowZRoku(rok);
                    dziekanacik.wypiszStudentowZRoku();
                }

                if (input.equals("6")) {
                    return;
                }



        }
    }
}
