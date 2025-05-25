package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String clientName;

    @Column(nullable = false)
    private String clientMail;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    @OneToOne(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private Portfolio portfolio;

    protected Client() {

    }

    public Client(String clientName, String clientMail, Advisor advisor) {
        this.clientName = clientName;
        this.clientMail = clientMail;
        this.advisor = advisor;
    }

    public long getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientMail() {
        return clientMail;
    }

    public void setClientMail(String clientMail) {
        this.clientMail = clientMail;
    }

    public Advisor getAdvisor() { return advisor; }

    public void setAdvisor(Advisor advisor) { this.advisor = advisor; }

    public Portfolio getPortfolio() { return portfolio; }

    public void setPortfolio(Portfolio portfolio) { this.portfolio = portfolio; }
}
