package beginnerCourse.core.logger;

public class DatabaseLogger implements BaseLogger{

    @Override
    public void add(String data) {
        System.out.println("Veri Tabanına Loglandı. ");
    }
}
