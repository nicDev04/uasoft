package ClassesDAO;

import Classes.Especie;
import Classes.JPAUtil;
import Classes.Raca;
import Utilidades.Alerta;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class RacaDAO {

    public static List<Raca> listarRaca(Especie especie) {
        EntityManager em = JPAUtil.getEntityManager();
        List<Raca> listaRacas = new ArrayList<>();
        TypedQuery<Raca>  consulta;

        try {
                consulta = em.createQuery("SELECT raca FROM Raca raca WHERE raca.especie = :especie", Raca.class);
                consulta.setParameter("especie", especie);
                listaRacas = consulta.getResultList();

            return listaRacas;
        } catch (Exception e) {
            Alerta.Erro("Erro listagem", "Erro as buscar informação para lista");
        }

        return listaRacas;
    }
        
}
