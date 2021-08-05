package cn.hp.model;

public class UserInfo {

    private  String userName;
    private  String pwd;

    public UserInfo() {
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public UserInfo(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }
}
