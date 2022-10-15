package observer.demo02;

/**
 * 显示最小,平均和最大的观测值.
 */
public class StatisticsDisplay implements DisplayElement,Observer {
    private SubjectData subjectData;
    @Override
    public void display() {
        System.out.println("布告板数据:最小,平均和最大的观测值为"+subjectData.getPressure());
    }

    @Override
    public void update(SubjectData subjectData) {
        this.subjectData = subjectData;
        display();
    }
}
