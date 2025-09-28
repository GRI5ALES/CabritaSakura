package Entities.LoginRegister;

public class Register {
    private String username;
    private String email;
    private String password;

    public Register(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Register createRegister(String username, String password, String email) {
        return new Register(username, password, email);
    }
}
