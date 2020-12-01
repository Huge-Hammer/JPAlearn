package com.example.thymedemo.entity;

import javax.persistence.*;

@Entity(name = "staff")
public class StaffInfo {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private int id;
    private String deptName;
    private String staffName;
    private int exit_or_enter;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getDeptName() {
        return deptName;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getStaffName() {
        return staffName;
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }
    public int getExit_or_enter() { return exit_or_enter; }
    public void setExit_or_enter(int exit_or_enter) { this.exit_or_enter = exit_or_enter; }
}
