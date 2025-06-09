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
    
    public static List<Produto> listarProdutos() {
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
    
    public static Produto listarProduto(String idProduto) {
        EntityManager em = JPAUtil.getEntityManager();
        Produto produto = new Produto();

        try {
            produto = em.find(Produto.class, idProduto);

            return produto;
        } catch (Exception e) {
            Alerta.Erro("Erro as buscar informação do produto", "Erro listagem");
        }

        return produto;
    }

     public static void editarProduto(Produto produto) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(produto);
            em.getTransaction().commit();
            Alerta.Erro("Edição realizada com sucesso!", "Sucesso!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Ocorreu um erro ao editar as informações", "Erro ao editar");
        } finally {
            em.close();
        }
    }

    public static void excluirProdutos(String id) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            Produto produtosRemover = em.find(Produto.class, id);
            em.remove(produtosRemover);
            em.getTransaction().commit();
            
            Alerta.Erro("Produto excluído com sucesso!", "Exclusão concluída!");

        } catch (Exception e) {
            Alerta.Erro("Erro ao excluir o produto no banco", "Erro excluir");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
}
