package lab5problema4;
import java.util.Scanner;
public class matrix {
        private int[][] mat;
	int linii, coloane;
	matrix()
	{
		linii = 0;
		coloane = 0;
	}
	matrix(int l, int c)
	{
		linii = l;
		coloane = c;
		mat = new int[linii][coloane];
	}
	public void afiseaza()
	{
		Scanner s = new Scanner(System.in);
		int i=0,j=0;
		for (i=0; i < linii; i++)
		{
			for(j=0; j < coloane; j++)
	        {
				mat[i][j] = s.nextInt();
			}

		}
	}

	public void print_matrix()
	{
		int i = 0, j = 0;
		for (i = 0; i < linii; i++)
		{
			System.out.println("");
			for (j = 0; j < coloane; j++)
			{
				System.out.print("   "+mat[i][j]);
			}

		}
	}

	public matrix sumaMatrici(matrix m1)
	{
		matrix ans = new matrix(linii,coloane);
		int i=0,j=0;
		if (this.linii != m1.linii || this.coloane != m1.coloane)
		{
			System.out.println("Matricile trebuie sa aiba acelasi numar de linii si coloane!");
		}
		else
		{
			for (i = 0; i < linii; i++)
			{
				for (j = 0; j < coloane; j++)
				{
					ans.mat[i][j] = this.mat[i][j] + m1.mat[i][j];
				}
			}
		}
		return ans;
	}

	public matrix diferentaMatrici(matrix m1)
	{
		matrix ans = new matrix(linii,coloane);
		int i=0,j=0;
		if (this.linii != m1.linii || this.coloane != m1.coloane)
		{
			System.out.println("Matricile trebuie sa aiba acelasi numar de linii si coloane!");
		}
		else
		{
			for (i = 0; i < linii; i++)
			{
				for (j = 0; j < coloane; j++)
				{
					ans.mat[i][j] = this.mat[i][j] - m1.mat[i][j];
				}
			}
		}
		return ans;
	}
        
        public matrix matriceTranspusa(matrix m1){
            matrix ans = new matrix(linii,coloane);
		int i=0,j=0;
		if (this.linii != m1.linii || this.coloane != m1.coloane)
		{
			System.out.println("Matricile trebuie sa aiba acelasi numar de linii si coloane!");
		}
		else
		{
			for (i = 0; i < coloane; i++)
			{
				for (j = 0; j < linii; j++)
				{
                                    ans.mat[i][j] = this.mat[j][i];
                                }
                        }
                }
                return ans;
        }
        public matrix inmultireMatrici(matrix m1)
	{
		matrix ans = new matrix(linii,coloane);
		int i=0,j=0;
		if (this.linii != m1.linii || this.coloane != m1.coloane)
		{
			System.out.println("Matricile trebuie sa aiba acelasi numar de linii si coloane!");
		}
		else
		{
			for (i = 0; i < linii; i++)
			{
				for (j = 0; j < coloane; j++)
				{
					ans.mat[i][j] = this.mat[i][j] * m1.mat[i][j];
				}
			}
		}
		return ans;
	}
}
