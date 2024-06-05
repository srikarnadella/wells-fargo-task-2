package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;

public class Portfolio {

    private long portfolioId;

    private Client client;

    private String creationDate;

    protected Portfolio() {}

    public Portfolio (Client client, String creationDate){
        this.client = client;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
