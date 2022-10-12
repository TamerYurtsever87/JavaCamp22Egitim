import beginnerCourse.business.CourseManager;
import beginnerCourse.business.InstructorManager;
import beginnerCourse.core.dataAccess.HibernateDao;
import beginnerCourse.core.dataAccess.JDBCDatabaseDao;
import beginnerCourse.core.logger.BaseLogger;
import beginnerCourse.core.logger.DatabaseLogger;
import beginnerCourse.core.logger.FileLogger;
import beginnerCourse.core.logger.MailLogger;
import beginnerCourse.entities.Course;
import beginnerCourse.entities.Instructor;


public class Main {
    public static void main(String[] args) throws Exception{


        Instructor instructor1 = new Instructor(101,"Tamer","Yurtsever","Ankara Üniversitesi , Bilgisayar Mühendisliği Mezunu.");
        Instructor instructor2 = new Instructor(102,"Ahmet","Vatansever","Kocaeli Üniversitesi , Bilgisayar Mühendisliği Mezunu.");
        Course course1 = new Course(1001,"Ahşap Boyama",22,"Ahşapların nasıl boyandığını en ince ayrıtısıyla öğreneceksiniz.",250);
        Course course2 = new Course(1002,"Ahşap Oymacılığı",32,"Ahşapları ince işçilikle işleyerek nasıl desenler çıkartırız, Bu kursta onu görüceksiniz.",350);

        BaseLogger[] baseLoggers ={new DatabaseLogger(),new FileLogger(),new MailLogger()};

        CourseManager courseManager1 = new CourseManager(new HibernateDao(),baseLoggers);
        courseManager1.add(course1);
        courseManager1.add(course2);

        InstructorManager instructorManager1 =new InstructorManager(new JDBCDatabaseDao(),baseLoggers);
        instructorManager1.add(instructor1);
        instructorManager1.add(instructor2);








    }
}