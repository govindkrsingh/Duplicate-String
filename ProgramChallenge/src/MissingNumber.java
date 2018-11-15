
public class MissingNumber {
	public static void main(String[] args) {
		int [] array= {1,2,3,4,6};
		int expacted_no=array.length+1;
		int sum_total=expacted_no*(expacted_no+1)/2;
		int  sum_given=0;
		for(int i=0;i<array.length;i++) {
			 sum_given=sum_given+array[i];
		}
		System.out.println("missing no" +(sum_total-sum_given));
	}

}
