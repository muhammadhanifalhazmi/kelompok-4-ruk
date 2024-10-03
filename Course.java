class Course {
    private String courseName;
    private Teacher teacher;
    private boolean isLabCourse;

    public Course(String courseName, Teacher teacher) {
        this.courseName = courseName;
        this.teacher = teacher;

        // Melanggar Konsep Clean Code KISS (Keep It Simple, Stupid), seharusnya disimplekan hanya dengan 1 baris kode
        // isLabCourse = courseName.equalsIgnoreCase("Computer Science");

        if (courseName.equalsIgnoreCase("Computer Science")) {
            isLabCourse = true;
        } else {
            isLabCourse = false;
        }
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Taught by: " + teacher.name);
        System.out.println("Lab Course: " + (isLabCourse ? "Yes" : "No"));
    }
}