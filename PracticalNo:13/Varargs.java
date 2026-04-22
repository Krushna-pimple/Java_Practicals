class Varargs {
	int sum;
	int add( int ...array){
		for(int i: array){
			sum+=i;
		}
		return sum;
	}
	public static void main(String args[]) {
		Varargs s1= new Varargs();
		int p=s1.add(11,12,13,14,15);
		System.out.println("total is:" + p);
	}
}