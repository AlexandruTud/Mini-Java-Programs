package lab5problema3;
import java.util.Scanner;
import static lab5problema3.Avion.afiseazaLocurile;
import static lab5problema3.Avion.e_full;
public class Lab5problema3 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int loc;
    int[] seats = new int[10];
    boolean full = false;//la inceput avionul e gol , deci full=false
    for (int i = 0 ; i < seats.length; i++) //locurile in avion
    {
        seats[i] = 0;
    }
    afiseazaLocurile(seats);
    System.out.print("\n");
    System.out.println("Introduceti locurile(1-5 pentru fumatori, 6-10 pentru nefumatori):");
    
    while (full == false) //cat timp avionu' nu e plin                   
    { 
      System.out.println("Scrieti 11 pentru fumatori, 12 pentru nefumatori si 13 ca sa iesiti!");
      int n = input.nextInt();
      if(n == 11) // in loc de 1 din cerinta , noi scriem 11
      {
        System.out.println("Rezervati locul(1-5):");
        loc = input.nextInt();
        if (seats[loc-1] == 1)//verificam daca locul e luat
        {
            System.out.println();
            System.out.println("Loc ocupat! Alegeti alt loc!");
            System.out.println();
        }
        else if ((loc >= 1) && (loc <= 5))      
        {
           seats[loc-1] = 1;
        }
      }
      else if(n==12)
      {
        System.out.println("Rezervati locul(6-10):");
        loc = input.nextInt();
        if (seats[loc-1] == 1)//verificam daca locul e luat
        {
        System.out.println();
        System.out.println("Loc ocupat! Alegeti alt loc!");
        System.out.println();
        }
        else if ((loc >= 6) && (loc <= 10))
        {
           seats[loc-1] = 1;
        }
      }
      else if(n==13){
          System.out.println("Multumim de vizita!");
          break;
      }
      afiseazaLocurile(seats);
      full = e_full(seats);
    }

    System.out.println("Urmatorul zbor e in 3 ore!");
  }
}
