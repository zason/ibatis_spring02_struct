package dao;

import java.util.List;

import po.Person;

public interface IAction {
	public boolean insertPerson(Person person);   //添加
	public boolean deleteById(int id);            //删除
	public boolean updatePerson(Person person);    //修改
	public Person queryById(int id);              //根据ID查询
	public List<Person> queryAllPerson();         //查询全部
}