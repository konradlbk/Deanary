public class Student {

    private String id;
    private int year;
    private double median;
    private String name;
    private String lastName;

    public Student(String id, int year, double median, String name, String lastName) {
        this.id = id;
        this.year = year;
        this.median = median;
        this.name = name;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMedian() {
        return median;
    }

    public void setMedian(double median) {
        this.median = median;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student: (" +
                "Numer indeksu: " + id  +
                ", Rok studiów: " + year +
                ", Srednia ocen: " + median +
                ", Imię: " + name  +
                ", Nazwisko: " + lastName  +
                ')';
    }

    public String toFileLine(){
        String SEPARATOR  = Dziekanat.SEPARATOR;
        String line = "";
        //kazde pole pochodzace z obiektu zapisujemy w linii oddzielając separatorem
        line+=id + SEPARATOR;
        line += year + SEPARATOR;
        line += median + SEPARATOR;
        line+=name+SEPARATOR;
        line += lastName +SEPARATOR;
        return line;
    }
}

