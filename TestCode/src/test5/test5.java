package test5;

public class test5 {
	public int answer(int[][] array) {
		int[] dx = {-1,0,1,0};
		int[] dy = {0,1,0,-1};
		int n = 10; // 연못의 크기
		int result = 0;
		int[] num = new int[4];
		int count = 0;
		while(count < 10) {
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++) {
					boolean flag = true;
					for(int k=0; k<4; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
							num[k] = array[nx][ny];
						}
					}
					if(num[0] == num[1] && num[1] == num[2] && num[2] == num[3]) {
						array[i][j] += 1; 
					}
				}
			}
			count++;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(array[i][j]>0) {
					result += array[i][j];
				}
			}
		}
		
		return result;
		
	}
}
