package fight.fit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fight.fit.dao.PckMenuDao;
import fight.fit.domain.PckMenu;
import fight.fit.service.PckMenuService;

@Service
public class PckMenuServiceImpl implements PckMenuService{
	@Autowired PckMenuDao pckMenuDao;
	
	public List<PckMenu> getPckMenu() throws Exception {
		// TODO Auto-generated method stub
		return pckMenuDao.getPckMenu();
	}

}
