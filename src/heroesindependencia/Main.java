/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesindependencia;

import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;



/**
 *
 * @author Juare
 */
public class Main extends javax.swing.JFrame {
    
    String nombresCorrectos[] = {
        "MIGUEL HIDALGO Y COSTILLA",
        "JOSEFA ORTÍZ DE DOMÍNGUEZ",
        "IGNACIO ALLENDE",
        "GUADALUPE VICTORIA",
        "JOSÉ MARíA MORELOS Y PAVÓN",
        "VICENTE GUERRERO",
        "MARIANO MATAMOROS",
        "JUAN ALDAMA",
        "AGUSTÍN DE ITURBIDE",
        "IGNACIO LÓPEZ RAYÓN",
        "NICOLÁS BRAVO"
        
    };
    String nombresIncorrectos[] = {
        "JOSÉ MARÍA MORELOS Y PAVÓN",
        "JOSÉ MARÍA MORELOS Y PAVÓN",
        "IGNACIO RAYÓN",
        "JOSEFA ORTÍZ DE DOMÍNGUEZ",
        "VICENTE GUERRERO",
        "GUADALUPE VICTORIA",
        "MARIANO ABASOLO",
        "AGUSTÍN DE ITURBIDE",
        "GUADALUPE VICTORIA",
        "IGNACIO ALLENDE",
        "GUADALUPE VICTORIA"
        
    };
    String nombresIncorrectos2[] = {
        "IGNACIO ALLENDE",
        "GUADALUPE VICTORIA",
        "FCO. JAVIER MINA",
        "IGNACIO ALLENDE",
        "MARIANO ABASOLO",
        "JUAN ALDAMA",
        "NICOLÁS BRAVO",
        "IGNACIO LÓPEZ RAYÓN",
        "NICOLÁS BRAVO",
        "JUAN ALDAMA",
        "AGUSTÍN DE ITURBIDE" 
    };
    String descripcion[] = {
        "Iniciador de la Guerra de Independencia",
        "Alerta a Hidalgo, Allende y Aldama que los han descubierto.",
        "Junto a Hidalgo y Aldama dio inicio a la lucha de independecia",
        "Cambió su nombre por el de dos elementos clave de la Independencia: \"La Virgen y la Victoria\"",
        "Conocido como: \"Siervo de la Nación\"",
        "Toma el mando del ejército a la muerte de José María Morelos y Pavón",
        "Buscó proteger a la Iglesia de los cambios de la corona",
        "Siendo Capitán de regimiento del ejército virreinal, estaba en contacto con los conspiradores de Querétaro.",
        "En 1821 se unió al bando independentista, acordó el Plan de Iguala",
        "Se le atribuye la formación del primer gobierno y la primera Constitución",
        "Ocupó la presidencia en tres ocasiones."
    };
    String descripcion2[] = {
        "Conocido como: \"El Padre de la Patria\"",
        "Cuando da aviso del descubrimiento de la conspiración provoca que se adelante el levantamento en armas.",
        "Llegó a ser nombrado Generalisimo del ejército Insurgente.",
        "Conocido como: \"Benemérito de la Patria\"",
        "Posterior a la muerte de Hidalgo es quien encabeza la lucha de Indpendencia",
        "Proclama el Plan de Iguala junto a Iturbide.",
        "Sometido a Juicio y hallado culpable muere de dos balazos.",
        "Su cabeza fue expuesta en la Alhóndiga de Granaditas como advetencia a los insurgentes.",
        "En 1823 adbicó y el año siguiente fue fusilado por republicanos",
        "Publicó diferentes decretos con el fin de abolir la esclavitu y los impuestos",
        "Perdonó la vida y dio libertad a 300 soldados realistas"
    };
    String imagenes[] = {
        "miguel_hidalgo.jpg",
        "josefa_ortiz.jpg",
        "allende_ignacio.jpg",
        "guadalupe_victoria.jpg",
        "jose_ma_morelos.jpg",
        "vicente_guerrero.jpg",
        "mariano_matamoros.jpg",
        "juan_aldama.jpg",
        "agustin_iturbide.jpg",
        "ignacio_lopez.jpg",
        "nicolas_bravo.jpg"
        
    };
    int puntaje = 0;
    int indicePersonaje = 0;
    int indiceDescripcion = 0;
    Imagen Imagen = new Imagen(imagenes[indicePersonaje]);
    /**
     * Creates new form Main
     * @param personaje
     */
    public void evaluar(String personaje){
        System.out.println("evaluar");
        if (indiceDescripcion==1){
            System.out.println("entro ==1 "+indicePersonaje+"--"+indiceDescripcion);
            if(nombresCorrectos[indicePersonaje].equals(personaje)){
                System.out.println("entro al equals"+indicePersonaje+"--"+indiceDescripcion);
                
                puntaje++;
                jPanel1.remove(Imagen);
                Imagen = new Imagen(imagenes[indicePersonaje]);
                jPanel1.add(Imagen);
                jPanel1.repaint();
                
                jButton5.setVisible(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jLabel3.setText("Puntuación: "+puntaje);
                JOptionPane.showMessageDialog(rootPane, "Personaje Correcto");
                jTextPane2.setText(descripcion2[indicePersonaje]);
                
                indicePersonaje++;
                if(indicePersonaje>10){
                    System.out.println("entrso al >9"+indicePersonaje+"--"+indiceDescripcion);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                    jButton5.setVisible(false);
                    jScrollPane1.setVisible(false);
                    jScrollPane3.setVisible(false);
                    jTextPane3.setVisible(false);
                    jTextPane2.setVisible(false);
                    jTextPane3.setEditable(false);
                    jTextPane2.setEditable(false);
                    jPanel1.remove(Imagen);
                    jPanel1.repaint();
                    jLabel3.setVisible(false);
                    jLabel3.setText("Puntuación: 0");
                    jLabel5.setVisible(true);
                    jLabel5.setText("¡Fin del juego! Puntaje: "+puntaje);
                    jButton1.setText("Reiniciar");
                    jButton1.setVisible(true);
                }
            }else{
                indicePersonaje++;
           if(indicePersonaje>9){
                jButton2.setVisible(false);
                jButton3.setVisible(false);
                jButton4.setVisible(false);
                jButton5.setVisible(false);
                jScrollPane1.setVisible(false);
                jScrollPane3.setVisible(false);
                jTextPane3.setVisible(false);
                jTextPane2.setVisible(false);
                jTextPane3.setEditable(false);
                jTextPane2.setEditable(false);
                jPanel1.remove(Imagen);
                jPanel1.repaint();
                jLabel3.setVisible(false);
                jLabel3.setText("Puntuación: 0");
                jLabel5.setVisible(true);
                jLabel5.setText("¡Fin del juego! Puntaje: "+puntaje);
                jButton1.setText("Reiniciar");
                jButton1.setVisible(true);
                
            }
           jTextPane3.setText(descripcion[indicePersonaje]);
           jTextPane2.setText("");
           indiceDescripcion=0;
           reordenar(); 
                
            }
            
        }
        else if (indiceDescripcion==0){
            System.out.println("entro ==0 "+indicePersonaje+"--"+indiceDescripcion);
            jTextPane2.setText(descripcion2[indicePersonaje]);
            if(nombresCorrectos[indicePersonaje].equals(personaje)){
                System.out.println("entro al equals"+indicePersonaje+"--"+indiceDescripcion);
                puntaje++;
                jPanel1.remove(Imagen);
                Imagen = new Imagen(imagenes[indicePersonaje]);
                jPanel1.add(Imagen);
                jPanel1.repaint();
                
                jButton5.setVisible(true);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jLabel3.setText("Puntuación: "+puntaje);
                JOptionPane.showMessageDialog(rootPane, "Personaje Correcto");
                jTextPane2.setText(descripcion2[indicePersonaje]);
                
                indicePersonaje++;
                if(indicePersonaje>10){
                    System.out.println("entrso al >9"+indicePersonaje+"--"+indiceDescripcion);
                    jButton2.setVisible(false);
                    jButton3.setVisible(false);
                    jButton4.setVisible(false);
                    jButton5.setVisible(false);
                    jScrollPane1.setVisible(false);
                    jScrollPane3.setVisible(false);
                    jTextPane3.setVisible(false);
                    jTextPane2.setVisible(false);
                    jTextPane3.setEditable(false);
                    jTextPane2.setEditable(false);
                    jPanel1.remove(Imagen);
                    jPanel1.repaint();
                    jLabel3.setVisible(false);
                    jLabel3.setText("Puntuación: 0");
                    jLabel5.setVisible(true);
                    jLabel5.setText("¡Fin del juego! Puntaje: "+puntaje);
                    jButton1.setText("Reiniciar");
                    jButton1.setVisible(true);
                }
            }
            indiceDescripcion++;
        }
    
        
    }
    public void reordenar(){
        String nombres[]={nombresCorrectos[indicePersonaje],nombresIncorrectos[indicePersonaje],nombresIncorrectos2[indicePersonaje]};
        int numero[] = {3,3,3};
        int tmp = (int)(Math.random()*3);
        for(int i=0; i<numero.length; i++){
            while (existe(numero,tmp)){
            tmp = (int)(Math.random()*3);
            }
            numero[i]=tmp;
        }
        jButton2.setText(nombres[numero[0]]);
        jButton3.setText(nombres[numero[1]]);
        jButton4.setText(nombres[numero[2]]);
        
    }
    
    public boolean existe(int[] numeros, int numero){
        for(int i=0; i<numeros.length; i++){
            if (numeros[i]==numero)
                return true;
        }
        return false;
    }

    
    public Main() {
        initComponents();
        jButton2.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jScrollPane1.setVisible(false);
        jScrollPane3.setVisible(false);
        jTextPane3.setVisible(false);
        jTextPane2.setVisible(false);
        jTextPane3.setEditable(false);
        jTextPane2.setEditable(false);
        jLabel3.setVisible(false);
        jLabel5.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Heroes de la Independencia");
        setBackground(new java.awt.Color(102, 153, 255));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Vivaldi", 0, 48)); // NOI18N
        jLabel1.setText("Héroes de la Independencia");

        jButton1.setText("Jugar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Instrucciones: Seleccione el nombre del personaje que corresponda a la descripcion para ganar puntos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jButton4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Siguiente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTextPane2);

        jLabel3.setText("Puntuación: ");

        jScrollPane3.setViewportView(jTextPane3);

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(jButton5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setVisible(false);
        jLabel2.setVisible(false);
        jScrollPane1.setVisible(true);
        jScrollPane3.setVisible(true);
        jTextPane3.setVisible(true);
        jTextPane2.setVisible(true);
        jLabel3.setVisible(true);
        jLabel3.setText("Puntuación: 0");
        jTextPane3.setText(descripcion[0]);
        jTextPane2.setText("");
        jButton2.setVisible(true);
        jButton3.setVisible(true);
        jButton4.setVisible(true);
        puntaje = 0;
        indicePersonaje = 0;
        indiceDescripcion = 0;
        Imagen = new Imagen(imagenes[indicePersonaje]);
        jLabel5.setVisible(false);
        
        reordenar();
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.out.println("boton2");
        //indiceDescripcion++;
        evaluar(jButton2.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.println("boton3");
        //indiceDescripcion++;
        evaluar(jButton3.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.out.println("boton4");
        //indiceDescripcion++;
        evaluar(jButton4.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        reordenar();
        jTextPane3.setText(descripcion[indicePersonaje]);
        jTextPane2.setText("");
        jButton5.setVisible(false);
        jPanel1.remove(Imagen);
        jPanel1.repaint();
        indiceDescripcion=0;
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                                
            }
        });       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables
}

