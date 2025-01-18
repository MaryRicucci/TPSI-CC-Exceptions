package Main;

import CCManagment.CC;
import CCManagment.CifraNegativaException;
import CCManagment.SaldoInsufficienteException;


public class Main {
    public static void main(String[] args) {
        double amount ;
        boolean p = true ;
        CC c = new CC ("Artemisia Parker", 3000) ;

        for (int i = 0 ; i<=30 ; i++) {
            amount = (double) (Math.random()) ;
            if (p) {
                try {
                    c.Preleva(amount);
                } catch (SaldoInsufficienteException e) {
                    System.out.print("Hai " + c.getSaldo() + " € e hai richiesto il prelievo di: " + amount + "€");
                }
            }
            else {
                try{
                    c.Deposita(amount) ;
                }catch (CifraNegativaException e) {
                    System.out.print("Hai inserito una cifra negativa") ;
                }
            }
    }
    }
}
