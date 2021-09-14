package assignment1.second;

import java.util.Scanner;

public class Comparison_Refactor {
	public void Comparrison(int dist, int dist1) {
		if (dist == dist1) {		
			System.out.println("Length of Line is Equal ");
			}else if(dist < dist1) {
				System.out.println("Length of Line1 is Greater");
			}else {
				System.out.println("Length of Line2 is Greater");
			}
			
	}
	public int Distance(int x1_co_ordinates,int  y1_co_ordinates,int x2_co_ordinates,int  y2_co_ordinates ) {
		int dx = x2_co_ordinates - x1_co_ordinates;
		int dy = y2_co_ordinates - y1_co_ordinates;
		int dist = (int) Math.sqrt(dx * dx + dy * dy);
		return dist;
	}
	public static void main(String[] args) {
		
		int dist,dist1;
		Comparison_Refactor obj = new Comparison_Refactor();
		
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
		dist = obj.Distance(x1_co_ordinates, y1_co_ordinates, x2_co_ordinates, y2_co_ordinates);
		
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
		
		dist1 = obj.Distance(x3_co_ordinates, y3_co_ordinates, x4_co_ordinates, y4_co_ordinates);
	    
		obj.Comparrison(dist, dist1);
	}

}
