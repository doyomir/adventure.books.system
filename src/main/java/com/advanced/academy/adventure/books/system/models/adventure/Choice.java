package com.advanced.academy.adventure.books.system.models.adventure;

import javax.persistence.*;

@Entity
@Table(name = "choice")
public class Choice {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @ManyToOne
    @JoinColumn(name = "step_given_in_id")
    private Step stepGivenIn;

    @ManyToOne
    @JoinColumn(name = "result_in_step_id")
    private Step resultInStep;


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


    public Step getStepGivenIn() {
        return stepGivenIn;
    }

    public void setStepGivenIn(Step stepGivenIn) {
        this.stepGivenIn = stepGivenIn;
    }
}
