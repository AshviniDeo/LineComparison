package assignment1.second;

import java.util.Scanner;

public class LineComparrison {
	public static void main(String[] args) {
		int i = 0;
		int dist,dist1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Co-ordinates for Line :");
		System.out.println("Starting Point(x,y) :" );
		System.out.println("x Coordinate :");
		int x1_co_ordinates = sc.nextInt();
		System.out.println("y Coordinate :");
		int y1_co_ordinates = sc.nextInt();
		System.out.println("Enter Ending Point(x,y) :");
		System.out.println("x Coordinate :");
		int x2_co_ordinates = sc.nextInt();
		System.out.println("y Coordinate :");
		int y2_co_ordinates = sc.nextInt();
		int dx = x2_co_ordinates - x1_co_ordinates;
		int dy = y2_co_ordinates - y2_co_ordinates;
		dist = (int) Math.sqrt(dx * dx + dy * dy);
		
		System.out.println("Enter Co-ordinates for Line 2 :");
		System.out.println("Starting Point(x,y) :" );
		System.out.println("x Coordinate :");
		int x3_co_ordinates = sc.nextInt();
		System.out.println("y Coordinate :");
		int y3_co_ordinates = sc.nextInt();
		System.out.println("Enter Ending Point(x,y) :");
		System.out.println("x Coordinate :");
		int x4_co_ordinates = sc.nextInt();
		System.out.println("y Coordinate :");
		int y4_co_ordinates = sc.nextInt();
		int dx1 = x4_co_ordinates - x3_co_ordinates;
		int dy1 = y4_co_ordinates - y3_co_ordinates;
		dist1 = (int) Math.sqrt(dx1 * dx1 + dy1 * dy1);
		
		System.out.println("Length of Line one : " + dist);
		System.out.println("Length of Line Two : " + dist1);
		
	}

}
