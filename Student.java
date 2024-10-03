import java.util.Scanner;

class Student extends Person {
    private String major;

    public Student() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jurusan: ");
        this.major = scanner.nextLine();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }
}