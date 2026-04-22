
class CheckRepetition {
		static int count;
	void Repetition(String c,String s){
		
		for(int i=0;i<s.length();i++){
			if(c.charAt(0) ==s.charAt(i)){
				count++;
			}
		}
		
	}
	
	public static void main(String args []) {
		try {
			if(args[0].length()>1) {
			throw new NotaCharException();
			}

			CheckRepetition c1= new CheckRepetition();
			c1.Repetition(args[0],args[1]);
			System.out.println("charecter:" +" " +args[0] +" "+ "found:" +" " + count+" " +"times");

			if(args.length>2) {
			throw new MoreThanTwoArgumentException();
			}
		}
		
		catch(NotaCharException e) {
			System.out.println("enter single charecter at first argument");
		}
	
		catch(MoreThanTwoArgumentException e) {
			System.out.println("skipping other arguments ");
		}
	}
}
class MoreThanTwoArgumentException extends Exception {
}
class NotaCharException extends Exception {
}