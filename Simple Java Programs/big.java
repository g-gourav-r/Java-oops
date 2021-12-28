//Biggest nymber using ternary operation
/*
variable = Expression1 ? Expression2 : Expression3

--same can be represented as---
if(Expression1)
{
    variable = Expression2;
}
else
{
    variable = Expression3;
}*/
class Biggest{
  public static void main(String args[]){
    int a=2,b=3,c=4,big;
    big=(a>b?(a>c?a:c):(b>c?b:c));
    System.out.println("Biggest is "+big);
  }
}