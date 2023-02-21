/**
 * <h1>Cost Personal</1>
 * <p>Esta es la clase CostPersonal en la que podem calcular el que ens costa mensualment un treballador o tota la plantilla</p>
 * <p>Per fer-ho podem usar tres métodes. El primer per calcular tota la planntila, el segon per fer un treballador o el tercer, que usa el métode de calcul de treballador per fer tota la plantilla</p>
 * @author PERE ROCA
 * @version 1.0.0
 * @since 2021-02-20
 */
public class CostPersonal {
    // static enum TipusTreballador{
    // DIRECTOR, SUBDIRECTOR, BASE
    // }
    static float CalculaCostDelPersonal(Treballador treballadors[]) {
    float costFinal = 0;
    Treballador treballador;

        for (int i = 0; i < treballadors.length; i++) {
                treballador = treballadors[i];
            if (treballador.getTipusTreballador() == Treballador.DIRECTOR || treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
                costFinal += treballador.getNomina();
            } else {
                costFinal += treballador.getNomina() + (treballador.getHoresExtres() * 20);
            }
        }
        
        return costFinal;
    
    }
    
    static float CostTreballador(Treballador treballador) {
        if (treballador.getTipusTreballador() == Treballador.DIRECTOR || treballador.getTipusTreballador() == Treballador.SUBDIRECTOR) {
        return treballador.getNomina();
        } else {
        return treballador.getNomina() + (treballador.getHoresExtres() * 20);
        }
    }
    
    static float CalculaCostDelPersonal2(Treballador treballadors[]) {
    
        // Versio refactoritzada del mètode anterior
        float costFinal = 0;
        Treballador treballador;
        for (int i = 0; i < treballadors.length; i++) {
            costFinal = costFinal + CostTreballador(treballadors[i]);
        }
        return costFinal;
    }
}