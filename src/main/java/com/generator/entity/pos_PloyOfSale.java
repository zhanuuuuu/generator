package com.generator.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class pos_PloyOfSale implements Serializable {
    private String cPloyNo;

    private String cGoodsNo;

    private Integer iLineNo;

    private String cGoodsName;

    private BigDecimal fQuantity_Ploy;

    private BigDecimal fPrice_SO;

    private Date dDateStart;

    private String cTimeStart;

    private Date dDateEnd;

    private String cTimeEnd;

    private Short iPriority;

    private Boolean bSO;

    private Boolean bPresent;

    private String cPresentPloyNo;

    private String cPloyTypeNo;

    private String cPloyTypeName;

    private Boolean bEnabled;

    private Boolean week1;

    private Boolean week2;

    private Boolean week3;

    private Boolean week4;

    private Boolean week5;

    private Boolean week6;

    private Boolean week7;

    private Boolean hour0;

    private Boolean hour1;

    private Boolean hour2;

    private Boolean hour3;

    private Boolean hour4;

    private Boolean hour5;

    private Boolean hour6;

    private Boolean hour7;

    private Boolean hour8;

    private Boolean hour9;

    private Boolean hour10;

    private Boolean hour11;

    private Boolean hour12;

    private Boolean hour13;

    private Boolean hour14;

    private Boolean hour15;

    private Boolean hour16;

    private Boolean hour17;

    private Boolean hour18;

    private Boolean hour19;

    private Boolean hour20;

    private Boolean hour21;

    private Boolean hour22;

    private Boolean hour23;

    private BigDecimal fVipValue;

    private Boolean bLimitQty;

    private BigDecimal fLimitQty;

    private Boolean bJiOu;

    private BigDecimal fQty_Ji;

    private BigDecimal fPrice_ji;

    private BigDecimal fQty_Ou;

    private BigDecimal fPrice_Ou;

    private BigDecimal fRatio_JiOu;

    private static final long serialVersionUID = 1L;

    public String getcPloyNo() {
        return cPloyNo;
    }

    public void setcPloyNo(String cPloyNo) {
        this.cPloyNo = cPloyNo == null ? null : cPloyNo.trim();
    }

    public String getcGoodsNo() {
        return cGoodsNo;
    }

    public void setcGoodsNo(String cGoodsNo) {
        this.cGoodsNo = cGoodsNo == null ? null : cGoodsNo.trim();
    }

    public Integer getiLineNo() {
        return iLineNo;
    }

    public void setiLineNo(Integer iLineNo) {
        this.iLineNo = iLineNo;
    }

    public String getcGoodsName() {
        return cGoodsName;
    }

    public void setcGoodsName(String cGoodsName) {
        this.cGoodsName = cGoodsName == null ? null : cGoodsName.trim();
    }

    public BigDecimal getfQuantity_Ploy() {
        return fQuantity_Ploy;
    }

    public void setfQuantity_Ploy(BigDecimal fQuantity_Ploy) {
        this.fQuantity_Ploy = fQuantity_Ploy;
    }

    public BigDecimal getfPrice_SO() {
        return fPrice_SO;
    }

    public void setfPrice_SO(BigDecimal fPrice_SO) {
        this.fPrice_SO = fPrice_SO;
    }

    public Date getdDateStart() {
        return dDateStart;
    }

    public void setdDateStart(Date dDateStart) {
        this.dDateStart = dDateStart;
    }

    public String getcTimeStart() {
        return cTimeStart;
    }

    public void setcTimeStart(String cTimeStart) {
        this.cTimeStart = cTimeStart == null ? null : cTimeStart.trim();
    }

    public Date getdDateEnd() {
        return dDateEnd;
    }

    public void setdDateEnd(Date dDateEnd) {
        this.dDateEnd = dDateEnd;
    }

    public String getcTimeEnd() {
        return cTimeEnd;
    }

    public void setcTimeEnd(String cTimeEnd) {
        this.cTimeEnd = cTimeEnd == null ? null : cTimeEnd.trim();
    }

    public Short getiPriority() {
        return iPriority;
    }

    public void setiPriority(Short iPriority) {
        this.iPriority = iPriority;
    }

    public Boolean getbSO() {
        return bSO;
    }

    public void setbSO(Boolean bSO) {
        this.bSO = bSO;
    }

    public Boolean getbPresent() {
        return bPresent;
    }

    public void setbPresent(Boolean bPresent) {
        this.bPresent = bPresent;
    }

    public String getcPresentPloyNo() {
        return cPresentPloyNo;
    }

    public void setcPresentPloyNo(String cPresentPloyNo) {
        this.cPresentPloyNo = cPresentPloyNo == null ? null : cPresentPloyNo.trim();
    }

    public String getcPloyTypeNo() {
        return cPloyTypeNo;
    }

    public void setcPloyTypeNo(String cPloyTypeNo) {
        this.cPloyTypeNo = cPloyTypeNo == null ? null : cPloyTypeNo.trim();
    }

    public String getcPloyTypeName() {
        return cPloyTypeName;
    }

    public void setcPloyTypeName(String cPloyTypeName) {
        this.cPloyTypeName = cPloyTypeName == null ? null : cPloyTypeName.trim();
    }

    public Boolean getbEnabled() {
        return bEnabled;
    }

    public void setbEnabled(Boolean bEnabled) {
        this.bEnabled = bEnabled;
    }

    public Boolean getWeek1() {
        return week1;
    }

    public void setWeek1(Boolean week1) {
        this.week1 = week1;
    }

    public Boolean getWeek2() {
        return week2;
    }

    public void setWeek2(Boolean week2) {
        this.week2 = week2;
    }

    public Boolean getWeek3() {
        return week3;
    }

    public void setWeek3(Boolean week3) {
        this.week3 = week3;
    }

    public Boolean getWeek4() {
        return week4;
    }

    public void setWeek4(Boolean week4) {
        this.week4 = week4;
    }

    public Boolean getWeek5() {
        return week5;
    }

    public void setWeek5(Boolean week5) {
        this.week5 = week5;
    }

    public Boolean getWeek6() {
        return week6;
    }

    public void setWeek6(Boolean week6) {
        this.week6 = week6;
    }

    public Boolean getWeek7() {
        return week7;
    }

    public void setWeek7(Boolean week7) {
        this.week7 = week7;
    }

    public Boolean getHour0() {
        return hour0;
    }

    public void setHour0(Boolean hour0) {
        this.hour0 = hour0;
    }

    public Boolean getHour1() {
        return hour1;
    }

    public void setHour1(Boolean hour1) {
        this.hour1 = hour1;
    }

    public Boolean getHour2() {
        return hour2;
    }

    public void setHour2(Boolean hour2) {
        this.hour2 = hour2;
    }

    public Boolean getHour3() {
        return hour3;
    }

    public void setHour3(Boolean hour3) {
        this.hour3 = hour3;
    }

    public Boolean getHour4() {
        return hour4;
    }

    public void setHour4(Boolean hour4) {
        this.hour4 = hour4;
    }

    public Boolean getHour5() {
        return hour5;
    }

    public void setHour5(Boolean hour5) {
        this.hour5 = hour5;
    }

    public Boolean getHour6() {
        return hour6;
    }

    public void setHour6(Boolean hour6) {
        this.hour6 = hour6;
    }

    public Boolean getHour7() {
        return hour7;
    }

    public void setHour7(Boolean hour7) {
        this.hour7 = hour7;
    }

    public Boolean getHour8() {
        return hour8;
    }

    public void setHour8(Boolean hour8) {
        this.hour8 = hour8;
    }

    public Boolean getHour9() {
        return hour9;
    }

    public void setHour9(Boolean hour9) {
        this.hour9 = hour9;
    }

    public Boolean getHour10() {
        return hour10;
    }

    public void setHour10(Boolean hour10) {
        this.hour10 = hour10;
    }

    public Boolean getHour11() {
        return hour11;
    }

    public void setHour11(Boolean hour11) {
        this.hour11 = hour11;
    }

    public Boolean getHour12() {
        return hour12;
    }

    public void setHour12(Boolean hour12) {
        this.hour12 = hour12;
    }

    public Boolean getHour13() {
        return hour13;
    }

    public void setHour13(Boolean hour13) {
        this.hour13 = hour13;
    }

    public Boolean getHour14() {
        return hour14;
    }

    public void setHour14(Boolean hour14) {
        this.hour14 = hour14;
    }

    public Boolean getHour15() {
        return hour15;
    }

    public void setHour15(Boolean hour15) {
        this.hour15 = hour15;
    }

    public Boolean getHour16() {
        return hour16;
    }

    public void setHour16(Boolean hour16) {
        this.hour16 = hour16;
    }

    public Boolean getHour17() {
        return hour17;
    }

    public void setHour17(Boolean hour17) {
        this.hour17 = hour17;
    }

    public Boolean getHour18() {
        return hour18;
    }

    public void setHour18(Boolean hour18) {
        this.hour18 = hour18;
    }

    public Boolean getHour19() {
        return hour19;
    }

    public void setHour19(Boolean hour19) {
        this.hour19 = hour19;
    }

    public Boolean getHour20() {
        return hour20;
    }

    public void setHour20(Boolean hour20) {
        this.hour20 = hour20;
    }

    public Boolean getHour21() {
        return hour21;
    }

    public void setHour21(Boolean hour21) {
        this.hour21 = hour21;
    }

    public Boolean getHour22() {
        return hour22;
    }

    public void setHour22(Boolean hour22) {
        this.hour22 = hour22;
    }

    public Boolean getHour23() {
        return hour23;
    }

    public void setHour23(Boolean hour23) {
        this.hour23 = hour23;
    }

    public BigDecimal getfVipValue() {
        return fVipValue;
    }

    public void setfVipValue(BigDecimal fVipValue) {
        this.fVipValue = fVipValue;
    }

    public Boolean getbLimitQty() {
        return bLimitQty;
    }

    public void setbLimitQty(Boolean bLimitQty) {
        this.bLimitQty = bLimitQty;
    }

    public BigDecimal getfLimitQty() {
        return fLimitQty;
    }

    public void setfLimitQty(BigDecimal fLimitQty) {
        this.fLimitQty = fLimitQty;
    }

    public Boolean getbJiOu() {
        return bJiOu;
    }

    public void setbJiOu(Boolean bJiOu) {
        this.bJiOu = bJiOu;
    }

    public BigDecimal getfQty_Ji() {
        return fQty_Ji;
    }

    public void setfQty_Ji(BigDecimal fQty_Ji) {
        this.fQty_Ji = fQty_Ji;
    }

    public BigDecimal getfPrice_ji() {
        return fPrice_ji;
    }

    public void setfPrice_ji(BigDecimal fPrice_ji) {
        this.fPrice_ji = fPrice_ji;
    }

    public BigDecimal getfQty_Ou() {
        return fQty_Ou;
    }

    public void setfQty_Ou(BigDecimal fQty_Ou) {
        this.fQty_Ou = fQty_Ou;
    }

    public BigDecimal getfPrice_Ou() {
        return fPrice_Ou;
    }

    public void setfPrice_Ou(BigDecimal fPrice_Ou) {
        this.fPrice_Ou = fPrice_Ou;
    }

    public BigDecimal getfRatio_JiOu() {
        return fRatio_JiOu;
    }

    public void setfRatio_JiOu(BigDecimal fRatio_JiOu) {
        this.fRatio_JiOu = fRatio_JiOu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cPloyNo=").append(cPloyNo);
        sb.append(", cGoodsNo=").append(cGoodsNo);
        sb.append(", iLineNo=").append(iLineNo);
        sb.append(", cGoodsName=").append(cGoodsName);
        sb.append(", fQuantity_Ploy=").append(fQuantity_Ploy);
        sb.append(", fPrice_SO=").append(fPrice_SO);
        sb.append(", dDateStart=").append(dDateStart);
        sb.append(", cTimeStart=").append(cTimeStart);
        sb.append(", dDateEnd=").append(dDateEnd);
        sb.append(", cTimeEnd=").append(cTimeEnd);
        sb.append(", iPriority=").append(iPriority);
        sb.append(", bSO=").append(bSO);
        sb.append(", bPresent=").append(bPresent);
        sb.append(", cPresentPloyNo=").append(cPresentPloyNo);
        sb.append(", cPloyTypeNo=").append(cPloyTypeNo);
        sb.append(", cPloyTypeName=").append(cPloyTypeName);
        sb.append(", bEnabled=").append(bEnabled);
        sb.append(", week1=").append(week1);
        sb.append(", week2=").append(week2);
        sb.append(", week3=").append(week3);
        sb.append(", week4=").append(week4);
        sb.append(", week5=").append(week5);
        sb.append(", week6=").append(week6);
        sb.append(", week7=").append(week7);
        sb.append(", hour0=").append(hour0);
        sb.append(", hour1=").append(hour1);
        sb.append(", hour2=").append(hour2);
        sb.append(", hour3=").append(hour3);
        sb.append(", hour4=").append(hour4);
        sb.append(", hour5=").append(hour5);
        sb.append(", hour6=").append(hour6);
        sb.append(", hour7=").append(hour7);
        sb.append(", hour8=").append(hour8);
        sb.append(", hour9=").append(hour9);
        sb.append(", hour10=").append(hour10);
        sb.append(", hour11=").append(hour11);
        sb.append(", hour12=").append(hour12);
        sb.append(", hour13=").append(hour13);
        sb.append(", hour14=").append(hour14);
        sb.append(", hour15=").append(hour15);
        sb.append(", hour16=").append(hour16);
        sb.append(", hour17=").append(hour17);
        sb.append(", hour18=").append(hour18);
        sb.append(", hour19=").append(hour19);
        sb.append(", hour20=").append(hour20);
        sb.append(", hour21=").append(hour21);
        sb.append(", hour22=").append(hour22);
        sb.append(", hour23=").append(hour23);
        sb.append(", fVipValue=").append(fVipValue);
        sb.append(", bLimitQty=").append(bLimitQty);
        sb.append(", fLimitQty=").append(fLimitQty);
        sb.append(", bJiOu=").append(bJiOu);
        sb.append(", fQty_Ji=").append(fQty_Ji);
        sb.append(", fPrice_ji=").append(fPrice_ji);
        sb.append(", fQty_Ou=").append(fQty_Ou);
        sb.append(", fPrice_Ou=").append(fPrice_Ou);
        sb.append(", fRatio_JiOu=").append(fRatio_JiOu);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}