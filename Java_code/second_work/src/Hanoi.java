
public class Hanoi {
	public static int step=0;
	public static void main(String[] args) {	
		hanoi(3,'a','b','c');
	}
	public static void hanoi(int n, char X, char Y, char Z) {
		//����÷������룬��Ҫ��ʵ��hanoi���ܡ���������
		if(n == 1)
		System.out.println(X+"->"+Z);
		else
		{hanoi(n-1,X,Z,Y);
		System.out.println(X+"->"+Z);
		hanoi(n-1,Y,X,Z);
		}

	}

}

