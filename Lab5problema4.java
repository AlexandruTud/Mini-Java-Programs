package lab5problema4;

import java.util.Scanner;

public class Lab5problema4 {
    private static matrix m1,m2,ans;
    public static void main(String[] args) {
        int i = 0, j = 0,l = 0,c = 0;
        Scanner s = new Scanner(System.in);
	System.out.println("Introduceti cate linii are matricea:");
	l = s.nextInt();
	System.out.println("Introduceti cate coloane are matricea:");
	c = s.nextInt();
        
	System.out.println("Introduceti elementele din prima matrice:");
	m1 = new matrix(l,c);
	m1.afiseaza();
	System.out.println("Introduceti elementele din a doua matrice:");
	m2 = new matrix(l,c);
	m2.afiseaza();
        
	ans = m1.sumaMatrici(m2);
	System.out.println("Suma celor 2 matrici:");
	ans.print_matrix();
	ans = m1.diferentaMatrici(m2);
	System.out.println("\nDiferenta celor 2 matrici");
	ans.print_matrix();
        ans = m1.matriceTranspusa(m1);
        System.out.println("\nMatricea transpusa:");
        ans.print_matrix();
        ans = m1.inmultireMatrici(m2);
        System.out.println("\nInmultirea celor 2 matrici:");
        ans.print_matrix();
    }
}