package com.JH.food;

import java.util.Scanner;

public class Order {

	public void order(Food[] food) {
		View view = new View();
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		Food[] nFood = food;

		while(check) {
			System.out.println("1. 주문 2. 결산");
			int num = sc.nextInt();

			switch(num) {
			case 1:
				for(int i =0; i<nFood.length ; i++ ) {
					System.out.print(i+1  + ". " + nFood[i].name+"    " );
				}

				System.out.println("메뉴를 선택하세요");
				num = sc.nextInt();
				for(int i =0; i<nFood.length; i++) {
					if(num == nFood[i].num) {
						System.out.println(nFood[i].name + "을 선택하셨습니다.");
						System.out.println("몇개 주문하시겠습니까 ? ");
						int total = sc.nextInt();

						nFood[i].total += total;
						if(nFood[i].store<nFood[i].total) {
							System.out.println("재고가 부족합니다.");
							nFood[i].total -= total;
							break;
						}
						System.out.println(total + "개 주문하셨습니다");

					}
					else {
						System.out.println("잘못된 입력입니다");

						break;
					}
				}




				break;
			case 2:
				System.out.println();
				view.totalView(nFood);
				check = !check;
				break;

			default:
				System.out.println("잘못된 입력입니다");
				break;
			}
		}
	}
}

