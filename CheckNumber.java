/**
 * <h1>Check Number</1>
 * <p>Este programa comproba el signe del número introduit</p>
 * @author PERE ROCA
 * @version 1.0.0
 * @since 2021-02-20
 */
public class CheckNumber {
    
    private double number;
    
    //Constructor
    public CheckNumber(double num) {
        
        this.number = num;
    
    }
    
    //Métode per comprovar el signe del número introduit
    public double comprovaSigne() {
            double status;
        //Si el nombre introduit es negatiu torna un -1
        if (this.number < 0)
            status = -1;
        //Si el nombre introduit es 0 torna un 0
        else if (this.number == 0)
            status = 0;
        //Si el nombre introduit ni es 0 ni negatiu (es positiu) torna un 1
        else
            status = 1;
        //El métode torna el valor status on diu que amb un número com es el valor introduit
        return status;
    }
}