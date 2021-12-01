package Aula20.CarrinhoDeCompras;

public class Vazio implements Estado {
//    Attributes
    private CarrinhoCompras carrinhoCompras;

//    Constructor
    public Vazio(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }

//    Methods
    @Override
    public void adicionarItem() {
        System.out.println("Produto adicionado");
    }

    @Override
    public void cancelarCompra() {

    }

    @Override
    public void retornar() {

    }

    @Override
    public void avancar() {

    }
}
