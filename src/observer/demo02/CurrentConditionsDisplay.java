package observer.demo02;

/**
 * 显示当前气象站当前观测值.
 */
public class CurrentConditionsDisplay implements DisplayElement,Observer{
    private SubjectData subjectData;
    @Override
    public void update(SubjectData subjectData) {
        this.subjectData = subjectData;
        display();
    }

    @Override
    public void display() {
        System.out.println("气象站数据:"+subjectData.toString());
    }
}
