/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fight.fit.domain;

import java.util.Date;

/**
 *
 * @author Sent
 */
public class PckUserMeetingEvent {

    private String uid;
    private String tranIdGen;
    private String tranIdCancel;
    private String eventId;
    private String eventMeetingStatus;
    private Date fromTime;
    private Date toTime;
    private String uidAttendes;
    private String sportId;
    private String isDelete;
    private Date createDate;
    private String createBy;
    private Date updateDate;
    private String updateBy;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTranIdGen() {
        return tranIdGen;
    }

    public void setTranIdGen(String tranIdGen) {
        this.tranIdGen = tranIdGen;
    }

    public String getTranIdCancel() {
        return tranIdCancel;
    }

    public void setTranIdCancel(String tranIdCancel) {
        this.tranIdCancel = tranIdCancel;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventMeetingStatus() {
        return eventMeetingStatus;
    }

    public void setEventMeetingStatus(String eventMeetingStatus) {
        this.eventMeetingStatus = eventMeetingStatus;
    }

    public Date getFromTime() {
        return fromTime;
    }

    public void setFromTime(Date fromTime) {
        this.fromTime = fromTime;
    }

    public Date getToTime() {
        return toTime;
    }

    public void setToTime(Date toTime) {
        this.toTime = toTime;
    }

    public String getUidAttendes() {
        return uidAttendes;
    }

    public void setUidAttendes(String uidAttendes) {
        this.uidAttendes = uidAttendes;
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return "PckUserMeetingEvent{" + "uid=" + uid + ", tranIdGen=" + tranIdGen + ", tranIdCancel=" + tranIdCancel + ", eventId=" + eventId + ", eventMeetingStatus=" + eventMeetingStatus + ", fromTime=" + fromTime + ", toTime=" + toTime + ", uidAttendes=" + uidAttendes + ", sportId=" + sportId + ", isDelete=" + isDelete + ", createDate=" + createDate + ", createBy=" + createBy + ", updateDate=" + updateDate + ", updateBy=" + updateBy + '}';
    }

    
    
}
