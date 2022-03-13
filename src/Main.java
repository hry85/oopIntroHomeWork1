public class Main {
    public static void main(String[] args) {

        Course course1 = new Course(1, "JavaScript", "Engin Demirog", 0);
        Course course2 = new Course(2, "C# + ANGULAR", "Engin Demirog", 0);
        Course course3 = new Course(3, "Java + REACT", "Engin Demirog", 12);
        Course course4 = new Course(4, "Programlamaya Giris icin Temel Kurs", "Engin Demirog", 0);

        Course[] courses = {course1, course2, course3, course4};

        for (Course course : courses) {
            System.out.println(course.name);
        }

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Ucretli";

        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Ucretsiz";


        CourseManager courseManager = new CourseManager();
        courseManager.sellectToCourse(course3);

        courseManager.updateToCourse(course3);
        System.out.println("Kurs kategorisi : " + category2.name);

    }


}
