package fight.fit.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import fight.fit.domain.PckMenu;

public interface PckMenuService {
	
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<PckMenu> getPckMenu() throws Exception;
	
}
