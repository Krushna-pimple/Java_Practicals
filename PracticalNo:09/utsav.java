class utsav {
	static String s1= new String("U");
	static StringBuffer s2= new StringBuffer("U");
	static StringBuilder s3= new StringBuilder("U");
	static long f1_totalTime;
	static long f2_totalTime;
	static long f3_totalTime;
	public static void main(String args[]) {
		for(int i=1;i<=2026;i++) {
			long f1_startTime=System.nanoTime();
			string(Integer.toString(i));
			long f1_endTime=System.nanoTime();
			f1_totalTime+= f1_endTime - f1_startTime;			
			}
		long f1_avgTime= f1_totalTime / 2026;
		System.out.println("avgTimeFor_f1:" + f1_avgTime ); 
		System.out.println( "string_s1:" + s1);

		for(int i=1;i<=2026;i++) {
			long f2_startTime=System.nanoTime();
			stringBuffer(Integer.toString(i));
			long f2_endTime=System.nanoTime();
			f2_totalTime+= f2_endTime - f2_startTime;			
			}
		long f2_avgTime= f2_totalTime / 2026;
		System.out.println("avgTimeFor_f2:" + f2_avgTime );
		System.out.println( "string_s2:" + s2);

		for(int i=1;i<=2026;i++) {
			long f3_startTime=System.nanoTime();
			stringBuilder(Integer.toString(i));
			long f3_endTime=System.nanoTime();
			f3_totalTime+= f3_endTime - f3_startTime;			
			}
		long f3_avgTime= f3_totalTime / 2026;
		System.out.println("avgTimeFor_f3:" + f3_avgTime );
		System.out.println( "string_s3:" + s3);
		}
	
	static void string(String i) {
		s1+=("_"+i);
		}

	static void stringBuffer(String i) {
		s2.append("_"+i);
		}

	static void stringBuilder(String i) {
		s3.append("_"+i);
		}

	}