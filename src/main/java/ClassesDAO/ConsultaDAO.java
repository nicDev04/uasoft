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
    
    public static Consulta listarConsulta(String idConsulta) {
        EntityManager em = JPAUtil.getEntityManager();
        Consulta consulta = new Consulta();
        
        try {
            consulta = em.find(Consulta.class, idConsulta);
            
            return consulta;
        } catch (Exception e) {
            Alerta.Erro("Erro ao listar a consulta no banco!", "Erro na listagem!");
        }
        return consulta;
    }
    
    public static void editarConsulta(Consulta consulta) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(consulta);
            em.getTransaction().commit();
            Alerta.Erro("Edição realizada com sucesso!", "Sucesso!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Ocorreu um erro ao editar as informações", "Erro ao editar");
        } finally {
            em.close();
        }
    }
    
    public static void excluirConsultas(String id) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            Consulta consultasRemover = em.find(Consulta.class, id);
            em.remove(consultasRemover);
            em.getTransaction().commit();
            
            Alerta.Erro("Consulta excluída com sucesso!", "Exclusão concluída!");

        } catch (Exception e) {
            Alerta.Erro("Erro ao excluir a consulta no banco", "Erro excluir");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
}
