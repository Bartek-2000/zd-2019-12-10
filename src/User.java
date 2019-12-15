import java.util.Objects;

public class User {
    private String name;
    private String surename;
    private int age;
    private String userID;

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public int getAge(int i) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserID(String i) {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public User(String name, String surename, int age, String userID) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.userID = userID;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                userID == user.userID &&
                Objects.equals(name, user.name) &&
                Objects.equals(surename, user.surename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surename, age, userID);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", age=" + age +
                ", userID=" + userID +
                '}';
    }
}
