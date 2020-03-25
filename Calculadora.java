//Author: SanMarE11
//Twitter: SanMarE11
import java.awt.event.*;
import javax.swing.*;
public class Calcu extends JFrame{
    private JPanel contenid=new JPanel();
    private JTextField valorit=new JTextField();
    private JButton zero=new JButton();
    private JButton uno=new JButton();
    private JButton dos=new JButton();
    private JButton tres=new JButton();
    private JButton cuatro=new JButton();
    private JButton cinco=new JButton();
    private JButton seis=new JButton();
    private JButton siete=new JButton();
    private JButton ocho=new JButton();
    private JButton nueve=new JButton();
    private JButton mas=new JButton();
    private JButton menos=new JButton();
    private JButton por=new JButton();
    private JButton igual=new JButton();
    private JButton entre=new JButton();
    private JButton punto=new JButton();
    private JButton limpiar=new JButton();
    private float primero=0;
    private float segundo=0;
    private float resultado=0;
    private String operacion;
    public Calcu(){
        interfaz();
        initComponents();
        botones();
        initProcess();
        initOperations();
    }
    private void interfaz(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(270,350);
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
        this.setLayout(null);
    }
    private void initComponents(){
        contenid.setSize(270, 350);
        contenid.setLayout(null);
        this.getContentPane().add(contenid);
        valorit.setBounds(15, 15, 165, 50);
        valorit.setFont(new Font("arial",0,20));
        valorit.setBackground(Color.white);
        valorit.setOpaque(true);
        contenid.add(valorit);
    }
    private void botones(){
        limpiar.setBounds(195,15,45,45);
        limpiar.setText("C");
        limpiar.setFont(new Font("arial",1,15));
        contenid.add(limpiar);
        uno.setBounds(15,75,45,45);
        uno.setText("1");
        uno.setFont(new Font("arial",1,20));
        contenid.add(uno);
        dos.setBounds(75,75,45,45);
        dos.setText("2");
        dos.setFont(new Font("arial",1,20));
        contenid.add(dos);
        tres.setBounds(135,75,45,45);
        tres.setText("3");
        tres.setFont(new Font("arial",1,20));
        contenid.add(tres);
        entre.setBounds(195,75,45,45);
        entre.setText("/");
        entre.setFont(new Font("arial",1,20));
        contenid.add(entre);
        cuatro.setBounds(15,135,45,45);
        cuatro.setText("4");
        cuatro.setFont(new Font("arial",1,20));
        contenid.add(cuatro);
        cinco.setBounds(75,135,45,45);
        cinco.setText("5");
        cinco.setFont(new Font("arial",1,20));
        contenid.add(cinco);
        seis.setBounds(135,135,45,45);
        seis.setText("6");
        seis.setFont(new Font("arial",1,20));
        contenid.add(seis);
        por.setBounds(195,135,45,45);
        por.setText("x");
        por.setFont(new Font("arial",1,20));
        contenid.add(por);
        siete.setBounds(15,195,45,45);
        siete.setText("7");
        siete.setFont(new Font("arial",1,20));
        contenid.add(siete);
        ocho.setBounds(75,195,45,45);
        ocho.setText("8");
        ocho.setFont(new Font("arial",1,20));
        contenid.add(ocho);
        nueve.setBounds(135,195,45,45);
        nueve.setText("9");
        nueve.setFont(new Font("arial",1,20));
        contenid.add(nueve);
        menos.setBounds(195,195,45,45);
        menos.setText("-");
        menos.setFont(new Font("arial",1,20));
        contenid.add(menos);
        punto.setBounds(15,255,45,45);
        punto.setText(".");
        punto.setFont(new Font("arial",1,20));
        contenid.add(punto);
        zero.setBounds(75,255,45,45);
        zero.setText("0");
        zero.setFont(new Font("arial",1,20));
        contenid.add(zero);
        igual.setBounds(135,255,45,45);
        igual.setText("=");
        igual.setFont(new Font("arial",1,18));
        contenid.add(igual);
        mas.setBounds(195,255,45,45);
        mas.setText("+");
        mas.setFont(new Font("arial",1,18));
        contenid.add(mas);
    }
    private void initProcess(){
       uno.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                valorit.setText(valorit.getText()+"1");
           }
       });
       dos.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                valorit.setText(valorit.getText()+"2");
           }
       });
       tres.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                valorit.setText(valorit.getText()+"3");
           }
       });
       cuatro.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                valorit.setText(valorit.getText()+"4");
           }
       });
       cinco.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                valorit.setText(valorit.getText()+"5");
           }
       });
       seis.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                valorit.setText(valorit.getText()+"6");
           }
       });
       siete.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                valorit.setText(valorit.getText()+"7");
           }
       });
       ocho.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                valorit.setText(valorit.getText()+"8");
           }
       });
       nueve.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                valorit.setText(valorit.getText()+"9");
           }
       });
       zero.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                valorit.setText(valorit.getText()+"0");
           }
       });
       punto.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                valorit.setText(valorit.getText()+".");
           }
       });
    }
    private void initOperations(){
            limpiar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    valorit.setText("");
                }
            });
            mas.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    try{
                        primero=Float.parseFloat(valorit.getText());
                        operacion="+";
                        valorit.setText("");
                    }catch(NumberFormatException nfe){
                       JOptionPane.showMessageDialog(null, "Formato Erroneo","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            menos.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    try{
                        primero=Float.parseFloat(valorit.getText());
                        operacion="-";
                        valorit.setText("");
                    }catch(NumberFormatException nfe){
                       JOptionPane.showMessageDialog(null, "Formato Erroneo","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            por.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    try{
                        primero=Float.parseFloat(valorit.getText());
                        operacion="x";
                        valorit.setText("");
                    }catch(NumberFormatException nfe){
                       JOptionPane.showMessageDialog(null, "Formato Erroneo","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            entre.addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                    try{
                        primero=Float.parseFloat(valorit.getText());
                        operacion="/";
                        valorit.setText("");
                    }catch(NumberFormatException nfe){
                       JOptionPane.showMessageDialog(null, "Formato Erroneo","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            igual.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    try{
                        segundo=Float.parseFloat(valorit.getText());
                        switch(operacion){
                            case "+":
                                resultado=primero+segundo;
                                break;
                            case "-":
                                resultado=primero-segundo;
                                break;
                            case "x":
                                resultado=primero*segundo;
                                break;
                            case "/":
                                resultado=primero/segundo;
                                break;
                        }
                        valorit.setText(Float.toString(resultado));
                    }catch(NumberFormatException nfe){
                       JOptionPane.showMessageDialog(null, "Formato Erroneo","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            
            });
    }
    public static void main(String[] args) {
        Calcu ven=new Calcu();
        ven.setVisible(true);
    }
}
