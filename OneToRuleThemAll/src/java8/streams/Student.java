package java8.streams;

/**
 * Created by Lukasz S. on 27.06.2017.
 */
public class Student {
    private String name;
    private String subject;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(String name, String subject, String age) {
        this.name = name;
        this.subject = subject;
        this.age = age;
    }
}
