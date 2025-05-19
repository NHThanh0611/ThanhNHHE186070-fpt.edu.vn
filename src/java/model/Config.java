package model;

public class Config {

    private int configId;
    private String configName;
    private int userId;
    private User user;

    public Config() {
    }

    public Config(int configId, String configName, int userId) {
        this.configId = configId;
        this.configName = configName;
        this.userId = userId;
    }

    public int getConfigId() {
        return configId;
    }

    public void setConfigId(int configId) {
        this.configId = configId;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
