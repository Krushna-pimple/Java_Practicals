class PatternDiamond {
static void pm1(int size) {
int m = (size + 1) / 2;
 for (int i = 1; i <= size; i++) {
 for (int j = 1; j <= size; j++) {
               
 if ((i == 1 || i == size) && j == m) {
       System.out.print("x");
    }              
 else if (i <= m && (j == m - i + 1 || j == m + i - 1)) {
       System.out.print("x");  }
 else if (i > m && (j == i - m + 1 || j == size - (i - m))) {
        System.out.print("x");  }
  else { System.out.print(" ");  }
   }
      System.out.println();
    }
    }
    
 static void pm2(int size) {
  int m = size / 2 + 1;
  for (int i = 1; i <= size; i++) {
  for (int j = 1; j <= size; j++) {

  if (i + j == m + 1 ||
      i + j == size + m ||
      i - j == m - 1 ||
      j - i == m - 1){
       System.out.print("x");}
  else{System.out.print(" ");}
   }
  System.out.println();
    }
    }
static void pm3(int size) {
  int m = size / 2 + 1;
 for (int i = 1; i <= size; i++) {
        int row;
 if (i <= m){
     row = i;}
  else
  {   row = size - i + 1;}
 for (int j = 1; j <= size; j++) {
  if (j == m - row + 1 || j==m+row -1 )
       System.out.print("x");
  else
      {  System.out.print(" ");}
   }
  System.out.println();
 }
}
    public static void main(String[] a) {
      pm1(3);
      pm1(5);
      pm2(3);
      pm2(5);
      pm3(3);
      pm3(5);
    }
}
