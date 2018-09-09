<%@page import="java.util.Map"%>
<%@ page isELIgnored="false" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="sidebar-menu-responsive">
        <nav id="sidebar-responsive">
            <ul class="list-unstyled">
                <li>
                    <a href="#groupSubMenu-responsive" data-toggle="collapse" aria-expanded="false">
                        <img src="images/group.png" class="icon-menu space-icon">
                        <span>Group</span>
                        <i class="fas fa-caret-down float-right"></i>
                    </a>
                    <ul class="collapse list-unstyled" id="groupSubMenu-responsive">
                        <li>
                            <a href="">Create Group</a>
                        </li>
                        <li>
                            <a href="">Update Group</a>
                        </li>
                        <li>
                            <a href="">Delete Group</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#userAuthorizeSubMenu-responsive" data-toggle="collapse" aria-expanded="false">
                        <img src="images/user.png" class="icon-menu space-icon">
                        <span>User Authorize</span>
                        <i class="fas fa-caret-down float-right"></i>
                    </a>
                    <ul class="collapse list-unstyled" id="userAuthorizeSubMenu-responsive">
                        <li>
                            <a href="">Add User to Group</a>
                        </li>
                        <li>
                            <a href="">Delete User in Group</a>
                        </li>
                        <li>
                            <a href="">Custom User Authorize</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#meetingRoomSubMenu-responsive" data-toggle="collapse" aria-expanded="false">
                        <img src="images/meeting.png" class="icon-menu space-icon">
                        <span>Meeting Room</span>
                        <i class="fas fa-caret-down float-right"></i>
                    </a>
                    <ul class="collapse list-unstyled" id="meetingRoomSubMenu-responsive">
                        <li>
                            <a href="">Create Building</a>
                        </li>
                        <li>
                            <a href="">Update Building</a>
                        </li>
                        <li>
                            <a href="">Create Meeting Room</a>
                        </li>
                        <li>
                            <a href="">Update Meeting Room</a>
                        </li>
                        <li>
                            <a href="">Booking History</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#hrSubMenu-responsive" data-toggle="collapse" aria-expanded="false">
                        <img src="images/HR.png" class="icon-menu space-icon">
                        <span>HR</span>
                        <i class="fas fa-caret-down float-right"></i>
                    </a>
                    <ul class="collapse list-unstyled" id="hrSubMenu-responsive">
                        <li>
                            <a href="">Create Document</a>
                        </li>
                        <li>
                            <a href="">Update Document</a>
                        </li>
                        <li>
                            <a href="">Job Request Document Form</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#contactToRepairSubMenu-responsive" data-toggle="collapse" aria-expanded="false">
                        <img src="images/repair.png" class="icon-menu space-icon">
                        <span>แจ้งซ่อม</span>
                        <i class="fas fa-caret-down float-right"></i>
                    </a>
                    <ul class="collapse list-unstyled" id="contactToRepairSubMenu-responsive">
                        <li>
                            <a href="">Job Contact Repair</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#starSubMenu-responsive" data-toggle="collapse" aria-expanded="false">
                        <img src="images/star.png" class="icon-menu space-icon">
                        <span>Star</span>
                        <i class="fas fa-caret-down float-right"></i>
                    </a>
                    <ul class="collapse list-unstyled" id="starSubMenu-responsive">
                        <li>
                            <a href="">Set Give Star by Group</a>
                        </li>
                        <li>
                            <a href="">Set Give Star by User</a>
                        </li>
                        <li>
                            <a href="">Create Reward</a>
                        </li>
                        <li>
                            <a href="">Reward List</a>
                        </li>
                        <li>
                            <a href="">Searc Redeem Rewards</a>
                        </li>
                    </ul>
                </li>
            </ul>

        </nav>
    </div>

    <!-- Sidebar Menu Destop -->
        <div class="sidebar-menu">
            <nav id="sidebar">
                <ul class="list-unstyled">
                    <li>
                        <a href="#groupSubMenu" data-toggle="collapse" aria-expanded="false">
                            <img src="images/group.png" class="icon-menu space-icon">
                            <span>Group</span>
                            <i class="fas fa-caret-down float-right"></i>
                        </a>
                        <ul class="collapse list-unstyled" id="groupSubMenu">
                            <li>
                                <a href="">Create Group</a>
                            </li>
                            <li>
                                <a href="">Update Group</a>
                            </li>
                            <li>
                                <a href="">Delete Group</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#userAuthorizeSubMenu" data-toggle="collapse" aria-expanded="false">
                            <img src="images/user.png" class="icon-menu space-icon">
                            <span>User Authorize</span>
                            <i class="fas fa-caret-down float-right"></i>
                        </a>
                        <ul class="collapse list-unstyled" id="userAuthorizeSubMenu">
                            <li>
                                <a href="">Add User to Group</a>
                            </li>
                            <li>
                                <a href="">Delete User in Group</a>
                            </li>
                            <li>
                                <a href="">Custom User Authorize</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#meetingRoomSubMenu" data-toggle="collapse" aria-expanded="false">
                            <img src="images/meeting.png" class="icon-menu space-icon">
                            <span>Meeting Room</span>
                            <i class="fas fa-caret-down float-right"></i>
                        </a>
                        <ul class="collapse list-unstyled" id="meetingRoomSubMenu">
                            <li>
                                <a href="">Create Building</a>
                            </li>
                            <li>
                                <a href="">Update Building</a>
                            </li>
                            <li>
                                <a href="">Create Meeting Room</a>
                            </li>
                            <li>
                                <a href="">Update Meeting Room</a>
                            </li>
                            <li>
                                <a href="">Booking History</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#hrSubMenu" data-toggle="collapse" aria-expanded="false">
                            <img src="images/HR.png" class="icon-menu space-icon">
                            <span>HR</span>
                            <i class="fas fa-caret-down float-right"></i>
                        </a>
                        <ul class="collapse list-unstyled" id="hrSubMenu">
                            <li>
                                <a href="">Create Document</a>
                            </li>
                            <li>
                                <a href="">Update Document</a>
                            </li>
                            <li>
                                <a href="">Job Request Document Form</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#contactToRepairSubMenu" data-toggle="collapse" aria-expanded="false">
                            <img src="images/repair.png" class="icon-menu space-icon">
                            <span>แจ้งซ่อม</span>
                            <i class="fas fa-caret-down float-right"></i>
                        </a>
                        <ul class="collapse list-unstyled" id="contactToRepairSubMenu">
                            <li>
                                <a href="">Job Contact Repair</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="#starSubMenu" data-toggle="collapse" aria-expanded="false">
                            <img src="images/star.png" class="icon-menu space-icon">
                            <span>Star</span>
                            <i class="fas fa-caret-down float-right"></i>
                        </a>
                        <ul class="collapse list-unstyled" id="starSubMenu">
                            <li>
                                <a href="">Set Give Star by Group</a>
                            </li>
                            <li>
                                <a href="">Set Give Star by User</a>
                            </li>
                            <li>
                                <a href="">Create Reward</a>
                            </li>
                            <li>
                                <a href="">Reward List</a>
                            </li>
                            <li>
                                <a href="">Searc Redeem Rewards</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </nav>
        </div>