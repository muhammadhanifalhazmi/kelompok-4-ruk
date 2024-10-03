import java.util.Scanner;

class Teacher extends Person {
    private String subject;
     // Melanggar Konsep Clean Code SRP (Single Responsibility), karena class Teacher menangani input, seharusnya hanya attribute dan method
    public Teacher() {
        super();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan mata pelajaran: ");
        this.subject = scanner.nextLine();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
