package com.generator.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class pos_GoodsType implements Serializable {
    private String cGoodsTypeno;

    private String cGoodsTypename;

    private String cParentNo;

    private String cDetail;

    private Boolean bWeight;

    private BigDecimal fValue_con;

    private BigDecimal fValue_Score;

    private String color_idNo;

    private String cDeptNo;

    private String cDept;

    private String cPath;

    private String bChange;

    private Date bChangedDate;

    private Boolean bfresh;

    private static final long serialVersionUID = 1L;

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

    public String getcParentNo() {
        return cParentNo;
    }

    public void setcParentNo(String cParentNo) {
        this.cParentNo = cParentNo == null ? null : cParentNo.trim();
    }

    public String getcDetail() {
        return cDetail;
    }

    public void setcDetail(String cDetail) {
        this.cDetail = cDetail == null ? null : cDetail.trim();
    }

    public Boolean getbWeight() {
        return bWeight;
    }

    public void setbWeight(Boolean bWeight) {
        this.bWeight = bWeight;
    }

    public BigDecimal getfValue_con() {
        return fValue_con;
    }

    public void setfValue_con(BigDecimal fValue_con) {
        this.fValue_con = fValue_con;
    }

    public BigDecimal getfValue_Score() {
        return fValue_Score;
    }

    public void setfValue_Score(BigDecimal fValue_Score) {
        this.fValue_Score = fValue_Score;
    }

    public String getColor_idNo() {
        return color_idNo;
    }

    public void setColor_idNo(String color_idNo) {
        this.color_idNo = color_idNo == null ? null : color_idNo.trim();
    }

    public String getcDeptNo() {
        return cDeptNo;
    }

    public void setcDeptNo(String cDeptNo) {
        this.cDeptNo = cDeptNo == null ? null : cDeptNo.trim();
    }

    public String getcDept() {
        return cDept;
    }

    public void setcDept(String cDept) {
        this.cDept = cDept == null ? null : cDept.trim();
    }

    public String getcPath() {
        return cPath;
    }

    public void setcPath(String cPath) {
        this.cPath = cPath == null ? null : cPath.trim();
    }

    public String getbChange() {
        return bChange;
    }

    public void setbChange(String bChange) {
        this.bChange = bChange == null ? null : bChange.trim();
    }

    public Date getbChangedDate() {
        return bChangedDate;
    }

    public void setbChangedDate(Date bChangedDate) {
        this.bChangedDate = bChangedDate;
    }

    public Boolean getBfresh() {
        return bfresh;
    }

    public void setBfresh(Boolean bfresh) {
        this.bfresh = bfresh;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cGoodsTypeno=").append(cGoodsTypeno);
        sb.append(", cGoodsTypename=").append(cGoodsTypename);
        sb.append(", cParentNo=").append(cParentNo);
        sb.append(", cDetail=").append(cDetail);
        sb.append(", bWeight=").append(bWeight);
        sb.append(", fValue_con=").append(fValue_con);
        sb.append(", fValue_Score=").append(fValue_Score);
        sb.append(", color_idNo=").append(color_idNo);
        sb.append(", cDeptNo=").append(cDeptNo);
        sb.append(", cDept=").append(cDept);
        sb.append(", cPath=").append(cPath);
        sb.append(", bChange=").append(bChange);
        sb.append(", bChangedDate=").append(bChangedDate);
        sb.append(", bfresh=").append(bfresh);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}