import java.util.*;

class Subject implements ISubject{
  List<Observer> observerList = new ArrayList<Observer>();

  private int _flag;

  public int getFlag(){
    return _flag;

  }

  
  public void setFlag(int _flag){
    this._flag = _flag;
    notifyObservers();
  }

  @Override
  public void register(Observer observer){
    observerList.add(observer);

  }

  @Override
  public void unregister(Observer observer){
    observerList.remove(observer);
  }

  @Override
  public void notifyObservers(){
    for(int i = 0; i < observerList.size(); i++){
      observerList.get(i).update();

    }

  }

}
