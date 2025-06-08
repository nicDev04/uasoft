package ClassesDAO;

import Classes.Especie;
import Classes.JPAUtil;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class EspecieDAO {

    public static List<Especie> listarEspecie() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Especie> listaEspecie = new ArrayList<>();
        Query consulta;

        try {
            consulta = em.createQuery("SELECT especie FROM Especie especie");
            listaEspecie = consulta.getResultList();

            return listaEspecie;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
        }

        return listaEspecie;
    }
}
