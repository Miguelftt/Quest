import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

class DiaFaturamento {
    public int dia;
    public double faturamento;
}
public class Q3 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<DiaFaturamento> faturamentos = objectMapper.readValue(new File("faturamento.json"), new TypeReference<List<DiaFaturamento>>() {});

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;
            for (DiaFaturamento dia : faturamentos) {
                if (dia.faturamento > 0) {
                    if (dia.faturamento < menorFaturamento) {
                        menorFaturamento = dia.faturamento;
                    }
                    if (dia.faturamento > maiorFaturamento) {
                        maiorFaturamento = dia.faturamento;
                    }
                    somaFaturamento += dia.faturamento;
                    diasComFaturamento++;
                }
            }
            double mediaMensal = somaFaturamento / diasComFaturamento;
            int diasAcimaDaMedia = 0;
            for (DiaFaturamento dia : faturamentos) {
                if (dia.faturamento > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }
            System.out.println("Menor faturamento ocorrido em um dia do mês: " + menorFaturamento);
            System.out.println("Maior faturamento ocorrido em um dia do mês: " + maiorFaturamento);
            System.out.println("Número de dias no mês em que o faturamento diário foi superior à média mensal: " + diasAcimaDaMedia);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
