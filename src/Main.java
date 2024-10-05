import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Double[] valores = {1.0, -5.0, 10.0, -20.0, 17.0, 7.0};
        List<Double> numeros = Arrays.asList(valores);

        double somatorio = numeros.stream()
                .map(valor -> valor * -1)
                .filter(valor -> valor >= 0)
                .reduce(0.0, (soma, valor) -> soma + valor);

        System.out.println(somatorio);

        numeros.stream().map(valor -> {
            if(valor < 0) return 0;
            else return valor;
        }).forEach(System.out::println);

        List<Double> numerosAlterados = numeros.stream()
                                                .filter(valor -> valor % 2 == 0)
                                                .toList();

        numeros.stream()
                .filter(valor -> valor > 5)
                .map(valor -> valor * 2)
                .forEach(System.out::println);

        String entrada = "He110 W0rld!";

        String saida = entrada.replaceAll("[0-9!?:/.]","");
        System.out.println(saida);

        Integer[] nums = {5, 7, 2, 3, 9, 21, 14, 16, 17, 9, 7, 3};
        List<Integer> vals = Arrays.asList(nums);

        long contagem = vals.stream()
                .filter(valor -> valor > 10)
                .count();

        vals.stream()
                .filter(valor -> valor % 2 == 1)
                .forEach(System.out::println);

        boolean b = vals.stream().allMatch(valor -> valor < 0);

        List<Integer> novaLista = vals.stream()
                .filter(valor -> valor % 2 == 1)
                .toList();

    }
}