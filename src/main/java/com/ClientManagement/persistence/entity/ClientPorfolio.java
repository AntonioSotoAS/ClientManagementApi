package com.ClientManagement.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "client_porfolio")
public class ClientPorfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client_porfolio")
    private Integer idClientPorfolio;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    public Integer getIdClientPorfolio() {
        return idClientPorfolio;
    }

    public void setIdClientPorfolio(Integer idClientPorfolio) {
        this.idClientPorfolio = idClientPorfolio;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}