import java.util.Scanner;

class Student extends Person {
    private String major;

    public Student() {
        super();
        // Melanggar Konsep Clean Code SRP (Single Responsibility), karena class Student menangani input, seharusnya hanya attribute dan method
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
