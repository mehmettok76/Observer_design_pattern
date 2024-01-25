
package observerpattern;


public class Observerpattern {

    
    public static void main(String[] args) {
        
        Observer musteri1 = new ObserverUser();
        Observer musteri2 = new ObserverUser();
        Observer musteri3 = new ObserverUser();
        Observer musteri4 = new ObserverUser();
        
        Samsung tablet = new Samsung();
        tablet.AddObserver(musteri1);
        tablet.AddObserver(musteri2);
        tablet.AddObserver(musteri3);
        tablet.AddObserver(musteri4);
        tablet.FiyatDegisimi();
    }
}
