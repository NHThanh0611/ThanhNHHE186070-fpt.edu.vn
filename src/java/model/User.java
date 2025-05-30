package model;

public class User {
    private int userId;
    private String email;
    private String phone;
    private String address;
    private String fullname;
    private String password;
    private int roleId;
    private Role role; // Reference to Role object

    // Constructors
    public User() {
    }

    public User(int userId, String email, String phone, String address, String fullname, String password, int roleId) {
        this.userId = userId;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.fullname = fullname;
        this.password = password;
        this.roleId = roleId;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}