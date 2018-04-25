package com.qa.business;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.domain.Account;
import com.qa.util.JSONUtil;



@RunWith(MockitoJUnitRunner.class)
public class AccountDBImpTest {

	@InjectMocks
	AccountImp accImp= new AccountDBImp();
	
	@Mock 
	private Account account;
	
	@Mock 
	private EntityManager em;
	
	@Mock 
	private JSONUtil jsonutil;
	
	private static final String MockAccount = "{\"firstName\":\"Ryan\",\"secondName\":\"Prince\",\"accountNumber\":\"1\"}";
	private static final String MockAccountList = "[{\"firstName\":\"Ryan\",\"secondName\":\"Prince\",\"accountNumber\":\"1\"}]";
	
	
	@Test
	public void createAccountTest() {
		String expectedValue="{\"message\": \"Account has been created.\"}";
		String actualValue= accImp.createAccount(MockAccount);
		assertEquals(expectedValue,actualValue);
	}

}
