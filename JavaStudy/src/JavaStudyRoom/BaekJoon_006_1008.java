package JavaStudyRoom;

import java.util.Scanner;

/*
A/B 스페셜 저지
 
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	336993	109874	94473	34.260%
문제
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

예제 입력 1 
1 3

 */
public class BaekJoon_006_1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		System.out.println(A/B);
	}
}
