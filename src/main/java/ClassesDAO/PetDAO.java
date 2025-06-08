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
}
