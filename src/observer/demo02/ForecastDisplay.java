package observer.demo02;

/**
 * 根据气压计显示天气预报.
 */
public class ForecastDisplay implements DisplayElement,Observer {
    private SubjectData subjectData;
    @Override
    public void display() {
        System.out.println("布告板数据:气压为:"+subjectData.getPressure());
    }

    @Override
    public void update(SubjectData subjectData) {
        this.subjectData = subjectData;
        display();
    }
}
