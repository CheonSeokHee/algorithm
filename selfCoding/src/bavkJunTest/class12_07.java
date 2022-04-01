package bavkJunTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class class12_07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int [N][2];
		
		for(int i=0; i<N; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (arr_1, arr_2) -> { //���ٽ����� 2���� �迭���� �����־����

			if(arr_1[0] == arr_2[0])  { //���� ���� ��
				
				return arr_1[1] - arr_2[1]; //������ ���� �ڸ��� �ٲ��� �ʰ�
			}
			else {
				return arr_1[0] - arr_2[0];	//����� �ڸ� �ٲٱ� 
			}
		});
		
		for(int i=0; i<N; i++) {
			
			sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
		}

		System.out.println(sb);
		
	}
}