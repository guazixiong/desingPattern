package observer.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题.
 */
public class ConcreteSubject implements Subject{

    private SubjectData subjectData;
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(e->{
            e.update(subjectData);
        });
    }

    public SubjectData getSubjectData() {
        return subjectData;
    }

    public void setSubjectData(SubjectData subjectData) {
        this.subjectData = subjectData;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }
}
