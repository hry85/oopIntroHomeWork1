public class CourseManager {
    public void sellectToCourse(Course course) {
        System.out.println("Kurs secildi : " + course.name);

    }

    public void updateToCourse(Course course) {
        course.status = 15;
        System.out.println("Kurs statusu degisti : " +course.status);
    }
}
