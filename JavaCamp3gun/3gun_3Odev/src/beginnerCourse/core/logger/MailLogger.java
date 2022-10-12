package beginnerCourse.core.logger;

public class MailLogger implements  BaseLogger{

    @Override
    public void add(String data) {
        System.out.println("Mail ile Loglandı. ");
    }
}
