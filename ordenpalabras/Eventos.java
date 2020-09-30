package ordenpalabras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static ordenpalabras.Archivo.condicion;
import static ordenpalabras.Ventana.area1;
import static ordenpalabras.Ventana.boton1;
import static ordenpalabras.Ventana.boton2;
import static ordenpalabras.Ventana.boton3;

public class Eventos implements ActionListener {

    Archivo ar = new Archivo();

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(boton1)) {
            JFileChooser abrir = new JFileChooser();
            try {
                ar.LecturaArchivo();
            } catch (IOException ex) {
                Logger.getLogger(Eventos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource().equals(boton2)) {
            if (condicion == true) {
                ar.Comparacion();

                String aux = "";
                for (int i = 0; i <= ar.FraseCorrecta.length - 1; i++) {
                    aux = aux + ar.FraseCorrecta[i] + " ";
                }
                area1.setText(aux);
            } else {
                JOptionPane.showMessageDialog(null, "Elige Ruta");
            }
        }

        if (e.getSource() == boton3) {
            System.exit(0);
        }

    }

}
