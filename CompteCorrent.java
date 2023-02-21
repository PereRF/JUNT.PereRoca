/**
 * <h1>CompteCorrent</1>
 * <p>Amb aquets classe podem gestionar el conte d'una persona a un banc</p>
 * <p>Podem usar diferents métodes que necesiten de autenticarse amb la contrasenya /p>
 * @author PERE ROCA
 * @version 1.0.0
 * @since 2021-02-20
 */
public class CompteCorrent {
    
    private int saldo;
    private String contrasenya;
    
    
    // Constructor vuit
    public CompteCorrent() {
        
    }
    
    // Constructor 
    public CompteCorrent(int saldoInicial, String cs) {
        this.saldo = saldoInicial;
        this.contrasenya = cs;
    }
    
    //Depositem diners al conte (no necesita contrasenya)
    public int diposita(int pasta) {
    
        saldo = saldo + pasta;
        return saldo;
    }

    //Métode per retirar diners en diferents condicions
    public int retira(int pasta, String cs) {
        //Declarem el valor per defecte amb un 1 ja que sino ens salta un error de que sino entrem a ninguna opció tornaríem un valor vuit.
        int resultat = 1;
        // Si la contrasenya és correcta i tenim prou diners, els restem del saldo i retornem el valor de la pasta que hem retirat.
        if(cs == contrasenya && saldo >= pasta){
            saldo =- pasta;
            resultat = saldo;
        }
        // Si no tenim prou saldo, retornem un -1.
        else if(cs == contrasenya && pasta > saldo ){
            resultat = -1;
        }
        // Si la contrasenya no és correcte, retornem un -2.
        else if(cs != contrasenya){
            resultat = -2;
        }
        //Retornem el valor resultat
        return resultat;
     
    }
    
    //Demanem el saldo
    public int getSaldo(String cs) {

        if(cs == contrasenya){
            System.out.println("Contrasenya correcta!");
        }else{
            System.out.println("Contrasenya equivocada!");
        }

        return saldo;
    }
    // Modifiquem la contrasenya, retornem 0 si va bé i -2 si l’antiga és incorrecta
    public int setContrasenya(String antiga, String nova) {
        //Si la contrasenya vella es correcta cambiem la nova
        if(antiga == contrasenya){
            contrasenya = nova;
            return 0;
        //Si la contrasenya vella es incorrecta torna un missatge i un -2
        }else{
            System.out.println("Contraseya incorrecta");
            return -2;
        }
        
    }
    }
