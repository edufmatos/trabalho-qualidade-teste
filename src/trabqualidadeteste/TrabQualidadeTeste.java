package trabqualidadeteste;

public class TrabQualidadeTeste {

    public static void main(String[] args) {
        int key = 6;
        int[] itens = {1,2,5,6,8,9};
        int size = itens.length;
        boolean ascending = true;
        SearchType type = SearchType.LessThanEquals;
        ResultType result = new ResultType();
        
        BuscaVetor.busca(type, itens, size, key, result, ascending);
        if (ascending) {
            System.out.println("Ordenado crescente");
        }else{
            System.out.println("Ordenado decrescente");
        }
        System.out.println(type);
        System.out.println(result);
    }
}