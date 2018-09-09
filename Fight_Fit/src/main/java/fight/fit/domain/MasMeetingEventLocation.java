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
public class MasMeetingEventLocation {

    private String locationEventId;
    private String locationEventName;
    private String sportId;
    private String locationPictureUrl;
    private Double latitude;
    private Double longtitude;
    private String isDelete;
    private Date createDate;
    private String createBy;
    private Date updateDate;
    private String updateBy;

    public String getLocationName() {
        return locationEventName;
    }

    public void setLocationName(String locationName) {
        this.locationEventName = locationName;
    }

    public String getLocationPictureUrl() {
        return locationPictureUrl;
    }

    public void setLocationPictureUrl(String locationPictureUrl) {
        this.locationPictureUrl = locationPictureUrl;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public String getEventName() {
        return locationEventName;
    }

    public void setEventName(String eventName) {
        this.locationEventName = eventName;
    }

    public String getLocationId() {
        return locationEventId;
    }

    public void setLocationId(String locationId) {
        this.locationEventId = locationId;
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public String getEventPictureUrl() {
        return locationPictureUrl;
    }

    public void setEventPictureUrl(String eventPictureUrl) {
        this.locationPictureUrl = eventPictureUrl;
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
}
