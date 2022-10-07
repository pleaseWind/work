
public class YanghuiTriangle {
	public static void main(String[] args) {
		int triangle[][] = new int[6][];// 创建二维数组,保存杨辉三角数据
		for (int i = 0; i < triangle.length; i++) {
			//补充缺失部分代码，实现将杨辉三角数据保存到二维数组中
			triangle[i] = new int[i + 1];
			for (int j = 0; j < i + 1; j ++) {
				if(j == 0||j == i)
					triangle[i][j] = 1;
				else 
					triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
			}

		}
		// 输出杨辉三角
		for(int i=0; i<triangle.length;i++) {
			for(int j=0; j<i + 1; j++)
				System.out.print(String.format("%-4d", triangle[i][j])); // 输出数组元素
			System.out.println();	//换行
		}
			
	}
}
