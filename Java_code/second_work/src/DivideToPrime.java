

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class DivideToPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������1��������");
		int num = sc.nextInt();
		divideToPrime(num);
	}
	
	public static void divideToPrime(int n) {
		System.out.print(n + " = " );
		int i = 2;
		//����÷���ȱʧ���ִ��룬��Ҫ��n�ֽ�Ϊ��������˻�����������
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
	//����÷������ж�����n�Ƿ�����
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
