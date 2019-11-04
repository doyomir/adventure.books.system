package com.advanced.academy.adventure.books.system.models;

import com.advanced.academy.adventure.books.system.models.enums.EndGameType;

import java.util.ArrayList;
import java.util.List;

public class Step {
    private Integer id;
    private Integer reputationChange;
    private EndGameType endGameType;
    private boolean endsGame = false;
    private String story;
    private List<Choice> choiceList = new ArrayList<>();

    public Integer getId() {
        return id;
    }


    public Integer getReputationChange() {
        return reputationChange;
    }

    public void setReputationChange(Integer reputationChange) {
        this.reputationChange = reputationChange;
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
