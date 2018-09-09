/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fight.fit.controller;

import fight.fit.service.ProfileManagementService;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

/**
 *
 * @author Sent
 */

@Controller
public class ProfileController extends BaseController{
    @Autowired
    private ProfileManagementService profileManagementService ;
    
    @RequestMapping(value="/user-profile", method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView initLogin(HttpServletRequest request){
		Date startDate = new Date();
		ModelAndView model = new ModelAndView("profile");

		request.setAttribute("currentLocale", RequestContextUtils.getLocale(request).getLanguage());
		
		
		return model;
	}
    
  
}
