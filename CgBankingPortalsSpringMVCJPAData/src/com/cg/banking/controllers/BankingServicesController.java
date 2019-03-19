package com.cg.banking.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.banking.beans.Account;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;
import com.cg.banking.services.BankingServices;

@Controller
public class BankingServicesController {
	@Autowired
	BankingServices bankingServices;
	@RequestMapping("/registerAccount")
	public ModelAndView registerAccount(@ModelAttribute Account account) throws InvalidAmountException, InvalidAccountTypeException, BankingServicesDownException {
		account=bankingServices.openAccount(account);		
		return new ModelAndView("registrationSuccessPage", "account",account);
	}
		@RequestMapping("/accountDetails")
		public ModelAndView getAssociateDetails(@RequestParam long accountNo) throws AccountNotFoundException, BankingServicesDownException {
			Account account=bankingServices.getAccountDetails(accountNo);
			return new ModelAndView("FindAccountDetails", "account",account);
		
	}
		@RequestMapping("/deposit")
		public ModelAndView getDepositAmount(@RequestParam long accountNo, @RequestParam float amount) throws AccountNotFoundException, BankingServicesDownException, AccountBlockedException{
			float depositBalance=bankingServices.depositAmount(accountNo, amount);
			return new ModelAndView("depositAmountPage", "depositBalance",depositBalance);
		
		}
		@RequestMapping("/withdraw")
		public ModelAndView getWithdrawAmount(@RequestParam long accountNo, @RequestParam float amount, @RequestParam int pinNumber) throws InsufficientAmountException, AccountNotFoundException, InvalidPinNumberException, BankingServicesDownException, AccountBlockedException{
			float withdrawBalance=bankingServices.withdrawAmount(accountNo, amount, pinNumber);
			return new ModelAndView("withdrawAmountPage", "withdrawBalance",withdrawBalance);
		
		}
		@RequestMapping("/transfer")
		public ModelAndView getTransferAmount(@RequestParam long accountNoTo, @RequestParam long accountNoFrom, @RequestParam float transferAmount,@RequestParam int pinNumber) throws InsufficientAmountException, AccountNotFoundException, InvalidPinNumberException, BankingServicesDownException, AccountBlockedException {
			boolean balance=bankingServices.fundTransfer(accountNoTo, accountNoFrom, transferAmount, pinNumber);
			return new ModelAndView("fundTransferPage", "balance",balance);
		}	
		
}
