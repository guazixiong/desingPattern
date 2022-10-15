package observer.demo02;

/**
 * 主题接口.
 */
public interface Subject {
    /**
     * 注册观察者.
     *
     * @param observer 观察者
     */
    void registerObserver(Observer ...observers);

    /**
     * 移除观察者.
     *
     * @param observer 观察者
     */
    void removeObserver(Observer ...observers);

    /**
     * 通知所有观察者.
     */
    void notifyObservers();
}
