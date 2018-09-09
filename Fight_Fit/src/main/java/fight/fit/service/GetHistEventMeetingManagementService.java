/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fight.fit.service;

import java.math.BigInteger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import fight.fit.model.rest.SearchEventMeetingHistoryResponseRESTModel;

/**
 *
 * @author Sent
 */
public interface GetHistEventMeetingManagementService {

    @Transactional(propagation = Propagation.SUPPORTS)
    public SearchEventMeetingHistoryResponseRESTModel getHistMeetingRoom(String sid, String language, String requestIndex, String requestRowPerPage, String searchDateTime, String buildingID, String meetingRoomID) throws Exception;
}
