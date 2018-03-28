package matala1;

public class ObjectSort {
	public static void sort(Sortable item)
	{
		for(int i=0;i<item.size();i++)
		{
			for(int j=i+1;j<item.size();j++)
			{
				if(item.compare(item.valueAt(i), item.valueAt(j))>0) 
					swap(item,i,j);
			}
		}
	}
	
	public static void swap(Sortable s,int i,int j)
	{
		Object temp = s.valueAt(i);
		s.setValue(s.valueAt(j), i);
		s.setValue(temp, j);
	}
	
	
	public static boolean checkSort(Sortable item)
	{
		for(int i=0;i<item.size();i++)
		{
			for(int j=i+1;j<item.size();j++)
			{
				if(item.compare(item.valueAt(i), item.valueAt(j))>0) 
					return false;
			}
		}
		return true;
	}
}
