package com.hyf.executor.pojo;

import java.util.Date;

/**
 * @author huangyongfei
 * @Description 角色实体类
 * @Date 2020/9/10 10:44
 */
public class RoleBean {

    /**
     * id
     */
    private String id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 描述
     */
    private String roleDesc;

    /**
     * 类型
     */
    private Integer roleType;

    private Integer roleLevel;

    /**
     * 启用/禁用标志
     */
    private Integer roleOnOffFlag;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建用户
     */
    private String createUser;

    /**
     * 删除标记
     */
    private Integer deleteFlag;

    /**
     * 绑定用户数量
     */
    private Integer bindCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    public Integer getRoleOnOffFlag() {
        return roleOnOffFlag;
    }

    public void setRoleOnOffFlag(Integer roleOnOffFlag) {
        this.roleOnOffFlag = roleOnOffFlag;
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

    public Integer getBindCount() {
        return bindCount;
    }

    public void setBindCount(Integer bindCount) {
        this.bindCount = bindCount;
    }

    public Integer getRoleLevel() {
        return roleLevel;
    }

    public void setRoleLevel(Integer roleLevel) {
        this.roleLevel = roleLevel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SysRoleDO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", roleName='").append(roleName).append('\'');
        sb.append(", roleDesc='").append(roleDesc).append('\'');
        sb.append(", roleType=").append(roleType);
        sb.append(", roleOnOffFlag=").append(roleOnOffFlag);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser='").append(createUser).append('\'');
        sb.append(", deleteFlag=").append(deleteFlag);
        sb.append(", bindCount=").append(bindCount);
        sb.append('}');
        return sb.toString();
    }
}
