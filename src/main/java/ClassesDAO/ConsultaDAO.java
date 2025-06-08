package ClassesDAO;


import Classes.Consulta;
import Classes.JPAUtil;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;


public class ConsultaDAO {
    
    public static void cadastrarConsulta(Consulta consulta) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(consulta);
            em.getTransaction().commit();
            Alerta.Erro("Consulta cadastrada com sucesso!", "Cadastro concluído!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Erro ao inserir o cadastro no banco!", "Erro no cadastro!");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
}
