package com.example.admin.tp7android;

/**
 * Created by admin on 12/06/2017.
 */

public class VraisFaux {


    private Boolean Reponse;
    private String question;
    private String question1;
    private String question2;
    private boolean reponse;

    public VraisFaux(String question, String question1, String question2, boolean reponse) {
        setQuestion(question);
        setQuestion1(question1);
        setQuestion2(question2);
        setReponse(reponse);
    }

    public Boolean getReponse() {
        return Reponse;
    }

    public void setReponse(Boolean reponse) {
        Reponse = reponse;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public boolean isReponse() {
        return reponse;
    }

    public void setReponse(boolean reponse) {
        this.reponse = reponse;
    }
}

