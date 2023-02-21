import static org.junit.Assert.assertEquals;
import java.sql.ResultSetMetaData;
import org.junit.Before;
import org.junit.Test;

public class CompteCorrentTest {

    //Test per el métode de depositar diners.
    @Test
    public void testDiposita() {
        int resultat;
        CompteCorrent compteCorrent = new CompteCorrent();
        resultat = compteCorrent.diposita(100);
        
        assertEquals(100, resultat, 0);
    }

    //Test per el métode de depositar diner amb valor 0
    @Test
    public void testDipositaRes() {
        int resultat;
        CompteCorrent compteCorrent = new CompteCorrent();
        resultat = compteCorrent.diposita(0);
          
        assertEquals(0, resultat, 0);
   
    }

    //Test per el métode de mostrar el saldo
    @Test
    public void testGetSaldo() {
        int resultat;
        CompteCorrent compteCorrent = new CompteCorrent();
        compteCorrent.setContrasenya(null, "Alumne");
        resultat = compteCorrent.getSaldo("Alumne");

        assertEquals(0, resultat, 0);

    }
    
    //Test per traure diners amb diners al banc
    @Test
    public void testRetiraAmbDiners() {
        int resultat;
        CompteCorrent compteCorrent = new CompteCorrent();
        compteCorrent.diposita(1000);
        compteCorrent.retira(100, null);
        resultat = compteCorrent.getSaldo(null);


        assertEquals(900 ,resultat, 0);

    }

    //Test per traure diners sense diners al banc
    @Test
    public void testRetiraSenseDiners() {
        int resultat;
        CompteCorrent compteCorrent = new CompteCorrent();
        resultat = compteCorrent.retira(100, null);

        assertEquals(-1 , resultat, 0);
        

    }

    //Test per traure diners amb la contrasenya erronea
    @Test
    public void testRetiraContrasenya() {
        int resultat;
        CompteCorrent compteCorrent = new CompteCorrent();
        resultat = compteCorrent.retira(100, "Incorrecta");

        assertEquals(-2 , resultat, 0);
        
        

    }

    //Test per comproba que el métode de gerar una contraseña nova funciona. Contraseña antiga correcta
    @Test
    public void testSetContrasenyaCorrecta() {
        int resultat;
        CompteCorrent compteCorrent = new CompteCorrent();
        resultat = compteCorrent.setContrasenya(null , "Alumne");

        assertEquals(0, resultat, 0);

    }

    //Test per comproba que el métode de geerar una contraseña nova funciona. Contraseña antiga incorrecta
    @Test
    public void testSetContrasenyaIncorrecta() {
        int resultat;
        CompteCorrent compteCorrent = new CompteCorrent();
        resultat = compteCorrent.setContrasenya("Incorrecta", "Alumne");

        assertEquals(-2, resultat, 0);

    }
}
