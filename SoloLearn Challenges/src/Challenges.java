//NBONACCI
public class Challenges	{

	public static int nBonacci(int n, int m)	{

		int[] arr = new int[m];

		for (int i=0; i<m; i++)
		{
			if (i < n-1) {
				arr[i] = 0;
			}

			else if (i == n-1)	{
				arr[i] =1;
			}

			else {
				for (int j =  1; j<=n; j++ )
				{
					arr[i] += arr[i-j];
				}
			}
			System.out.print(arr[i] + " ");
		}

		return arr[m-1];
	}


	public static double cubeRoot(int n)	{

		double cube = 0.0;
		
		for (int i = 2; i<n; i++)	{
			if (((i+1)*(i+1)*(i+1)>n) && ((i-1)*(i-1)*(i-1)<n))	{
				cube += i;
				
			}
		}


		for (double j = 0; j<1; j+=.0001)	{
			if (((cube + j)*(cube + j)*(cube + j)>n) && (cube - j)*(cube - j)*(cube - j)<n)	{
				cube += j;
				
			}
		}

		return cube;
	}








}