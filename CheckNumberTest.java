import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CheckNumberTest {

    public CheckNumber checkNumber;

    //El que pose en este métode es fa avans de començar els métodes
    @Before
    public void testComençarTest() {
        System.out.println("Estem començant els testos)");


    }

    //Comprobar si al ficar un nombre negatiu funciona correctament
    @Test
    public void testComprovaSigneNegatiu() {
        //Creem un checkNumber amb un nombre negatiu
        checkNumber = new CheckNumber(-1d);
        //Guardem el resultat de la funció comprovaSigne
        double signe = checkNumber.comprovaSigne();

        //Verifiquem que signe es igual al resultat esperat
        assertEquals(signe,-1, 0);
    }

    //Comprobar si al ficar un nombre positiu funciona correctament
    @Test
    public void testComprovaSignePositiu() {
        //Creem un checkNumber amb un nombre positiu
        checkNumber = new CheckNumber(1d);
        //Guardem el resultat de la funció comprovaSigne
        double signe = checkNumber.comprovaSigne();

         //Verifiquem que signe es igual al resultat esperat
         assertEquals(signe,1, 0);
    }

    //Comprobar si al ficar un 0 funciona correctament
    @Test
    public void testComprovaSigneZero() {
        //Creem un checkNumber amb un nombre es zero
        checkNumber = new CheckNumber(0d);
        //Guardem el resultat de la funció comprovaSigne
        double signe = checkNumber.comprovaSigne();

         //Verifiquem que signe es igual al resultat esperat
         assertEquals(signe,0, 0);
    }
 
}
