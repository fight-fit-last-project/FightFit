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
public class MasEvent {
    private String eventMeetingId;
    private String eventName;
    private String locationId;
    private String sportId;
    private int noOfAttendees;
    private String eventPictureUrl;
    private String isDelete;
    private Date createDate;
    private String createBy;
    private Date updateDate;
    private String updateBy;

    public String getEventMeetingId() {
        return eventMeetingId;
    }

    public void setEventMeetingId(String eventMeetingId) {
        this.eventMeetingId = eventMeetingId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public int getNoOfAttendees() {
        return noOfAttendees;
    }

    public void setNoOfAttendees(int noOfAttendees) {
        this.noOfAttendees = noOfAttendees;
    }

    public String getEventPictureUrl() {
        return eventPictureUrl;
    }

    public void setEventPictureUrl(String eventPictureUrl) {
        this.eventPictureUrl = eventPictureUrl;
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
        return "{" + "eventMeetingId=" + eventMeetingId + ", eventName=" + eventName + ", locationId=" + locationId + ", sportId=" + sportId + ", noOfAttendees=" + noOfAttendees + ", eventPictureUrl=" + eventPictureUrl + ", isDelete=" + isDelete + ", createDate=" + createDate + ", createBy=" + createBy + ", updateDate=" + updateDate + ", updateBy=" + updateBy + '}';
    }

}
