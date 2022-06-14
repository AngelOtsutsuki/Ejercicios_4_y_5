public class Ejercicio515
{              

private int Tam = 10;

public void Imprime()
{       

System.out.println("\n");

for ( int i = 1; i <= Tam; i++ )
{           
for ( int j = 1; j <= i; j++ )
System.out.print("*");

for ( int k = i + 1; k <= Tam; k++)
System.out.print(" ");

System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int l = 1; l <= Tam + 1 - i; l++ )
System.out.print("*");

for ( int m = Tam - 1 -i; m <= Tam; m++)
System.out.print(" ");

System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int n = 1; n < i; n++ )
System.out.print(" ");
   
for ( int p = i; p <= Tam; p++ )
System.out.print("*");

System.out.print(" ");
System.out.print(" ");
System.out.print(" ");
System.out.print(" ");

for ( int q = 1; q <= Tam - i; q++ )
System.out.print(" ");

for ( int r = Tam - i; r < Tam; r++ )
System.out.print("*");

System.out.println();
}           

System.out.println("\n");
}       

}    