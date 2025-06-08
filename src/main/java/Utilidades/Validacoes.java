/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Components.RoundedFormattedTextField;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class Validacoes {

    public static String formatarData(String dataFormatar) {
        String dataLimpo = dataFormatar.replace("/", "").trim();

        return dataLimpo;
    }

    public static String formatarNumero(String telefoneFormatar) {
        String numeroLimpo = telefoneFormatar.replace("(", "").replace(")", "").replace("-", "").trim();

        return numeroLimpo;
    }

    public static String formatarCPF(String cpfFormatar) {
        String cpfLimpo = cpfFormatar.replace(".", "").replace("-", "").trim();

        return cpfLimpo;
    }

    public static String formatarValor(String valorFormatar) {
        // Remove "R$", todos os pontos e espaços extras, e troca vírgula por ponto
        String valorLimpo = valorFormatar
                .replace("R$", "")
                .replace(".", "")
                .replace(",", ".")
                .trim();

        return valorLimpo;
    }
}
