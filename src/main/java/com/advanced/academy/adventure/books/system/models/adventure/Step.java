package com.advanced.academy.adventure.books.system.models.adventure;

import com.advanced.academy.adventure.books.system.models.adventure.Choice;
import com.advanced.academy.adventure.books.system.models.enums.EndGameType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Step")
public class Step {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "end_game_type")
    @Enumerated(EnumType.STRING)
    private EndGameType endGameType =EndGameType.NONE;

    @Column(name = "ends_game")
    private boolean endsGame = false;

    @Column(name = "story", columnDefinition = "TEXT")
    private String story;

    @OneToMany(mappedBy = "stepGivenIn", cascade = {CascadeType.REMOVE}, fetch = FetchType.LAZY)
    private List<Choice> choiceList = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public EndGameType getEndGameType() {
        return endGameType;
    }

    public void setEndGameType(EndGameType endGameType) {
        this.endGameType = endGameType;
    }

    public boolean isEndsGame() {
        return endsGame;
    }

    public void setEndsGame(boolean endsGame) {
        this.endsGame = endsGame;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public List<Choice> getChoiceList() {
        return choiceList;
    }

    public void setChoiceList(List<Choice> choiceList) {
        this.choiceList = choiceList;
    }


}
