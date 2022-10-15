package observer.demo01;

/**
 * 具体观察者.
 */
public class ConcreteObserver implements Observer {

    private SubjectData data;
    /**
     * 数据更新.
     *
     * @param subjectData 主题数据
     */
    @Override
    public void update(SubjectData subjectData) {
        data = subjectData;
        display();
    }

    /**
     * 数据展示.
     */
    @Override
    public void display() {
        System.out.println(data.toString());
    }
}
