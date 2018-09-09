/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fight.fit.model.vo;

import java.util.Date;

/**
 *
 * @author Anuwat_K
 */
public class EventMeetingHistory {

    private String LocationID;
    private String EventMeetingID;
    private String searchDateTime;

    public String getBuildingID() {
        return LocationID;
    }

    public void setBuildingID(String buildingID) {
        this.LocationID = buildingID;
    }

    public String getMeetingRoomID() {
        return EventMeetingID;
    }

    public void setMeetingRoomID(String meetingRoomID) {
        this.EventMeetingID = meetingRoomID;
    }

    public String getSearchDateTime() {
        return searchDateTime;
    }

    public void setSearchDateTime(String searchDateTime) {
        this.searchDateTime = searchDateTime;
    }

    @Override
    public String toString() {
        return "{" + "buildingID=" + LocationID + ", meetingRoomID=" + EventMeetingID + ", searchDateTime=" + searchDateTime + '}';
    }

}
