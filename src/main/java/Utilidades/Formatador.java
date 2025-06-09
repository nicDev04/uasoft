package Utilidades;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Formatador {

    public static String converterData(String dataRecebida) {
        SimpleDateFormat formatoOriginal = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoMySQL = new SimpleDateFormat("yyyy-MM-dd");

        try {
            if (dataRecebida.matches("\\d{2}/\\d{2}/\\d{4}")) {
                Date data = formatoOriginal.parse(dataRecebida);
                return formatoMySQL.format(data);
            } else if (dataRecebida.matches("\\d{4}-\\d{2}-\\d{2}")) {
                Date data = formatoMySQL.parse(dataRecebida);
                return formatoOriginal.format(data);
            }
        } catch (ParseException e) {
            Alerta.Erro("Erro ao converter data", null);
        }
        return null;
    }

    public static String converterParaPTBR(LocalDate data) {
        if (data == null) {
            return null;
        }

        DateTimeFormatter formatoNumerico = DateTimeFormatter.ofPattern("ddMMyyyy");
        return data.format(formatoNumerico);
    }

    public static String converterValorParaReal(Object valorRecebido) {
        try {
            double valor;

            if (valorRecebido instanceof String) {
                String entrada = ((String) valorRecebido).trim();

                // Se for um número sem vírgula ou ponto, trata como reais
                if (entrada.matches("\\d+")) {
                    valor = Double.parseDouble(entrada);
                } else {
                    // Remove pontos (milhar) e troca vírgula por ponto decimal
                    entrada = entrada.replace(".", "").replace(",", ".");
                    valor = Double.parseDouble(entrada);
                }

            } else if (valorRecebido instanceof Number) {
                valor = ((Number) valorRecebido).doubleValue();
            } else {
                throw new IllegalArgumentException("Valor inválido para conversão");
            }

            NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
            return formatoMoeda.format(valor);

        } catch (Exception e) {
            Alerta.Erro("Erro ao converter valor monetário", null);
        }
        return null;
    }

    public static String formatarCPF(String cpf) {
        // Remove tudo que não for número
        String cpfLimpo = cpf.replaceAll("\\D", "");

        // Verifica se tem 11 dígitos
        if (cpfLimpo.length() != 11) {
            throw new IllegalArgumentException("CPF deve conter 11 dígitos.");
        }

        // Aplica a formatação
        return cpfLimpo.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    public static String formatarTelefone(String telefone) {
        // Remove tudo que não for número
        String numeroLimpo = telefone.replaceAll("\\D", "");

        // Verifica se tem 11 dígitos (formato celular com DDD)
        if (numeroLimpo.length() != 11) {
            throw new IllegalArgumentException("Telefone deve conter 11 dígitos (com DDD).");
        }

        // Aplica a formatação: (XX) 9XXXX-XXXX
        return numeroLimpo.replaceFirst("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
    }
    
    public static String formatarValorPTBR(double valor) {
    NumberFormat formatoBrasileiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    String formatado = formatoBrasileiro.format(valor);
    
    // Remove o símbolo de R$, se você quer apenas os números
    return formatado.replace("R$", "").trim();
}

}
