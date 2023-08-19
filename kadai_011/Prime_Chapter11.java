package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		boolean[] isPrime = new boolean[101];

		
		// 2からisPrime.lengthまでの数を素数と仮定、初期化する
		for(int i = 2; i < isPrime.length; i++) {
			
			isPrime[i] =true;
			
		}
		//2 から 100 までの数値について、それぞれが素数かどうかを判定
		for( int i = 2; i < isPrime.length; i++) {
			
			//isPrime[i]がtrueなら
			if(isPrime[i]) {
				//2～100のjを作成
				for(int j = i + 1; j < isPrime.length; j++) {
				//iで割り切れないかつ以前のループでJが素数ならtrueを代入 そうでないならfalseを代入
				isPrime[j] = (j % i != 0 ) && isPrime[j];
					
				}
				
			}
			
		}
		for(int i = 0; i < isPrime.length; ++i) {
			
			if(isPrime[i]) {
				
				System.out.println(i);
				
			}
			
		}
			
	}
		
		
	}	
		


	
		

