package Aula20.CarrinhoDeCompras;

public class Fechado implements Estado {
    //    Attributes
    private CarrinhoCompras carrinhoCompras;

    //    Constructor
    public Fechado(CarrinhoCompras carrinhoCompras) {
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
