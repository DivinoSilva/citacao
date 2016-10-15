package referencia.model;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.lang.Thread.sleep;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Classe criada para as Citações com 1 autor
 * @author Divino Silva
 * @since Classe criada em 14/06/2016
 */
public class UmAutor extends JFrame {

    /* Instancia todos os elementos graficos necessários*/
    int altura1 = 20, largura1 = 175, largura = 175, altura = 20, a = -50, b = -40;
    int posX1 = 100, posY1 = 500;
    JButton b1 = new JButton("Reset");
    JButton b2 = new JButton("Verificar");
    JLabel janela = new JLabel();
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel l6 = new JLabel();
    JLabel l7 = new JLabel();
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    JPanel p6 = new JPanel();
    JPanel p7 = new JPanel();
    JPanel p8 = new JPanel();
    JPanel p9 = new JPanel();
    JPanel p10 = new JPanel();
    JPanel p11 = new JPanel();
    JPanel p12 = new JPanel();
    JPanel p13 = new JPanel();
    JPanel p14 = new JPanel();

    boolean mousePress1 = false;
    boolean mousePress2 = false;
    boolean mousePress3 = false;
    boolean mousePress4 = false;
    boolean mousePress5 = false;
    boolean mousePress6 = false;
    boolean p1Vazio = true;
    boolean p2Vazio = true;
    boolean p3Vazio = true;
    boolean p4Vazio = true;
    boolean p5Vazio = true;
    boolean p6Vazio = true;

    public UmAutor() {
        new Mover().start();
        editarJanela();
        editarBotoes();

    }

    /*Thread que com sleep de 5ms*/
    public class Mover extends Thread {
        int i = 0;
        public void run() {
            while (true) {
                try {
                    sleep(5);
                } catch (Exception erro) {
                }
                atualizarMouse();
                verificarPanel();
                verificarMouse();
                fundoLabel();
            }
        }
    }

    /*Função que seta a posição do LABEL de acordo a posição atual do Mouse*/
    public void atualizarMouse() {
        if (mousePress1) {
            try {
                Point ponto = getMousePosition();
                if (ponto.y > 50)// && ponto.y<1200)
                {
                    l1.setBounds(ponto.x + a, ponto.y + b, largura1, altura1);
                }
            } catch (Exception erro) {
            }
        }
        if (mousePress2) {
            try {
                Point ponto = getMousePosition();
                if (ponto.y > 50)// && ponto.y<1200)
                {
                    l2.setBounds(ponto.x + a, ponto.y + b, largura1, altura1);
                }
            } catch (Exception erro) {
            }
        }
        if (mousePress3) {
            try {
                Point ponto = getMousePosition();
                if (ponto.y > 50)// && ponto.y<1200)
                {
                    l3.setBounds(ponto.x + a, ponto.y + b, largura1, altura1);
                }
            } catch (Exception erro) {
            }
        }
        if (mousePress4) {
            try {
                Point ponto = getMousePosition();
                if (ponto.y > 50)// && ponto.y<1200)
                {
                    l4.setBounds(ponto.x + a, ponto.y + b, largura1, altura1);
                }
            } catch (Exception erro) {
            }
        }
        if (mousePress5) {
            try {
                Point ponto = getMousePosition();
                if (ponto.y > 50)// && ponto.y<1200)
                {
                    l5.setBounds(ponto.x + a, ponto.y + b, largura1, altura1);
                }
            } catch (Exception erro) {
            }
        }
        if (mousePress6) {
            try {
                Point ponto = getMousePosition();
                if (ponto.y > 50)// && ponto.y<1200)
                {
                    l6.setBounds(ponto.x + a, ponto.y + b, largura1, altura1);
                }
            } catch (Exception erro) {
            }
        }
    }

    /*Função que identifica qual LABEL foi clicado e altera o status da variavel*/
    public void verificarMouse() {
        l1.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                mousePress1 = true;
            }

            public void mouseReleased(MouseEvent e) {
                mousePress1 = false;
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        l2.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                mousePress2 = true;
            }

            public void mouseReleased(MouseEvent e) {
                mousePress2 = false;
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        l3.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                mousePress3 = true;
            }

            public void mouseReleased(MouseEvent e) {
                mousePress3 = false;
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        l4.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                mousePress4 = true;
            }

            public void mouseReleased(MouseEvent e) {
                mousePress4 = false;
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        l5.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                mousePress5 = true;
            }

