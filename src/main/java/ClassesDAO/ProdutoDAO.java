package ClassesDAO;

import Classes.JPAUtil;
import Classes.Produto;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    public static void cadastrarProduto(Produto produto) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
            Alerta.Erro("Produto cadastrado com sucesso!", "Cadastro concluído!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Erro ao inserir o cadastro no banco!", "Erro no cadastro!");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    public static List<Produto> listarProduto() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Produto> listaProdutos = new ArrayList<>();
        Query consulta;

        try {
            consulta = em.createQuery("SELECT produto FROM Produto produto");
            listaProdutos = consulta.getResultList();

            return listaProdutos;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
        }

        return listaProdutos;
    }
}
