package observer.demo01;

/**
 * 启动类.
 */
public class ObserverMain {
    public static void main(String[] args) {
        SubjectData subjectData = new SubjectData("39.6","-0.3");
        ConcreteObserver concreteObserver = new ConcreteObserver();
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(concreteObserver);
        subject.setSubjectData(subjectData);
        subject.notifyObservers();
    }
}
