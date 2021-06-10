/*
 *    Copyright 2009-2021 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.hyf.executor.pojo;

import java.util.Date;

/**
 * 用户实体类
 *
 * @author liangbo
 * @version 1.0
 */
public class UserBean {
    /**
     * 用户Id
     */
    private String id;

    /**
     * 账号
     */
    private String accountName;

    /**
     * 用户密码
     */
    private String passWord;

    /**
     * 性别
     */
    private String gender;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户手机号
     */
    private String userTel;

    /**
     * MSN/WeChat
     */
    private String userIM;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 启用/禁用标志
     */
    private Integer userOnOffFlag;

    /**
     * 描述
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建者
     */
    private String createUser;

    /**
     * 是否删除标识
     */
    private Integer deleteFlag;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserIM() {
        return userIM;
    }

    public void setUserIM(String userIM) {
        this.userIM = userIM;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserOnOffFlag() {
        return userOnOffFlag;
    }

    public void setUserOnOffFlag(Integer userOnOffFlag) {
        this.userOnOffFlag = userOnOffFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime == null ? null : (Date) createTime.clone();
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime == null ? null : (Date) createTime.clone();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }


    @Override
    public String toString() {
        return "UserBean{" +
                "id='" + id + '\'' +
                ", accountName='" + accountName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", gender='" + gender + '\'' +
                ", userName='" + userName + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userIM='" + userIM + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userOnOffFlag=" + userOnOffFlag +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", deleteFlag=" + deleteFlag +
                '}';
    }
}
