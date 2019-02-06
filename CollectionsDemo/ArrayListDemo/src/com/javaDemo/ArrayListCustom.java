import java.util.*;

class ArryListCustom<E> extends ArrayList<E>
{
	public boolean allowDuplicates;

	public ArrayListCustom(boolean allowDuplicates)
	{
		this.allowDuplicates = allowDuplicates;
	}

	HashSet<Object> h = new HashSet<Object>();

	public Boolean add(E e)
	{
		if(this.allowDuplicates == false && h.add(e) == false)
		{
			throw new IllegalArgumentException("No Duplicates are allowed");
		}else if(this.allowDuplicates == true && h.add == false)
		{
			super.add(e);
		}
		return allowDuplicates;
	}
}