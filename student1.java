import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class student1 {
    private String name;
    private LocalDate dob;

    public student1(String name, String dob) {
        DateTimeFormatter formatter = dob.contains("-") ? DateTimeFormatter.ofPattern("dd-MM-yyyy") : DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.name = name;
        this.dob = LocalDate.parse(dob, formatter);
    }

    public int calculateAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + calculateAge() + " years");
    }

    public static void main(String[] args) {
        student1 student = new student1("Amogh", "15-06-2005");
        student.displayInfo();
    }
}