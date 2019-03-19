package com.cg.banking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.banking.beans.Account;

@Controller
public class URIController {
	private Account account;
	@RequestMapping(value= {"/","index"})
	public String getIndexPage() {
		return "indexPage";
	}
	@RequestMapping("/registration")
	public String getRegistrationPage() {
		return "registrationPage";
	}
	@RequestMapping("/findAccountDetails")
	public String getFindAccountDetails() {
		return "FindAccountDetails";
	}
	@RequestMapping("/depositAmount")
	public String getDepositAmount() {
		return "depositAmountPage";
	}
	@RequestMapping("/withdrawAmount")
	public String getWithdrawAmount() {
		return "withdrawAmountPage";
	}
	@RequestMapping("/fundTransfer")
	public String getfundTransfer() {
		return "fundTransferPage";
	}
	@ModelAttribute
	public Account getAccount() {
		 return new Account();
	}
}
