package com.imooc.entity;

import java.util.Date;
import java.util.Objects;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private Integer age;
    private String gender;
    private String phone;
    private String email;
    private Date createTime;
    private Date updateTime;
    private Date lastLoginTime;
    private Integer userStatus;
    private String remark;

    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String username, String password, String nickname, Integer age, String gender, String phone, String email, Date createTime, Date updateTime, Date lastLoginTime, Integer userStatus, String remark) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.lastLoginTime = lastLoginTime;
        this.userStatus = userStatus;
        this.remark = remark;
    }

    public User(Integer id, String username, String password, String nickname, String phone, String email, Date createTime, Integer userStatus) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.phone = phone;
        this.email = email;
        this.createTime = createTime;
        this.userStatus = userStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) &&
                Objects.equals(getUsername(), user.getUsername()) &&
                Objects.equals(getPassword(), user.getPassword()) &&
                Objects.equals(getNickname(), user.getNickname()) &&
                Objects.equals(getAge(), user.getAge()) &&
                Objects.equals(getGender(), user.getGender()) &&
                Objects.equals(getPhone(), user.getPhone()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getCreateTime(), user.getCreateTime()) &&
                Objects.equals(getUpdateTime(), user.getUpdateTime()) &&
                Objects.equals(getLastLoginTime(), user.getLastLoginTime()) &&
                Objects.equals(getUserStatus(), user.getUserStatus()) &&
                Objects.equals(getRemark(), user.getRemark());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUsername(), getPassword(), getNickname(), getAge(), getGender(), getPhone(), getEmail(), getCreateTime(), getUpdateTime(), getLastLoginTime(), getUserStatus(), getRemark());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", lastLoginTime=" + lastLoginTime +
                ", userStatus=" + userStatus +
                ", remark='" + remark + '\'' +
                '}';
    }
}
