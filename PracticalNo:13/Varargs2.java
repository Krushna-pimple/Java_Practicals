class Varargs {
	int sum;
	int add( int ...array){
		for(float i: array){
			sum+=i;
		}
		return sum;
	}
	public static void main(String args[]) {
		Varargs s1= new Varargs();
		s1.add(11,12,13,14,15);
		System.out.println("Addition is:" + s1.sum);
	}
}