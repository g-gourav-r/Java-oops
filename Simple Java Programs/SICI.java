//program to find simple intrest and compund intrest in java
class CISI{
  public static void main( String args[]){
    int p=1000, t=3;
    double r=3.3, CI,SI;
    System.out.println("The simple intrest is "+((p*t*r)/100));
    System.out.println("The compound intrest is "+(p*Math.pow(1+r/100,t)-p));
  }
}