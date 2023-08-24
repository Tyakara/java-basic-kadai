package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	public String getMychoice() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("自分のジャンケンの手を入力してください(r,s,p):");
		
		String myChoice = scanner.next();
		
		while(!myChoice.equals("r") && !myChoice.equals("s") && !myChoice.equals("p")) {
			
			System.out.println("無効な入力です。r,s,pのいずれかを入力してください");
			myChoice = scanner.next();
			
		}
		return myChoice;
	}
	public String getRandom() {
		
		int randomNumber = (int)Math.floor(Math.random() * 3);
		
		String[] choices = {"r","s","p"};
		
		return choices[randomNumber];
		
		
	}
	public void playGame() {
		String myChoice = getMychoice();
		
		String computerChoice = getRandom();
		
		HashMap<String,String> hand = new HashMap<>();
		hand.put("r","グー");
		hand.put("s","チョキ");
		hand.put("p","パー");
		
		System.out.println("自分の選んだ手:" + hand.get(myChoice));
		System.out.println("対戦相手が選んだ手"+ hand.get(computerChoice));
		
		if(myChoice.equals(computerChoice)) {
			
			System.out.println("あいこです。");
		
		
		}else if((myChoice.equals("r") && computerChoice.equals("s"))
			  ||(myChoice.equals("s") && computerChoice.equals("p"))
			  ||(myChoice.equals("s") && computerChoice.equals("p"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
	}
	
}