class gcd {
	public static int findgcd(int a,int b) {
		int res=0;
		while(b>0) {
			int temp=b;
			b=a%b;
			a=temp;
			res=a;
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]={12,6,81,27};
		int result=findgcd(arr[0],arr[1]);
		for(int i = 2; i < arr.length; i++) {
			result = findgcd(result,arr[i]);
		}
		System.out.println("The GCD of "+arr.length+" numbers is :: "+result);
	}
}