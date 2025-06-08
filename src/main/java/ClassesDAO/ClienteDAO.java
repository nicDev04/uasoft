
package ClassesDAO;

import Classes.Cliente;
import Classes.JPAUtil;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    
    public static void cadastrarCliente(Cliente cliente) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            Alerta.Erro("Cliente cadastrado com sucesso!", "Cadastro concluído!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Erro ao inserir o cadastro no banco!", "Erro no cadastro!");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    public static List<Cliente> listarClientes() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Cliente> listaCliente = new ArrayList<>();
        Query consulta;

        try {
                consulta = em.createQuery("SELECT cliente FROM Cliente cliente");
                listaCliente = consulta.getResultList();

            return listaCliente;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
        }

        return listaCliente;
    }
    
    
    
}
