package ClassesDAO;

import Classes.Cliente;
import Classes.JPAUtil;
import Classes.Pet;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class PetDAO {

    public static void cadastrarPet(Pet pet) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(pet);
            em.getTransaction().commit();
            Alerta.Erro("Pet cadastrado com sucesso!", "Cadastro concluído!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Erro ao inserir o cadastro no banco!", "Erro no cadastro!");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
    
    public static List<Pet> listarPets() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Pet> listaPets = new ArrayList<>();
        Query consulta;

        try {
                consulta = em.createQuery("SELECT pet FROM Pet pet");
                listaPets = consulta.getResultList();

            return listaPets;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
        }

        return listaPets;
    }
    
    public static List<Pet> listarPetsCliente(Cliente cliente) {
        EntityManager em = JPAUtil.getEntityManager();
        List<Pet> listaPetCliente = new ArrayList<>();
        TypedQuery<Pet>  consulta;

        try {
                consulta = em.createQuery("SELECT pet FROM Pet pet WHERE pet.cliente = :cliente", Pet.class);
                consulta.setParameter("cliente", cliente);
                listaPetCliente = consulta.getResultList();

            return listaPetCliente;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
        }

        return listaPetCliente;
    }
    
    public static Pet listarPet(String idPet) {
        EntityManager em = JPAUtil.getEntityManager();
        Pet pet = new Pet();

        try {
            pet = em.find(Pet.class, idPet);

            return pet;
        } catch (Exception e) {
            Alerta.Erro("Erro as buscar informação do pet", "Erro listagem");
        }

        return pet;
    }
    
    public static void editarPet(Pet pet) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            em.merge(pet);
            em.getTransaction().commit();
            Alerta.Erro("Edição realizada com sucesso!", "Sucesso!");

        } catch (Exception e) {
            em.getTransaction().rollback();
            Alerta.Erro("Ocorreu um erro ao editar as informações", "Erro ao editar");
        } finally {
            em.close();
        }
    }

    public static void excluirPets(String id) {
        EntityManager em = JPAUtil.getEntityManager();

        try {
            em.getTransaction().begin();
            Pet petsRemover = em.find(Pet.class, id);
            em.remove(petsRemover);
            em.getTransaction().commit();
            Alerta.Erro("Pet excluído com sucesso!", "Exclusão concluída!");

        } catch (Exception e) {
            Alerta.Erro("Erro ao excluir o pet no banco", "Erro excluir");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }
}
