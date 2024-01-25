
package observerpattern;


public class ObserverUser implements Observer {
    
    @Override
    public void bildirim()
    {
        System.out.println( "Fiyati dustu!!");
    }
    
}