            public void mouseReleased(MouseEvent e) {
                mousePress5 = false;
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });

        l6.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
            }

            public void mousePressed(MouseEvent e) {
                mousePress6 = true;
            }

            public void mouseReleased(MouseEvent e) {
                mousePress6 = false;
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }
        });
    }

    /*Função que faz o sorteio da ordem dos LABEL's e os seta em suas respectivas
      posições iniciais. Também seta os PANEL's e cria as bordas*/
    public void editarLabel() {
        int p[] = new int[6];
        int i = 0, aux, x = 12, y = 200;
        int v[] = new int[6];
        while (i < 6) {
            boolean igual = false;
            if (i == 0) {
                v[i++] = (int) (Math.random() * 6);
            } else {
                aux = (int) (Math.random() * 6);
                for (int j = 0; j < i; j++) {
                    if (v[j] == aux) {
                        igual = true;
                    }
                }
                if (igual == false) {
                    v[i++] = aux;
                }
            }
        }
        
        for (i = 0; i < 6; i++) {
            p[i] = v[i] * 225 + 50;
        }
        poeTexto();
        l7.setText("                                     "
                + "                                   FATEC OURINHOS");
        l1.setForeground(Color.blue);
        l2.setForeground(Color.blue);
        l3.setForeground(Color.blue);
        l4.setForeground(Color.blue);
        l5.setForeground(Color.blue);
        l6.setForeground(Color.blue);
        l7.setBorder(BorderFactory.createTitledBorder(""));
        p7.setBorder(BorderFactory.createTitledBorder(""));
        p8.setBorder(BorderFactory.createTitledBorder(""));
        p9.setBorder(BorderFactory.createTitledBorder(""));
        p10.setBorder(BorderFactory.createTitledBorder(""));
        p11.setBorder(BorderFactory.createTitledBorder(""));
        p12.setBorder(BorderFactory.createTitledBorder(""));
        p7.setBounds(p[0] - x, y, 175, 100);
        p8.setBounds(p[1] - x, y, 175, 100);
        p9.setBounds(p[2] - x, y, 175, 100);
        p10.setBounds(p[3] - x, y, 175, 100);
        p11.setBounds(p[4] - x, y, 175, 100);
        p12.setBounds(p[5] - x, y, 175, 100);
        l1.setBounds(p[0], y+40, largura1, altura1);
        l2.setBounds(p[1], y+40, largura1, altura1);
        l3.setBounds(p[2], y+40, largura1, altura1);
        l4.setBounds(p[3], y+40, largura1, altura1);
        l5.setBounds(p[4], y+40, largura1, altura1);
        l6.setBounds(p[5], y+40, largura1, altura1);
        l7.setBounds(415, 50, 550, 100);
    }

    /*Função que seta os texto dos LABEL's*/
    public void poeTexto() {
        l1.setText("ASSUNÇÃO, M. F. A..");
        l2.setText("Segredos do Hacker Ético.");
        l3.setText("3. ed.");
        l4.setText("Florianópolis:");
        l5.setText("Visual,");
        l6.setText("2010.");
    }

    /*Edita os botões VERIFICA e RESET*/
    public void editarBotoes() {
        b1.setBounds(415, 160, 100, 30);
        b2.setBounds(865, 160, 100, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editarLabel();
                p1Vazio = true;
                p2Vazio = true;
                p3Vazio = true;
                p4Vazio = true;
                p5Vazio = true;
                p6Vazio = true;
                fundoLabel();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarGanhou();
            }
        });
    }

    /*Edita os PANEL's*/
    public void editarPanel() {
        int x = 500;
        p1.setBounds(30, x, largura, altura);
        p2.setBounds(255, x, largura, altura);
        p3.setBounds(480, x, largura, altura);
        p4.setBounds(705, x, largura, altura);
        p5.setBounds(930, x, largura, altura);
        p6.setBounds(1155, x, largura, altura);
        p1.setBackground(Color.yellow);
        p2.setBackground(Color.yellow);
        p3.setBackground(Color.yellow);
        p4.setBackground(Color.yellow);
        p5.setBackground(Color.yellow);
        p6.setBackground(Color.yellow);
        p13.setBackground(Color.yellow);
        p13.setBounds(25, x, 1300, 150);
        p14.setBounds(30, x + 25, 1300, 1);
        p14.setBorder(BorderFactory.createTitledBorder(""));
    }

    /*Cria a Janela e add os ítens à ela*/
    public void editarJanela() {
        editarLabel();
        editarPanel();
        setLayout(null);
        setSize(1425, 750);
        setLocation(250, 300);
        setTitle("D.G.R. -> Metodologia da Pesquisa Científico-Tecnológica -> Joogo -> Referência Bibliográfica");
        setVisible(true);
        setLocationRelativeTo(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        add(p7);
        add(p8);
        add(p9);
        add(p10);
        add(p11);
        add(p12);
        add(p14);
        add(b1);
        add(b2);
    }

    /*Função que verifica se o LABEl que foi arrastado está na area de 
      intersecção do PANEL e caso positivo, ao soltar o mouse, o LABEL 
      é posiciionado no ponto ZERO pré determinado do PANEL*/
    public void verificarPanel() {
        //Teste de p1  
       if (bateu(l1, p1) && !mousePress1) {
            l1.setBounds(30, posY1, largura, altura);
            p1Vazio = false;
        } else 
            if (bateu(l2, p1) && !mousePress2 ) { 
                l2.setBounds(30, posY1, largura, altura);
                p1Vazio = false;
            }else 
                if (bateu(l3, p1) && !mousePress3) {
                    l3.setBounds(30, posY1, largura, altura);
                    p1Vazio = false;
                } else 
                    if (bateu(l4, p1) && !mousePress4) {
                        l4.setBounds(30, posY1, largura, altura);
			p1Vazio=false;
                    } else 
                        if (bateu(l5, p1) && !mousePress5 ) {
                            l5.setBounds(30, posY1, largura, altura);
                            p1Vazio = false;
			} else
                            if (bateu(l6, p1) && !mousePress6) {
				l6.setBounds(30, posY1, largura, altura);
				p1Vazio = false;
                            } else {
                                p1Vazio = true;
                            } 

        //Teste de p2 
       if (bateu(l1, p2) && !mousePress1) {
            l1.setBounds(255, posY1, largura, altura);
            p2Vazio = false;
        } else 
            if (bateu(l2, p2) && !mousePress2 ) { 
                l2.setBounds(255, posY1, largura, altura);
                p2Vazio = false;
            }else 
                if (bateu(l3, p2) && !mousePress3) {
                    l3.setBounds(255, posY1, largura, altura);
                    p2Vazio = false;
                } else 
                    if (bateu(l4, p2) && !mousePress4) {
                        l4.setBounds(255, posY1, largura, altura);
			p2Vazio=false;
                    } else 
                        if (bateu(l5, p2) && !mousePress5 ) {
                            l5.setBounds(255, posY1, largura, altura);
                            p2Vazio = false;
			} else
                            if (bateu(l6, p2) && !mousePress6) {
				l6.setBounds(255, posY1, largura, altura);
				p2Vazio = false;
                            } else {
                                p2Vazio = true;
                            } 
       
       //Teste de P3
        if (bateu(l1, p3) && !mousePress1) {
            l1.setBounds(480, posY1, largura, altura);
            p3Vazio = false;
        } else 
            if (bateu(l2, p3) && !mousePress2 ) { 
                l2.setBounds(480, posY1, largura, altura);
                p3Vazio = false;
            }else 
                if (bateu(l3, p3) && !mousePress3) {
                    l3.setBounds(480, posY1, largura, altura);
                    p3Vazio = false;
                } else 
                    if (bateu(l4, p3) && !mousePress4) {
                        l4.setBounds(480, posY1, largura, altura);
			p3Vazio=false;
                    } else 
                        if (bateu(l5, p3) && !mousePress5 ) {
                            l5.setBounds(480, posY1, largura, altura);
                            p3Vazio = false;
			} else
                            if (bateu(l6, p3) && !mousePress6) {
				l6.setBounds(480, posY1, largura, altura);
				p3Vazio = false;
                            } else {
                                p3Vazio = true;
                            } 

        //Teste de p4 
       if (bateu(l1, p4) && !mousePress1) {
            l1.setBounds(705, posY1, largura, altura);
            p4Vazio = false;
        } else 
            if (bateu(l2, p4) && !mousePress2 ) { 
                l2.setBounds(705, posY1, largura, altura);
                p4Vazio = false;
            }else 
                if (bateu(l3, p4) && !mousePress3) {
                    l3.setBounds(705, posY1, largura, altura);
                    p4Vazio = false;
                } else 
                    if (bateu(l4, p4) && !mousePress4) {
                        l4.setBounds(705, posY1, largura, altura);
			p4Vazio=false;
                    } else 
                        if (bateu(l5, p4) && !mousePress5 ) {
                            l5.setBounds(705, posY1, largura, altura);
                            p4Vazio = false;
			} else
                            if (bateu(l6, p4) && !mousePress6) {
				l6.setBounds(705, posY1, largura, altura);
				p4Vazio = false;
                            } else {
                                p4Vazio = true;
                            } 
      //Teste de p5 
       if (bateu(l1, p5) && !mousePress1) {
            l1.setBounds(930, posY1, largura, altura);
            p5Vazio = false;
        } else 
            if (bateu(l2, p5) && !mousePress2 ) { 
                l2.setBounds(930, posY1, largura, altura);
                p5Vazio = false;
            }else 
                if (bateu(l3, p5) && !mousePress3) {
                    l3.setBounds(930, posY1, largura, altura);
                    p5Vazio = false;
                } else 
                    if (bateu(l4, p5) && !mousePress4) {
                        l4.setBounds(930, posY1, largura, altura);
			p5Vazio=false;
                    } else 
                        if (bateu(l5, p5) && !mousePress5 ) {
                            l5.setBounds(930, posY1, largura, altura);
                            p5Vazio = false;
			} else
                            if (bateu(l6, p5) && !mousePress6) {
				l6.setBounds(930, posY1, largura, altura);
				p5Vazio = false;
                            } else {
                                p5Vazio = true;
                            }      
 
      //Teste de p6 
       if (bateu(l1, p6) && !mousePress1) {
            l1.setBounds(1155, posY1, largura, altura);
            p6Vazio = false;
        } else 
            if (bateu(l2, p6) && !mousePress2 ) { 
                l2.setBounds(1155, posY1, largura, altura);
                p6Vazio = false;
            }else 
                if (bateu(l3, p6) && !mousePress3) {
                    l3.setBounds(1155, posY1, largura, altura);
                    p6Vazio = false;
                } else 
                    if (bateu(l4, p6) && !mousePress4) {
                        l4.setBounds(1155, posY1, largura, altura);
			p6Vazio=false;
                    } else 
                        if (bateu(l5, p6) && !mousePress5 ) {
                            l5.setBounds(1155, posY1, largura, altura);
                            p6Vazio = false;
			} else
                            if (bateu(l6, p6) && !mousePress6) {
				l6.setBounds(1155, posY1, largura, altura);
				p6Vazio = false;
                            } else {
                                p6Vazio = true;
                            }       
    }

    /*Verifica se a sequencia está correta */
    public void verificarGanhou() {
        if (bateu(l1, p1) && bateu(l2, p2) && bateu(l3, p3) && bateu(l4, p4) && bateu(l5, p5) && bateu(l6, p6)) {
            JOptionPane.showMessageDialog(null, "\tParabéns!!!!!!\n\nVocê Ganhou");
        } else {
            JOptionPane.showMessageDialog(null, "\tQue pena\n\nVocê errou");
        }
    }

    /*Função que verifica se o COMPONENT 'a' colidiu com COMPONETN 'b'*/
    public boolean bateu(Component a, Component b) {
        int aX = a.getX();
        int aY = a.getY();
        int ladoDireitoA = aX + a.getWidth();
        int ladoEsquerdoA = aX;
        int ladoBaixoA = aY + a.getHeight();
        int ladoCimaA = aY;
        int bX = b.getX();
        int bY = b.getY();
        int ladoDireitoB = bX + b.getWidth();
        int ladoEsquerdoB = bX;
        int ladoBaixoB = bY + b.getHeight();
        int ladoCimaB = bY;
        boolean bateu = false;
        boolean cDireita = false;
        boolean cCima = false;
        boolean cBaixo = false;
        boolean cEsquerda = false;
        if (ladoDireitoA >= ladoEsquerdoB) {
            cDireita = true;
        }
        if (ladoCimaA <= ladoBaixoB) {
            cCima = true;
        }
        if (ladoBaixoA >= ladoCimaB) {
            cBaixo = true;
        }
        if (ladoEsquerdoA <= ladoDireitoB) {
            cEsquerda = true;
        }

        if (cDireita && cEsquerda && cBaixo && cCima) {
            bateu = true;
        }
        return bateu;
    }

    
    /*Função que altera a cor de fundo do PANEL caso o LABEL esteja no
      ponto ZERO do PANEL */
    public void fundoLabel() {
        if (!p1Vazio) {
            p1.setOpaque(false);
        } else {
            p1.setOpaque(true);
        }
        if (!p2Vazio) {
            p2.setOpaque(false);
        } else {
            p2.setOpaque(true);
        }
        if (!p3Vazio) {
            p3.setOpaque(false);
        } else {
            p3.setOpaque(true);
        }
        if (!p4Vazio) {
            p4.setOpaque(false);
        } else {
            p4.setOpaque(true);
        }
        if (!p5Vazio) {
            p5.setOpaque(false);
        } else {
            p5.setOpaque(true);
        }
        if (!p6Vazio) {
            p6.setOpaque(false);
        } else {
            p6.setOpaque(true);
        }
    }
}//fim da clase
