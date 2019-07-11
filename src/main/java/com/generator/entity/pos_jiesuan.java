package com.generator.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class pos_jiesuan implements Serializable {
    private String sheetno;

    private String jstype;

    private BigDecimal mianzhi;

    private BigDecimal zhekou;

    private BigDecimal zhaoling;

    private BigDecimal shishou;

    private Date jstime;

    private Date zdriqi;

    private Short jiaozhang;

    private Date jiaozhangtime;

    private Date jiaozhangdate;

    private String shouyinyuanno;

    private String shouyinyuanmc;

    private Date jiaokuantime;

    private String shoukuanno;

    private String shoukuanname;

    private Short netjiecun;

    private BigDecimal orientmoney;

    private BigDecimal leftmoney;

    private Short storevalue;

    private String detail;

    private Boolean bPost;

    private String cWHno;

    private String invoiceNo;

    private String cBanci_ID;

    private Integer iLineNo_Banci;

    private String cBanci;

    private static final long serialVersionUID = 1L;

    public String getSheetno() {
        return sheetno;
    }

    public void setSheetno(String sheetno) {
        this.sheetno = sheetno == null ? null : sheetno.trim();
    }

    public String getJstype() {
        return jstype;
    }

    public void setJstype(String jstype) {
        this.jstype = jstype == null ? null : jstype.trim();
    }

    public BigDecimal getMianzhi() {
        return mianzhi;
    }

    public void setMianzhi(BigDecimal mianzhi) {
        this.mianzhi = mianzhi;
    }

    public BigDecimal getZhekou() {
        return zhekou;
    }

    public void setZhekou(BigDecimal zhekou) {
        this.zhekou = zhekou;
    }

    public BigDecimal getZhaoling() {
        return zhaoling;
    }

    public void setZhaoling(BigDecimal zhaoling) {
        this.zhaoling = zhaoling;
    }

    public BigDecimal getShishou() {
        return shishou;
    }

    public void setShishou(BigDecimal shishou) {
        this.shishou = shishou;
    }

    public Date getJstime() {
        return jstime;
    }

    public void setJstime(Date jstime) {
        this.jstime = jstime;
    }

    public Date getZdriqi() {
        return zdriqi;
    }

    public void setZdriqi(Date zdriqi) {
        this.zdriqi = zdriqi;
    }

    public Short getJiaozhang() {
        return jiaozhang;
    }

    public void setJiaozhang(Short jiaozhang) {
        this.jiaozhang = jiaozhang;
    }

    public Date getJiaozhangtime() {
        return jiaozhangtime;
    }

    public void setJiaozhangtime(Date jiaozhangtime) {
        this.jiaozhangtime = jiaozhangtime;
    }

    public Date getJiaozhangdate() {
        return jiaozhangdate;
    }

    public void setJiaozhangdate(Date jiaozhangdate) {
        this.jiaozhangdate = jiaozhangdate;
    }

    public String getShouyinyuanno() {
        return shouyinyuanno;
    }

    public void setShouyinyuanno(String shouyinyuanno) {
        this.shouyinyuanno = shouyinyuanno == null ? null : shouyinyuanno.trim();
    }

    public String getShouyinyuanmc() {
        return shouyinyuanmc;
    }

    public void setShouyinyuanmc(String shouyinyuanmc) {
        this.shouyinyuanmc = shouyinyuanmc == null ? null : shouyinyuanmc.trim();
    }

    public Date getJiaokuantime() {
        return jiaokuantime;
    }

    public void setJiaokuantime(Date jiaokuantime) {
        this.jiaokuantime = jiaokuantime;
    }

    public String getShoukuanno() {
        return shoukuanno;
    }

    public void setShoukuanno(String shoukuanno) {
        this.shoukuanno = shoukuanno == null ? null : shoukuanno.trim();
    }

    public String getShoukuanname() {
        return shoukuanname;
    }

    public void setShoukuanname(String shoukuanname) {
        this.shoukuanname = shoukuanname == null ? null : shoukuanname.trim();
    }

    public Short getNetjiecun() {
        return netjiecun;
    }

    public void setNetjiecun(Short netjiecun) {
        this.netjiecun = netjiecun;
    }

    public BigDecimal getOrientmoney() {
        return orientmoney;
    }

    public void setOrientmoney(BigDecimal orientmoney) {
        this.orientmoney = orientmoney;
    }

    public BigDecimal getLeftmoney() {
        return leftmoney;
    }

    public void setLeftmoney(BigDecimal leftmoney) {
        this.leftmoney = leftmoney;
    }

    public Short getStorevalue() {
        return storevalue;
    }

    public void setStorevalue(Short storevalue) {
        this.storevalue = storevalue;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public Boolean getbPost() {
        return bPost;
    }

    public void setbPost(Boolean bPost) {
        this.bPost = bPost;
    }

    public String getcWHno() {
        return cWHno;
    }

    public void setcWHno(String cWHno) {
        this.cWHno = cWHno == null ? null : cWHno.trim();
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
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

    public String getcBanci() {
        return cBanci;
    }

    public void setcBanci(String cBanci) {
        this.cBanci = cBanci == null ? null : cBanci.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sheetno=").append(sheetno);
        sb.append(", jstype=").append(jstype);
        sb.append(", mianzhi=").append(mianzhi);
        sb.append(", zhekou=").append(zhekou);
        sb.append(", zhaoling=").append(zhaoling);
        sb.append(", shishou=").append(shishou);
        sb.append(", jstime=").append(jstime);
        sb.append(", zdriqi=").append(zdriqi);
        sb.append(", jiaozhang=").append(jiaozhang);
        sb.append(", jiaozhangtime=").append(jiaozhangtime);
        sb.append(", jiaozhangdate=").append(jiaozhangdate);
        sb.append(", shouyinyuanno=").append(shouyinyuanno);
        sb.append(", shouyinyuanmc=").append(shouyinyuanmc);
        sb.append(", jiaokuantime=").append(jiaokuantime);
        sb.append(", shoukuanno=").append(shoukuanno);
        sb.append(", shoukuanname=").append(shoukuanname);
        sb.append(", netjiecun=").append(netjiecun);
        sb.append(", orientmoney=").append(orientmoney);
        sb.append(", leftmoney=").append(leftmoney);
        sb.append(", storevalue=").append(storevalue);
        sb.append(", detail=").append(detail);
        sb.append(", bPost=").append(bPost);
        sb.append(", cWHno=").append(cWHno);
        sb.append(", invoiceNo=").append(invoiceNo);
        sb.append(", cBanci_ID=").append(cBanci_ID);
        sb.append(", iLineNo_Banci=").append(iLineNo_Banci);
        sb.append(", cBanci=").append(cBanci);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}