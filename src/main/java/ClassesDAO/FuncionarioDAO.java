package ClassesDAO;

import Classes.Funcionario;
import Classes.JPAUtil;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    public static void cadastrarFuncionario(Funcionario funcionario) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(funcionario);
            em.getTransaction().commit();
            Alerta.Erro("Funcionario cadastrado com sucesso!", "Cadastro concluído!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Erro ao inserir o cadastro no banco!", "Erro no cadastro!");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    public static Funcionario listarFuncionario(String idFuncionario) {
        EntityManager em = JPAUtil.getEntityManager();
        Funcionario funcionario = new Funcionario();
        
        try {
            funcionario = em.find(Funcionario.class, idFuncionario);
            
            return funcionario;
        } catch (Exception e) {
            Alerta.Erro("Erro ao listar o funcionário no banco!", "Erro na listagem!");
        }
        return funcionario;
    }

    public static List<Funcionario> listarFuncionarios() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        Query consulta;

        try {
            consulta = em.createQuery("SELECT funcionario FROM Funcionario funcionario");
            listaFuncionarios = consulta.getResultList();

            return listaFuncionarios;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
        }

        return listaFuncionarios;
    }
    
    public static List<Funcionario> listarVeterinario() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Funcionario> listaVet = new ArrayList<>();
        TypedQuery consulta;

        try {
            consulta = em.createQuery("SELECT funcionario FROM Funcionario funcionario WHERE funcionario.cargoF = :cargo", Funcionario.class);
            consulta.setParameter("cargo", "Veterinário");
            listaVet = consulta.getResultList();

            return listaVet;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
            
        }

        return listaVet;
    }
    
    public static void editarFuncionario(Funcionario funcionario) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(funcionario);
            em.getTransaction().commit();
            Alerta.Erro("Edição realizada com sucesso!", "Sucesso!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Ocorreu um erro ao editar as informações", "Erro ao editar");
        } finally {
            em.close();
        }
    }
    
    public static void excluirFuncionarios(String id) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            Funcionario funcionariosRemover = em.find(Funcionario.class, id);
            em.remove(funcionariosRemover);
            em.getTransaction().commit();
            
            Alerta.Erro("Funcionario excluído com sucesso!", "Exclusão concluída!");

        } catch (Exception e) {
            Alerta.Erro("Erro ao excluir o funcionario no banco", "Erro excluir");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
}
