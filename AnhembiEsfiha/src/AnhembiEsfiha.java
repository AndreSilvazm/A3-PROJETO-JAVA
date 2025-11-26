import CRM.CRMmanager;

public class AnhembiEsfiha {

    public static void main(String[] args) {
        CRMmanager CRMmanager = new CRMmanager();

        while (true) {
            CRMmanager.MostrarMenuInicial();

            switch (CRMmanager.getOpcao()) {

                case 1:
                    CRMmanager.FazerLogin();
                    break;

                case 2:
                    CRMmanager.CadastrarProduto();
                    CRMmanager.MostrarEsfihas();
                    break;

                case 3:
                    CRMmanager.CadastrarPedido();
                    break;

                case 4:
                    System.out.println("Saindo...");
                    return; // encerra o programa

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
