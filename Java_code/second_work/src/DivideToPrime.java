

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class DivideToPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入大于1的正整数");
		int num = sc.nextInt();
		divideToPrime(num);
	}
	
	public static void divideToPrime(int n) {
		System.out.print(n + " = " );
		int i = 2;
		//补充该方法缺失部分代码，按要求将n分解为多个素数乘积，并输出结果
		for(;i < n;i++){
			if(n % i == 0 && isPrime(i)) {
			System.out.print(i + "*");
			n /= i;
			i --;
			}
		}
		System.out.print(n);
	}
	
public static boolean isPrime(int n) {
	//补充该方法，判断整数n是否素数
	int count = 0;
		for(int i = 2;i < n;i++){
			if(n % i == 0){
				count = 1;
				break;
			}
			}
		if(count == 0){
			return true;
		}
		else
		return false;
	}
}
