package observer.demo02;

/**
 * 启动类.
 */
public class ObserverMain {
    public static void main(String[] args) {
        // 气象站
        WeatherData subject = new WeatherData();
        // 气象数据
        SubjectData subjectData = new SubjectData("30.2","0.33");
        subject.setSubjectData(subjectData);
        // 布告板
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay();
        subject.registerObserver(statisticsDisplay,forecastDisplay,thirdPartyDisplay);
        subject.notifyObservers();
        subject.removeObserver(statisticsDisplay,forecastDisplay);
        subject.notifyObservers();
    }
}
