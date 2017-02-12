package leetcode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class KeyboardRow {
	public static void main(String[] args) {
		String[] output = findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
		for(int s = 0 ; s < output.length; s++){
			System.out.println(output[s]);
		}
	}
	public static String[] findWords(String[] words){
		List<HashSet<Character>> keyBoard = new ArrayList<HashSet<Character>>();
		HashSet<Character> firstRow = new HashSet<Character>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
		HashSet<Character> secondRow = new HashSet<Character>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
		HashSet<Character> thirdRow = new HashSet<Character>(Arrays.asList('z','x','c','v','b','n','m'));
		keyBoard.add(firstRow);
		keyBoard.add(secondRow);
		keyBoard.add(thirdRow);
		List<String> output = new ArrayList<String>();
		for(int i = 0 ; i < words.length; i++){
			char[] word = words[i].toLowerCase().toCharArray();
			if(word.length == 0){
				continue;
			}
			for(int j = 0 ; j < keyBoard.size(); j++){
				HashSet<Character> tempSet = keyBoard.get(j);
				int k = 0;
				if(tempSet.contains(word[k++])){
					for(; k < word.length; k++){
						if(!tempSet.contains(word[k])){
							break;
						}
					}
					if(k == word.length){
						output.add(words[i]);
					}
				}
			}
		}
		return output.toArray(new String[output.size()]);
	}
}
