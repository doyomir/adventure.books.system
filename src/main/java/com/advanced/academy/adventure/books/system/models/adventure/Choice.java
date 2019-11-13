package com.advanced.academy.adventure.books.system.models.adventure;

import org.hibernate.annotations.LazyToOne;
import org.hibernate.annotations.LazyToOneOption;

import javax.persistence.*;

@Entity
@Table(name = "choice")
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "step_given_in_id")
    @LazyToOne(LazyToOneOption.NO_PROXY)
    private Step stepGivenIn;

    @ManyToOne(cascade = {CascadeType.ALL},fetch = FetchType.LAZY)
    @JoinColumn(name = "result_in_step_id")
    private Step resultInStep;

    @Column(name = "reputation_change")
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

    public Step getResultsInStep() {
        return resultInStep;
    }

    public void setResultsInStep(Step resultInStep) {
        this.resultInStep = resultInStep;
    }


    public Step getStepGivenIn() {
        return stepGivenIn;
    }

    public void setStepGivenIn(Step stepGivenIn) {
        this.stepGivenIn = stepGivenIn;
    }

    public Integer getReputationChange() {
        return reputationChange;
    }

    public void setReputationChange(Integer reputationChange) {
        this.reputationChange = reputationChange;
    }
}
