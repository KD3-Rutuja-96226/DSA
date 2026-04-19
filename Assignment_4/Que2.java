
public class Que2 {
	public static int searchFibbonacciSeries(int n){
		if(n==0 || n==1) {
			return n;
		}
		int fn1 = searchFibbonacciSeries(n-1);
		int fn2 = searchFibbonacciSeries(n-2);
		return fn1+fn2;	
	}
	public static void main(String[] args) {
		int res = searchFibbonacciSeries(10);
		System.out.println(res);
	}
}





