package dao.impl;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import po.Person;


public class ActionImplTest {
	private static ApplicationContext applicationContext = null;   //提供静态ApplicationContext
	static{
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"); //实例化
	}
	
	//添加操作
	@Test
	public void testInsertPerson(){
		ActionImpl s = (ActionImpl)applicationContext.getBean("personDAO");
		s.insertPerson(new Person(2,"zhangsan",20));
	}
	
	//删除操作
	@Test
	public void testDeletePerson(){
		ActionImpl s = (ActionImpl)applicationContext.getBean("personDAO");
		s.deleteById(1);
	}
	
	//查询全部
	@Test
	public void testQueryAllPerson(){
		ActionImpl s = (ActionImpl)applicationContext.getBean("personDAO");
		List<Person> persons = s.queryAllPerson();
		//System.out.println(persons.size());
	    Iterator<Person> ite = persons.iterator();
	    while(ite.hasNext()){
	    	Person person = ite.next();
	    	System.out.print("ID: "+person.getId());
	    	System.out.print(" Name: "+person.getName());
	    	System.out.print(" Sex: "+person.getSex());
	    	System.out.println();
	    }
	}
}
