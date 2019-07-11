package com.generator.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class pos_Goods implements Serializable {
    private String cGoodsNo;

    private String cUnitedNo;

    private String cGoodsName;

    private String cGoodsTypeno;

    private String cGoodsTypename;

    private String cBarcode;

    private String cUnit;

    private String cSpec;

    private BigDecimal fNormalPrice;

    private BigDecimal fVipPrice;

    private String cProductUnit;

    private String cHelpCode;

    private BigDecimal cTaxRate;

    private BigDecimal fPreservationUp;

    private BigDecimal fPreservationDown;

    private String cLevel;

    private Boolean bSuspend;

    private Boolean bDeling;

    private Boolean bDeled;

    private Date dSuspendDate1;

    private Date dSuspendDate2;

    private Date dDelingDate1;

    private Date dDelingDate2;

    private BigDecimal fVipScore;

    private Boolean bProducted;

    private String cProductNo;

    private Boolean bWeight;

    private Boolean bHidePrice;

    private Boolean bHideQty;

    private String pinpaino;

    private String pinpai;

    private Boolean bUpdate;

    private BigDecimal fVipPrice_Student;

    private Boolean bStorage;

    private Boolean bLimitQty;

    private Boolean bReturnMoney;

    private Boolean bStorageToNull;

    private Boolean bDazhe;

    private Boolean b_VipPricePlan;

    private Boolean bMoneycard;

    private BigDecimal fMoneyValue;

    private BigDecimal fPreservation_soft;

    private BigDecimal fVipScore_0;

    private String cSupNo;

    private byte[] cGoodsImage;

    private static final long serialVersionUID = 1L;

    public String getcGoodsNo() {
        return cGoodsNo;
    }

    public void setcGoodsNo(String cGoodsNo) {
        this.cGoodsNo = cGoodsNo == null ? null : cGoodsNo.trim();
    }

    public String getcUnitedNo() {
        return cUnitedNo;
    }

    public void setcUnitedNo(String cUnitedNo) {
        this.cUnitedNo = cUnitedNo == null ? null : cUnitedNo.trim();
    }

    public String getcGoodsName() {
        return cGoodsName;
    }

    public void setcGoodsName(String cGoodsName) {
        this.cGoodsName = cGoodsName == null ? null : cGoodsName.trim();
    }

    public String getcGoodsTypeno() {
        return cGoodsTypeno;
    }

    public void setcGoodsTypeno(String cGoodsTypeno) {
        this.cGoodsTypeno = cGoodsTypeno == null ? null : cGoodsTypeno.trim();
    }

    public String getcGoodsTypename() {
        return cGoodsTypename;
    }

    public void setcGoodsTypename(String cGoodsTypename) {
        this.cGoodsTypename = cGoodsTypename == null ? null : cGoodsTypename.trim();
    }

    public String getcBarcode() {
        return cBarcode;
    }

    public void setcBarcode(String cBarcode) {
        this.cBarcode = cBarcode == null ? null : cBarcode.trim();
    }

    public String getcUnit() {
        return cUnit;
    }

    public void setcUnit(String cUnit) {
        this.cUnit = cUnit == null ? null : cUnit.trim();
    }

    public String getcSpec() {
        return cSpec;
    }

    public void setcSpec(String cSpec) {
        this.cSpec = cSpec == null ? null : cSpec.trim();
    }

    public BigDecimal getfNormalPrice() {
        return fNormalPrice;
    }

    public void setfNormalPrice(BigDecimal fNormalPrice) {
        this.fNormalPrice = fNormalPrice;
    }

    public BigDecimal getfVipPrice() {
        return fVipPrice;
    }

    public void setfVipPrice(BigDecimal fVipPrice) {
        this.fVipPrice = fVipPrice;
    }

    public String getcProductUnit() {
        return cProductUnit;
    }

    public void setcProductUnit(String cProductUnit) {
        this.cProductUnit = cProductUnit == null ? null : cProductUnit.trim();
    }

    public String getcHelpCode() {
        return cHelpCode;
    }

    public void setcHelpCode(String cHelpCode) {
        this.cHelpCode = cHelpCode == null ? null : cHelpCode.trim();
    }

    public BigDecimal getcTaxRate() {
        return cTaxRate;
    }

    public void setcTaxRate(BigDecimal cTaxRate) {
        this.cTaxRate = cTaxRate;
    }

    public BigDecimal getfPreservationUp() {
        return fPreservationUp;
    }

    public void setfPreservationUp(BigDecimal fPreservationUp) {
        this.fPreservationUp = fPreservationUp;
    }

    public BigDecimal getfPreservationDown() {
        return fPreservationDown;
    }

    public void setfPreservationDown(BigDecimal fPreservationDown) {
        this.fPreservationDown = fPreservationDown;
    }

    public String getcLevel() {
        return cLevel;
    }

    public void setcLevel(String cLevel) {
        this.cLevel = cLevel == null ? null : cLevel.trim();
    }

    public Boolean getbSuspend() {
        return bSuspend;
    }

    public void setbSuspend(Boolean bSuspend) {
        this.bSuspend = bSuspend;
    }

    public Boolean getbDeling() {
        return bDeling;
    }

    public void setbDeling(Boolean bDeling) {
        this.bDeling = bDeling;
    }

    public Boolean getbDeled() {
        return bDeled;
    }

    public void setbDeled(Boolean bDeled) {
        this.bDeled = bDeled;
    }

    public Date getdSuspendDate1() {
        return dSuspendDate1;
    }

    public void setdSuspendDate1(Date dSuspendDate1) {
        this.dSuspendDate1 = dSuspendDate1;
    }

    public Date getdSuspendDate2() {
        return dSuspendDate2;
    }

    public void setdSuspendDate2(Date dSuspendDate2) {
        this.dSuspendDate2 = dSuspendDate2;
    }

    public Date getdDelingDate1() {
        return dDelingDate1;
    }

    public void setdDelingDate1(Date dDelingDate1) {
        this.dDelingDate1 = dDelingDate1;
    }

    public Date getdDelingDate2() {
        return dDelingDate2;
    }

    public void setdDelingDate2(Date dDelingDate2) {
        this.dDelingDate2 = dDelingDate2;
    }

    public BigDecimal getfVipScore() {
        return fVipScore;
    }

    public void setfVipScore(BigDecimal fVipScore) {
        this.fVipScore = fVipScore;
    }

    public Boolean getbProducted() {
        return bProducted;
    }

    public void setbProducted(Boolean bProducted) {
        this.bProducted = bProducted;
    }

    public String getcProductNo() {
        return cProductNo;
    }

    public void setcProductNo(String cProductNo) {
        this.cProductNo = cProductNo == null ? null : cProductNo.trim();
    }

    public Boolean getbWeight() {
        return bWeight;
    }

    public void setbWeight(Boolean bWeight) {
        this.bWeight = bWeight;
    }

    public Boolean getbHidePrice() {
        return bHidePrice;
    }

    public void setbHidePrice(Boolean bHidePrice) {
        this.bHidePrice = bHidePrice;
    }

    public Boolean getbHideQty() {
        return bHideQty;
    }

    public void setbHideQty(Boolean bHideQty) {
        this.bHideQty = bHideQty;
    }

    public String getPinpaino() {
        return pinpaino;
    }

    public void setPinpaino(String pinpaino) {
        this.pinpaino = pinpaino == null ? null : pinpaino.trim();
    }

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai == null ? null : pinpai.trim();
    }

    public Boolean getbUpdate() {
        return bUpdate;
    }

    public void setbUpdate(Boolean bUpdate) {
        this.bUpdate = bUpdate;
    }

    public BigDecimal getfVipPrice_Student() {
        return fVipPrice_Student;
    }

    public void setfVipPrice_Student(BigDecimal fVipPrice_Student) {
        this.fVipPrice_Student = fVipPrice_Student;
    }

    public Boolean getbStorage() {
        return bStorage;
    }

    public void setbStorage(Boolean bStorage) {
        this.bStorage = bStorage;
    }

    public Boolean getbLimitQty() {
        return bLimitQty;
    }

    public void setbLimitQty(Boolean bLimitQty) {
        this.bLimitQty = bLimitQty;
    }

    public Boolean getbReturnMoney() {
        return bReturnMoney;
    }

    public void setbReturnMoney(Boolean bReturnMoney) {
        this.bReturnMoney = bReturnMoney;
    }

    public Boolean getbStorageToNull() {
        return bStorageToNull;
    }

    public void setbStorageToNull(Boolean bStorageToNull) {
        this.bStorageToNull = bStorageToNull;
    }

    public Boolean getbDazhe() {
        return bDazhe;
    }

    public void setbDazhe(Boolean bDazhe) {
        this.bDazhe = bDazhe;
    }

    public Boolean getB_VipPricePlan() {
        return b_VipPricePlan;
    }

    public void setB_VipPricePlan(Boolean b_VipPricePlan) {
        this.b_VipPricePlan = b_VipPricePlan;
    }

    public Boolean getbMoneycard() {
        return bMoneycard;
    }

    public void setbMoneycard(Boolean bMoneycard) {
        this.bMoneycard = bMoneycard;
    }

    public BigDecimal getfMoneyValue() {
        return fMoneyValue;
    }

    public void setfMoneyValue(BigDecimal fMoneyValue) {
        this.fMoneyValue = fMoneyValue;
    }

    public BigDecimal getfPreservation_soft() {
        return fPreservation_soft;
    }

    public void setfPreservation_soft(BigDecimal fPreservation_soft) {
        this.fPreservation_soft = fPreservation_soft;
    }

    public BigDecimal getfVipScore_0() {
        return fVipScore_0;
    }

    public void setfVipScore_0(BigDecimal fVipScore_0) {
        this.fVipScore_0 = fVipScore_0;
    }

    public String getcSupNo() {
        return cSupNo;
    }

    public void setcSupNo(String cSupNo) {
        this.cSupNo = cSupNo == null ? null : cSupNo.trim();
    }

    public byte[] getcGoodsImage() {
        return cGoodsImage;
    }

    public void setcGoodsImage(byte[] cGoodsImage) {
        this.cGoodsImage = cGoodsImage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cGoodsNo=").append(cGoodsNo);
        sb.append(", cUnitedNo=").append(cUnitedNo);
        sb.append(", cGoodsName=").append(cGoodsName);
        sb.append(", cGoodsTypeno=").append(cGoodsTypeno);
        sb.append(", cGoodsTypename=").append(cGoodsTypename);
        sb.append(", cBarcode=").append(cBarcode);
        sb.append(", cUnit=").append(cUnit);
        sb.append(", cSpec=").append(cSpec);
        sb.append(", fNormalPrice=").append(fNormalPrice);
        sb.append(", fVipPrice=").append(fVipPrice);
        sb.append(", cProductUnit=").append(cProductUnit);
        sb.append(", cHelpCode=").append(cHelpCode);
        sb.append(", cTaxRate=").append(cTaxRate);
        sb.append(", fPreservationUp=").append(fPreservationUp);
        sb.append(", fPreservationDown=").append(fPreservationDown);
        sb.append(", cLevel=").append(cLevel);
        sb.append(", bSuspend=").append(bSuspend);
        sb.append(", bDeling=").append(bDeling);
        sb.append(", bDeled=").append(bDeled);
        sb.append(", dSuspendDate1=").append(dSuspendDate1);
        sb.append(", dSuspendDate2=").append(dSuspendDate2);
        sb.append(", dDelingDate1=").append(dDelingDate1);
        sb.append(", dDelingDate2=").append(dDelingDate2);
        sb.append(", fVipScore=").append(fVipScore);
        sb.append(", bProducted=").append(bProducted);
        sb.append(", cProductNo=").append(cProductNo);
        sb.append(", bWeight=").append(bWeight);
        sb.append(", bHidePrice=").append(bHidePrice);
        sb.append(", bHideQty=").append(bHideQty);
        sb.append(", pinpaino=").append(pinpaino);
        sb.append(", pinpai=").append(pinpai);
        sb.append(", bUpdate=").append(bUpdate);
        sb.append(", fVipPrice_Student=").append(fVipPrice_Student);
        sb.append(", bStorage=").append(bStorage);
        sb.append(", bLimitQty=").append(bLimitQty);
        sb.append(", bReturnMoney=").append(bReturnMoney);
        sb.append(", bStorageToNull=").append(bStorageToNull);
        sb.append(", bDazhe=").append(bDazhe);
        sb.append(", b_VipPricePlan=").append(b_VipPricePlan);
        sb.append(", bMoneycard=").append(bMoneycard);
        sb.append(", fMoneyValue=").append(fMoneyValue);
        sb.append(", fPreservation_soft=").append(fPreservation_soft);
        sb.append(", fVipScore_0=").append(fVipScore_0);
        sb.append(", cSupNo=").append(cSupNo);
        sb.append(", cGoodsImage=").append(cGoodsImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}