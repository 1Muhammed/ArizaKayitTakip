/*
 * Scada Kontrol Merkezi
 * Arıza Kayıt Ve Takip Sistemi Yazılımı
 * Yazılımı yapan Muhammed KORUCU,
 * 1muhammed.korucugmail.com
 * v0.1
 */

package frmSayfa;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

/**
 * @Muhammed KORUCU
 */

public class frmArizaKayitTakipSystem extends javax.swing.JFrame {
   
    private Object tblKayitListesi;
    int sayac =-1;
    int secilensatir=0;
   
    public frmArizaKayitTakipSystem() {
        initComponents();
        //setIcon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtAra = new javax.swing.JTextField();
        btnBul = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKayiıtListesi = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSira = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtmahalle = new javax.swing.JTextField();
        cmbilce = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtistasyon = new javax.swing.JTextField();
        txtisimsoyisim1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbUnvan2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtTelefon1 = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtArizatarihi = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbArizacesidi = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtArizaizah = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtElektrikizah = new javax.swing.JTextField();
        cmbElektrikArizasi = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtDiger = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtisimsoyisim2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cmbUnvan1 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        txtBildirimT = new javax.swing.JFormattedTextField();
        cmbAtelye = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtSaat1 = new javax.swing.JFormattedTextField();
        txtSaat2 = new javax.swing.JFormattedTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAciklama = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        btnYenikayit = new javax.swing.JButton();
        btnKaydet = new javax.swing.JButton();
        btnDuzenle = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnMeil = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnKapat = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arıza Kayıt ve Takip Programı v0.1");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1600, 900));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1600, 970));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mücavir Alan Arıza Kayıt ve Takip Sistemi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 9, 540, 30));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ara.png"))); // NOI18N
        jLabel21.setText("Ara");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 60, 30));

        txtAra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtAra.setToolTipText("Veri veya Bilgi Arama");
        jPanel1.add(txtAra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 150, 30));

        btnBul.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBul.setText("BUL");
        jPanel1.add(btnBul, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 10, 60, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1610, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 960, 1600, 10));

        tblKayiıtListesi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblKayiıtListesi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra no", "İlçe", "Mahalle", "İstasyon", "İsim Soyisim", "Ünvanı", "Telefonu", "Tarih", "Saat", "Arıza", "Arıza izahı", "Elektrik Arıza", "Elek. Arıza izah", "Diğer", "Arıza Kime Bildirildi", "Unvanı", "Bildirme Tarihi", "Bildirme Saati", "Atelye"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblKayiıtListesi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 1310, 800));

        jPanel3.setBackground(new java.awt.Color(118, 221, 245));
        jPanel3.setMinimumSize(new java.awt.Dimension(270, 600));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("Sıra No :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, 20));

        txtSira.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSira.setForeground(java.awt.Color.red);
        jPanel3.add(txtSira, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 100, 25));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 240, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("İstasyon İsmi");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 100, -1));

        txtmahalle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtmahalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, 25));

        cmbilce.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbilce.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz ...", "Akyurt", "Altındağ", "Ayaş", "Bala", "Beypazarı", "Çamlıdere", "Çankaya", "Çubuk", "Elmadağ", "Etimesgut", "Evren", "Gölbaşı", "Güdül", "Haymana", "Kalecik", "KahramanKazan", "Keçiören", "Kızılcahamam", "Mamak", "Nallıhan", "Polatlı", "Pursaklar", "Sincan", "Şereflikoçhisar", "Yenimahalle" }));
        jPanel3.add(cmbilce, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 150, 24));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("İlçe");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 30, -1));

        txtistasyon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtistasyon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 150, 25));

        txtisimsoyisim1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtisimsoyisim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Mahalle");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Arızayı Bildiren");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 240, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("İsim Soyisim");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ünvanı");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        cmbUnvan2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbUnvan2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz ...", "Başkan", "Müdür", "Şef", "Personel", "Abone", "Muhtar", "Pompa Atelyesi", "Vana Atelyesi", "Sondaj Atelyesi", "Elektrik Atelyesi", "İlgili Bölge" }));
        jPanel3.add(cmbUnvan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 150, 24));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Telefonu");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        try {
            txtTelefon1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0.###.###.##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefon1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtTelefon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 120, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Arıza Çaşiti");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        try {
            txtArizatarihi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtArizatarihi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtArizatarihi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArizatarihiActionPerformed(evt);
            }
        });
        jPanel3.add(txtArizatarihi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 90, 25));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Tarihi / Saat");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        cmbArizacesidi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbArizacesidi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz...", "Pompa", "Kuyu", "Dalgıç Pompa", "Hirdofor", "Vana ", "Tahliye Vanası", "Klepe", "Çıkış Vanası", "Auma Vana", "Vantuz", "Kollektör", "Giriş Kollektörü", "Çıkış Kollektörü", "Boru Patlağı", "Şekebe Patlağı", "RF Arızası", "GSM Arızası", "Röle Arızası", " " }));
        jPanel3.add(cmbArizacesidi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 150, 24));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Arızasnın İzahı");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        txtArizaizah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtArizaizah, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 150, 25));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Elektrik Arızası");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Arızanın İzahı");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        txtElektrikizah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtElektrikizah, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 150, 25));

        cmbElektrikArizasi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbElektrikArizasi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz ...", "Motor Yanık", "Auma Yanık", "Dalgıç Yanık", "Kuyu Yanık", "Elektrik Panosu Yanık", "AG Atık", "OG Atık", "YG Atık", "Kompanizasyon Panosu Arızalı", "Kumanda Panosu Arızalı", "Elektrik Panosunda Arıza Var", "Termik Arızalı", "Kondaktör Arızalı", "Röle Arızalı", "Şalter Arızalı", "Trafo Arızalı", "Trafo Ayarı", "Ayrıcı Kolu", "Cam Sigorta", "Seramik Sigorta", "Kablo Kopuğu", "Jeneratör Arızalı", "Biliinmiyor" }));
        jPanel3.add(cmbElektrikArizasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 150, 24));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Diğer");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        txtDiger.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtDiger, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 150, 25));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Gelen Arıza Kime Bildirildi");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 250, 10));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("İsim Soyisim");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        txtisimsoyisim2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtisimsoyisim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 150, 25));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Ünvanı");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        cmbUnvan1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbUnvan1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz ...", "Başkan", "Müdür", "Şef", "Personel", "Abone", "Muhtar", " " }));
        jPanel3.add(cmbUnvan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 150, 24));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Bildirme Tarihi");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        try {
            txtBildirimT.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##.####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtBildirimT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtBildirimT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 90, 25));

        cmbAtelye.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbAtelye.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seçiniz ...", "Pompa Atelyesi", "Sondaj Atelyesi", "Vana Atelyesi", "Elektrik Atelyesi", "İlgili Bölge", "Başkan", "Müdür", "Şey", "Diğer" }));
        jPanel3.add(cmbAtelye, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 150, 24));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Atelye");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 260, 10));

        try {
            txtSaat1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSaat1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtSaat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 60, 25));

        try {
            txtSaat2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSaat2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel3.add(txtSaat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 60, 25));

        txtAciklama.setColumns(20);
        txtAciklama.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAciklama.setRows(5);
        jScrollPane3.setViewportView(txtAciklama);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 260, 90));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Günün Notu :");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 110, 20));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 762, 260, 10));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 280, 910));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(900, 110));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnYenikayit.setBackground(new java.awt.Color(255, 255, 255));
        btnYenikayit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnYenikayit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yenikayit.png"))); // NOI18N
        btnYenikayit.setText("Yeni Kayıt");
        btnYenikayit.setToolTipText("Yeni Kayıt Açmak için Tıkla");
        btnYenikayit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 221, 245), 2, true));
        btnYenikayit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnYenikayit.setName(""); // NOI18N
        btnYenikayit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnYenikayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYenikayitActionPerformed(evt);
            }
        });
        jPanel4.add(btnYenikayit, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 10, 100, 80));

        btnKaydet.setBackground(new java.awt.Color(255, 255, 255));
        btnKaydet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKaydet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kaydet.png"))); // NOI18N
        btnKaydet.setText("Kaydet");
        btnKaydet.setToolTipText("Bilgileri Kaydetmek İçin Tıkla");
        btnKaydet.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 221, 245), 2, true));
        btnKaydet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKaydet.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });
        jPanel4.add(btnKaydet, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 90, 80));

        btnDuzenle.setBackground(new java.awt.Color(255, 255, 255));
        btnDuzenle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDuzenle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/duzenle.png"))); // NOI18N
        btnDuzenle.setText("Duzenle");
        btnDuzenle.setToolTipText("Veriyi Düzenlemek İçin Tıkla");
        btnDuzenle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 221, 245), 2, true));
        btnDuzenle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDuzenle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(btnDuzenle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 90, 80));

        btnReset.setBackground(new java.awt.Color(255, 255, 255));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setToolTipText("Girilen Verileeri Temizlemek İçin Tıkla");
        btnReset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 221, 245), 2, true));
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel4.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 90, 80));

        btnSil.setBackground(new java.awt.Color(255, 255, 255));
        btnSil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sil.png"))); // NOI18N
        btnSil.setText("Kayıt Sil");
        btnSil.setToolTipText("İşaretli Kaydı Silmek İçin Tıkla");
        btnSil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 221, 245), 2, true));
        btnSil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        jPanel4.add(btnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 90, 80));

        btnMeil.setBackground(new java.awt.Color(255, 255, 255));
        btnMeil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMeil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/meil.png"))); // NOI18N
        btnMeil.setText("@ Gönder");
        btnMeil.setToolTipText("E-Mail Gönder");
        btnMeil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 221, 245), 2, true));
        btnMeil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMeil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(btnMeil, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 90, 80));

        btnExcel.setBackground(new java.awt.Color(255, 255, 255));
        btnExcel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/excel.png"))); // NOI18N
        btnExcel.setText("Aktar");
        btnExcel.setToolTipText("Bilgiyi Excel'e Aktar");
        btnExcel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 221, 245), 2, true));
        btnExcel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(btnExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 90, 80));

        btnPrint.setBackground(new java.awt.Color(255, 255, 255));
        btnPrint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yazdir.png"))); // NOI18N
        btnPrint.setText("Çıktı Al");
        btnPrint.setToolTipText("İstenilen bilgiyi Çıktı Olarak Al");
        btnPrint.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(118, 221, 245), 2, true));
        btnPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel4.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 90, 80));

        btnKapat.setBackground(new java.awt.Color(255, 255, 255));
        btnKapat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKapat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kapat.png"))); // NOI18N
        btnKapat.setToolTipText("Çıkış Yapmak İçin Tıkla");
        btnKapat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 2, true));
        btnKapat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapatActionPerformed(evt);
            }
        });
        jPanel4.add(btnKapat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 90, 80));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 850, 1310, 110));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 0, 10, 1000));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtArizatarihiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArizatarihiActionPerformed
    // Devredışı.
    }//GEN-LAST:event_txtArizatarihiActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        ac();
        DefaultTableModel model;
       
        model = (DefaultTableModel) tblKayiıtListesi.getModel();
  
        model.addRow(new Object[]{ 
         
    txtSira.getText(),
    cmbilce.getSelectedItem(),
    txtmahalle.getText(),
    txtistasyon.getText(),
    txtisimsoyisim1.getText(),
    cmbUnvan1.getSelectedItem(),
    txtTelefon1.getText(),
    txtArizatarihi.getText(),
    txtSaat2.getText(),
    cmbArizacesidi.getSelectedItem(),
    txtArizaizah.getText(),
    cmbElektrikArizasi.getSelectedItem(),
    txtElektrikizah.getText(),
    txtDiger.getText(),
    txtisimsoyisim2.getText(),
    cmbUnvan2.getSelectedItem(),
    txtBildirimT.getText(),
    txtSaat1.getText(),
    cmbAtelye.getSelectedItem(),
    
        });
        
       kapat();

        
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapatActionPerformed

        if (JOptionPane.showConfirmDialog(null, "Program Kapanacak Emin misiniz ?", "Çıkış Yapılıyor",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
						System.exit(0);
                                }
    }//GEN-LAST:event_btnKapatActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    
        temizle();
    
        btnKaydet.setEnabled(false);
        btnReset.setEnabled(true);
        btnYenikayit.setEnabled(true);
        btnKapat.setEnabled(true);
        
        kapat();
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblKayiıtListesi.getModel();
       

       if(tblKayiıtListesi.getSelectedRow()==-1){
            if(tblKayiıtListesi.getRowCount()==0){
                
              JOptionPane.showMessageDialog(null, "Silme İşlemi", "Silmek İstediğinden Emin misin ?",
              JOptionPane.OK_OPTION);
            }else{
                JOptionPane.showMessageDialog(null, "Silmek İstediğin Satırı Seç", "Silme Hatası",
              JOptionPane.OK_OPTION);
            }
       }else {
                    model.removeRow(tblKayiıtListesi.getSelectedRow());
                    }
       kapat();
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnYenikayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenikayitActionPerformed

        ac();
        btnYenikayit.setEnabled(false);
        btnKaydet.setEnabled(true);
        btnReset.setEnabled(true);
        btnDuzenle.setEnabled(true);
        btnSil.setEnabled(true);
        
        ac();
        temizle();
        
    }//GEN-LAST:event_btnYenikayitActionPerformed

    public void temizle () {
        
        txtSira.setText("");
        cmbilce.setSelectedIndex(0);
        txtmahalle.setText("");
        txtistasyon.setText("");
        txtisimsoyisim1.setText("");
        cmbUnvan1.setSelectedIndex(0);
        txtTelefon1.setText("");
        txtArizatarihi.setText("");
        cmbArizacesidi.setSelectedIndex(0);
        txtSaat1.setText("");
        txtSaat2.setText("");
        txtArizaizah.setText("");
        cmbElektrikArizasi.setSelectedIndex(0);
        txtElektrikizah.setText("");
        txtDiger.setText("");
        txtisimsoyisim2.setText("");
        cmbUnvan2.setSelectedIndex(0);
        txtBildirimT.setText("");
        cmbAtelye.setSelectedIndex(0);
        
    }
   
    public void ac(){

        txtSira.setEditable(true);
        txtSira.setBackground(new java.awt.Color(255, 255, 255));
        cmbilce.setEditable(true);
        cmbilce.setBackground(new java.awt.Color(255, 255, 255));
        txtmahalle.setEditable(true);
        txtmahalle.setBackground(new java.awt.Color(255, 255, 255));
        txtistasyon.setEditable(true);
        txtistasyon.setBackground(new java.awt.Color(255, 255, 255));
        txtisimsoyisim1.setEditable(true);
        txtisimsoyisim1.setBackground(new java.awt.Color(255, 255, 255));
        cmbUnvan1.setEditable(true);
        cmbUnvan1.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefon1.setEditable(true);
        txtTelefon1.setBackground(new java.awt.Color(255, 255, 255));
        txtArizatarihi.setEditable(true);
        txtArizatarihi.setBackground(new java.awt.Color(255, 255, 255));
        txtSaat2.setEditable(true);
        txtSaat2.setBackground(new java.awt.Color(255, 255, 255));
        cmbArizacesidi.setEditable(true);
        cmbArizacesidi.setBackground(new java.awt.Color(255, 255, 255));
        txtArizaizah.setEditable(true);
        txtArizaizah.setBackground(new java.awt.Color(255, 255, 255));
        cmbElektrikArizasi.setEditable(true);
        cmbElektrikArizasi.setBackground(new java.awt.Color(255, 255, 255));
        txtElektrikizah.setEditable(true);
        txtElektrikizah.setBackground(new java.awt.Color(255, 255, 255));
        txtDiger.setEditable(true);
        txtDiger.setBackground(new java.awt.Color(255, 255, 255));
        txtisimsoyisim2.setEditable(true);
        txtisimsoyisim2.setBackground(new java.awt.Color(255, 255, 255));
        cmbUnvan2.setEditable(true);
        cmbUnvan2.setBackground(new java.awt.Color(255, 255, 255));
        txtBildirimT.setEditable(true);
        txtBildirimT.setBackground(new java.awt.Color(255, 255, 255));
        txtSaat1.setEditable(true);
        txtSaat1.setBackground(new java.awt.Color(255, 255, 255));
        cmbAtelye.setEditable(true);
        cmbAtelye.setBackground(new java.awt.Color(255, 255, 255));
                
    }
    
    public void kapat(){
     
        txtSira.setEditable(false);
        txtSira.setBackground(new java.awt.Color(204, 204, 204));
        cmbilce.setEditable(false);
        cmbilce.setBackground(new java.awt.Color(204, 204, 204));
        txtmahalle.setEditable(false);
        txtmahalle.setBackground(new java.awt.Color(204, 204, 204));
        txtistasyon.setEditable(false);
        txtistasyon.setBackground(new java.awt.Color(204, 204, 204));
        txtisimsoyisim1.setEditable(false);
        txtisimsoyisim1.setBackground(new java.awt.Color(204, 204, 204));
        cmbUnvan1.setEditable(false);
        cmbUnvan1.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefon1.setEditable(false);
        txtTelefon1.setBackground(new java.awt.Color(204, 204, 204));
        txtArizatarihi.setEditable(false);
        txtArizatarihi.setBackground(new java.awt.Color(204, 204, 204));
        txtSaat2.setEditable(false);
        txtSaat2.setBackground(new java.awt.Color(204, 204, 204));
        cmbArizacesidi.setEditable(false);
        cmbArizacesidi.setBackground(new java.awt.Color(204, 204, 204));
        txtArizaizah.setEditable(false);
        txtArizaizah.setBackground(new java.awt.Color(204, 204, 204));
        cmbElektrikArizasi.setEditable(false);
        cmbElektrikArizasi.setBackground(new java.awt.Color(204, 204, 204));
        txtElektrikizah.setEditable(false);
        txtElektrikizah.setBackground(new java.awt.Color(204, 204, 204));
        txtDiger.setEditable(false);
        txtDiger.setBackground(new java.awt.Color(204, 204, 204));
        txtisimsoyisim2.setEditable(false);
        txtisimsoyisim2.setBackground(new java.awt.Color(204, 204, 204));
        cmbUnvan2.setEditable(false);
        cmbUnvan2.setBackground(new java.awt.Color(204, 204, 204));
        txtBildirimT.setEditable(false);
        txtBildirimT.setBackground(new java.awt.Color(204, 204, 204));
        txtSaat1.setEditable(false);
        txtSaat1.setBackground(new java.awt.Color(204, 204, 204));
        cmbAtelye.setEditable(false);
        cmbAtelye.setBackground(new java.awt.Color(204, 204, 204));
        
    }
    
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
            java.util.logging.Logger.getLogger(frmArizaKayitTakipSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmArizaKayitTakipSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmArizaKayitTakipSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmArizaKayitTakipSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmArizaKayitTakipSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBul;
    private javax.swing.JButton btnDuzenle;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnKapat;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnMeil;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnYenikayit;
    private javax.swing.JComboBox cmbArizacesidi;
    private javax.swing.JComboBox cmbAtelye;
    private javax.swing.JComboBox cmbElektrikArizasi;
    private javax.swing.JComboBox cmbUnvan1;
    private javax.swing.JComboBox cmbUnvan2;
    private javax.swing.JComboBox cmbilce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tblKayiıtListesi;
    private javax.swing.JTextArea txtAciklama;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtArizaizah;
    private javax.swing.JFormattedTextField txtArizatarihi;
    private javax.swing.JFormattedTextField txtBildirimT;
    private javax.swing.JTextField txtDiger;
    private javax.swing.JTextField txtElektrikizah;
    private javax.swing.JFormattedTextField txtSaat1;
    private javax.swing.JFormattedTextField txtSaat2;
    private javax.swing.JTextField txtSira;
    private javax.swing.JFormattedTextField txtTelefon1;
    private javax.swing.JTextField txtisimsoyisim1;
    private javax.swing.JTextField txtisimsoyisim2;
    private javax.swing.JTextField txtistasyon;
    private javax.swing.JTextField txtmahalle;
    // End of variables declaration//GEN-END:variables

//    private void setIcon() {
//       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Systemicon.png")));
//    }
    
}
