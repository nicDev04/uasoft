
package ClassesDAO;

import Classes.JPAUtil;
import Classes.Venda;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;


public class VendaDAO {
    
    public static void cadastrarVenda(Venda venda) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(venda);
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
