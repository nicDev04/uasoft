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

    public static List<Venda> listarVenda() {
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

}
