class Super
{
int i=10;
static int j=20;


void m1()
{
      System.out.println("Super instance method");

}
static void m2()
{
      System.out.println("Super static method");

}
}

class Sub extends Super
{
int k=10;
static int m=20;
void m3()
{
    System.out.println("Sub instance method");
}
 static void m4()
{
    System.out.println("Sub static method");
}
}
