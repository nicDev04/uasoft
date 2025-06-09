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
            Alerta.Erro("Erro as buscar informação para lista", "Erro listagem");
        }

        return listaCliente;
    }

    public static Cliente listarCliente(String idCliente) {
        EntityManager em = JPAUtil.getEntityManager();
        Cliente cliente = new Cliente();

        try {
            cliente = em.find(Cliente.class, idCliente);

            return cliente;
        } catch (Exception e) {
            Alerta.Erro("Erro as buscar informação de cliente", "Erro listagem");
        }

        return cliente;
    }

     public static void editarCliente(Cliente cliente) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
            Alerta.Erro("Edição realizada com sucesso!", "Sucesso!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Ocorreu um erro ao editar as informações", "Erro ao editar");
        } finally {
            em.close();
        }
    }

    public static void excluirClientes(String id) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            Cliente clientesRemover = em.find(Cliente.class, id);
            em.remove(clientesRemover);
            em.getTransaction().commit();
            
            Alerta.Erro("Cliente excluído com sucesso!", "Exclusão concluída!");

        } catch (Exception e) {
            Alerta.Erro("Erro ao excluir o cliente no banco", "Erro excluir");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

}
