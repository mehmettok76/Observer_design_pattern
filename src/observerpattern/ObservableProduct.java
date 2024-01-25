
package observerpattern;

import java.util.ArrayList;
import java.util.List;


public abstract class ObservableProduct {
    private  List<Observer> musteriler ; 
    
    ObservableProduct()
    {
        musteriler = new ArrayList<>();
    }
    

    
    public void AddObserver(Observer observer)
    { 
        musteriler.add(observer);
    }
    
    public void notifyObserver()
    {
        for(Observer musteri : musteriler)
        {
            musteri.bildirim();
        }
    }
   
    
}
