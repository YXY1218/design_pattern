package test01;

public class MainClass {
    public static void main(String[] args) {
        DBUtil dbUtil = new DBUtil();
        UserDAO userDAO = new UserDAO(dbUtil);
        LoginForm loginForm = new LoginForm(userDAO,"userName","userPassword");
        loginForm.validate();
    }
}
