package action;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import po.Person;

import com.opensymphony.xwork2.ActionSupport;

import dao.impl.ActionImpl;

public class FristAction  extends ActionSupport{
	private static ApplicationContext applicationContext = null;   //�ṩ��̬ApplicationContext
	static{
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); //ʵ����
	}
	HttpSession session = ServletActionContext.getRequest().getSession();
	public String execute() throws Exception
	{
    	ActionImpl s = (ActionImpl)applicationContext.getBean("personDAO");
		s.insertPerson(new Person(5,"zhangsan",25));
		//session.setAttribute("account", null);
		return SUCCESS;
	}
}
