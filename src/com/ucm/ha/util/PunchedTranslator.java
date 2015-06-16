/**
 * 
 */
package com.ucm.ha.util;

/**
 * @author Abhinandan
 *
 */
public class PunchedTranslator {
	public static double convertToDecimal(String punchedString){
		if(punchedString!=null&&!punchedString.isEmpty()){
			char lastChar=punchedString.charAt(punchedString.length()-1);
			if(PunchedCharacterMap.getPunchedCharMap().get(lastChar)!=null){
				int lastDigit=PunchedCharacterMap.getPunchedCharMap().get(lastChar);
				int incomingValue=Integer.valueOf(punchedString.substring(0,punchedString.length()-1));
				double finalValue;
				if(lastDigit>=0){
					
					
					finalValue=Math.round(((incomingValue*10)+lastDigit))/100.0;
				}else{
					finalValue=Math.round(((incomingValue*-10)+lastDigit))/100.0;
				}

				return finalValue;
			}
			
		}
		return 0;
	}

}
