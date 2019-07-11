package com.generator.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class pos_SaleSheetDetail implements Serializable {
    private String cSaleSheetno;

    private Integer iSeed;

    private String cGoodsNo;

    private String cGoodsName;

    private String cBarCode;

    private String cOperatorno;

    private String cOperatorName;

    private String cVipCardno;

    private Boolean bAuditing;

    private String cChkOperno;

    private String cChkOper;

    private Boolean bSettle;

    private BigDecimal fVipScore;

    private BigDecimal fPrice;

    private BigDecimal fNormalSettle;

    private Boolean bVipPrice;

    private BigDecimal fVipPrice;

    private Boolean bVipRate;

    private BigDecimal fVipRate;

    private BigDecimal fQuantity;

    private BigDecimal fAgio;

    private BigDecimal fLastSettle0;

    private BigDecimal fLastSettle;

    private String cManager;

    private String cManagerno;

    private Date dSaleDate;

    private String cSaleTime;

    private Date dFinanceDate;

    private String cWorkerno;

    private String cWorker;

    private Boolean bPost;

    private Boolean bChecked;

    private String cCheckNo;

    private Date dCheck;

    private String cVipNo;

    private Boolean bHidePrice;

    private Boolean bHideQty;

    private Boolean bWeight;

    private BigDecimal fNormalVipScore;

    private Boolean bExchange;

    private BigDecimal fSupRatio_exchange;

    private Boolean bPresent;

    private Boolean bSend;

    private String cWHno;

    private Boolean bLimited;

    private BigDecimal fVipScore_cur;

    private String cBanci_ID;

    private Integer iLineNo_Banci;

    private BigDecimal fDiscount;

    private BigDecimal fPrice_Exe;

    private BigDecimal fRate_Exe;

    private String cBanci;

    private Boolean bMoneycard;

    private BigDecimal fMoneyValue;

    private String cPloyNo;

    private String cPloyName;

    private String cPloyTypeNo;

    private String cPloyTypeName;

    private Integer iGroupType;

    private BigDecimal fRatio_GroupPloy;

    private static final long serialVersionUID = 1L;

    public String getcSaleSheetno() {
        return cSaleSheetno;
    }

    public void setcSaleSheetno(String cSaleSheetno) {
        this.cSaleSheetno = cSaleSheetno == null ? null : cSaleSheetno.trim();
    }

    public Integer getiSeed() {
        return iSeed;
    }

    public void setiSeed(Integer iSeed) {
        this.iSeed = iSeed;
    }

    public String getcGoodsNo() {
        return cGoodsNo;
    }

    public void setcGoodsNo(String cGoodsNo) {
        this.cGoodsNo = cGoodsNo == null ? null : cGoodsNo.trim();
    }

    public String getcGoodsName() {
        return cGoodsName;
    }

    public void setcGoodsName(String cGoodsName) {
        this.cGoodsName = cGoodsName == null ? null : cGoodsName.trim();
    }

    public String getcBarCode() {
        return cBarCode;
    }

    public void setcBarCode(String cBarCode) {
        this.cBarCode = cBarCode == null ? null : cBarCode.trim();
    }

    public String getcOperatorno() {
        return cOperatorno;
    }

    public void setcOperatorno(String cOperatorno) {
        this.cOperatorno = cOperatorno == null ? null : cOperatorno.trim();
    }

    public String getcOperatorName() {
        return cOperatorName;
    }

    public void setcOperatorName(String cOperatorName) {
        this.cOperatorName = cOperatorName == null ? null : cOperatorName.trim();
    }

    public String getcVipCardno() {
        return cVipCardno;
    }

    public void setcVipCardno(String cVipCardno) {
        this.cVipCardno = cVipCardno == null ? null : cVipCardno.trim();
    }

    public Boolean getbAuditing() {
        return bAuditing;
    }

    public void setbAuditing(Boolean bAuditing) {
        this.bAuditing = bAuditing;
    }

    public String getcChkOperno() {
        return cChkOperno;
    }

    public void setcChkOperno(String cChkOperno) {
        this.cChkOperno = cChkOperno == null ? null : cChkOperno.trim();
    }

    public String getcChkOper() {
        return cChkOper;
    }

    public void setcChkOper(String cChkOper) {
        this.cChkOper = cChkOper == null ? null : cChkOper.trim();
    }

    public Boolean getbSettle() {
        return bSettle;
    }

    public void setbSettle(Boolean bSettle) {
        this.bSettle = bSettle;
    }

    public BigDecimal getfVipScore() {
        return fVipScore;
    }

    public void setfVipScore(BigDecimal fVipScore) {
        this.fVipScore = fVipScore;
    }

    public BigDecimal getfPrice() {
        return fPrice;
    }

    public void setfPrice(BigDecimal fPrice) {
        this.fPrice = fPrice;
    }

    public BigDecimal getfNormalSettle() {
        return fNormalSettle;
    }

    public void setfNormalSettle(BigDecimal fNormalSettle) {
        this.fNormalSettle = fNormalSettle;
    }

    public Boolean getbVipPrice() {
        return bVipPrice;
    }

    public void setbVipPrice(Boolean bVipPrice) {
        this.bVipPrice = bVipPrice;
    }

    public BigDecimal getfVipPrice() {
        return fVipPrice;
    }

    public void setfVipPrice(BigDecimal fVipPrice) {
        this.fVipPrice = fVipPrice;
    }

    public Boolean getbVipRate() {
        return bVipRate;
    }

    public void setbVipRate(Boolean bVipRate) {
        this.bVipRate = bVipRate;
    }

    public BigDecimal getfVipRate() {
        return fVipRate;
    }

    public void setfVipRate(BigDecimal fVipRate) {
        this.fVipRate = fVipRate;
    }

    public BigDecimal getfQuantity() {
        return fQuantity;
    }

    public void setfQuantity(BigDecimal fQuantity) {
        this.fQuantity = fQuantity;
    }

    public BigDecimal getfAgio() {
        return fAgio;
    }

    public void setfAgio(BigDecimal fAgio) {
        this.fAgio = fAgio;
    }

    public BigDecimal getfLastSettle0() {
        return fLastSettle0;
    }

    public void setfLastSettle0(BigDecimal fLastSettle0) {
        this.fLastSettle0 = fLastSettle0;
    }

    public BigDecimal getfLastSettle() {
        return fLastSettle;
    }

    public void setfLastSettle(BigDecimal fLastSettle) {
        this.fLastSettle = fLastSettle;
    }

    public String getcManager() {
        return cManager;
    }

    public void setcManager(String cManager) {
        this.cManager = cManager == null ? null : cManager.trim();
    }

    public String getcManagerno() {
        return cManagerno;
    }

    public void setcManagerno(String cManagerno) {
        this.cManagerno = cManagerno == null ? null : cManagerno.trim();
    }

    public Date getdSaleDate() {
        return dSaleDate;
    }

    public void setdSaleDate(Date dSaleDate) {
        this.dSaleDate = dSaleDate;
    }

    public String getcSaleTime() {
        return cSaleTime;
    }

    public void setcSaleTime(String cSaleTime) {
        this.cSaleTime = cSaleTime == null ? null : cSaleTime.trim();
    }

    public Date getdFinanceDate() {
        return dFinanceDate;
    }

    public void setdFinanceDate(Date dFinanceDate) {
        this.dFinanceDate = dFinanceDate;
    }

    public String getcWorkerno() {
        return cWorkerno;
    }

    public void setcWorkerno(String cWorkerno) {
        this.cWorkerno = cWorkerno == null ? null : cWorkerno.trim();
    }

    public String getcWorker() {
        return cWorker;
    }

    public void setcWorker(String cWorker) {
        this.cWorker = cWorker == null ? null : cWorker.trim();
    }

    public Boolean getbPost() {
        return bPost;
    }

    public void setbPost(Boolean bPost) {
        this.bPost = bPost;
    }

    public Boolean getbChecked() {
        return bChecked;
    }

    public void setbChecked(Boolean bChecked) {
        this.bChecked = bChecked;
    }

    public String getcCheckNo() {
        return cCheckNo;
    }

    public void setcCheckNo(String cCheckNo) {
        this.cCheckNo = cCheckNo == null ? null : cCheckNo.trim();
    }

    public Date getdCheck() {
        return dCheck;
    }

    public void setdCheck(Date dCheck) {
        this.dCheck = dCheck;
    }

    public String getcVipNo() {
        return cVipNo;
    }

    public void setcVipNo(String cVipNo) {
        this.cVipNo = cVipNo == null ? null : cVipNo.trim();
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

    public Boolean getbWeight() {
        return bWeight;
    }

    public void setbWeight(Boolean bWeight) {
        this.bWeight = bWeight;
    }

    public BigDecimal getfNormalVipScore() {
        return fNormalVipScore;
    }

    public void setfNormalVipScore(BigDecimal fNormalVipScore) {
        this.fNormalVipScore = fNormalVipScore;
    }

    public Boolean getbExchange() {
        return bExchange;
    }

    public void setbExchange(Boolean bExchange) {
        this.bExchange = bExchange;
    }

    public BigDecimal getfSupRatio_exchange() {
        return fSupRatio_exchange;
    }

    public void setfSupRatio_exchange(BigDecimal fSupRatio_exchange) {
        this.fSupRatio_exchange = fSupRatio_exchange;
    }

    public Boolean getbPresent() {
        return bPresent;
    }

    public void setbPresent(Boolean bPresent) {
        this.bPresent = bPresent;
    }

    public Boolean getbSend() {
        return bSend;
    }

    public void setbSend(Boolean bSend) {
        this.bSend = bSend;
    }

    public String getcWHno() {
        return cWHno;
    }

    public void setcWHno(String cWHno) {
        this.cWHno = cWHno == null ? null : cWHno.trim();
    }

    public Boolean getbLimited() {
        return bLimited;
    }

    public void setbLimited(Boolean bLimited) {
        this.bLimited = bLimited;
    }

    public BigDecimal getfVipScore_cur() {
        return fVipScore_cur;
    }

    public void setfVipScore_cur(BigDecimal fVipScore_cur) {
        this.fVipScore_cur = fVipScore_cur;
    }

    public String getcBanci_ID() {
        return cBanci_ID;
    }

    public void setcBanci_ID(String cBanci_ID) {
        this.cBanci_ID = cBanci_ID == null ? null : cBanci_ID.trim();
    }

    public Integer getiLineNo_Banci() {
        return iLineNo_Banci;
    }

    public void setiLineNo_Banci(Integer iLineNo_Banci) {
        this.iLineNo_Banci = iLineNo_Banci;
    }

    public BigDecimal getfDiscount() {
        return fDiscount;
    }

    public void setfDiscount(BigDecimal fDiscount) {
        this.fDiscount = fDiscount;
    }

    public BigDecimal getfPrice_Exe() {
        return fPrice_Exe;
    }

    public void setfPrice_Exe(BigDecimal fPrice_Exe) {
        this.fPrice_Exe = fPrice_Exe;
    }

    public BigDecimal getfRate_Exe() {
        return fRate_Exe;
    }

    public void setfRate_Exe(BigDecimal fRate_Exe) {
        this.fRate_Exe = fRate_Exe;
    }

    public String getcBanci() {
        return cBanci;
    }

    public void setcBanci(String cBanci) {
        this.cBanci = cBanci == null ? null : cBanci.trim();
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

    public String getcPloyNo() {
        return cPloyNo;
    }

    public void setcPloyNo(String cPloyNo) {
        this.cPloyNo = cPloyNo == null ? null : cPloyNo.trim();
    }

    public String getcPloyName() {
        return cPloyName;
    }

    public void setcPloyName(String cPloyName) {
        this.cPloyName = cPloyName == null ? null : cPloyName.trim();
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

    public Integer getiGroupType() {
        return iGroupType;
    }

    public void setiGroupType(Integer iGroupType) {
        this.iGroupType = iGroupType;
    }

    public BigDecimal getfRatio_GroupPloy() {
        return fRatio_GroupPloy;
    }

    public void setfRatio_GroupPloy(BigDecimal fRatio_GroupPloy) {
        this.fRatio_GroupPloy = fRatio_GroupPloy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cSaleSheetno=").append(cSaleSheetno);
        sb.append(", iSeed=").append(iSeed);
        sb.append(", cGoodsNo=").append(cGoodsNo);
        sb.append(", cGoodsName=").append(cGoodsName);
        sb.append(", cBarCode=").append(cBarCode);
        sb.append(", cOperatorno=").append(cOperatorno);
        sb.append(", cOperatorName=").append(cOperatorName);
        sb.append(", cVipCardno=").append(cVipCardno);
        sb.append(", bAuditing=").append(bAuditing);
        sb.append(", cChkOperno=").append(cChkOperno);
        sb.append(", cChkOper=").append(cChkOper);
        sb.append(", bSettle=").append(bSettle);
        sb.append(", fVipScore=").append(fVipScore);
        sb.append(", fPrice=").append(fPrice);
        sb.append(", fNormalSettle=").append(fNormalSettle);
        sb.append(", bVipPrice=").append(bVipPrice);
        sb.append(", fVipPrice=").append(fVipPrice);
        sb.append(", bVipRate=").append(bVipRate);
        sb.append(", fVipRate=").append(fVipRate);
        sb.append(", fQuantity=").append(fQuantity);
        sb.append(", fAgio=").append(fAgio);
        sb.append(", fLastSettle0=").append(fLastSettle0);
        sb.append(", fLastSettle=").append(fLastSettle);
        sb.append(", cManager=").append(cManager);
        sb.append(", cManagerno=").append(cManagerno);
        sb.append(", dSaleDate=").append(dSaleDate);
        sb.append(", cSaleTime=").append(cSaleTime);
        sb.append(", dFinanceDate=").append(dFinanceDate);
        sb.append(", cWorkerno=").append(cWorkerno);
        sb.append(", cWorker=").append(cWorker);
        sb.append(", bPost=").append(bPost);
        sb.append(", bChecked=").append(bChecked);
        sb.append(", cCheckNo=").append(cCheckNo);
        sb.append(", dCheck=").append(dCheck);
        sb.append(", cVipNo=").append(cVipNo);
        sb.append(", bHidePrice=").append(bHidePrice);
        sb.append(", bHideQty=").append(bHideQty);
        sb.append(", bWeight=").append(bWeight);
        sb.append(", fNormalVipScore=").append(fNormalVipScore);
        sb.append(", bExchange=").append(bExchange);
        sb.append(", fSupRatio_exchange=").append(fSupRatio_exchange);
        sb.append(", bPresent=").append(bPresent);
        sb.append(", bSend=").append(bSend);
        sb.append(", cWHno=").append(cWHno);
        sb.append(", bLimited=").append(bLimited);
        sb.append(", fVipScore_cur=").append(fVipScore_cur);
        sb.append(", cBanci_ID=").append(cBanci_ID);
        sb.append(", iLineNo_Banci=").append(iLineNo_Banci);
        sb.append(", fDiscount=").append(fDiscount);
        sb.append(", fPrice_Exe=").append(fPrice_Exe);
        sb.append(", fRate_Exe=").append(fRate_Exe);
        sb.append(", cBanci=").append(cBanci);
        sb.append(", bMoneycard=").append(bMoneycard);
        sb.append(", fMoneyValue=").append(fMoneyValue);
        sb.append(", cPloyNo=").append(cPloyNo);
        sb.append(", cPloyName=").append(cPloyName);
        sb.append(", cPloyTypeNo=").append(cPloyTypeNo);
        sb.append(", cPloyTypeName=").append(cPloyTypeName);
        sb.append(", iGroupType=").append(iGroupType);
        sb.append(", fRatio_GroupPloy=").append(fRatio_GroupPloy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}