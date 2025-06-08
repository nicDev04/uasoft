package ClassesDAO;

import Classes.Grupo;
import Classes.JPAUtil;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class GrupoDAO {

    public static List<Grupo> listarGrupos() {
        EntityManager em = JPAUtil.getEntityManager();
        List<Grupo> listaGrupos = new ArrayList<>();
        Query consulta;

        try {
            consulta = em.createQuery("SELECT grupo FROM Grupo grupo");
            listaGrupos = consulta.getResultList();

            return listaGrupos;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
        }

        return listaGrupos;
    }
}
