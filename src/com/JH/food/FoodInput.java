package com.JH.food;

import java.util.Scanner;

public class FoodInput {
	
	public Food[] foodinput() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 메뉴의 개수를 입력해 주세요.");
		int menu_num = sc.nextInt();
		Food[] food = new Food[menu_num];
		
		for(int i=0;i<menu_num;i++) {
			
			Food foods = new Food();
			foods.num = i+1; //음식의 번호 지정
			System.out.println(" 메뉴 이름을 입력해 주세요. ");
			foods.name = sc.next();
			System.out.println(" 메뉴 가격을 입력해 주세요. ");
			foods.price = sc.nextInt();
			System.out.println(" 메뉴 수량을 입력해 주세요. ");
			foods.store = sc.nextInt();
			foods.total = 0; //주문수량 계산
			food[i] = foods;
			
			
		}//end of for
		
		return food;

	} 
}