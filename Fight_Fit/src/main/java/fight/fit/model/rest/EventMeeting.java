/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fight.fit.model.rest;

/**
 *
 * @author Sent
 */
public class EventMeeting {

    private String transactionID;
    private String dateEventMeeting;
    private String timeEventMeeting;
    private String topicMeeting;
    private String eventName;

    
    private String eventPictureURL;

    private String locationEventMeetingName;
    private String ownerEventMeeting;
    private String profileName;
   

    private String mobileNo;

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getDateEventMeeting() {
        return dateEventMeeting;
    }

    public void setDateEventMeeting(String dateEventMeeting) {
        this.dateEventMeeting = dateEventMeeting;
    }

    public String getTimeEventMeeting() {
        return timeEventMeeting;
    }

    public void setTimeEventMeeting(String timeEventMeeting) {
        this.timeEventMeeting = timeEventMeeting;
    }

    public String getTopicMeeting() {
        return topicMeeting;
    }

    public void setTopicMeeting(String topicMeeting) {
        this.topicMeeting = topicMeeting;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventPictureURL() {
        return eventPictureURL;
    }

    public void setEventPictureURL(String eventPictureURL) {
        this.eventPictureURL = eventPictureURL;
    }

    public String getLocationEventMeetingName() {
        return locationEventMeetingName;
    }

    public void setLocationEventMeetingName(String locationEventMeetingName) {
        this.locationEventMeetingName = locationEventMeetingName;
    }

    public String getOwnerEventMeeting() {
        return ownerEventMeeting;
    }

    public void setOwnerEventMeeting(String ownerEventMeeting) {
        this.ownerEventMeeting = ownerEventMeeting;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

   

    @Override
    public String toString() {
        return "Booking{" + "transactionID=" + transactionID + ", dateEventMeeting=" + dateEventMeeting + ", timeEventMeeting=" + timeEventMeeting + ", topicMeeting=" + topicMeeting + ", eventName=" + eventName + ", eventPictureURL=" + eventPictureURL + ", locationEventMeetingName=" + locationEventMeetingName + ", ownerEventMeeting=" + ownerEventMeeting + ", profileName=" + profileName + ", mobileNo=" + mobileNo + '}';
    }

 
   

}
