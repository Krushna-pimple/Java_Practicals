class Sy2024bit001{

static int factorial1(int n){
int f=n;
if(n==0 || n==1){
return 1;
}
else{
for (int i=(n-1);i>=2;i--){
f=f*i;
}
return f;
}
}

static int factorial2 (int num){
if (num==0 || num==1){
return 1;}
else{
return num*factorial2(num-1);}
}
public static void main (String[] args){
System.out.println(factorial1(0));
System.out.println(factorial2(4));
}
}