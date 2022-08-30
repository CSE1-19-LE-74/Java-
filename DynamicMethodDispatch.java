Class A
 
{
 
Void display()
 
{ System.out.println(“A”);
 
}
 
}
 
Class B extends A
 
{
 
            Void display()
 
{ System.out.println(“B”);
 
}
 
}
 
Class C extends A
 
{
 
            Void display()
 
{ System.out.println(“C”);
 
}
 
}
 
Class Test
 
{           public static void main(String args[])
 
            { A a;
 
            a = new B();
 
            a.display();     
 
 
            a = new C();
 
            a.display();
 
            }
 
}
