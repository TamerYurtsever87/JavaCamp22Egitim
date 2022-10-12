package beginnerCourse.core.logger;



public class FileLogger implements BaseLogger{

    @Override
    public void add(String data) {
        System.out.println("Dosyaya Kaydedildi. ");
    }
}
