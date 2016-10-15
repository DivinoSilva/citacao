package referencia.model;


import javax.swing.JOptionPane;

/**
 * Classe criada para o "Sobre"
 * @author Divino Silva
 * @since Classe criada em 14/06/2016
 */
public class Sobre {
    
    String msg="\n     FATEC OURINHOS 2016/1"
            + "\nJogo educativo elaborado para a Disciplina\t "
            + "\n\"Metodologia da Pesquisa Científico-Tecnológica\""
            + "\nAlunos do 4º ADS Noturno"
            + " \n\nDivino Silva\nGabriel Silvestre\nRamon Moura";
    
    public Sobre(){
        JOptionPane.showMessageDialog(null, msg);
    }
}//fim da clase
