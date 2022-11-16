
public class bbsrt {
	
	public static void main(String[] args) {
		
		int a[]= {14,2,7,8,27};
		System.out.print("Array before sort: ");
		for(int i:a) {
			System.out.print(i+" ");
			
		}
		int n=a.length;
		int t=0;
		for (int i=0;i<n;i++)
		{
			for(int j=1;j<(n-1);j++)
			{
				if(a[j-1]>a[j])
				{
					t=a[j-1];
					a[j-1]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.print("\nAfter sort: ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
	}
	

}
