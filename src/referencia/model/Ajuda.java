package referencia.model;


import javax.swing.JOptionPane;

/**
 * Classe criada para mostrar a opção de ajuda do jogo
 * @author Divino Silva
 * @since Classe criada em 14/06/2016
 */
public class Ajuda {
    String msg="O intuíto do jogo é acertar as referências bibliográficas de diversos ítens."
            + "\nPosicione os ítens nos locais indicados para montar a referência correta";  
    public Ajuda(){
        JOptionPane.showMessageDialog(null, msg);
    }
}//fim da clase
