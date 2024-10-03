import java.util.Scanner;

class Person {
    public String name;
    private int age;

    public Person() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        this.name = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        this.age = scanner.nextInt();
        scanner.nextLine();
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}