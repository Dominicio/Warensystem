package IMT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.*;
import java.util.Scanner;
import java.util.UUID;

import static javax.swing.JOptionPane.showMessageDialog;

public class graphische extends Main {
    static Scanner sc=new Scanner(System.in);

    private JComboBox<String> auswahloptionen;
    private JButton auswahlButton;
    private JButton jBtnSelection=new JButton("Selection");


    public static int getBaumi() {
        return Baumi;
    }

    public static void setBaumi(int baumi) {
        Baumi=baumi;
    }


    public static String getBaumi2() {
        return Baumi2;
    }

    public static void setBaumi2(String baumi2) {
        Baumi2=baumi2;
    }

    public static int getBaumi3() {
        return Baumi3;
    }

    public static void setBaumi3(int baumi3) {
        Baumi3=baumi3;
    }

    public static double getBaumi4() {
        return Baumi4;
    }

    public static void setBaumi4(double baumi4) {
        Baumi4=baumi4;
    }
    static int Baumi;
    static String Baumi2;
    static int Baumi3;
    static double Baumi4;



    static JMenuBar b;
    static JMenu s;
    static JMenuItem m1, m2, m3, m4,m5,m6;
    static JFrame frame;
    static JLabel label;
    static JPanel p;


    public static int getJ() {
        return j;
    }

    public static void setJ(int j) {
        graphische.j=j;
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        graphische.i=i;
    }

    static int i=1;

    static int j=i;

    public static String getUuid() {
        return uuid;
    }

    public static void setUuid(String uuid) {
        graphische.uuid=uuid;
    }

    static String uuid="";

    static JFrame logo=new JFrame();

    public static int Baumi() {
        return 0;
    }

    public void login() {

    }



