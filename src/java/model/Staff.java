package model;

public class Staff {

    private int staffId;
    private Integer supervisorId;
    private User user;

    public Staff() {
    }

    public Staff(int staffId, Integer supervisorId) {
        this.staffId = staffId;
        this.supervisorId = supervisorId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public Integer getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Integer supervisorId) {
        this.supervisorId = supervisorId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
