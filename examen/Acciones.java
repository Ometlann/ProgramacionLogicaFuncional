package examen;

import static examen.Ventana.boton1;
import static examen.Ventana.boton2;
import static examen.Ventana.boton3;
import static examen.Ventana.boton4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Acciones implements ActionListener {

    //ExpresionAritmetica e = new ExpresionAritmetica();
    @Override
    public void actionPerformed(ActionEvent e) {
        //Boton 3-----------------------------------------------------------------------------------------------
        if (e.getSource().equals(boton3)) {
            int numeros = 0;
            int letras = 0;
            String texto;

            texto = JOptionPane.showInputDialog(null, "Ingresa Cadena");

            for (int i = 0; i < texto.length(); i++) {
                if (Character.isDigit(texto.charAt(i))) {
                    char[] caracteres = texto.toCharArray();
                    numeros++;
                } else if (texto.charAt(i) != (char) 32) {
                    letras++;
                }
            }
            JOptionPane.showMessageDialog(null, "El Texto Ingresado Es: " + texto + "\n"
                    + "Y Contiene " + numeros + " numeros y " + letras + " Letras");
        }

        //Boton 2------------------------------------------------------------------------------------------------
        if (e.getSource().equals(boton2)) {

            List<String> vp = new ArrayList<String>();
            List<String> vq = new ArrayList<String>();
            List<String> condicional = new ArrayList<String>();
            List<String> conjuncion = new ArrayList<String>();
            List<String> condicionalres = new ArrayList<String>();

            vp.add("V");
            vp.add("V");
            vp.add("F");
            vp.add("F");

            vq.add("V");
            vq.add("F");
            vq.add("V");
            vq.add("F");

            for (int i = 0; i < vp.size(); i++) {
                for (int j = 0; j < vq.size(); j++) {
                    //Condicional-----------------------------
                    if ((vp.get(0)) == (vq.get(0))) {
                        condicional.add("V");
                    }
                    if ((vp.get(1)) != (vq.get(1))) {
                        condicional.add("F");
                    }
                    if ((vp.get(2)) != (vq.get(2))) {
                        condicional.add("V");
                    }
                    if ((vp.get(3)) == (vq.get(3))) {
                        condicional.add("V");
                    }
                }
                for (int j = 0; j < condicional.size(); j++) {
                    if (condicional.get(0) == (vp.get(0))) {
                        conjuncion.add("V");
                    }
                    if (condicional.get(1) != (vp.get(1))) {
                        conjuncion.add("F");
                    }
                    if (condicional.get(2) != (vp.get(2))) {
                        conjuncion.add("F");
                    }
                    if (condicional.get(3) != (vp.get(3))) {
                        conjuncion.add("F");
                    }
                }
                for (int j = 0; j < conjuncion.size(); j++) {
                    if (conjuncion.get(0) == (vq.get(0))) {
                        condicionalres.add("V");
                    }
                    if (conjuncion.get(1) != (vq.get(1))) {
                        condicionalres.add("V");
                    }
                    if (conjuncion.get(2) != (vq.get(2))) {
                        condicionalres.add("V");
                    }
                    if (conjuncion.get(3) == (vq.get(3))) {
                        condicionalres.add("V");
                    }
                }
                //JOptionPane.showMessageDialog(null,"");
                JOptionPane.showMessageDialog(null,"Tautologia\n"+vp.get(i) + " " + vq.get(i) + " | " + condicional.get(i) + " - " + conjuncion.get(i) + " - " + condicionalres.get(i)+"\n");
                System.out.println("" + vp.get(i) + "  " + vq.get(i) + " | " + condicional.get(i) + " - " + conjuncion.get(i) + " - " + condicionalres.get(i));
            }
        }
        // Boton 1---------------------------------------------------------------
        if(e.getSource().equals(boton1)){
            //ExpresionAritmetica ex = new ExpresionAritmetica();
            new ExpresionAritmetica();
        }
        if (e.getSource().equals(boton4)) {
            System.exit(0);
        }
    }
}
