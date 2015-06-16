/**
 * 
 */
package com.ucm.ha.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Abhinandan
 *
 */
public class PunchedCharacterMap {
	static Map<Character,Integer>punchedCharMap=new HashMap<Character,Integer>();
	static{
		punchedCharMap.put('{',0);
		punchedCharMap.put('A',1);
		punchedCharMap.put('B',2);
		punchedCharMap.put('C',3);
		punchedCharMap.put('D',4);
		punchedCharMap.put('E',5);
		punchedCharMap.put('F',6);
		punchedCharMap.put('G',7);
		punchedCharMap.put('H',8);
		punchedCharMap.put('I',9);
		
		punchedCharMap.put('}',-0);
		punchedCharMap.put('J',-1);
		punchedCharMap.put('K',-2);
		punchedCharMap.put('L',-3);
		punchedCharMap.put('M',-4);
		punchedCharMap.put('N',-5);
		punchedCharMap.put('O',-6);
		punchedCharMap.put('P',-7);
		punchedCharMap.put('Q',-8);
		punchedCharMap.put('R',-9);
		
	}
	
	public static  Map<Character,Integer> getPunchedCharMap(){
		return punchedCharMap;
	}
}
