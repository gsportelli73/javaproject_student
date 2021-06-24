
/**
 * Aggiungi qui una descrizione della classe Somma
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Somma
{
    // variabili d'istanza - sostituisci l'esempio che segue con il tuo
    private int x,y;
    private int s;

    /**
     * Costruttore degli oggetti di classe  Somma
     */
    public Somma(int a,int b)
    {
        // inizializza le variabili d'istanza
        s = 0;
        this.x=a;
        this.y=b;
    }

    /**
     * Un esempio di metodo - aggiungi i tuoi commenti
     * 
     * @param  y   un parametro d'esempio per un metodo
     * @return     la somma di x e y
     */
    public void somma2()
    {
        // metti qui il tuo codice
        this.s=this.x+this.y;
    }
    public int somma3()
    {
        return s;
    }
    public void stampa()
    {
        System.out.println("La somma dei due numeri è: "+this.s+"\n");
    }
    public static void main(String args[])
    {
        int n1=10;
        int n2=20;
        int sum=0;
        Somma z=new Somma(n1,n2);
        z.somma2();
        z.stampa();
        sum =z.somma3();
        System.out.println("La somma memorizzata nella variabile del main sum:" +sum);
}}
