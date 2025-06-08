package ClassesDAO;

import Classes.JPAUtil;
import Classes.Produto;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;

public class ProdutoDAO {

    public static void cadastrarProduto(Produto produto) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
            Alerta.Erro("Pet cadastrado com sucesso!", "Cadastro concluído!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Erro ao inserir o cadastro no banco!", "Erro no cadastro!");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
