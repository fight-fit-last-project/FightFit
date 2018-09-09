/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fight.fit.model.rest;

import java.util.List;

/**
 *
 * @author Anuwat_K
 */
public class SearchEventMeetingHistoryResponseRESTModel {

    private boolean remaindRecordFlag;
    private String recordsTotal;
    private String recordsFiltered;
    private List<EventMeeting> booking;

    public boolean isRemaindRecordFlag() {
        return remaindRecordFlag;
    }

    public void setRemaindRecordFlag(boolean remaindRecordFlag) {
        this.remaindRecordFlag = remaindRecordFlag;
    }

    public String getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(String recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public String getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(String recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<EventMeeting> getBooking() {
        return booking;
    }

    public void setBooking(List<EventMeeting> booking) {
        this.booking = booking;
    }

    @Override
    public String toString() {
        return "{" + "remaindRecordFlag=" + remaindRecordFlag + ", index=" + recordsTotal + ", indexTotal=" + recordsFiltered + ", booking=" + booking + '}';
    }
}
