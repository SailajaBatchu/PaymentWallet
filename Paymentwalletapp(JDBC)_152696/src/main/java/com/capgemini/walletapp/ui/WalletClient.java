package com.capgemini.walletapp.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.walletapp.bean.Customer;
import com.capgemini.walletapp.bean.WalletAppDetails;
import com.capgemini.walletapp.service.WalletAppService;
import com.capgemini.walletapp.service.WalletAppValidation;

public class WalletClient {
	
public static void createAccount() {
	WalletAppService service=new WalletAppService();
	WalletAppValidation validate=new WalletAppValidation();
	List<String> trans=new ArrayList<String>();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	try {
		System.out.println("Enter customerName: ");
		String customerName=br.readLine();
		System.out.println("Enter  gender(Male/Female): ");
		String gender=br.readLine();
		System.out.println("Enter phone Number: ");
		String phoneNumber=br.readLine();
		System.out.println("Enter age: ");
		int age=Integer.parseInt(br.readLine());
		System.out.println("Enter email: ");
		String email=br.readLine();
		System.out.println("Enter UserID: ");
		String user_ID=br.readLine();
		System.out.println("Enter password");
		String password=br.readLine();
		/*System.out.println("Enter Amount: ");
		double amount=Double.parseDouble(br.readLine());*/
		System.out.println("Enter adhar number: ");
		long adharNumber=Long.parseLong(br.readLine());
		System.out.println("Enter address: ");
		String address=br.readLine();
		
		LocalDate date=LocalDate.now();
		long accountNumber=(long) (Math.random()*123456789 + 999999999);
		WalletAppDetails details=new WalletAppDetails();
		Customer data=new Customer();
		
		
		data.setCustomerName(customerName);
		data.setGender(gender);
		data.setPhoneNumber(phoneNumber);
		data.setAge(age);
		data.setEmail(email);
		data.setUser_ID(user_ID);
		data.setPassword(password);
		data.setAdharNumber(adharNumber);
		data.setAddress(address);
		//details.setAmount(amount);
		details.setAccountNumber(accountNumber);
		details.setTrans(trans);
		/*details.setCust(data);*/
		details.setDate(date);
		data.setWallet(details);
	/*	boolean isValidFName=validate.isValidFirstName(firstName);
		boolean isValidLName=validate.isValidLastname(lastName);*/
		
		boolean isValidCustNmae=validate.isValidcustomername(customerName);
		boolean isValidgender=validate.isValidGender(gender);
		boolean isValidAge=validate.isValidAge(age);
		boolean isValidemail=validate.isValidEmail(email);
		
		if( isValidCustNmae && isValidgender && isValidAge && isValidemail )
		{
			service.createAccount(data);
			System.out.println("Your Account has been created");
			System.out.println("Account No is :"+details.getAccountNumber());
		}
		else
		{
			System.out.println("Enter Valid Details");
		}
		
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}
public static void login() {
	int choice=0;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	WalletAppService service=new WalletAppService();
	
	try {
		System.out.println("Enter userID: ");
		String user_ID=br.readLine();
		System.out.println("Enter password: ");
		String password=br.readLine();
		
		service.login(user_ID, password);
		System.out.println("Successfully logged into account");
		do {
		System.out.println("1. ShowBalance\n2. Deposit\n3. Withdraw\n4. FundTransfer\n5. PrintTransactions\n6. Exit the Application");
		System.out.println("Enter your choice: ");
		choice=Integer.parseInt(br.readLine());
		
		switch (choice) {
		case 1:
			System.out.println("Your Account Balance is :"+service.showBalance());
			break;
		case 2:
			System.out.println("Enter the amount to deposit: ");
			double amount=Double.parseDouble(br.readLine());
			service.deposit(amount);
			break;
		case 3:
			System.out.println("Enter the amount to withdraw: ");
			double with_amt=Double.parseDouble(br.readLine());
			service.withdraw(with_amt);
			
			break;
		case 4:
			System.out.println("Enter account number for MoneyTransfer: ");
			long accNo=Long.parseLong(br.readLine());
			System.out.println("Enter amount to transfer: ");
			double tran_amt=Double.parseDouble(br.readLine());
			service.fundTransfer(accNo, tran_amt);
			break;
		case 5:
			service.printTrans();

			break;
		case 6:
			homePage();
			break;
		default:
			
			System.out.println("Enter valid choice");
			break;
		}
		}while(choice!=6);
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}

	public static void homePage()
	{
		int key = 0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*****Welcome to Payment Wallet Application Service of XYZ Bank*****");
		do {
		System.out.println("1. CreateAccount\n2. Login\n3. Exit");
		System.out.println("Enter choice: ");
		try {
			key=Integer.parseInt(br.readLine());
			switch (key) {
			case 1:
				createAccount();
				break;
			case 2:
				login();
				break;
			case 3:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice Please enter correct choice");
				break;
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		}while(key!=3);

	}
	public static void main(String[] args) throws SQLException {
	
		homePage();
		
	}

}