//package fight.fit.util;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import org.apache.log4j.Logger;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import fight.fit.constant.ProjectConstant;
//
//
//import fight.fit.domain.PckMenu;
//import fight.fit.domain.vo.DropdownVO;
//import fight.fit.service.PckMenuService;
//
//@Component
//public class MasterUtils {
//
//    private static final Logger systemLogger = Logger.getLogger(ProjectConstant.APPENDER_SYSTEM_LOG);
//    private static final Logger errorLogger = Logger.getLogger(ProjectConstant.APPENDER_ERROR_LOG);
//
//  
//    @Autowired
//    private PckMenuService pckMenuService;
//    @Autowired
//    private MasMeetingRoomDao masMeetingRoomDao;
//    
//
//    private static List<PckMenu> lstPckMenu;
//    private static List<MasMeetingRoom> masMeetingRoomList;
//    
// 
//  
//
//    @PostConstruct
//    public void loadMaster() throws Exception {
//
//
//        masMeetingRoomList = masMeetingRoomDao.getMasMeetingRoom(null);
//        
//       
//    }
//
//    
//
//    public static synchronized Map<String, String> getMenuMap(String language) throws Exception {
//        Map<String, String> menuMap = new HashMap<String, String>();
//
//        for (PckMenu rec : lstPckMenu) {
//            if (ProjectConstant.LANGUAGE_TH.equalsIgnoreCase(language)) {
//                menuMap.put(rec.getMenuCode(), rec.getMenuNameTh());
//            } else {
//                menuMap.put(rec.getMenuCode(), rec.getMenuNameEn());
//            }
//        }
//
//        return menuMap;
//
//    }
//
//    public static List<DropdownVO> loadMasMeetingRoomDropdownList(String language, String buildingID) throws Exception {
//        List<DropdownVO> dropdownList = new ArrayList<DropdownVO>();
//        DropdownVO mapper;
//        try {
//            for (MasMeetingRoom masMeetingRoom : masMeetingRoomList) {
//                if (ProjectConstant.STATUS_N.equalsIgnoreCase(masMeetingRoom.getIsDelete())) {
//                    boolean foundBuildingFlag = false;
//                    if (StringUtils.isNotEmptyOrNull(buildingID)) {
//                        if (Integer.parseInt(buildingID) == masMeetingRoom.getBuildingId()) {
//                            foundBuildingFlag = true;
//                        } else {
//                            foundBuildingFlag = false;
//                        }
//                    } else {
//                        foundBuildingFlag = true;
//                    }
//                    if (foundBuildingFlag) {
//                        mapper = new DropdownVO();
//                        mapper.setDropDownKey(masMeetingRoom.getRoomId().toString());
//                        if (ProjectConstant.LANGUAGE_TH.equalsIgnoreCase(language)) {
//                            mapper.setDropDownValue(masMeetingRoom.getRoomTh());
//                        } else {
//                            mapper.setDropDownValue(masMeetingRoom.getRoomEn());
//                        }
//                        dropdownList.add(mapper);
//                    }
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            errorLogger.error(LogFormatter.error(e));
//            throw e;
//        }
//        return dropdownList;
//    }
//
//
//
//    
//
//   
//
//    public static List<MasMeetingRoom> loadMasMeetingRoom(String paramKey) throws Exception {
//        List<MasMeetingRoom> result = new ArrayList<MasMeetingRoom>();
//        try {
//            if (StringUtils.isNotEmptyOrNull(paramKey)) {
//                for (MasMeetingRoom masMeetingRoom : masMeetingRoomList) {
//                    if (paramKey.equals(masMeetingRoom.getRoomId().toString())) {
//                        if (ProjectConstant.STATUS_N.equalsIgnoreCase(masMeetingRoom.getIsDelete())) {
//                            result.add(masMeetingRoom);
//                        }
//                    }
//                }
//            } else if (paramKey == null) {
//                result = masMeetingRoomList;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            errorLogger.error(LogFormatter.error(e));
//            throw e;
//        }
//        return result;
//    }
//
//  
//
//}
