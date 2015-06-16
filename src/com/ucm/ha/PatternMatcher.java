package com.ucm.ha;

import java.util.HashMap;
import java.util.Map;

import com.ucm.ha.model.IngredientPrice;
import com.ucm.ha.util.PunchedTranslator;

public class PatternMatcher {

	public PatternMatcher() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		String b1Request="H123456D0B1AVVV      1011234567890     20150305XXXXXXXXXXAM04C2CARDHOLDER ID       C1RX1606         C3008C62AM01C419551226C52CAPATFNAME    CBPATLNAME           CMPAT ADDRESSCNPAT CITYCOSTCP555555     AM07EM1D2RX NUMBERE100D70                  E70000045000D303D5030D62D80DE20141202DF05DJ4C800EU00E254471007   AM11D90002770HDC0000500{DX0000950{DQ0003270HDU0003270HDN01AM03EZ01DBPRESCRIBER IDDRPRESCRIBER LNAME8E14AM10EF17EG1EC08RE03TE62991215904        ED0000000036EE0000175EUE01RE03TE38779086905        ED0000000009EE0000010IUE01RE03TE62991112404        ED0000005625EE0001054GUE01RE03TE63275998309        ED0000000014EE0000010AUE01RE03TE52372767620        ED0000000041EE0000000CUE01RE03TE52372085502        ED0000000058EE0000841{UE01RE03TE38779197404        ED0000000014EE0000214EUE01RE03TE51927336000        ED0000040330EE0000463HUE01";
		long startTime=System.nanoTime();
		
		
		String extractedString=b1Request.substring(481,924);
		System.out.println(extractedString);
		long endTime=System.nanoTime();
		
		
		
		
		System.out.println("--------------------------");
		String str2;
		String[] compundSegmentArray=extractedString.split("UE01");
		
		
		Map<Long,IngredientPrice> pricingMap=new HashMap<Long, IngredientPrice>();
		
		
		
		for(int counter=0;counter<compundSegmentArray.length;counter++){
			
			System.out.println("Item Number"+(counter+1));
			String str3=compundSegmentArray[counter].replaceAll("\\s", "");
			System.out.println(str3);
			
			String drugCode=str3.substring(str3.indexOf("TE")+2, str3.indexOf("TE")+13);
			String qty=(str3.substring(str3.indexOf("ED")+2, str3.indexOf("ED")+13)).replaceFirst("^0+(?!$)", "");
			String punchedPharmacyDrugCost=(str3.substring(str3.indexOf("EE")+2, str3.indexOf("EE")+10)).replaceFirst("^0+(?!$)", "");
			
		//	System.out.println("Code=="+code+"=="+qty.replaceFirst("^0+(?!$)", "")+"Cost=="+cost.replaceFirst("^0+(?!$)", ""));
			double pharmacyDrugCost =PunchedTranslator.convertToDecimal(punchedPharmacyDrugCost);
			
			Long ndc=Long.valueOf(drugCode);
			
			IngredientPrice ingredientPricing=new IngredientPrice();
			ingredientPricing.setDrugCode(Long.valueOf(drugCode));
			ingredientPricing.setIngredientQty(Float.valueOf(qty));
			ingredientPricing.setPharmacyDrugCost(pharmacyDrugCost);
			pricingMap.put(ndc, ingredientPricing);
			
			
			
			//System.out.println("==============================");
			
		}
		
		System.out.println("-------------------------------------------");
		
		
		
		
		
		System.out.println("Time Taken:"+(endTime-startTime));
	}

}
