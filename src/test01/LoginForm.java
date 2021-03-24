package test01;

public class LoginForm {
    private String userPassword;
    private UserDAO userDao;
    private String userName;
    public LoginForm(UserDAO userDAO,String userName,String userPassword){
        this.userDao = userDAO;
        this.userName = userName;
        this.userPassword = userPassword;
        this.init();
        this.display();
    }
    public void init(){
        System.out.println("初始化");
    }
    public void display(){
        System.out.println("显示界面");
    }
    public void validate(){
        System.out.println("验证中");
        userDao.findUser(userName,userPassword);
    }
}
