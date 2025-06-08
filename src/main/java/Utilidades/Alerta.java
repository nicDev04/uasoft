package Utilidades;

import Telas.TelaAviso;

public class Alerta {
    public static void Erro(String mensagem, String titulo){
        new TelaAviso(null, true, mensagem, titulo).setVisible(true);
    }
}
