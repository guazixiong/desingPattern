package observer.demo02;

/**
 * 主题数据.
 */
public class SubjectData {
    // 压力
    private String pressure;
    // 温度
    private String temperature;

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public SubjectData() {
    }

    public SubjectData(String pressure, String temperature) {
        this.pressure = pressure;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "SubjectData{" +
                "pressure='" + pressure + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }
}
