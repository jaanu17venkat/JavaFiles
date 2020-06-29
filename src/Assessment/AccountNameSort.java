package Assessment;

import java.util.Comparator;

public class AccountNameSort implements Comparator<Account>{

	@Override
	public int compare(Account o1, Account o2) {
		if(o1.getName()==o2.getName())
			return 0;
		else
			return -1;
	}

}
