
public class Hanoi {
	public static int step=0;
	public static void main(String[] args) {	
		hanoi(3,'a','b','c');
	}
	public static void hanoi(int n, char X, char Y, char Z) {
		//补充该方法代码，按要求实现hanoi功能、并输出结果
		if(n == 1)
		System.out.println(X+"->"+Z);
		else
		{hanoi(n-1,X,Z,Y);
		System.out.println(X+"->"+Z);
		hanoi(n-1,Y,X,Z);
		}

	}

}

