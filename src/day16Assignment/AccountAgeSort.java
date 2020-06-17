package day16Assignment;

import java.util.Comparator;

public class AccountAgeSort implements Comparator<Account> {

	
	@Override
	public int compare(Account o1, Account o2) {
		if(o1.getAge()==o2.getAge())
			return 0;
		else if(o1.getAge()> o2.getAge())
			return 1;
		else
			return -1;
		//return Float.compare(o1.getDuration(), o2.getDuration());
	}
	}


