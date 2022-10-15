package observer.demo01;

/**
 * 观察者接口.
 */
public interface Observer {
    /**
     * 观察者数据更新.
     *
     */
    void update(SubjectData subjectData);

    /**
     * 数据展示.
     */
    void display();
}
