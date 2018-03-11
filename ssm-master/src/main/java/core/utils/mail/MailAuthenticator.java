package core.utils.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;


public class MailAuthenticator  extends Authenticator {
	 /**
     * 用户名（登录邮箱）
     */
    private String username;
    /**
     * 密码
     */
    private String password;
  
    /**
     * 初始化邮箱和密码
     * 
     * @param username 邮箱
     * @param password 密码
     */
    protected MailAuthenticator(String username, String password) {
    this.username = username;
    this.password = password;
//    getPasswordAuthentication();
    }
  
    String getPassword() {
    return password;
    }
  
    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
 System.out.println("进行身份验证");
    	return new PasswordAuthentication(username, password);
    }
  
    String getUsername() {
    return username;
    }
  
    public void setPassword(String password) {
    this.password = password;
    }
  
    public void setUsername(String username) {
    this.username = username;
    }
  
}
