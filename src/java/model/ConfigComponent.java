package model;

public class ConfigComponent {

    private int configId;
    private int componentId;
    private Config config;
    private Product component;

    public ConfigComponent() {
    }

    public ConfigComponent(int configId, int componentId) {
        this.configId = configId;
        this.componentId = componentId;
    }

    public int getConfigId() {
        return configId;
    }

    public void setConfigId(int configId) {
        this.configId = configId;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public Product getComponent() {
        return component;
    }

    public void setComponent(Product component) {
        this.component = component;
    }
}
