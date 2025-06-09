package ClassesDAO;

import Classes.Funcionario;
import Classes.JPAUtil;
import Classes.Venda;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class VendaDAO {

    public static void cadastrarVenda(Venda venda) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(venda);
            em.getTransaction().commit();
            Alerta.Erro("Venda cadastrada com sucesso!", "Cadastro concluído!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Erro ao inserir o cadastro no banco!", "Erro no cadastro!");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    public static List<Venda> listarVendas() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Venda> listaVendas = new ArrayList<>();
        Query consulta;

        try {
            consulta = em.createQuery("SELECT venda FROM Venda venda");
            listaVendas = consulta.getResultList();

            return listaVendas;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
        }

        return listaVendas;
    }
    
     public static Venda listarVenda(String idVenda) {
        EntityManager em = JPAUtil.getEntityManager();
        Venda venda = new Venda();
        
        try {
            venda = em.find(Venda.class, idVenda);
            
            return venda;
        } catch (Exception e) {
            Alerta.Erro("Erro as buscar informação da venda", "Erro listagem");
        }
        
        return venda;
    }
    
    public static void editarVenda(Venda venda) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(venda);
            em.getTransaction().commit();
            Alerta.Erro("Edição realizada com sucesso!", "Sucesso!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Ocorreu um erro ao editar as informações", "Erro ao editar");
        } finally {
            em.close();
        }
    }

    public static void excluirVendas(String id) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            Venda vendasRemover = em.find(Venda.class, id);
            em.remove(vendasRemover);
            em.getTransaction().commit();
            Alerta.Erro("Venda excluída com sucesso!", "Exclusão concluída!");

        } catch (Exception e) {
            Alerta.Erro("Erro ao excluir venda no banco", "Erro excluir");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

}
