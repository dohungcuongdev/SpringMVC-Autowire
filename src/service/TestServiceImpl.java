package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TestDAO;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	TestDAO testDAO;
	
	@Override
	public String getName() {
		return getTestDAO().getName();
	}

	public TestDAO getTestDAO() {
		return testDAO;
	}

	public void setTestDAO(TestDAO testDAO) {
		this.testDAO = testDAO;
	}

}
