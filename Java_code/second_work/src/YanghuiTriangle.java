
public class YanghuiTriangle {
	public static void main(String[] args) {
		int triangle[][] = new int[6][];// ������ά����,���������������
		for (int i = 0; i < triangle.length; i++) {
			//����ȱʧ���ִ��룬ʵ�ֽ�����������ݱ��浽��ά������
			triangle[i] = new int[i + 1];
			for (int j = 0; j < i + 1; j ++) {
				if(j == 0||j == i)
					triangle[i][j] = 1;
				else 
					triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
			}

		}
		// ����������
		for(int i=0; i<triangle.length;i++) {
			for(int j=0; j<i + 1; j++)
				System.out.print(String.format("%-4d", triangle[i][j])); // �������Ԫ��
			System.out.println();	//����
		}
			
	}
}
