package com.generator.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class BLBGoodsInfo implements Serializable {
    private Long lineId;

    private String cartld;

    private String cartFlowNo;

    private String storeId;

    private String cashierNo;

    private String sn;

    private String id;

    private String name;

    private BigDecimal amount;

    private BigDecimal discountAmount;

    private String discountName;

    private BigDecimal basePrice;

    private BigDecimal price;

    private Integer qty;

    private BigDecimal weight;

    private Boolean isWeight;

    private String barcode;

    private String unit;

    private static final long serialVersionUID = 1L;

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    public String getCartld() {
        return cartld;
    }

    public void setCartld(String cartld) {
        this.cartld = cartld == null ? null : cartld.trim();
    }

    public String getCartFlowNo() {
        return cartFlowNo;
    }

    public void setCartFlowNo(String cartFlowNo) {
        this.cartFlowNo = cartFlowNo == null ? null : cartFlowNo.trim();
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    public String getCashierNo() {
        return cashierNo;
    }

    public void setCashierNo(String cashierNo) {
        this.cashierNo = cashierNo == null ? null : cashierNo.trim();
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName == null ? null : discountName.trim();
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Boolean getIsWeight() {
        return isWeight;
    }

    public void setIsWeight(Boolean isWeight) {
        this.isWeight = isWeight;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lineId=").append(lineId);
        sb.append(", cartld=").append(cartld);
        sb.append(", cartFlowNo=").append(cartFlowNo);
        sb.append(", storeId=").append(storeId);
        sb.append(", cashierNo=").append(cashierNo);
        sb.append(", sn=").append(sn);
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", amount=").append(amount);
        sb.append(", discountAmount=").append(discountAmount);
        sb.append(", discountName=").append(discountName);
        sb.append(", basePrice=").append(basePrice);
        sb.append(", price=").append(price);
        sb.append(", qty=").append(qty);
        sb.append(", weight=").append(weight);
        sb.append(", isWeight=").append(isWeight);
        sb.append(", barcode=").append(barcode);
        sb.append(", unit=").append(unit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}