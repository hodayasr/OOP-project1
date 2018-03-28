package matala1;

public class SortComplex implements Sortable {
	// **** ///
	 private Complex[] cArr;    
	 public SortComplex(Complex[] c)
	 {
		 this.cArr=c;
	 }
	@Override
	public int compare(Object left, Object right) {
		return ((Complex)left).compare((Complex)right);
	}

	@Override
	public Object valueAt(int position) {
		return cArr[position];
	}

	@Override
	public void setValue(Object value, int position) {
		this.cArr[position]=(Complex)value;
	}

	@Override
	public int size() {
		return cArr.length;
	}

}
