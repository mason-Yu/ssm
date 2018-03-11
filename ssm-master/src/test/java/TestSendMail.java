import javax.mail.MessagingException;

import core.utils.mail.SimpleMail;
import core.utils.mail.SimpleMailSender;


public class TestSendMail {
public static void main(String[] args) {
	SimpleMailSender mail = new SimpleMailSender("yuzq1547885838@163.com","1547885838");
	SimpleMail mailinfo = new SimpleMail();
	mailinfo.setContent("我刚刚给你发邮件了，不要鸟我！");
	mailinfo.setSubject("我是吴莹莹");
	try {
		mail.send("1547885838@qq.com", mailinfo);
		System.out.println("已发送！");
	} catch (MessagingException e) {
		// TODO Auto-generated catch block
		System.out.println("发送失败，请检查邮箱是否正确!");
		e.printStackTrace();
	}
}
}
 