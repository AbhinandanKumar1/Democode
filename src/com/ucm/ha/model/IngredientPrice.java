/**
 * 
 */
package com.ucm.ha.model;

/**
 * @author Abhinandan
 * For storing the price given by pharmacy and validated by UCM.
 */

public class IngredientPrice {
	
	private Long drugCode;
	
	private float ingredientQty;
	
	private double pharmacyDrugCost;
	
	private double ucmDrugCost;
	
	private double revisedCost;

	public IngredientPrice() {
		super();
	}
	public Long getDrugCode() {
		return drugCode;
	}
	public void setDrugCode(Long drugCode) {
		this.drugCode = drugCode;
	}
	public float getIngredientQty() {
		return ingredientQty;
	}
	public void setIngredientQty(float ingredientQty) {
		this.ingredientQty = ingredientQty;
	}
	public double getPharmacyDrugCost() {
		return pharmacyDrugCost;
	}
	public void setPharmacyDrugCost(double pharmacyDrugCost) {
		this.pharmacyDrugCost = pharmacyDrugCost;
	}
	public double getUcmDrugCost() {
		return ucmDrugCost;
	}
	public void setUcmDrugCost(double ucmDrugCost) {
		this.ucmDrugCost = ucmDrugCost;
	}
	public double getRevisedCost() {
		return revisedCost;
	}
	public void setRevisedCost(double revisedCost) {
		this.revisedCost = revisedCost;
	}

}
