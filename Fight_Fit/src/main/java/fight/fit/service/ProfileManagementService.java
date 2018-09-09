/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fight.fit.service;

import fight.fit.model.rest.ProfileManagement.GetProfile;
import java.math.BigInteger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Sent
 */
public interface ProfileManagementService {
     @Transactional(propagation = Propagation.SUPPORTS)
    public GetProfile getProfile(BigInteger sid,String dateRequest,String uid,String Language) throws Exception;
    
   
}
