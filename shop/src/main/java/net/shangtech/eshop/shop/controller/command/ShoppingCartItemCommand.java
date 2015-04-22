package net.shangtech.eshop.shop.controller.command;

import java.io.Serializable;

public class ShoppingCartItemCommand implements Serializable {

	private static final long serialVersionUID = -5821218860974954008L;

	private ShoppingCartSkuCommand sku;
	
	/** 库存编码 */
	private String code;
	
	private int quantity;
	
	private String size;
	
	private String color;
	
	/** 库存 */
	private int avaliable;
	
	private Double price;
	
	private Integer min;
	
	private Integer max;
	
	/** 小计 */
	private Double amount;

	public ShoppingCartSkuCommand getSku() {
		return sku;
	}

	public void setSku(ShoppingCartSkuCommand sku) {
		this.sku = sku;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void add(int quantity){
		this.quantity += quantity;
	}
	
	public void reduce(int quantity){
		if(quantity > this.quantity){
			
		}
		this.quantity -= quantity;
	}

	public int getAvaliable() {
		return avaliable;
	}

	public void setAvaliable(int avaliable) {
		this.avaliable = avaliable;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
