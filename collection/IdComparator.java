package list;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.Id>o2.Id)
			return -1;
		else if(o1.Id<o2.Id)
			return 1;
		else
		    return 0;
	}

}
