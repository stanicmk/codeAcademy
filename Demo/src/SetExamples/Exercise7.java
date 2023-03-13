package SetExamples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Exercise7 {
	
	public static void main(String[] args) {
		
		HashSet<String> colorsSet = new HashSet<>();
		
		colorsSet.add("Red");
		colorsSet.add("Blue");
		colorsSet.add("Green");
		colorsSet.add("Black");
		colorsSet.add("White");
		colorsSet.add("Pink");
		colorsSet.add("Yellow");
		
		ArrayList<String> colorsList = new ArrayList<>();
		colorsList = set2array(colorsSet);
		
		System.out.println(colorsList);
		
	}
		
	public static ArrayList<String> set2array(HashSet<String> set){
		
		ArrayList<String> result = new ArrayList<>();
		
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			
			result.add(iterator.next());
		}
		
		return result;
	}
		

}
