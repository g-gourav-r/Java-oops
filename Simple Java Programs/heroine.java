//Check whether a triangle can be formed or not.... use heroines formula to find the area

class triangle{
  public static void main(String args[]){
    int a=3,b=5,c=4;
    double area, s;
    if(a+b<c || a+c<b || b+c<a)
      System.out.println("Triangle cannot be formed ");
    else{
      s=(a+b+c)/2.0;
      area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
      System.out.println("The area is "+ area);
    }
  }
}