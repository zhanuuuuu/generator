package com.generator.entity;

import java.io.Serializable;

public class posstation implements Serializable {
    private String appId;

    private String posname;

    private String posid;

    private String cWHno;

    private String pos_Day;

    private String cStoreNo;

    private String cMachineID;

    private String CMachineKey;

    private static final long serialVersionUID = 1L;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    public String getPosname() {
        return posname;
    }

    public void setPosname(String posname) {
        this.posname = posname == null ? null : posname.trim();
    }

    public String getPosid() {
        return posid;
    }

    public void setPosid(String posid) {
        this.posid = posid == null ? null : posid.trim();
    }

    public String getcWHno() {
        return cWHno;
    }

    public void setcWHno(String cWHno) {
        this.cWHno = cWHno == null ? null : cWHno.trim();
    }

    public String getPos_Day() {
        return pos_Day;
    }

    public void setPos_Day(String pos_Day) {
        this.pos_Day = pos_Day == null ? null : pos_Day.trim();
    }

    public String getcStoreNo() {
        return cStoreNo;
    }

    public void setcStoreNo(String cStoreNo) {
        this.cStoreNo = cStoreNo == null ? null : cStoreNo.trim();
    }

    public String getcMachineID() {
        return cMachineID;
    }

    public void setcMachineID(String cMachineID) {
        this.cMachineID = cMachineID == null ? null : cMachineID.trim();
    }

    public String getCMachineKey() {
        return CMachineKey;
    }

    public void setCMachineKey(String CMachineKey) {
        this.CMachineKey = CMachineKey == null ? null : CMachineKey.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appId=").append(appId);
        sb.append(", posname=").append(posname);
        sb.append(", posid=").append(posid);
        sb.append(", cWHno=").append(cWHno);
        sb.append(", pos_Day=").append(pos_Day);
        sb.append(", cStoreNo=").append(cStoreNo);
        sb.append(", cMachineID=").append(cMachineID);
        sb.append(", CMachineKey=").append(CMachineKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}