package examen;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana {
    
    static JButton boton1;
    static JButton boton2;
    static JButton boton3;
    static JButton boton4;
    static JLabel label1;
    static JLabel label2;
    static JLabel label3;
    
    Ventana(){
        JFrame f= new JFrame();
        f.setLayout(null);
        f.setSize(500, 180);
        f.setTitle("Expresiones");
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Acciones ev = new Acciones();
        
        label1 = new JLabel("(6 + 2) * 3 / 2 ^ 2 - 4");
        label1.setBounds(20, 20, 150, 30);
        f.add(label1);
        
        boton1 = new JButton("Resolver");
        boton1.setBounds(20, 60, 100, 30);
        f.add(boton1);
        
        label2 = new JLabel("[(p -> q) ^ p] -> q");
        label2.setBounds(180, 20, 150, 30);
        f.add(label2);
        
        boton2 = new JButton("Resolver");
        boton2.setBounds(180, 60, 100, 30);
        boton2.addActionListener((ActionListener)ev);
        f.add(boton2);
        
        label3 = new JLabel("Ingresa Cadena");
        label3.setBounds(340, 20, 150, 30);
        f.add(label3);
        
        boton3 = new JButton("Resolver");
        boton3.setBounds(340,60, 100, 30);
        boton3.addActionListener((ActionListener) ev);
        f.add(boton3);
        
        boton4 = new JButton("Salir");
        boton4.setBounds(180,100, 100, 30);
        boton4.addActionListener((ActionListener) ev);
        f.add(boton4);
        
        f.setVisible(true);
        
    }
}
