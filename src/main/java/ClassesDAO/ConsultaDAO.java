package ClassesDAO;


import Classes.Consulta;
import Classes.JPAUtil;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;


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
    
    public static List<Consulta> listarConsultas() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Consulta> listaConsultas = new ArrayList<>();
        Query consulta;

        try {
                consulta = em.createQuery("SELECT consulta FROM Consulta consulta");
                listaConsultas = consulta.getResultList();

            return listaConsultas;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
        }

        return listaConsultas;
    }
    
}