    public graphische() {
        JFrame frame=new JFrame("Shop");




        b=new JMenuBar();
        s=new JMenu("menu");

        m1=new JMenuItem("Bestand");
        m2=new JMenuItem("Support");
        m3=new JMenuItem("Kontakt");
        m4=new JMenuItem("ware hinzufügen");
        m5 = new JMenuItem("Login");
        m6 = new JMenuItem("Register");
        s.add(m1);
        s.add(m2);
        s.add(m3);
        s.add(m4);
        s.add(m5);
        s.add(m6);
        b.add(s);
        frame.setJMenuBar(b);


        frame.setSize(500,500);
        frame.setVisible(true);
        label=new JLabel();
        JPanel p=new JPanel();
        label.setText("hallo");
        p.add(label);
        frame.add(p);
        frame.setSize(300,300);
        frame.show();

        frame.setTitle("Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar=new JMenuBar();
        frame.setJMenuBar(menuBar);


        // Menü erstellen
        JMenu fileMenu=new JMenu("Menü");
        menuBar.add(fileMenu);

        // Menüelement erstellen
        JMenuItem bestand=new JMenuItem("Bestand");
        JMenuItem support=new JMenuItem("support");
        JMenuItem kontakt=new JMenuItem("Kontakt");
        JMenuItem ware=new JMenuItem("ware");
        JMenuItem Login = new JMenuItem("Login");
        JMenuItem Register = new JMenuItem("Register");


        fileMenu.add(bestand);
        fileMenu.add(support);
        fileMenu.add(kontakt);
        fileMenu.add(ware);
        fileMenu.add(Login);
        fileMenu.add(Register);

        JLabel finalLabel=label;
        bestand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                // Neues Fenster erstellen und anzeigen
                JFrame newFrame=new JFrame("Lagerbestand");
                newFrame.setTitle("Lagerbestand");
                newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newFrame.setSize(200,150);
                newFrame.setVisible(true);



                i++;


                // Inhalt für das neue Fenster hinzufügen
                JLabel label=new JLabel("Lager");
                label.setHorizontalAlignment(JLabel.CENTER);
                newFrame.add(label);

                JButton buttonOK=new JButton("OK");
                buttonOK.setBounds(200,100,100,50);
                buttonOK.addActionListener(this);
                buttonOK.setText("Bestätigen");
                buttonOK.setFocusable(false);
                if (ae.getSource() == buttonOK) {
                    System.out.println("Bestätigt");


                }
                p.add(buttonOK);
                newFrame.add(p);
                newFrame.setVisible(true);
                newFrame.add(label);
                newFrame.add(buttonOK);


                newFrame.setSize(400,400);
                newFrame.setLayout(null);
                newFrame.setVisible(true);

                newFrame.add(label);
                newFrame.add(buttonOK);

                newFrame.setSize(400,400);
                newFrame.setLayout(null);
                newFrame.setVisible(true);

                //ImageIcon myfile = new ImageIcon("C:\\Users\\User\\Pictures\\wp2827784.jpg");
                //JLabel lab = new JLabel((myfile));
                // lab.setBounds(150,100,50,50);
                // p.add(lab);

                UUID uuid=UUID.randomUUID();
               System.out.println("UUID = " + uuid.toString());

            }
        });


        support.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Neues Fenster erstellen und anzeigen
                JFrame newFrame=new JFrame("Neues Fenster");
                newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newFrame.setSize(200,150);
                newFrame.setVisible(true);

                // Inhalt für das neue Fenster hinzufügen
                JLabel label=new JLabel("Das ist das neue Fenster!");
                label.setHorizontalAlignment(JLabel.CENTER);
                newFrame.add(label);


            }
        });
        kontakt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Neues Fenster erstellen und anzeigen
                JFrame newFrame=new JFrame("Neues Fenster");
                newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newFrame.setSize(200,150);
                newFrame.setVisible(true);

                // Inhalt für das neue Fenster hinzufügen
                JLabel label=new JLabel("Das ist das neue Fenster!");
                label.setHorizontalAlignment(JLabel.CENTER);
                newFrame.add(label);
            }
        });
        ware.addActionListener(new ActionListener() {
            @Override
            public void  actionPerformed(ActionEvent b) {
                JFrame frame1=new JFrame();
                JPanel p=new JPanel();

                frame1.setVisible(true);

                frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame1.setVisible(true);
                p.setSize(500,500);
                p.setLayout(null);
                p.setBackground(Color.pink);

                frame1.setTitle("Waren hinzufügen");
                frame1.setSize(600,600);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JTextField t1=new JTextField();
                JTextField t2=new JTextField();
                JTextField t3=new JTextField();
                JTextField t4=new JTextField();
                JLabel ArtikelNR=new JLabel("ArtikelNR");
                JLabel Name=new JLabel("Name");
                JLabel Bestand=new JLabel("Bestand");
                JLabel Preis=new JLabel("Preis");
                ArtikelNR.setBounds(20,100,200,50);
                Name.setBounds(40,155,200,50);
                Bestand.setBounds(40,210,200,50);
                Preis.setBounds(40,265,200,50);


                t1.setBounds(100,100,200,50);
                t1.setText("");
                t2.setBounds(100,155,200,50);
                t2.setText("");
                t3.setBounds(100,210,200,50);
                t3.setText("");
                t4.setBounds(100,265,200,50);
                t4.setText("");
                p.add(t1);
                p.add(t2);
                p.add(t3);
                p.add(t4);
                p.add(ArtikelNR);
                p.add(Name);
                p.add(Bestand);
                p.add(Preis);

                frame1.add(p);
                JButton hinzufügen=new JButton("hinzufügen");
                hinzufügen.setBounds(100,500,100,25);
                hinzufügen.addActionListener(this);
                hinzufügen.setText("hinzufügen");
                hinzufügen.setFocusable(false);

                if (b.getSource() == hinzufügen) {
            SQLL s1 = new SQLL();

          s1.getClass();
                    Baumi=Integer.parseInt(t1.getText());
                    Baumi2=t2.getText();
                    Baumi3=Integer.parseInt(t3.getText());
                    Baumi4=Double.parseDouble(t4.getText());






                }
















                p.add(hinzufügen);
                frame1.add(p);



                    }
                });







        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent c) {
                JFrame Anmelden = new JFrame("Login");
                Anmelden.setSize(300,200);
                Anmelden.setVisible(true);
            }

            });
        Register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent de) {
                JFrame Register = new JFrame("Regeister");
                Register.setSize(300,200);
                Register.setVisible(true);

            }

        });


        frame.setLayout(new FlowLayout());
        frame.setVisible(true);



    }


}




