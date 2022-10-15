package observer.demo02;

/**
 * 显示基于观测值的其他内容(第三方观察者).
 */
public class ThirdPartyDisplay implements DisplayElement,Observer {
    private SubjectData subjectData;
    @Override
    public void display() {
        System.out.println("第三方布告板数据:当前气压为"+subjectData.getPressure()+",较至昨日略有升高.");
    }

    @Override
    public void update(SubjectData subjectData) {
        this.subjectData = subjectData;
        display();
    }
}
