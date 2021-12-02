package controle;

import dao.FornecedorDAO;
import java.util.List;
import modelo.Fornecedor;
public class FornecedorControl {

    public void salvar(String cnpj, String tel) {
        Fornecedor f = new Fornecedor();
        f.setCnpj(cnpj);
        f.setTel(tel);
        FornecedorDAO d = new FornecedorDAO();
        d.cadastrar(f);
    }

    public void alterar(String cnpj, String tel, String id) {
        Fornecedor f = new Fornecedor();
        f.setCnpj(cnpj);
        f.setTel(tel);
        f.setId(Long.parseLong(id));
        FornecedorDAO d = new FornecedorDAO();
        d.alterar(f);
    }

    public void deletar(String id) {
        Fornecedor f = new Fornecedor();
        f.setId(Long.parseLong(id));
        FornecedorDAO d = new FornecedorDAO();
        d.excluir(f.getId());

    }

    public List<Fornecedor> listar(String query) {
        FornecedorDAO d = new FornecedorDAO();
        List<Fornecedor> fornecedores= d.listar(query);
        return fornecedores;
    }
    
   public void sair(String id) {
        Fornecedor f = new Fornecedor();
        f.setId(Long.parseLong(id));
        FornecedorDAO d = new FornecedorDAO();
        d.limpar(f.getId());
}
}