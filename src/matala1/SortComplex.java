package matala1;

public class SortComplex implements Sortable {

	 private Complex[] cArr;    
	 public SortComplex(Complex[] c)
	 {
		 cArr=new Complex[c.length];
		 for(int i=0;i<c.length;i++)
		 {
			 this.cArr[i].setA(c[i].getA());
			 this.cArr[i].setB(c[i].getB());
		 }
	 }
	@Override
	public int compare(Object left, Object right) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object valueAt(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(Object value, int position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
