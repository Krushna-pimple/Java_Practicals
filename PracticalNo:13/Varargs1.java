class Varargs {
	int sum;
	 String s="";
	int add( int ...array){
		for(int i: array){
			sum+=i;
		}
		return sum;
	}
	String add(String ...Array) {
		for(String i:Array){
			s+=i;
		}
		return s;
	}
	public static void main(String args[]) {
		Varargs s1= new Varargs();
		s1.add(11,12,13,14,15);
		System.out.println("Addition is:" + s1.sum);
		s1.add("11","12","13","14","15");
		System.out.println("Addition is:" + s1.s);
	}
}