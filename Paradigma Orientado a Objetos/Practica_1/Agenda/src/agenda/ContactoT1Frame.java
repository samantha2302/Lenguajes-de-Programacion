package agenda;

/**
 *
 * @author Sam
 */
public class ContactoT1Frame extends javax.swing.JFrame {

    public ContactoT1Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelid = new javax.swing.JLabel();
        jLabelname = new javax.swing.JLabel();
        jLabelage = new javax.swing.JLabel();
        jLabelgenre = new javax.swing.JLabel();
        jLabeladdresss = new javax.swing.JLabel();
        jLabelphone = new javax.swing.JLabel();
        jLabelmail = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldid = new javax.swing.JTextField();
        jTextFieldname = new javax.swing.JTextField();
        jTextFieldage = new javax.swing.JTextField();
        jTextFieldgenre = new javax.swing.JTextField();
        jTextFieldaddress = new javax.swing.JTextField();
        jTextFieldphone = new javax.swing.JTextField();
        jTextFieldmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelid.setText("ID");

        jLabelname.setText("Name");

        jLabelage.setText("Age");

        jLabelgenre.setText("Genre");

        jLabeladdresss.setText("Address");

        jLabelphone.setText("Phone");

        jLabelmail.setText("Mail");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel8.setText("Contacto T1");

        jTextFieldid.setText("jTextField1");

        jTextFieldname.setText("jTextField2");

        jTextFieldage.setText("jTextField3");

        jTextFieldgenre.setText("jTextField4");

        jTextFieldaddress.setText("jTextField5");

        jTextFieldphone.setText("jTextField6");

        jTextFieldmail.setText("jTextField7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelage, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldname)
                                    .addComponent(jTextFieldage)
                                    .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelgenre)
                                .addGap(29, 29, 29)
                                .addComponent(jTextFieldgenre, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabeladdresss)
                                    .addComponent(jLabelphone)
                                    .addComponent(jLabelmail))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldmail, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(jTextFieldaddress)
                                    .addComponent(jTextFieldphone)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel8)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelid)
                    .addComponent(jTextFieldid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelname)
                    .addComponent(jTextFieldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelage))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelgenre)
                    .addComponent(jTextFieldgenre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeladdresss)
                    .addComponent(jTextFieldaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelphone)
                    .addComponent(jTextFieldphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelmail)
                    .addComponent(jTextFieldmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabeladdresss;
    private javax.swing.JLabel jLabelage;
    private javax.swing.JLabel jLabelgenre;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JLabel jLabelmail;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JLabel jLabelphone;
    public javax.swing.JTextField jTextFieldaddress;
    public javax.swing.JTextField jTextFieldage;
    public javax.swing.JTextField jTextFieldgenre;
    public javax.swing.JTextField jTextFieldid;
    public javax.swing.JTextField jTextFieldmail;
    public javax.swing.JTextField jTextFieldname;
    public javax.swing.JTextField jTextFieldphone;
    // End of variables declaration//GEN-END:variables
}
