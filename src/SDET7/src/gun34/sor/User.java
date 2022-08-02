package gun34.sor;

public class User {
    String name;

    UserStatus  statu;

    Role role;

    public User(String name, UserStatus statu, Role role) {
        this.name = name;
        this.statu = statu;
        this.role = role;
    }
}
