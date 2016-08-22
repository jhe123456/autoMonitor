<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="page-sidebar-wrapper">
    <div class="page-sidebar navbar-collapse collapse">
        <!-- BEGIN SIDEBAR MENU -->
        <ul class="page-sidebar-menu" id="page-sidebar-menu">
            <li class="sidebar-toggler-wrapper">
                <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
                <div class="sidebar-toggler hidden-phone"></div>
                <!-- BEGIN SIDEBAR TOGGLER BUTTON -->
            </li>

            <li class="start active">
                <a href="<%=basePath%>/dashboard" id="btn-dashboard">
                    <i class="fa fa-home"></i><span class="title"> 首页 </span><span
                        class="selected"> </span>
                </a>
            </li>
            <li class="start active">
                <a href="<%=basePath%>/baidu" >
                    <i class="fa fa-gears"></i><span class="title">服务器配置 </span>
                </a>
            </li>
            <li class="">
                <a href="javascript:;">
                    <i class="fa fa-gears"></i><span class="title"> 系统管理 </span><span
                        class="arrow "> </span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="<%=basePath%>/user/userMenu" id="userConfig">
                            用户管理
                        </a>
                    </li>
                    <li>
                        <a href="javascript:;">
                            角色管理
                        </a>
                    </li>
                    <li>
                        <a href="javascript:;">
                            权限管理
                        </a>
                    </li>
                </ul>
            </li>

            <li class="">
                <a href="javascript:;">
                    <i class="fa fa-user"></i><span class="title"> 个人中心 </span><span
                        class="arrow "> </span>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a href="javascript:;">
                            信息修改
                        </a>
                    </li>
                    <li>
                        <a href="javascript:;">
                            密码修改
                        </a>
                    </li>
                </ul>
            </li>

        </ul>
        <!-- END SIDEBAR MENU -->
    </div>
</div>