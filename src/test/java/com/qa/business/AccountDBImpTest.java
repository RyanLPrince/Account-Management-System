package com.qa.business;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;



@RunWith(MockitoJUnitRunner.class)
public class AccountDBImpTest {

	@InjectMocks
	AccountImp accImp= new AccountDBImp();
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
