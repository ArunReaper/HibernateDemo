package com.mappings;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {

    @Id
    private int question_id;

    private String question;

    @OneToOne
    private Answer answer_id;

    public Question() {
        super();
    }

    public Question(int question_id, String question, Answer answer_id) {
        this.question_id = question_id;
        this.question = question;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Answer getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(Answer answer_id) {
        this.answer_id = answer_id;
    }
}
