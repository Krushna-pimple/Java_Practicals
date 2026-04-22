class Varargs {
	int c;
	int findNumber( int num,int ...array){
		for(int i: array){
			if(num==i){	
				break;
			}
			else
			c++;
		}
		return c+1;
	}
	public static void main(String args[]) {
		Varargs s1= new Varargs();
		int p=s1.findNumber(14,11,12,13,14,15);
		System.out.println("number foud at index:" + p);
	}
}