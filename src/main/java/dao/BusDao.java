package dao;


import model.Bus;
import org.hibernate.Session;

import java.util.List;

public class BusDao extends BaseDao {

    private Session session;

    public void saveBus(List<Bus> busList) {
        session = builderSession().openSession();
        session.beginTransaction();
        for (Bus bus : busList)
            session.persist(bus);
        session.getTransaction().commit();
        session.close();
    }

}
