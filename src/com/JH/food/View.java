package com.JH.food;

public class View {

//	
//	public void littleView(Food[] food) {
//		Food[] lfood = food;
//		for(int i = 0; i<lfood.length; i++) {
//			
//			lfood[i]
//		}
//	}
	
	
	public void totalView(Food[] food) {
		Food[] tfood = food;
		int sum = 0;
		System.out.println("총 결산");
		for(int i =0; i<tfood.length; i++) {
			System.out.println(tfood[i].name + " " + "판매 수량 :  " + tfood[i].total );
			System.out.println("남은 재고" + (tfood[i].store - tfood[i].total) + "개");
			System.out.println("=====================================");
			sum = sum + (tfood[i].total * tfood[i].price);
			
		}
		System.out.println("총 판매액 :  "+ sum);
	}
}
