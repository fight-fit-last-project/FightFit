/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fight.fit.service.impl;

import fight.fit.dao.PckProfileDao;
import fight.fit.domain.PckProfile;
import fight.fit.model.rest.ProfileManagement.GetProfile;
import fight.fit.service.ProfileManagementService;
import java.math.BigInteger;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sent
 */
@Service
public class ProfileManagementServiceImpl implements ProfileManagementService {

    @Autowired
    private PckProfileDao pckProfileDao;

    public GetProfile getProfile(BigInteger sid, String dateRequest, String uid, String Language) throws Exception {
        GetProfile result = new GetProfile();
        PckProfile pckProfile = new PckProfile();
        try {
            List<PckProfile> pckProfileListDB = pckProfileDao.getPckEmployee(pckProfile);
            PckProfile PckProfileDB = pckProfileListDB != null && pckProfileListDB.size() > 0 ? pckProfileListDB.get(0) : null;
           
            result.setProfileId(PckProfileDB.getProfileId());
            result.setUid(PckProfileDB.getUid());
            result.setFirstName(PckProfileDB.getFirstName());
            result.setLastName(PckProfileDB.getLastName());
            result.setNickName(PckProfileDB.getNickName());
            result.setMobilePhoneNo(PckProfileDB.getMobilePhone());
            result.setPictureURL(PckProfileDB.getPictureUrl());
            result.setPosition(PckProfileDB.getPositionNo());

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return result;
    }

}
