import Arrays.Array;
import CRM.CRMmanager;


public class AnhembiEsfiha {

    public static void main(String[] args) {
        CRMmanager CRMmanager = new CRMmanager();

        //AQUI ELE MOSTRA O MENU INICIAL ANTES DE ENTRAR NO SWITCH
        CRMmanager.MostrarMenuInicial();

        //SWITCH PARA TRATAR OS DADOS QUE FORAM PREENCHIDSO NO MENU INICAL
        switch(CRMmanager.getOpcao()){
            case 1:
                CRMmanager.FazerLogin();
                CRMmanager.MostrarMenuInicial();

            case 2:
                CRMmanager.CadastrarProduto();
                CRMmanager.MostrarProdutos();
                CRMmanager.DeletarProduto();
                CRMmanager.MostrarProdutos();
                break;
            default:
                break;
        }

    }

}