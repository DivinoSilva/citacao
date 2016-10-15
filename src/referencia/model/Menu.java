package referencia.model;



import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



/**
 * Classe criada para o Menu principal
 * @author Divino Silva
 * @since Classe criada em 14/06/2016
 */
public class Menu extends JFrame {
    int opc; 
    
    ImageIcon figura = new ImageIcon(getClass().getResource("Bibliografia.jpg"));
    JLabel janela = new JLabel(figura);
    JButton b1 = new JButton("Novo Jogo");
    JButton b2 = new JButton("Ajuda");
    JButton b3 = new JButton("Sobre");
    JButton b4 = new JButton("Sair");
     public Menu(){    
        editarJanela();
        editarBotoes(); 
    }
       public void editarBotoes(){
        b1.setBounds(50,100, 100, 30);
        b2.setBounds(400,100, 100, 30);
        b3.setBounds(50,200, 100, 30);
        b4.setBounds(400,200, 100, 30);   
        
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            opc=(int)(Math.random()*3);
            switch(opc){
                case 0: new UmAutor();
                        break;
                case 1: new UmAutor1Ed();
                        break;
                case 2: JOptionPane.showMessageDialog(null, "Dissertação de Mestrado");
                        break;
        /*        case 3: JOptionPane.showMessageDialog(null, "Periódico de Internet");
                        break;
                case 4: JOptionPane.showMessageDialog(null, "Congresso");
                        break;
                case 5: JOptionPane.showMessageDialog(null, "Trablaho de Graduação");
                        break;       */            
            }    
            }
        });
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ajuda();
            }
        });  
        
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new Sobre();
      
            }
        });       

        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int resp = JOptionPane.showConfirmDialog(null, "Deseja Sair?","Confirma Saída",JOptionPane.YES_NO_OPTION); 
                if(resp==JOptionPane.YES_OPTION)
                System.exit(0);       
            }
        });   
    }

    public void editarJanela(){
        Rectangle bound= new Rectangle(570,350);
        setSize(570,340);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("D.G.R. -> MPCT -> Jogo -> Referência Bibliográfica");
        setMaximizedBounds(bound);
        setVisible(true);
        setLocationRelativeTo(null);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(janela);
    }
     
     
     
     
}//fim da clase
