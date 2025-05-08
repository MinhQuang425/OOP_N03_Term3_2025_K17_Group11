public class Number {
 public int i;
}
public static void main(String[] args) throws Exception {
Number n1 = new Number();
Number n2 = new Number();
n1.i = 2;
n2.i= 5;
n1 = n2;
n2.i = 10; // what is n1.i?
System.out.println(n2.i);//10 or 20
}
}
