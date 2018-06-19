package per.jgx.feign.entity;

/**
 * @author 姜广兴
 * @date 2018-06-19
 **/
public class UserDemo {
    private String name;
    private String id;
    private String age;

    public UserDemo() {
    }

    public UserDemo(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
