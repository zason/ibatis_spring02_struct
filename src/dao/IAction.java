package dao;

import java.util.List;

import po.Person;

public interface IAction {
	public boolean insertPerson(Person person);   //���
	public boolean deleteById(int id);            //ɾ��
	public boolean updatePerson(Person person);    //�޸�
	public Person queryById(int id);              //����ID��ѯ
	public List<Person> queryAllPerson();         //��ѯȫ��
}