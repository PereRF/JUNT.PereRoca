/**
 * <h1>Treballador</1>
 * <p>Esta es la clase treballador en la que podem generar treballadors indicant diferents paràmetres</p>
 * <p>Els diferents paràmetres qe podem indicar son el tipus de treballador, el nom, la nómina i les hores extres</p>
 * <p>A part podem cambiar o solicitar els diferents valors</p>
 * @author PERE ROCA
 * @version 1.0.0
 * @since 2021-02-20
 */
class Treballador {

    static final int DIRECTOR = 0;
    static final int SUBDIRECTOR = 1;
    static final int BASE = 2;
    String nomTreballador;
    int tipusTreballador;
    float nominaTreballador;
    int horesExtresTreballador;

    // Constructor amb arguments, alternatiu al constructor per defecte
    
    Treballador(String nom, int tipus, float nomina, int hores) {
        
        nomTreballador = nom;
        tipusTreballador = tipus;
        nominaTreballador = nomina;
        horesExtresTreballador = hores;
    }

    
    // Constructor buit per defecte, l'hem de declarar si volem poder usar-lo per culpa d'haver declarat l'anterior

    Treballador() {

    }

    //Cambiar el nom pero si no segueix les conficions tirar una exepció
    void setNom(String nom) throws Exception {

    // Si la longitud del nou nom es inferior a tres caracters llença excepció avisant del problema
    
        if (nom.length() < 3) {
            
            throw new Exception("El nom ha de tenir 3 o més caracters");
    
        }
    
    // En cas contrari assigna el nom

        nomTreballador = nom;
    
    }
    
    //Saber el nom
    String getNom() {
    
        return nomTreballador;
    
    }
    
    //Cambiar la nómina
    void setNomina(float euros) {
    
        // Per simplicitat no comprovem que la nomina és superior a zero ja que el programa no fallarà per aquest error i així ens estalviem les excepcions
    
        nominaTreballador = euros;
    
    }

    //Saber la nómina
    float getNomina() {

        return nominaTreballador;
    
    }
    
    //Cambiar les hores extres
    void setHoresExtres(int hores) {

        // Les hores extra poden ser zero sense problema
        horesExtresTreballador = hores;
    }

    //Saber les hores extres
    int getHoresExtres() {

        return horesExtresTreballador;
    }

    //Cambiar el tipus de treballador
    void setTipusTreballador(int tipus) throws Exception {
            
            // Aqui no és recomanable estalviar-se les comprovacions perquè el tipus de treballador només pot ser DIRECTOR, SUBDIRECTOR o BASE
            if ((tipus == DIRECTOR) || (tipus == SUBDIRECTOR) || (tipus == BASE)) {
            // Si el tipus és vàlid, l'assignem
            tipusTreballador = tipus;
            } else {// Si el tipus no és valid, creem excepció
            throw new Exception("Tipus de treballador no vàlid");
            }
        }
        
        //Saber de quin tipus es el treballador
        int getTipusTreballador() {
            return tipusTreballador;
        }
    }