
package buzi;


public class Buzi {

    
    public static void main(String[] args) {
        Pracownicy Pierwszy = new Pracownicy("Marta", "Teodorowicz");
        
        Pracownicy Drugi = new Pracownicy();
        
        System.out.println(Pierwszy.imie + " " + Pierwszy.nazwisko + " ID = " + Pierwszy.ID);
        System.out.println(Drugi.nazwisko + " ID = " + Drugi.ID);
        
        
    }
    
}
class Pracownicy
{
String imie;
String nazwisko;
int ID = 0;
static int nastepnyID = 0;
    Pracownicy()
    {
        
        nastepnyID++;
int a=5;
        ID = nastepnyID;
    }
    Pracownicy(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko= nazwisko;
        nastepnyID++;
        ID = nastepnyID;
        
    }
    
    void atakuj(){
        System.out.println("ghraaaa");
    }
}
