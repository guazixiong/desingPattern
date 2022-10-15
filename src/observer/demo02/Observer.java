package observer.demo02;

/**
 * 观察者接口.
 */
public interface Observer {
    /**
     * 观察者数据更新.
     *
     */
    void update(SubjectData subjectData);
}
