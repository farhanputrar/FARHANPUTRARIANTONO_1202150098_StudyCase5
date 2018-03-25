package com.example.android.farhanputrariantono_1202150098_studycase5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddDataActivity {


    String todo, desc, prior;


    public AddDataActivity(String todo, String desc, String prior){
        this.todo=todo;
        this.desc=desc;
        this.prior=prior;
    }


    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }
}