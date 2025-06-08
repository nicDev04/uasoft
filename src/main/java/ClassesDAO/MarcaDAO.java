package ClassesDAO;

import Classes.JPAUtil;
import Classes.Marca;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class MarcaDAO {

    public static List<Marca> listarMarcas() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Marca> listaMarcas = new ArrayList<>();
        Query consulta;

        try {
            consulta = em.createQuery("SELECT marca FROM Marca marca");
            listaMarcas = consulta.getResultList();

            return listaMarcas;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
        }

        return listaMarcas;
    }
}
