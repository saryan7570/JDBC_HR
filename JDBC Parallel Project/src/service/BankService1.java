package service;

import java.sql.SQLException;

import beans.BankBean;

public interface BankService1 {

	long getBalance(long accNo) throws ClassNotFoundException, SQLException;

	String getTransaction(long accNo) throws ClassNotFoundException, SQLException;

	void setBalance(long accNo, long bal, String st) throws ClassNotFoundException, SQLException;

	
	boolean checkAccNo(long acc) throws ClassNotFoundException, SQLException;

	boolean checkPass(String st) throws ClassNotFoundException, SQLException;

	boolean checkName(String name);

	boolean checkM(long mob);

	boolean checkP(String password);

	String addAccount(String name, long mobile, String password) throws SQLException, ClassNotFoundException;

	BankBean getInfo(long accNo) throws ClassNotFoundException, SQLException;

}
