package Encapsulation;

import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
	
	public void brew() {
		System.out.println("필터로 커피를 우려내는 중");
	}
	
	public void addCondiments() {
		System.out.println("우유와 설탕을 추가하는 중");
	}
	
	public boolean customerWantsCondiments() {
		
		String answer = getUserInput();
		
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getUserInput() {
		String answer = null;
		
		System.out.println("커피에 우유와 설탕을 넣을까요? (y/n) ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch(IOException ioe) {
			System.out.println("IO 오류");
		}
		if(answer == null) {
			return "no";
		}
		return answer;
	}
}
