package com.hp.autoMonitor.web.model;

import java.util.Date;

public class SysUser {
    private Integer id;

    private String fullName;

    private String birthday;

    private String userName;

    private String userPassword;

    private String staffId;

    private String workEmail;

    private String mobileno1;

    private String workTel;

    private String mobileno2;

    private String workTelExt;

    private String personalEmail;

    private String workAddress;

    private String homeTel;

    private String homeAddress;

    private String expcontPerson;

    private String expcontPsnTel;

    private Integer dataFrom;

    private String remark;

    private String onlineStatus;

    private String gender;

    private String degree1;

    private String deleteFlag;

    private Integer orderNo;

    private Date createDt;

    private Long createId;

    private Long modifyId;

    private String modifyBy;

    private Date modifyDt;

    private String createBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail == null ? null : workEmail.trim();
    }

    public String getMobileno1() {
        return mobileno1;
    }

    public void setMobileno1(String mobileno1) {
        this.mobileno1 = mobileno1 == null ? null : mobileno1.trim();
    }

    public String getWorkTel() {
        return workTel;
    }

    public void setWorkTel(String workTel) {
        this.workTel = workTel == null ? null : workTel.trim();
    }

    public String getMobileno2() {
        return mobileno2;
    }

    public void setMobileno2(String mobileno2) {
        this.mobileno2 = mobileno2 == null ? null : mobileno2.trim();
    }

    public String getWorkTelExt() {
        return workTelExt;
    }

    public void setWorkTelExt(String workTelExt) {
        this.workTelExt = workTelExt == null ? null : workTelExt.trim();
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail == null ? null : personalEmail.trim();
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress == null ? null : workAddress.trim();
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel == null ? null : homeTel.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public String getExpcontPerson() {
        return expcontPerson;
    }

    public void setExpcontPerson(String expcontPerson) {
        this.expcontPerson = expcontPerson == null ? null : expcontPerson.trim();
    }

    public String getExpcontPsnTel() {
        return expcontPsnTel;
    }

    public void setExpcontPsnTel(String expcontPsnTel) {
        this.expcontPsnTel = expcontPsnTel == null ? null : expcontPsnTel.trim();
    }

    public Integer getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(Integer dataFrom) {
        this.dataFrom = dataFrom;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus == null ? null : onlineStatus.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getDegree1() {
        return degree1;
    }

    public void setDegree1(String degree1) {
        this.degree1 = degree1 == null ? null : degree1.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Long getModifyId() {
        return modifyId;
    }

    public void setModifyId(Long modifyId) {
        this.modifyId = modifyId;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }

    public Date getModifyDt() {
        return modifyDt;
    }

    public void setModifyDt(Date modifyDt) {
        this.modifyDt = modifyDt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }
}