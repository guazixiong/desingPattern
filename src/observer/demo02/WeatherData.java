package observer.demo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 具体主题.
 */
public class WeatherData implements Subject {

    private SubjectData subjectData;
    private List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer ...observers) {
        List<Observer> collect = Arrays.stream(observers).collect(Collectors.toList());
        observerList.addAll(collect);
    }

    @Override
    public void removeObserver(Observer ...observers) {
        List<Observer> collect = Arrays.stream(observers).collect(Collectors.toList());
        observerList.removeAll(collect);
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

    public WeatherData() {
        observerList.add(new CurrentConditionsDisplay());
    }
}
