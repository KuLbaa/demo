package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        /*
        StandardServiceRegistry registry = null;
        SessionFactory sessionFactory = null;

        try {
            registry = (new StandardServiceRegistryBuilder()).configure().build();
            sessionFactory = (new MetadataSources(registry)).buildMetadata().buildSessionFactory();

        Address address = new Address("Espana", "Madrit", "Valecii 2");
        Manager manager = new Manager("Jakub", "Stańv", "1231313", "123131", address, LocalDate.of(2000,11,2),4000, true, 1500);
        Driver driver = new Driver("Jakub", "Stańv", "1231313", "123131", address, LocalDate.of(2000,11,2),4000, true, 1500);
        Receptionist receptionist = new Receptionist("Jakub", "Stańv", "1231313", "123131", new Address("Germany", "Berlin", "Bie"), LocalDate.of(2000,11,2),4000, true, 25);
        Department department = new Department(address, manager);
        Client client = new Client("Wiktor", "Wur", "1243513", "7863131", address);
        Reservation reservation = new Reservation(LocalDate.of(2022, 02,11), LocalDate.of(2022, 03, 15), LocalDate.of(2022, 03, 10), Status.INPROGRESS, 3000);
        //client.addReservation(reservation);
        reservation.setReceptionist(receptionist);
        reservation.setDriver(driver);
        Car car = new Car("BMW", "M4", "2022", 420, "Black", 580000);
        InsurancePolicy insurancePolicy = new InsurancePolicy(LocalDate.of(2022, 02, 2), LocalDate.of(2023, 02, 2), 520000, car);
        car.addReservation(reservation);
        System.out.println(manager);

            Session session = sessionFactory.openSession();
            session.save(car);
            session.save(manager);
            session.getTransaction().commit();
            session.close();

            session = sessionFactory.openSession();
            session.beginTransaction();

            /*List<Person> personsFromDb = session.createQuery("from Person").list();
            //Iterator var19 = personsFromDb.iterator();

            while(var19.hasNext()){
                Person person = (Person)var19.next();
                System.out.println(person);
            }
            session.getTransaction().commit();
            session.close();
        } catch (Exception var16) {
            var16.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
                sessionFactory = null;
            }
            //address.getPersonList();
            //address.getDepartmentList();
            //Address.getExtent();
        }*/
    }
}
