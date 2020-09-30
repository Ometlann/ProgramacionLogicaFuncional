package ordenpalabras;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana {

    //Componentes a Utilizar.................................................
    static JButton boton1;
    static JButton boton2;
    static JButton boton3;
    static JTextField caja1;
    static JTextArea area1;

    //Posicion De La Ventana y Sus Los Elementos.............................
    Ventana() {
        JFrame f = new JFrame();
        f.setLayout(null);
        f.setSize(470, 220);
        f.setTitle("Ondenamiento Frase");
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.darkGray);

        // Objeto Para La Clase Eventos...................................... 
        Eventos ev = new Eventos();
        
        boton1 = new JButton("Abrir Archivo");
        boton1.setBounds(30, 30, 150, 30);
        boton1.addActionListener((ActionListener) ev);
        f.add(boton1);

        boton2 = new JButton("Ordenar Frase");
        boton2.setBounds(30, 130, 150, 30);
        boton2.addActionListener((ActionListener) ev);
        f.add(boton2);

        boton3 = new JButton("Salir");
        boton3.setBounds(210, 130, 150, 30);
        boton3.addActionListener((ActionListener) ev);
        f.add(boton3);

        area1 = new JTextArea();
        area1.setBounds(30, 70, 410, 50);
        f.add(area1);

        f.setVisible(true);

    }
}
