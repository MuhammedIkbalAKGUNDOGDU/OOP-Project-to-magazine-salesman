package nypDonemProjesi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.Box;
import javax.swing.JDesktopPane;
import javax.swing.JTabbedPane;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class distributorMain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCvv;
	private JTextField txtName;
	private JTextField txtCreditcardnr;
	private JTextField txtMonth;
	private JTextField txtYear;
	private JTextField txtMiktar;
	private JTextField textField;
	private JTextField bankName;
	private JTextField txtBankcode;
	private JTextField txtIssueday;
	private JTextField txtIssumonth;
	private JTextField txtOdememiktari;
	private JTextField txtIssueyear;
	private JTextField txtKurumadi;
	private JTextField textFieldad;
	private JTextField textFieldissn;
	private JTextField textFieldfreq;
	private JTextField textFieldprice;
	private JTextField text_fieldissnfound;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					distributorMain frame = new distributorMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public distributorMain() {
		Distributor distributor = new Distributor();
		distributor.loadState();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		Panel anaekran = new Panel();
		contentPane.add(anaekran, "name_331505121763000");
		anaekran.setLayout(null);
		
		JTextArea txtrHogeldiniz = new JTextArea();
		txtrHogeldiniz.setToolTipText(" ");
		txtrHogeldiniz.setText("HOŞGELDİNİZ");
		Font font = new Font("Arial", Font.BOLD, 16);
		txtrHogeldiniz.setFont(new Font("Arial", Font.BOLD, 28));
		txtrHogeldiniz.setBounds(218, 35, 196, 38);
		anaekran.add(txtrHogeldiniz);
		
		JTextArea txtrLtfenGiriYapn = new JTextArea();
		txtrLtfenGiriYapn.setToolTipText(" ");
		txtrLtfenGiriYapn.setText("LÜTFEN GİRİŞ TÜRÜNÜ SEÇİN");
		txtrLtfenGiriYapn.setFont(new Font("Arial", Font.BOLD, 28));
		txtrLtfenGiriYapn.setBounds(112, 84, 421, 38);
		anaekran.add(txtrLtfenGiriYapn);
		
		JTextArea txtrBireyselGiri = new JTextArea();
		txtrBireyselGiri.setToolTipText(" ");
		txtrBireyselGiri.setText("ÖDEME YAP");
		txtrBireyselGiri.setFont(new Font("Arial", Font.BOLD, 15));
		txtrBireyselGiri.setBounds(81, 256, 132, 23);
		anaekran.add(txtrBireyselGiri);
		
		JTextArea txtrBireyselGiri_1_1 = new JTextArea();
		txtrBireyselGiri_1_1.setToolTipText(" ");
		txtrBireyselGiri_1_1.setText("DİSTİRBİTÖR GİRİŞİ");
		txtrBireyselGiri_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		txtrBireyselGiri_1_1.setBounds(81, 181, 152, 23);
		anaekran.add(txtrBireyselGiri_1_1);
		
		JButton btndeme = new JButton("ÖDEME");
		btndeme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
                cardLayout.show(contentPane, "name_331512384480600");
				
			} 
		});
		btndeme.setBounds(266, 257, 89, 23);
		anaekran.add(btndeme); 
		
		JButton btnGiri = new JButton("GİRİŞ");
		btnGiri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			CardLayout cardLayout = (CardLayout) contentPane.getLayout();
            cardLayout.show(contentPane, "name_331545864608200");
			}
		});
		btnGiri.setBounds(266, 181, 89, 23);
		anaekran.add(btnGiri);
		
		Panel odeme = new Panel();
		contentPane.add(odeme, "name_331512384480600");
		odeme.setLayout(null);

		Panel panel = new Panel();
		panel.setBounds(10, 63, 519, 338);
		odeme.add(panel);
		
		panel.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("DÖN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
	            cardLayout.show(contentPane, "name_331505121763000");
			}
		});
		btnNewButton_1.setBounds(575, 417, 89, 23);
		odeme.add(btnNewButton_1);
		
		JTextArea txtrBireyselGiri_1_1_1 = new JTextArea();
		txtrBireyselGiri_1_1_1.setToolTipText(" ");
		txtrBireyselGiri_1_1_1.setText("MENÜYE DÖN");
		txtrBireyselGiri_1_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		txtrBireyselGiri_1_1_1.setBounds(556, 395, 108, 23);
		odeme.add(txtrBireyselGiri_1_1_1);
		Panel panel_1 = new Panel();
		panel.add(panel_1, "name_336661513771900");
		
		Panel bireysel = new Panel();
		bireysel.setBounds(10, 63, 519, 338);
		panel.add(bireysel,"bireysel");
		bireysel.setLayout(null);
		
		txtCvv = new JTextField();
		txtCvv.setBounds(10, 160, 86, 20);
		txtCvv.setToolTipText("");
		txtCvv.setHorizontalAlignment(SwingConstants.CENTER);
		bireysel.add(txtCvv);
		txtCvv.setColumns(10);
		
		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setBounds(10, 34, 86, 20);
		bireysel.add(txtName);
		txtName.setColumns(10);
		
		txtCreditcardnr = new JTextField();
		txtCreditcardnr.setHorizontalAlignment(SwingConstants.CENTER);
		txtCreditcardnr.setBounds(10, 80, 187, 20);
		bireysel.add(txtCreditcardnr);
		txtCreditcardnr.setColumns(10);
		
		txtMonth = new JTextField();
		txtMonth.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonth.setBounds(10, 120, 86, 20);
		bireysel.add(txtMonth);
		txtMonth.setColumns(10);
		
		txtYear = new JTextField();
		txtYear.setHorizontalAlignment(SwingConstants.CENTER);
		txtYear.setBounds(126, 120, 71, 20);
		bireysel.add(txtYear);
		txtYear.setColumns(10);
		
		txtMiktar = new JTextField();
		txtMiktar.setHorizontalAlignment(SwingConstants.CENTER);
		txtMiktar.setBounds(10, 200, 86, 20);
		bireysel.add(txtMiktar);
		txtMiktar.setColumns(10);
		
		JTextArea txtrBireyselGiri_1_1_1_2 = new JTextArea();
		txtrBireyselGiri_1_1_1_2.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2.setText("isim");
		txtrBireyselGiri_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2.setBounds(10, 21, 108, 16);
		bireysel.add(txtrBireyselGiri_1_1_1_2);
		
		JTextArea txtrBireyselGiri_1_1_1_2_1 = new JTextArea();
		txtrBireyselGiri_1_1_1_2_1.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2_1.setText("Kredi Kartı Numarası");
		txtrBireyselGiri_1_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2_1.setBounds(10, 65, 108, 16);
		bireysel.add(txtrBireyselGiri_1_1_1_2_1);
		
		JTextArea txtrBireyselGiri_1_1_1_2_2 = new JTextArea();
		txtrBireyselGiri_1_1_1_2_2.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2_2.setText("Son Ay");
		txtrBireyselGiri_1_1_1_2_2.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2_2.setBounds(10, 103, 108, 16);
		bireysel.add(txtrBireyselGiri_1_1_1_2_2);
		
		JTextArea txtrBireyselGiri_1_1_1_2_3 = new JTextArea();
		txtrBireyselGiri_1_1_1_2_3.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2_3.setText("Son Yıl");
		txtrBireyselGiri_1_1_1_2_3.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2_3.setBounds(124, 103, 108, 16);
		bireysel.add(txtrBireyselGiri_1_1_1_2_3);
		
		JTextArea txtrBireyselGiri_1_1_1_2_4 = new JTextArea();
		txtrBireyselGiri_1_1_1_2_4.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2_4.setText("CVV");
		txtrBireyselGiri_1_1_1_2_4.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2_4.setBounds(10, 144, 108, 16);
		bireysel.add(txtrBireyselGiri_1_1_1_2_4);
		
		JTextArea txtrBireyselGiri_1_1_1_2_5 = new JTextArea();
		txtrBireyselGiri_1_1_1_2_5.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2_5.setText("Ödeme miktarı");
		txtrBireyselGiri_1_1_1_2_5.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2_5.setBounds(10, 185, 108, 16);
		bireysel.add(txtrBireyselGiri_1_1_1_2_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(161, 308, 137, 16);
		bireysel.add(textArea);
		
		JButton btnNewButton_2_1 = new JButton("Ödeme Yap");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int flag=0;
				for(Journal journal : distributor.journals.values()) {
					for(Subscription subscription : journal.subscriptions) {
						System.out.println(txtCreditcardnr.getText());
						if(txtName.getText().equals(subscription.subscriber.getName())) {
							String as = txtCreditcardnr.getText()+txtMonth.getText()+txtYear.getText()+txtCvv.getText();
							 if(subscription.subscriber.getBillingInformation().equals(as)) {
								 subscription.acceptPayment(Integer.parseInt(txtMiktar.getText()));
								 System.out.println("odeme alindi");
								 distributor.saveState();
								 textArea.setText("Odeme alindi");
								 flag=1;
							 }else {//hatalı kart bilgileri
								 if(flag!=1) {
									 System.out.println("hatali kart");
									 textArea.setText("Hatali Kart");
									 flag=1;
								 }
								
							 }
						}else {//kullanici bulunamadi
							if(flag!=1) {
								System.out.println("kullanici yok");
								textArea.setText("Hatali Kullanıcı");
							}
						}
					}
				}
				
			}
		});
		btnNewButton_2_1.setBounds(359, 304, 137, 23);
		bireysel.add(btnNewButton_2_1);
		
		
		
		Panel kurumsal = new Panel();
		kurumsal.setBounds(10, 63, 519, 338);
		panel.add(kurumsal,"kurumsal");
		kurumsal.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(22, 172, 86, 20);
		kurumsal.add(textField);
		
		bankName = new JTextField();
		bankName.setHorizontalAlignment(SwingConstants.CENTER);
		bankName.setColumns(10);
		bankName.setBounds(22, 46, 86, 20);
		kurumsal.add(bankName);
		
		txtBankcode = new JTextField();
		txtBankcode.setHorizontalAlignment(SwingConstants.CENTER);
		txtBankcode.setColumns(10);
		txtBankcode.setBounds(22, 92, 187, 20);
		kurumsal.add(txtBankcode);
		
		txtIssueday = new JTextField();
		txtIssueday.setHorizontalAlignment(SwingConstants.CENTER);
		txtIssueday.setColumns(10);
		txtIssueday.setBounds(22, 132, 86, 20);
		kurumsal.add(txtIssueday);
		
		txtIssumonth = new JTextField();
		txtIssumonth.setHorizontalAlignment(SwingConstants.CENTER);
		txtIssumonth.setColumns(10);
		txtIssumonth.setBounds(138, 132, 71, 20);
		kurumsal.add(txtIssumonth);
		
		txtOdememiktari = new JTextField();
		txtOdememiktari.setHorizontalAlignment(SwingConstants.CENTER);
		txtOdememiktari.setColumns(10);
		txtOdememiktari.setBounds(22, 212, 86, 20);
		kurumsal.add(txtOdememiktari);
		
		JTextArea BankName = new JTextArea();
		BankName.setToolTipText(" ");
		BankName.setText("Banka adı");
		BankName.setFont(new Font("Arial", Font.BOLD, 9));
		BankName.setBounds(22, 33, 108, 16);
		kurumsal.add(BankName);
		
		JTextArea txtrBireyselGiri_1_1_1_2_1_1 = new JTextArea();
		txtrBireyselGiri_1_1_1_2_1_1.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2_1_1.setText("Banka Kodu");
		txtrBireyselGiri_1_1_1_2_1_1.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2_1_1.setBounds(22, 77, 108, 16);
		kurumsal.add(txtrBireyselGiri_1_1_1_2_1_1);
		
		JTextArea txtrBireyselGiri_1_1_1_2_2_1 = new JTextArea();
		txtrBireyselGiri_1_1_1_2_2_1.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2_2_1.setText("Gün");
		txtrBireyselGiri_1_1_1_2_2_1.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2_2_1.setBounds(22, 115, 108, 16);
		kurumsal.add(txtrBireyselGiri_1_1_1_2_2_1);
		
		JTextArea txtrBireyselGiri_1_1_1_2_3_1 = new JTextArea();
		txtrBireyselGiri_1_1_1_2_3_1.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2_3_1.setText("Ay");
		txtrBireyselGiri_1_1_1_2_3_1.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2_3_1.setBounds(136, 115, 108, 16);
		kurumsal.add(txtrBireyselGiri_1_1_1_2_3_1);
		
		JTextArea txtrBireyselGiri_1_1_1_2_4_1 = new JTextArea();
		txtrBireyselGiri_1_1_1_2_4_1.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2_4_1.setText("Hesap Numarası");
		txtrBireyselGiri_1_1_1_2_4_1.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2_4_1.setBounds(22, 156, 108, 16);
		kurumsal.add(txtrBireyselGiri_1_1_1_2_4_1);
		
		JTextArea txtrBireyselGiri_1_1_1_2_5_1 = new JTextArea();
		txtrBireyselGiri_1_1_1_2_5_1.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2_5_1.setText("Ödeme miktarı");
		txtrBireyselGiri_1_1_1_2_5_1.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2_5_1.setBounds(22, 197, 108, 16);
		kurumsal.add(txtrBireyselGiri_1_1_1_2_5_1);
		
		txtIssueyear = new JTextField();
		txtIssueyear.setHorizontalAlignment(SwingConstants.CENTER);
		txtIssueyear.setColumns(10);
		txtIssueyear.setBounds(254, 132, 71, 20);
		kurumsal.add(txtIssueyear);
		
		JTextArea txtrBireyselGiri_1_1_1_2_3_1_1 = new JTextArea();
		txtrBireyselGiri_1_1_1_2_3_1_1.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_2_3_1_1.setText("Yıl");
		txtrBireyselGiri_1_1_1_2_3_1_1.setFont(new Font("Arial", Font.BOLD, 9));
		txtrBireyselGiri_1_1_1_2_3_1_1.setBounds(252, 115, 108, 16);
		kurumsal.add(txtrBireyselGiri_1_1_1_2_3_1_1);
		
		JTextArea txtrKurumAd = new JTextArea();
		txtrKurumAd.setToolTipText(" ");
		txtrKurumAd.setText("Kurum Adı");
		txtrKurumAd.setFont(new Font("Arial", Font.BOLD, 9));
		txtrKurumAd.setBounds(170, 33, 108, 12);
		kurumsal.add(txtrKurumAd);
		
		txtKurumadi = new JTextField();
		txtKurumadi.setHorizontalAlignment(SwingConstants.CENTER);
		txtKurumadi.setColumns(10);
		txtKurumadi.setBounds(170, 46, 86, 20);
		kurumsal.add(txtKurumadi);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(187, 308, 137, 16);
		kurumsal.add(textArea_1);
		
		JButton btnNewButton_2 = new JButton("Ödeme Yap");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int flag=0;
				
				for(Journal journal : distributor.journals.values()) {
					for(Subscription subscription : journal.subscriptions) {
						System.out.println(txtCreditcardnr.getText());
						if(txtKurumadi.getText().equals(subscription.subscriber.getName())) {
							String as = txtBankcode.getText()+bankName.getText()+textField.getText()+txtIssueday.getText()+txtIssumonth.getText()+txtIssueyear.getText();
							System.out.println(as); 
							System.out.println(subscription.subscriber.getBillingInformation());
							System.out.println(bankName.getText());
							 if(subscription.subscriber.getBillingInformation().equals(as)) {
								 subscription.acceptPayment(Integer.parseInt(txtOdememiktari.getText()));
								 System.out.println("odeme alindi");
								 distributor.saveState();
								 textArea_1.setText("Odeme alindi");
								 flag=1;
							 }else {//hatalı kart bilgileri
								 if(flag!=1) {
									 System.out.println("hatali kart");
									 textArea_1.setText("Hatali Çek");
									 flag=1;
								 }
							 }
						}else {//kullanici bulunamadi
							if(flag!=1) {
								System.out.println("kullanici yok");
								textArea_1.setText("Hatali Kurum");
							}
						}
					}
				}
			}
		});
		btnNewButton_2.setBounds(356, 304, 127, 23);
		kurumsal.add(btnNewButton_2);
		
		
		
		JButton btnNewButton = new JButton("Bireysel Ödeme");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 CardLayout cardLayout = (CardLayout) panel.getLayout();
			      cardLayout.show(panel, "bireysel");
				
			}
		});
		btnNewButton.setBounds(71, 23, 133, 23);
		odeme.add(btnNewButton);
		
		JButton btnKurumsaldeme = new JButton("Kurumsal Ödeme");
		btnKurumsaldeme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) panel.getLayout();
			      cardLayout.show(panel, "kurumsal");
			}
		});
		btnKurumsaldeme.setBounds(267, 23, 133, 23);
		odeme.add(btnKurumsaldeme);
		
		Panel giris = new Panel();
		contentPane.add(giris, "name_331545864608200");
		giris.setLayout(null);
		
		JTextArea txtrBireyselGiri_1_1_1_1 = new JTextArea();
		txtrBireyselGiri_1_1_1_1.setBounds(556, 395, 108, 23);
		txtrBireyselGiri_1_1_1_1.setToolTipText(" ");
		txtrBireyselGiri_1_1_1_1.setText("MENÜYE DÖN");
		txtrBireyselGiri_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 15));
		giris.add(txtrBireyselGiri_1_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("DÖN");
		btnNewButton_1_1.setBounds(575, 417, 89, 23);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) contentPane.getLayout();
	            cardLayout.show(contentPane, "name_331505121763000");
			}
		});
		giris.add(btnNewButton_1_1);
		
		Panel panel_2 = new Panel();
		panel_2.setBounds(150, 50, 493, 341);
		giris.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		Panel dergi = new Panel();
		panel_2.add(dergi, "name_347467453875400");
		dergi.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DERGİ ADI");
		lblNewLabel.setBounds(53, 24, 59, 14);
		dergi.add(lblNewLabel);
		
		JLabel lblIssn = new JLabel("ISSN");
		lblIssn.setBounds(53, 49, 59, 14);
		dergi.add(lblIssn);
		
		JLabel lblSklk = new JLabel("SIKLIK");
		lblSklk.setBounds(53, 74, 59, 14);
		dergi.add(lblSklk);
		
		JLabel lblBirimcret = new JLabel("Birim Ücret:");
		lblBirimcret.setBounds(53, 99, 59, 14);
		dergi.add(lblBirimcret);
		
		textFieldad = new JTextField();
		textFieldad.setBounds(115, 21, 86, 20);
		dergi.add(textFieldad);
		textFieldad.setColumns(10);
		
		textFieldissn = new JTextField();
		textFieldissn.setColumns(10);
		textFieldissn.setBounds(115, 49, 86, 20);
		dergi.add(textFieldissn);
		
		textFieldfreq = new JTextField();
		textFieldfreq.setColumns(10);
		textFieldfreq.setBounds(115, 74, 86, 20);
		dergi.add(textFieldfreq);
		
		textFieldprice = new JTextField();
		textFieldprice.setColumns(10);
		textFieldprice.setBounds(115, 99, 86, 20);
		dergi.add(textFieldprice);
		JLabel journaladdedinfo = new JLabel("");
		journaladdedinfo.setBounds(53, 209, 148, 49);
		dergi.add(journaladdedinfo);
		JButton btnNewButton_ekle = new JButton("EKLE");
		btnNewButton_ekle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Journal journal = new Journal();
				journal.setName(textFieldad.getText());
				journal.setFrequency(Integer.parseInt(textFieldfreq.getText()));
				journal.setIssn(textFieldissn.getText());
				journal.setIssuePrice(Double.parseDouble(textFieldprice.getText()));
				boolean flag = distributor.addJournal(journal);
				if(flag) {
					journaladdedinfo.setText("Dergi eklendi");
					distributor.saveState();
				}else {
					journaladdedinfo.setText("Dergi eklenemedi");
				}
			}
		});
		btnNewButton_ekle.setBounds(112, 143, 89, 23);
		dergi.add(btnNewButton_ekle);
		
		JLabel journalfounded = new JLabel("");
		journalfounded.setBounds(211, 99, 272, 49);
		dergi.add(journalfounded);
		
		JButton btnNewButton_ara = new JButton("ARA");
		btnNewButton_ara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Journal journal =distributor.searchJournal(text_fieldissnfound.getText());
					if(journal != null) {
						journalfounded.setText("Journal Name :"+journal.getName()+" Price : "+journal.getIssuePrice());
					}else {
						journalfounded.setText("Journal Can Not Found");
					}
					
			}
		});
		btnNewButton_ara.setBounds(340, 49, 89, 23);
		dergi.add(btnNewButton_ara);
		
		JLabel lblIssn_1 = new JLabel("ISSN : ");
		lblIssn_1.setBounds(291, 24, 59, 14);
		dergi.add(lblIssn_1);
		
		text_fieldissnfound = new JTextField();
		text_fieldissnfound.setColumns(10);
		text_fieldissnfound.setBounds(340, 24, 86, 20);
		dergi.add(text_fieldissnfound);
		
		Panel abone = new Panel();
		panel_2.add(abone, "name_347467463865200");
		abone.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("İsim");
		lblNewLabel_1.setBounds(10, 14, 59, 14);
		abone.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(88, 11, 86, 20);
		abone.add(textField_1);
		
		JLabel lblIssn_2 = new JLabel("Adres");
		lblIssn_2.setBounds(10, 39, 59, 14);
		abone.add(lblIssn_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(88, 39, 86, 20);
		abone.add(textField_2);
		
		JLabel lblSklk_1 = new JLabel("Kredi Kart No");
		lblSklk_1.setBounds(10, 64, 97, 14);
		abone.add(lblSklk_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(88, 64, 86, 20);
		abone.add(textField_3);
		
		JLabel lblBirimcret_1 = new JLabel("Son ay");
		lblBirimcret_1.setBounds(10, 89, 59, 14);
		abone.add(lblBirimcret_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(88, 89, 86, 20);
		abone.add(textField_4);
		
		JLabel aboneislemsonuc = new JLabel("");
		aboneislemsonuc.setBounds(264, 267, 229, 63);
		abone.add(aboneislemsonuc);
		
		JButton btnNewButton_ekle_1 = new JButton("EKLE");
		btnNewButton_ekle_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Individual subscriber = new Individual(textField_1.getText(), textField_2.getText());
				subscriber.setCCV(Integer.parseInt(textField_7.getText()));
				subscriber.setCreditCardNr(textField_3.getText());
				subscriber.setExpireMonth(Integer.parseInt(textField_4.getText()));
				subscriber.setExpireYear(Integer.parseInt(textField_6.getText()));
				boolean flag = distributor.addSubscriber(subscriber);
				if(flag) {
					aboneislemsonuc.setText("Abone eklendi");
					distributor.saveState();
				}else {
					aboneislemsonuc.setText("Abone eklenemedi");
				}
			}
		});
		btnNewButton_ekle_1.setBounds(88, 178, 89, 23);
		abone.add(btnNewButton_ekle_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(59, 282, 86, 20);
		abone.add(textField_5);
		
		JButton btnNewButton_ara_1 = new JButton("ARA");
		btnNewButton_ara_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(distributor.searchSubscriber(textField_5.getText()) != null)
				{
					String name = distributor.searchSubscriber(textField_5.getText()).getName();
					aboneislemsonuc.setText(name+" Found");
					
				}else {
					aboneislemsonuc.setText("Not Found");
				}
			}
		});
		btnNewButton_ara_1.setBounds(59, 307, 89, 23);
		abone.add(btnNewButton_ara_1);
		
		
		
		JLabel lblIssn_1_1 = new JLabel(" Abone Adı");
		lblIssn_1_1.setBounds(0, 282, 69, 14);
		abone.add(lblIssn_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(88, 114, 86, 20);
		abone.add(textField_6);
		
		JLabel lblBirimcret_1_1 = new JLabel("Son yıl");
		lblBirimcret_1_1.setBounds(10, 114, 59, 14);
		abone.add(lblBirimcret_1_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(88, 145, 86, 20);
		abone.add(textField_7);
		
		JLabel lblBirimcret_1_2 = new JLabel("CVV");
		lblBirimcret_1_2.setBounds(10, 145, 59, 14);
		abone.add(lblBirimcret_1_2);
		
		JLabel lblBirimcret_1_2_1 = new JLabel("Son Yıl");
		lblBirimcret_1_2_1.setBounds(265, 145, 59, 14);
		abone.add(lblBirimcret_1_2_1);
		
		JButton btnNewButton_ekle_1_1 = new JButton("EKLE");
		btnNewButton_ekle_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Corporation corporation = new Corporation(textField_13.getText(), textField_12.getText(), textField_21.getText(), Integer.parseInt(textField_11.getText()), Integer.parseInt(textField_14.getText()), Integer.parseInt(textField_10.getText()), Integer.parseInt(textField_9.getText()), Integer.parseInt(textField_8.getText()));
				boolean flag =distributor.addSubscriber(corporation);
				if(flag) {
					aboneislemsonuc.setText("Kurum Kaydı Eklendi");
					distributor.saveState();
				}else {
					aboneislemsonuc.setText("Kurum Kaydı Eklenemedi !!!");
				}
			}
		});
		btnNewButton_ekle_1_1.setBounds(379, 229, 89, 23);
		abone.add(btnNewButton_ekle_1_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(379, 145, 86, 20);
		abone.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(379, 114, 86, 20);
		abone.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(379, 89, 86, 20);
		abone.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(379, 64, 86, 20);
		abone.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(379, 39, 86, 20);
		abone.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(379, 11, 86, 20);
		abone.add(textField_13);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kurum Adı");
		lblNewLabel_1_1.setBounds(265, 14, 59, 14);
		abone.add(lblNewLabel_1_1);
		
		JLabel lblIssn_2_1 = new JLabel("Adres");
		lblIssn_2_1.setBounds(265, 39, 59, 14);
		abone.add(lblIssn_2_1);
		
		JLabel lblSklk_1_1 = new JLabel("Banka Kodu ");
		lblSklk_1_1.setBounds(265, 64, 97, 14);
		abone.add(lblSklk_1_1);
		
		JLabel lblBirimcret_1_3 = new JLabel("Son Gün");
		lblBirimcret_1_3.setBounds(265, 89, 59, 14);
		abone.add(lblBirimcret_1_3);
		
		JLabel lblBirimcret_1_1_1 = new JLabel("Son ay");
		lblBirimcret_1_1_1.setBounds(265, 114, 59, 14);
		abone.add(lblBirimcret_1_1_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(379, 178, 86, 20);
		abone.add(textField_14);
		
		JLabel lblBirimcret_1_2_1_1 = new JLabel("Hesap Numarası");
		lblBirimcret_1_2_1_1.setBounds(265, 178, 97, 14);
		abone.add(lblBirimcret_1_2_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Banka adı");
		lblNewLabel_1_2.setBounds(265, 212, 59, 14);
		abone.add(lblNewLabel_1_2);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(379, 209, 86, 20);
		abone.add(textField_21);
		
		Panel aboneekle = new Panel();
		panel_2.add(aboneekle, "name_347721234305900");
		aboneekle.setLayout(null);
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setBounds(322, 265, 161, 31);
		aboneekle.add(lblNewLabel_2_3);
		JButton btnNewButton_3 = new JButton("ABONELİK EKLE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DateInfo dateInfo = new DateInfo(Integer.parseInt(textField_15.getText()), Integer.parseInt(textField_16.getText()), Integer.parseInt(textField_17.getText()));
				Subscription subscription = new Subscription(Integer.parseInt(textField_18.getText()), dateInfo, distributor.searchSubscriber(textField_20.getText()), distributor.searchJournal(textField_19.getText()));
				boolean flag =distributor.addSubscription(distributor.searchJournal(textField_19.getText()).getIssn(), distributor.searchSubscriber(textField_20.getText()), subscription);
				if(flag) {
					lblNewLabel_2_3.setText("Abonelik eklendi");
					distributor.saveState();
				}else {
					lblNewLabel_2_3.setText("Abonelik eklenemedi !!!");
				}
			}
		});
		btnNewButton_3.setBounds(308, 307, 175, 23);
		aboneekle.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("İlk Ay");
		lblNewLabel_2.setBounds(10, 11, 46, 14);
		aboneekle.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Son Ay");
		lblNewLabel_2_1.setBounds(10, 36, 46, 14);
		aboneekle.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Başlangıç Yıl");
		lblNewLabel_2_2.setBounds(10, 61, 80, 14);
		aboneekle.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Kopya Sayısı");
		lblNewLabel_2_2_1.setBounds(10, 86, 80, 14);
		aboneekle.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Dergi ISSN");
		lblNewLabel_2_2_2.setBounds(10, 111, 80, 14);
		aboneekle.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Kullanıcı ");
		lblNewLabel_2_2_2_1.setBounds(10, 136, 80, 14);
		aboneekle.add(lblNewLabel_2_2_2_1);
		
		textField_15 = new JTextField();
		textField_15.setBounds(81, 8, 86, 20);
		aboneekle.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(81, 33, 86, 20);
		aboneekle.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(81, 58, 86, 20);
		aboneekle.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(81, 80, 86, 20);
		aboneekle.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(81, 105, 86, 20);
		aboneekle.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(81, 130, 86, 20);
		aboneekle.add(textField_20);
		
		
		
		Panel listele = new Panel();
		panel_2.add(listele, "name_347724237822000");
		listele.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("ListAllSnedingOrders");
		lblNewLabel_3.setBounds(10, 11, 105, 14);
		listele.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("ListSendingOrders");
		lblNewLabel_3_1.setBounds(10, 36, 105, 14);
		listele.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("ListIncompletePayments");
		lblNewLabel_3_2.setBounds(10, 59, 118, 14);
		listele.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("ListSubscriptions");
		lblNewLabel_3_3.setBounds(10, 84, 118, 14);
		listele.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("ListSubscriptions");
		lblNewLabel_3_4.setBounds(10, 109, 118, 14);
		listele.add(lblNewLabel_3_4);
		
		JButton btnNewButton_4 = new JButton("Progress");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				distributor.listAllSendingOrders(Integer.parseInt(textField_24.getText()), Integer.parseInt(textField_25.getText()));
			}
		});
		btnNewButton_4.setBounds(362, 7, 89, 23);
		listele.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("Progress");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				distributor.listSendingOrders(textField_26.getText(), Integer.parseInt(textField_27.getText()), Integer.parseInt(textField_28.getText()));
			}
		});
		btnNewButton_4_1.setBounds(362, 32, 89, 23);
		listele.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("Progress");
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				distributor.listInCompletePayments();
			}
		});
		btnNewButton_4_2.setBounds(362, 55, 89, 23);
		listele.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_3 = new JButton("Progress");
		btnNewButton_4_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				distributor.listSubscriptionsByName(textField_23.getText());
			}
		});
		btnNewButton_4_3.setBounds(362, 80, 89, 23);
		listele.add(btnNewButton_4_3);
		
		JButton btnNewButton_4_4 = new JButton("Progress");
		btnNewButton_4_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				distributor.listSubscriptionsByIssn(textField_22.getText());
			}
		});
		btnNewButton_4_4.setBounds(362, 105, 89, 23);
		listele.add(btnNewButton_4_4);
		
		textField_22 = new JTextField();
		textField_22.setBounds(214, 106, 39, 20);
		listele.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(263, 81, 39, 20);
		listele.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(184, 8, 39, 20);
		listele.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(288, 8, 39, 20);
		listele.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(164, 33, 39, 20);
		listele.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(243, 33, 39, 20);
		listele.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(313, 33, 39, 20);
		listele.add(textField_28);
		
		JLabel lblNewLabel_4 = new JLabel("You Can Look Results In Console");
		lblNewLabel_4.setBounds(10, 134, 317, 14);
		listele.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Month :");
		lblNewLabel_5.setBounds(125, 11, 46, 14);
		listele.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Year :");
		lblNewLabel_5_1.setBounds(233, 11, 46, 14);
		listele.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Month :");
		lblNewLabel_5_2.setBounds(204, 36, 39, 14);
		listele.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Year :");
		lblNewLabel_5_1_1.setBounds(281, 36, 29, 14);
		listele.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("ISSN:");
		lblNewLabel_5_2_1.setBounds(125, 36, 39, 14);
		listele.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_2_1_1 = new JLabel("ISSN:");
		lblNewLabel_5_2_1_1.setBounds(165, 109, 39, 14);
		listele.add(lblNewLabel_5_2_1_1);
		
		JLabel lblNewLabel_5_2_1_2 = new JLabel("Subscriber Name :");
		lblNewLabel_5_2_1_2.setBounds(138, 84, 115, 14);
		listele.add(lblNewLabel_5_2_1_2);
		
		JButton btndergi = new JButton("Dergi İşlemleri");
		btndergi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) panel_2.getLayout();
	            cardLayout.show(panel_2, "name_347467453875400");
			}
		});
		btndergi.setBounds(10, 50, 134, 23);
		giris.add(btndergi);
		
		JButton btnabone = new JButton("Abone İşlemleri"); //name_347467463865200
		btnabone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) panel_2.getLayout();
	            cardLayout.show(panel_2, "name_347467463865200");
			}
		});
		btnabone.setBounds(10, 84, 134, 23);
		giris.add(btnabone);
		
		JButton btnabonelik = new JButton("Abonelik ekle"); //name_347721234305900
		btnabonelik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) panel_2.getLayout();
	            cardLayout.show(panel_2, "name_347721234305900");
			}
		});
		btnabonelik.setBounds(10, 118, 134, 23);
		giris.add(btnabonelik);
		
		JButton btnlistele = new JButton("Listeleme işlemleri"); //name_347724237822000
		btnlistele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout = (CardLayout) panel_2.getLayout();
	            cardLayout.show(panel_2, "name_347724237822000");
			}
		});
		btnlistele.setBounds(10, 152, 134, 23);
		giris.add(btnlistele);
	}
}
