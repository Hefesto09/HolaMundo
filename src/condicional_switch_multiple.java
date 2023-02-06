import javax.swing.JOptionPane;

public class condicional_switch_multiple {
    public static void main(String[] args) {
        /* La centencia switch
         * switch (dato){
         * caso 1 : instruccion 1;
         *          break;
         * caso 2 : instruccion 2;
         *          break;
         * caso 3 : instruccion 3;
         *          break;
         * ...
         * caso n : instruccion n;
         *          break;
         * defaul : casoContrario;
         *          break;
         * }
         * 
         * durante las siguientes clases se trabajara con JOptionpane
         */

        int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-5: "));

            switch (dato) {
                case 1 : JOptionPane.showMessageDialog(null, "Es el numero 1");
                break;
                case 2 : JOptionPane.showMessageDialog(null, "Es el numero 2");
                break;
                case 3 : JOptionPane.showMessageDialog(null, "Es el numero 3");
                break;
                case 4 : JOptionPane.showMessageDialog(null, "Es el numero 4");
                break;
                case 5 : JOptionPane.showMessageDialog(null, "Es el numero 5");
                break;
                
                default : JOptionPane.showMessageDialog(null, "El numero no esta entre 1-5");
            }
    }
}
