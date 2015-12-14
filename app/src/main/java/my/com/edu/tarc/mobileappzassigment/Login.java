package my.com.edu.tarc.mobileappzassigment;

/**
 * Created by Lotso on 12/14/2015.
 */
public class Login {
    private String username;
    private String password;
    private String CustID;

    public Login() {
    }

    public Login(String username, String password, String custID) {
        this.username = username;
        this.password = password;
        CustID = custID;
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

    public String getCustID() {
        return CustID;
    }

    public void setCustID(String custID) {
        CustID = custID;
    }
}
