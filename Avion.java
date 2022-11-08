package lab5problema3;
public class Avion {
public static void afiseazaLocurile(int[] anArray)
  {    
    System.out.print("Fumatori:");
    for (int i = 0; i <  5; i++)
    {
        System.out.print(anArray[i]+" ");
    }
    System.out.print("\n");
    System.out.print("Nefumatori:");
    for (int i = 0; i <  5; i++)
    {
        System.out.print(anArray[i+5]+" ");
    }
    System.out.print("\n");
  }
  public static boolean e_full(int[] anArray)
  {
    int sum = 0;
    for (int i = 0; i < 10; i++)
    {
      sum = anArray[i] + sum; //daca sunt e 10 inseamna ca locurile sunt ocupate
    }        
    if (sum == 10)
        return true;              
    else
        return false;                          
  }

}
