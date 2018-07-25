package com.demo.core.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.testng.annotations.Test;

import com.demo.databin.Databin;
import com.demo.pages.Login;

public class HibernateConnection {
	private static Session sessionTestManager;
	List<Login> allTestSteps = null;
	@Test
	@SuppressWarnings("unused")
	private void generateTestManagerDBSessions() {
		sessionTestManager = TestDataHibernateUtil.getInstance().getCurrentSession();
		allTestSteps=getAllExecutionTestStepsByExecutionTestScenarioReference();
		String x= allTestSteps.get(0).getPassword();
		String y= allTestSteps.get(0).getUserName();
		
	
	
	}
	public List<Login> getAllExecutionTestStepsByExecutionTestScenarioReference() {
		
		Transaction t=sessionTestManager.beginTransaction();
		try {
			Criteria criteria = sessionTestManager.createCriteria(Login.class);
			criteria.add(Restrictions.eq("TestcaseID", "TC001"));
			criteria.addOrder(Order.asc("TestcaseID"));
			allTestSteps = criteria.list();
			t.commit();
		}
		catch(Exception e) {
			t.rollback();
		}
		return allTestSteps;
	}

}
