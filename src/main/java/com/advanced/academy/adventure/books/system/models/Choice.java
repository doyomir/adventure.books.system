package com.advanced.academy.adventure.books.system.models;

public class Choice {
    private Integer id;
    private String description;
    private Step resultInStep;
    private Integer reputationChange;

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Step getResultInStep() {
        return resultInStep;
    }

    public void setResultInStep(Step resultInStep) {
        this.resultInStep = resultInStep;
    }

    public Integer getReputationChange() {
        return reputationChange;
    }

    public void setReputationChange(Integer reputationChange) {
        this.reputationChange = reputationChange;
    }
}
