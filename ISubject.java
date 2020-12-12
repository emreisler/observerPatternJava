import java.util.*;

interface ISubject{

    public void register(Observer observer);

    public void unregister(Observer observer);

    public void notifyObservers();

}
