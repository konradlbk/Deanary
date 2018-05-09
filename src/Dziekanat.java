import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dziekanat {

    public static final String FILEPATH = "C:/Dziekanat/studenci.txt";
    public static final String SEPARATOR = ";";

    public void createFile(){
    File directory = new File("C:\\Dziekanat");
    if (!directory.exists()){
        directory.mkdir();
        File file = new File("C:\\Dziekanat\\studenci.txt");
    }


    }

    public List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);


    }

    public void printAllStudents() {

        for (Student studenci : studentList) {

            System.out.println(studenci);
        }
    }

    public void wypiszListe(Student student) {

        System.out.println(studentList);
    }

    public Optional <Student> chooseStudent(String idNumber) {

        Student chosen = null;

        for (Student studenci : studentList) {

            if (studenci.getId().equals(idNumber)) {
                chosen = studenci;
                System.out.println(chosen);
                break;

            }
        }
        return Optional.ofNullable(chosen);

    }

    List<Student> below = new ArrayList<>();

    public List<Student> sredniaNizszaNiz(double srednia) {

        for (Student oceny : studentList) {

            if (oceny.getMedian() < srednia) {

                below.add(oceny);
            }

        }

        return below;

    }

    public void wypiszZNizszaSrednia() {


        for (int i = 0; i < below.size(); i++) {

            System.out.println(below.get(i));
        }
    }

    List<Student> studentsOfYear = new ArrayList<>();

    public List<Student> wybierzStudentowZRoku(int rokStudiow) {
        System.out.println("Studenci roku " + rokStudiow + " :");

        for (Student studenciRoku : studentList) {

            if (studenciRoku.getYear() == rokStudiow) {
                studentsOfYear.add(studenciRoku);

            }
        }
        return studentsOfYear;
    }

    public void wypiszStudentowZRoku() {

        for (int i = 0; i < studentsOfYear.size(); i++) {

            System.out.println(studentsOfYear.get(i));
        }
    }

    List<Student> poUsunieciu = new ArrayList<>();

    public boolean usunStudenta(String numerIndeksu) {

        for (int i = 0; i < studentList.size(); i++) {

            if (!studentList.get(i).getId().equals(numerIndeksu)) {
                poUsunieciu.add(studentList.get(i));

            }


        }
        return true;
    }

    public void usunieci(){

        for (int i=0; i<poUsunieciu.size(); i++){

            System.out.println(poUsunieciu.get(i));
        }
        studentList=poUsunieciu;
    }

    public void saveToFile(Student students) throws IOException{
        FileWriter fileWriter = new FileWriter(FILEPATH, false);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for (Student student : studentList){

            printWriter.println(student.toFileLine());
        }
        printWriter.close();


    }

    public void saveToFilee() throws IOException{
        for (int i=0; i<studentList.size(); i++){
            saveToFile(studentList.get(i));
        }
    }
}
