import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CostPersonalTest {

    public CostPersonal checkNumber;

    //Fem un test per comprobar el calcul de treballadors amb les dades plenes
    @Test
    public void testCalculaCostDelPersonalPle() {
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1200, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 1200, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 1000, 8);

        Treballador[] treballadors = { treballador1, treballador2, treballador3 };
        float resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

        assertEquals((1200 + 1200 + 1000 + (8 * 20)), resultat, 0);

    }

    //Fem un test per comprobar el calcul de treballadors sense dades
    @Test
    public void testCalculaCostDelPersonalVuit() {
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 0, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 0, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 0, 0);

        Treballador[] treballadors = { treballador1, treballador2, treballador3 };
        float resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

        assertEquals(0, resultat, 0);

    }

    //Fem un test per comprobar el calcul de treballadors amb les dades a mitjes
    @Test
    public void testCalculaCostDelPersonalMitjes() {
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1200, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 1200, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 0, 0);

        Treballador[] treballadors = { treballador1, treballador2, treballador3 };
        float resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

        assertEquals((1200 + 1200), resultat, 0);

    }

    // Test per comprovar el métode sense treballadors
    @Test
    public void testCalculaCostSensePersonal() {
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1200, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 1200, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 0, 0);

        Treballador[] treballadors = {};
        float resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

        assertEquals(0, resultat, 0);

    }

    // Test per comprovar el métode amb 1 treballador
    @Test
    public void testCalculaCostUnPersonal() {
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1200, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 1200, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 0, 0);

        Treballador[] treballadors = { treballador1 };
        float resultat = CostPersonal.CalculaCostDelPersonal(treballadors);

        assertEquals(1200, resultat, 0);

    }

    // Test per calcular el cost de un sol treballador
    @Test
    public void testCostTreballador() {
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 1000, 8);
        float resultat = CostPersonal.CostTreballador(treballador3);

        assertEquals(1000 + (8 * 20), resultat, 0);

    }

    // Test per usar el métode refactoritzat
    @Test
    public void testCalculaCostDelPersonal2() {
        Treballador treballador1 = new Treballador(null, Treballador.DIRECTOR, 1200, 0);
        Treballador treballador2 = new Treballador(null, Treballador.SUBDIRECTOR, 1200, 0);
        Treballador treballador3 = new Treballador(null, Treballador.BASE, 1000, 8);

        Treballador[] treballadors = { treballador1, treballador2, treballador3 };
        float resultat = CostPersonal.CalculaCostDelPersonal2(treballadors);

        assertEquals(1200 + 1200 + 1000 + 160, resultat, 0);

    }
}
