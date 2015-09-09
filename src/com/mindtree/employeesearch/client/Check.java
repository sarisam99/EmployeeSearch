/**
 * 
 */
package com.mindtree.employeesearch.client;

import com.mindtree.employeesearch.exception.DaoException;

/**
 * @author M1018352
 *
 */
public class Check {

public static void main(String[] args) throws DaoException {
	
	int num=100;
	
	try {
		num=num/0;
	} catch (Exception e) {
	String exception ="Exception occured";
	exception="sari";
	}
	System.out.println("sari");
}
}
