
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public class Objednavka {
   private List<Zbozi> seznamZbozi = new ArrayList<>();

   public void pridejZbozi(Zbozi zbozi) {
       seznamZbozi.add(zbozi);
   }
    public void odeberZbozi(Zbozi zbozi) {
        seznamZbozi.remove(zbozi);

    }
    public BigDecimal celkovaCena(){
       BigDecimal vysledek = BigDecimal.ZERO;
    for (Zbozi zbozi : seznamZbozi) {
        vysledek = vysledek.add(zbozi.getCena());
    }
    return vysledek;
   }

   public List<String> nazvyZboziSnizenaDph(){
       List<String> vysledek = new ArrayList<>();
       for( Zbozi zbozi : seznamZbozi){
           if(zbozi.isMaSnizenouDph()){
               vysledek.add(zbozi.getPopis());
           }
       }
       return vysledek;
   }
}










