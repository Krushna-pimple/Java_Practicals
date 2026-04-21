 class Practical6 {

 public static void main(String[] args){
System.out.println(Integer.parseInt("12"));
System.out.println(Integer.parseInt("1111",2));
System.out.println(Integer.parseInt("010",8));
System.out.println(Integer.parseInt("-FF",16));
System.out.println(Integer.parseInt("123",10));
System.out.println(Integer.parseInt("-0",10));
System.out.println(Integer.toOctalString(12));
System.out.println(Integer.toBinaryString(12));
System.out.println(Integer.toHexString(12));
System.out.println(Integer.decode("12"));
System.out.println(Integer.reverse(132));
System.setProperty("num","100");
System.out.println(Integer.getInteger("num"));

}

}