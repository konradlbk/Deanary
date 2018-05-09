import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException{

        Student student1 = new Student("U-7882", 3, 3.5, "Konrad", "Szulc");
        Student student2 = new Student("U-1234", 2, 4.0, "Artur", "Sanok");
        Student student3 = new Student("U-5678", 2, 5.0, "Zbigniew", "Krefta");
        Student student4 = new Student("U-9876", 1, 3.5, "Magda", "Jakastam");
        Student student5 = new Student("U-5432", 4, 3.0, "Agata", "Celban");
        Student student6 = new Student("U-2888", 2, 3.25, "Patryk", "Pilarek");
        Student student7 = new Student("U-3111", 1, 3.75, "Jakub", "Majcher");
        Dziekanat dziekanat = new Dziekanat();
        dziekanat.createFile();
        dziekanat.addStudent(student1);
        dziekanat.addStudent(student2);
        dziekanat.addStudent(student3);
        dziekanat.addStudent(student4);
        dziekanat.addStudent(student5);
        dziekanat.addStudent(student6);
        dziekanat.addStudent(student7);

       // dziekanat.printAllStudents();
//        System.out.println("Wybieram po numerze indeksu");
//        dziekanat.chooseStudent("U-7883");
//
//        System.out.println("TERAZ CYMBALY: ");
//        dziekanat.sredniaNizszaNiz(4.0);
//        dziekanat.wypiszZNizszaSrednia();
//        dziekanat.wybierzStudentowZRoku(1);
//        dziekanat.wypiszStudentowZRoku();
//        System.out.println("Pozostali studenci");
//        dziekanat.usunStudenta("U-7882");
//        dziekanat.usunieci();

        DziekanatUI UI = new DziekanatUI();
        UI.dziekanacik.addStudent(student1);
        UI.dziekanacik.addStudent(student2);
        UI.dziekanacik.addStudent(student3);
        UI.dziekanacik.addStudent(student4);
        UI.dziekanacik.addStudent(student5);
        UI.dziekanacik.addStudent(student6);
        UI.dziekanacik.addStudent(student7);
        UI.start();
        UI.dziekanacik.saveToFilee();



    }
}
