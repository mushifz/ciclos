import javax.swing.JOptionPane;

public class Tablas{

    public static int obtenerNumero(){
        int numeroTemporal =0;
        while(numeroTemporal<1){
            //System.out.println(mensaje);
            //numeroTemporal = scanner.nextInt();
            String numeroCadena = JOptionPane.showInputDialog("Introduce un numero ");
            numeroTemporal = Integer.parseInt(numeroCadena);    
        }
        return numeroTemporal;  
    }

    public static void mostrarTabla(int numero){
        for(int i = 1; i<11; i++){
            JOptionPane.showMessageDialog(null, i + " x " + numero + " = " + (numero*i));
        }
    }

    public static void main (String[] args){
        int numero = obtenerNumero();
        mostrarTabla(numero);
        
    }
}