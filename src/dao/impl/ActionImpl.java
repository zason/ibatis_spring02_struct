package dao.impl;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.sqlmap.client.SqlMapSession;

import po.Person;
import dao.IAction;

public class ActionImpl extends SqlMapClientDaoSupport implements IAction {

	//��Ӳ���
	//@Override
	public boolean insertPerson(Person person) {
		// TODO Auto-generated method stub
		getSqlMapClientTemplate().insert("insertPerson",person);
		return false;
	}
	
	//ɾ������
	//@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		getSqlMapClientTemplate().delete("deleteById", id);
		return false;
	}

	

	//��ѯȫ��
	//@Override
	public List<Person> queryAllPerson() {
		// TODO Auto-generated method stub
		List<Person> persons = getSqlMapClientTemplate().queryForList("queryAllPerson");
		return persons;
	}

	//@Override
	public Person queryById(int id) {
		// TODO Auto-generated method stub
        //�Լ����ʵ�ִ���
		return null;
	}

	//@Override
	public boolean updatePerson(Person person) {
		// TODO Auto-generated method stub
        //�Լ����ʵ�ִ���
		return false;
	}

}
