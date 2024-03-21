package ch05.check;

import java.util.Scanner;

public class Q9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int stdNum = 0;
		int[] arr = null;
		int score = 0;
		boolean run = true;
		while(run) {
			
			System.out.println("=======================================");
			System.out.println("1.학생수 2.점수 입력 3.점수리스트 4.분석 5.종료");
			System.out.println("=======================================");
			System.out.print("선택 > ");
			String cNum = sc.nextLine();
	
			switch(cNum) {
			
			case "1":
				System.out.print("학생 수를 입력하세요. > ");
				stdNum = Integer.parseInt(sc.nextLine());
				arr = new int[stdNum];
				break;
				
			case "2":
				System.out.println("점수를 입력하세요.");
				for(int i = 0; i<stdNum; i++) {
					
					System.out.print("score["+i+"] >");
					score = Integer.parseInt(sc.nextLine());
					arr[i] = score;
				}
				break;
			case "3":
				System.out.println("점수 리스트 입니다.");
				for(int i = 0 ;i<stdNum;i++) {
					System.out.println("score["+i+"] : "+arr[i]);
				}
				break;
			case "4" :
				int max = arr[0];
				int sum = arr[0];
				for(int i = 1 ; i<arr.length; i++) {
					sum += arr[i];
					if(max < arr[i]) {
						max = arr[i];
					}
				}
				
				double avg = (double)sum/stdNum;
				System.out.println("최고 점수 : "+ max);
				System.out.println("평균 점수 : " + avg);
				break;
			case "5":
				run = false;
				break;
			}
			
			
			
		}
		
		
	}

}
