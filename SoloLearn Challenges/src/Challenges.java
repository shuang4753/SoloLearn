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
				break;

			}
		}


		for (double j = .0001; j<1; j+=.0001)	{
			if (((cube + j)*(cube + j)*(cube + j)>n) && (cube - j)*(cube - j)*(cube - j)<n)	{
				
				if (((cube + j)*(cube + j)*(cube + j)-n) > .0001)	{
					System.out.print(j+"  oks      ");
					cube += j;
				}
				
				else {
					System.out.print(j+"  mis      ");
					cube-=j;
				}
				break;
				
				
				
				
				
				
				
			}
		}
		return cube;

/*
 * if (n - (cube +=j)*(cube +=j)*(cube +=j)< .0001)	{
					cube += j;
					System.out.print(j+"  oks  ");
					break;
				}
				
				
				
				else {
					cube -=j;
					System.out.print(j+"  ji  ");
					break;
				}
 */






	}
}