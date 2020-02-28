/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto02_dahan_gonzalez;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author USUARIO
 */
public class VistaArbol extends JFrame{
        private JPanel contentPane;
        public ArbolBinario tree;
	public Lienzo drawer;
         
	
	/**
	 * Creamos el frame donde se visualizará el Árbol
        * @param tree
	 */
	public VistaArbol (ArbolBinario tree) {
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setBounds(100, 100, 1500, 900);
                
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		drawer = new Lienzo(tree);
		
		contentPane.add(drawer);
                this.setLayout(new BorderLayout());
                this.setBackground(Color.WHITE);
               	this.setContentPane(contentPane);
		this.tree =tree;
	}
        public void iniciar(){
            drawer.setObjArbol(tree);
        }
}
