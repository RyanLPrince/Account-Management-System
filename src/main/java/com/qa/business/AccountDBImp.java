package com.qa.business;

import javax.persistence.EntityManager;

import com.qa.domain.Account;
import com.qa.util.JSONUtil;

public class AccountDBImp implements AccountImp {

	private EntityManager em;
	private JSONUtil jsonutil=new JSONUtil();
	
	public String createAccount(String accountAsJSON) {
		Account account = jsonutil.getObjectForJSON(accountAsJSON,Account.class);
		em.persist(account);
		return "{\"message\": \"Account has been created.\"}";
	}

}

