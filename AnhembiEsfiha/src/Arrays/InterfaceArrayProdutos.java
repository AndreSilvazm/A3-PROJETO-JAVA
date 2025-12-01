package Arrays;

import Model.Produto.PrincipalProdutos;

public interface InterfaceArrayProdutos<T extends PrincipalProdutos> {
    public void Inserir(T produto);
    public void Exibir();
    public T[] NovoArray();
    public boolean AtualizarProdutoPorID(int id, T produtoAtualizado);
}
