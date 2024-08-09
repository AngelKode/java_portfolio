package practice_classes;

import javax.swing.*;

public class InputData {
    public static void main(String[] args) {
        int numberEntered = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero decimal: "));
        JOptionPane.showMessageDialog(null,"Tu numero ingresado es: " + numberEntered,"RESULTADO",JOptionPane.INFORMATION_MESSAGE);
    }
}
