package day5;


import java.sql.Date;

public class Student {
    private Integer id;
    private Integer class_id;
    private String name;
    private String sex;
    private Date date;

    public Student(int id, int class_id, String 盲僧, String 男, int i) {
    }

    public Student(Integer id, Integer class_id, String name, String sex, Date date) {
        this.id = id;
        this.class_id = class_id;
        this.name = name;
        this.sex = sex;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClass_id() {
        return class_id;
    }

    public void setClass_id(Integer class_id) {
        this.class_id = class_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", class_id=" + class_id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", date=" + date +
                '}';
    }
}
