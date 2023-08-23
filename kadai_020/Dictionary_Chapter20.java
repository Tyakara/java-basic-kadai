package kadai_020;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	public static void main(String[] args) {
	
	HashMap<String,String> dictionary = new HashMap<String, String>();
	
	dictionary.put("apple","りんご");
	dictionary.put("peach", "桃");
	dictionary.put("banana", "バナナ");
	dictionary.put("lemon", "レモン");
	dictionary.put("pear", "梨");
	dictionary.put("kiwi", "キウィ");
	dictionary.put("strawberry", "いちご");
	dictionary.put("grape", "ぶどう");
	dictionary.put("muscat", "マスカット");
	dictionary.put("cherry", "さくらんぼ");
	
	
	ArrayList<String> wordList = new ArrayList<String>();
	
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("grape");
		wordList.add("orange");
		
		//拡張for文を忘れてた、配列の要素を順番に参照するfor-each
	for(String word : wordList) {
		
		//ここがわからなかったので調べた、if(dictionary.containsKey(word))はboolean型で指定された単語がHashMapのキー値に存在すればtrueを出力、無ければfalseを返す。
		if(dictionary.containsKey(word)) {
			
		String translation = dictionary.get(word);
		System.out.println(word +"の意味は"+translation);
		
		}else {
			
			System.out.println(word + "は辞書に存在しません");
			
		}
		
	}
	
	
		
	}

}