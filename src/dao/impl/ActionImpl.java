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

	//添加操作
	//@Override
	public boolean insertPerson(Person person) {
		// TODO Auto-generated method stub
		getSqlMapClientTemplate().insert("insertPerson",person);
		return false;
	}
	
	//删除操作
	//@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		getSqlMapClientTemplate().delete("deleteById", id);
		return false;
	}

	

	//查询全部
	//@Override
	public List<Person> queryAllPerson() {
		// TODO Auto-generated method stub
		List<Person> persons = getSqlMapClientTemplate().queryForList("queryAllPerson");
		return persons;
	}

	//@Override
	public Person queryById(int id) {
		// TODO Auto-generated method stub
        //自己添加实现代码
		return null;
	}

	//@Override
	public boolean updatePerson(Person person) {
		// TODO Auto-generated method stub
        //自己添加实现代码
		return false;
	}

}
