/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carochess;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Thu
 */
public class GamePVP extends javax.swing.JFrame {

    
    int Cot,Hang;
    int SoLuongCot[]={5,10,15,20};
    int SoLuongHang[]={5,10,15,20};
    JButton quanCo[][];    
    boolean ODaDi[][];
    boolean luot;
    int DiLaiX[]=new int[Hang*Cot];
    int diLaiY[]=new int[Hang*Cot];
    int soBuocDi=0;
    int soOTrenBanCo;    
    String tenNguoiChoi1;
    String tenNguoiChoi2;
    ImageIcon iconX,iconO;    
    /**
     * Creates new form GamePVP
     */
    public GamePVP(){}
    public GamePVP(String tenNguoiChoi1,String tenNguoiChoi2) {
        initComponents();        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setTitle("caro");
        this.Hang=5;
        this.Cot=5;
        this.luot=true;        
        this.p1txt.setText(tenNguoiChoi1); 
        this.p2txt.setText(tenNguoiChoi2);        
        this.jLabel2.setIcon(new ImageIcon(new ImageIcon("x.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
        this.p1icon.setIcon( new ImageIcon(new ImageIcon("x.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
        this.p2icon.setIcon( new ImageIcon(new ImageIcon("o.jpg").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
        this.soOTrenBanCo=0;
        this.quanCo=new JButton[Hang+2][Cot+2];
        this.ODaDi=new boolean[Hang+2][Cot+2];
        this.DiLaiX=new int[Hang*Cot];
        this.diLaiY=new int[Hang*Cot];   
        int y=jPanel2.getHeight()/Hang;int x=jPanel2.getWidth()/Cot;
        iconX = new ImageIcon(new ImageIcon("x.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        iconO = new ImageIcon(new ImageIcon("o.jpg").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        veBanco(Hang,Cot); 
        
    }
    public GamePVP(String title,int Hang,int Cot, boolean luot,int soOTrenBanCo,String tenNguoiChoi1,String tenNguoiChoi2) {
        super(title);
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);        
        this.Hang=Hang;
        this.Cot=Cot;
        this.luot=true;       
        
        this.jLabel2.setIcon(new ImageIcon(new ImageIcon("x.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));        
        this.p1icon.setIcon( new ImageIcon(new ImageIcon("x.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
        this.p2icon.setIcon( new ImageIcon(new ImageIcon("o.jpg").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));        
        this.p1icon.setIcon( new ImageIcon(new ImageIcon("x.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
        this.p2icon.setIcon( new ImageIcon(new ImageIcon("o.jpg").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
        p1txt.setText(tenNguoiChoi1);
        p2txt.setText(tenNguoiChoi2);
        this.soOTrenBanCo=soOTrenBanCo;
        this.quanCo=new JButton[Hang+2][Cot+2];
        this.ODaDi=new boolean[Hang+2][Cot+2];
        this.DiLaiX=new int[Hang*Cot];
        this.diLaiY=new int[Hang*Cot];
        int y=jPanel2.getHeight()/Hang;int x=jPanel2.getWidth()/Cot;
        iconX = new ImageIcon(new ImageIcon("x.png").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        iconO = new ImageIcon(new ImageIcon("o.jpg").getImage().getScaledInstance(x, y, Image.SCALE_DEFAULT));
        veBanco(this.Hang,this.Cot);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        newgamebtn = new javax.swing.JButton();
        undobtn = new javax.swing.JButton();
        CellChoose = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        change = new javax.swing.JButton();
        sooco = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        p1txt = new javax.swing.JLabel();
        p1icon = new javax.swing.JLabel();
        p2icon = new javax.swing.JLabel();
        p2txt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 700));
        jPanel1.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 650));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 650, 650);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        newgamebtn.setBackground(new java.awt.Color(255, 255, 51));
        newgamebtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        newgamebtn.setText("Ch??i l???i");
        newgamebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgamebtnActionPerformed(evt);
            }
        });

        undobtn.setBackground(new java.awt.Color(255, 255, 51));
        undobtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        undobtn.setText("????nh l???i");
        undobtn.setEnabled(false);
        undobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undobtnActionPerformed(evt);
            }
        });

        CellChoose.setBackground(new java.awt.Color(255, 255, 51));
        CellChoose.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        CellChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5x5", "10x10", "15x15" }));
        CellChoose.setToolTipText("");
        CellChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CellChooseActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 255, 51));
        back.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        back.setText("Tr??? v??? m??n h??nh");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        change.setBackground(new java.awt.Color(255, 255, 51));
        change.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        change.setText("?????i qu??n 2 b??n");
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        sooco.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        sooco.setText("S??? ?? c???");

        exit.setBackground(new java.awt.Color(255, 255, 51));
        exit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        exit.setText("Tho??t");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        p1txt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        p1txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1txt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        p2txt.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("L?????t hi???n t???i");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sooco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CellChoose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(exit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newgamebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(undobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(change, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p1txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p2txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p1icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(p2icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(back, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1icon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2icon, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newgamebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(undobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CellChoose, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(sooco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(650, 0, 200, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CellChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CellChooseActionPerformed
        // TODO add your handling code here:
        int i=CellChoose.getSelectedIndex();
        if(this.soOTrenBanCo!=i){
            this.soOTrenBanCo=i;
            int soCotMoi=SoLuongCot[i];
            int soHangMoi=SoLuongHang[i];
            GamePVP newgame= new GamePVP("caro", soHangMoi, soCotMoi,true,i,tenNguoiChoi1,tenNguoiChoi2);
            newgame.setVisible(true);
            newgame.tenNguoiChoi1=tenNguoiChoi1;
            newgame.tenNguoiChoi2=tenNguoiChoi2;
            newgame.CellChoose.setSelectedIndex(i);            
            this.dispose();
        }
    }//GEN-LAST:event_CellChooseActionPerformed

    private void newgamebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgamebtnActionPerformed
        // TODO add your handling code here:
        GamePVP newgame= new GamePVP("caro", Hang, Cot,true,soOTrenBanCo,tenNguoiChoi1,tenNguoiChoi2);
        newgame.setVisible(true);
        newgame.CellChoose.setSelectedIndex(soOTrenBanCo);
        newgame.tenNguoiChoi1=tenNguoiChoi1;
        newgame.tenNguoiChoi2=tenNguoiChoi2;
        this.dispose();
    }//GEN-LAST:event_newgamebtnActionPerformed

    private void undobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undobtnActionPerformed
        // TODO add your handling code here:
            undo();
    }//GEN-LAST:event_undobtnActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new LOGIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed
        // TODO add your handling code here:
        doiQuanHienTai();
          
    }//GEN-LAST:event_changeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this,"B???n c?? mu???n tho??t?")==JOptionPane.OK_OPTION)
            System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(GamePVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePVP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GamePVP().setVisible(true);
        });
    }
    public void veBanco(int Hang,int Cot)
    {
        this.jPanel2.setLayout(new GridLayout(Hang,Cot));        
        for(int i=0;i<=Hang+1;i++)
        {
            
            for(int j=0;j<=Cot+1;j++){
            quanCo[i][j]=new JButton("");
            quanCo[i][j].setActionCommand(i+","+j);
            quanCo[i][j].setBackground(new Color(255,255,204));            
            quanCo[i][j].addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformed(evt);
            }
        });
            
            ODaDi[i][j] = true;
            }
        }
        for(int i=1;i<=Hang;i++)
            for(int j=1;j<=Cot;j++)
            jPanel2.add(quanCo[i][j]);
            
        
        jPanel2.updateUI();
    }
    public boolean kiemtraThang(int i,int j)
    {
        //kiem tra hang doc
        int h = i,d = 0, k,demquanchan=0;
        while (quanCo[h][j].getIcon()==quanCo[i][j].getIcon()) {            
            d++;
            h++;
        }
        if(quanCo[h][j].getIcon()!=quanCo[i][j].getIcon()&&quanCo[h][j].getIcon()!=null)
           demquanchan++;
        h=i-1;
        while (quanCo[h][j].getIcon()==quanCo[i][j].getIcon()) {            
            d++;
            h--;
        }
        if(quanCo[h][j].getIcon()!=quanCo[i][j].getIcon()&&quanCo[h][j].getIcon()!=null)
            demquanchan++;
        if(demquanchan!=2){
        if(d>4) return true;
        }
        //kiem tra hang ngang
         k=j;d=0;demquanchan=0;
        while (quanCo[i][k].getIcon()==quanCo[i][j].getIcon()) {            
            d++;
            k++;
        }
        if(quanCo[i][k].getIcon()!=quanCo[i][j].getIcon()&&quanCo[i][k].getIcon()!=null)
            demquanchan++;
        k=j-1;
        while (quanCo[i][k].getIcon()==quanCo[i][j].getIcon()) {            
            d++;
            k--;
        }
        if(quanCo[i][k].getIcon()!=quanCo[i][j].getIcon()&&quanCo[i][k].getIcon()!=null)
            demquanchan++;
        if(demquanchan!=2){
        if(d>4) return true;
        }
        //kiem tra duong cheo 
        h=i;k=j;d=0;demquanchan=0;
        while (quanCo[h][k].getIcon()==quanCo[i][j].getIcon()) {            
            d++;
            k++;
            h++;
        }
        if(quanCo[h][k].getIcon()!=quanCo[i][j].getIcon()&&quanCo[h][k].getIcon()!=null)
            demquanchan++;
        h=i-1;k=j-1;
        while (quanCo[h][k].getIcon()==quanCo[i][j].getIcon()) {            
            d++;
            k--;
            h--;
        }
        if(quanCo[h][k].getIcon()!=quanCo[i][j].getIcon()&&quanCo[h][k].getIcon()!=null)
            demquanchan++;
        if(demquanchan!=2){
        if(d>4) return true;
        }
        //kiem tra duong cheo
        h=i;k=j;d=0;demquanchan=0;
        while (quanCo[h][k].getIcon()==quanCo[i][j].getIcon()) {            
            d++;
            h++;
            k--;
        }
        if(quanCo[h][k].getIcon()!=quanCo[i][j].getIcon()&&quanCo[h][k].getIcon()!=null)
            demquanchan++;
        h=i-1;k=j+1;
        while (quanCo[h][k].getIcon()==quanCo[i][j].getIcon()) {            
            d++;
            h--;
            k++;
        }
        if(quanCo[h][k].getIcon()!=quanCo[i][j].getIcon()&&quanCo[h][k].getText()!=null)
            demquanchan++;
        if(demquanchan!=2){
        if(d>4) return true;
        }
        return false;
    }
    
    public boolean kiemTraHoa(){
        return soBuocDi==(Hang*Cot);
    }
    public void addPoint(int i,int j)
    {
        
        DiLaiX[soBuocDi]=i;
        diLaiY[soBuocDi]=j;
        soBuocDi++;
        if(luot)
        {
//            quanCo[i][j].setText("X");
//            quanCo[i][j].setForeground(Color.red);
            quanCo[i][j].setIcon(iconX);
        }
        else
        {
//            quanCo[i][j].setText("O");
//            quanCo[i][j].setForeground(Color.blue);
            quanCo[i][j].setIcon(iconO);
        }
        ODaDi[i][j]=false;
        luot^=true;
        undobtn.setEnabled(true);
        if(luot){
                
                jLabel2.setIcon(new ImageIcon(new ImageIcon("x.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
            }
            else{
                
                jLabel2.setIcon(new ImageIcon(new ImageIcon("o.jpg").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
            }
        
    }
    public void undo()
    {
        if(soBuocDi>0){
            quanCo[DiLaiX[soBuocDi - 1]][diLaiY[soBuocDi - 1]].setIcon(null);
            quanCo[DiLaiX[soBuocDi - 1]][diLaiY[soBuocDi - 1]].setActionCommand(DiLaiX[soBuocDi - 1]+","+diLaiY[soBuocDi - 1]);
            
            ODaDi[DiLaiX[soBuocDi-1]][diLaiY[soBuocDi-1]]=true;
            luot^=true;
            soBuocDi--;
            if(soBuocDi==0) undobtn.setEnabled(false);
            if(luot){
                
                jLabel2.setIcon(new ImageIcon(new ImageIcon("x.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
            }
            else{
                
                jLabel2.setIcon(new ImageIcon(new ImageIcon("o.jpg").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
            }
            
        }
    }
    public void playWithPlayer(int i,int j)
    {       
        if (ODaDi[i][j]) {
            addPoint(i, j);
            
        }
        if(kiemTraHoa()){
            for (i = 1; i <= Hang; i++)
                                for (j = 1; j <= Cot; j++)
                quanCo[i][j].setEnabled(false);                                
                undobtn.setEnabled(false);
                CellChoose.setEnabled(false);
                change.setEnabled(false);
                JOptionPane.showMessageDialog(this, "H??a");
        }
        else if (kiemtraThang(i, j)) 
            {			
                for (i = 1; i <= Hang; i++)
                        for (j = 1; j <= Cot; j++) 
                quanCo[i][j].setEnabled(false);
                undobtn.setEnabled(false);	
                CellChoose.setEnabled(false);
                change.setEnabled(false);
                
                if(luot){
                    jLabel1.setText("Winner:");
                    jLabel2.setIcon(new ImageIcon(new ImageIcon("o.jpg").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
                    JOptionPane.showMessageDialog(this, tenNguoiChoi2+" ???? chi???n th???ng");
                
                }
                else{
                    jLabel1.setText("Winner:");
                    jLabel2.setIcon(new ImageIcon(new ImageIcon("x.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));
                    JOptionPane.showMessageDialog(this, tenNguoiChoi1+" ???? chi???n th???ng");
                
                }
            }
    }
   
    public void doiQuanHienTai()
    {
         for(int i=1;i<=Hang;i++)
            for(int j=1;j<=Cot;j++)
            {
                if(quanCo[i][j].getIcon()==iconX){
                    quanCo[i][j].setIcon(iconO);
                    
                }
                else if(quanCo[i][j].getIcon()==iconO){
                    quanCo[i][j].setIcon(iconX);
                }
            }   
         luot^=true;
         if(luot==true){
             this.jLabel2.setIcon(new ImageIcon(new ImageIcon("x.png").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));             
         }
         else{
             this.jLabel2.setIcon(new ImageIcon(new ImageIcon("o.jpg").getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT)));             
         } 
         
         ImageIcon icon1 =(ImageIcon) p1icon.getIcon();
         ImageIcon icon2 =(ImageIcon) p2icon.getIcon();
         p1icon.setIcon(icon2);
         p2icon.setIcon(icon1);
             
        
        
    }
    private void ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        
        String s = evt.getActionCommand();
        StringTokenizer stk= new StringTokenizer(s,",");
        int i = Integer.parseInt(stk.nextToken());
        int j = Integer.parseInt(stk.nextToken());
       
         playWithPlayer(i, j);
         
       
}
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CellChoose;
    private javax.swing.JButton back;
    private javax.swing.JButton change;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton newgamebtn;
    private javax.swing.JLabel p1icon;
    private javax.swing.JLabel p1txt;
    private javax.swing.JLabel p2icon;
    private javax.swing.JLabel p2txt;
    private javax.swing.JLabel sooco;
    private javax.swing.JButton undobtn;
    // End of variables declaration//GEN-END:variables
}
