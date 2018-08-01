package com.rp.qai.testfyp;

import java.io.Serializable;

public class PoemId implements Serializable {
    private String poemId;
    private String idTitle;

    public PoemId(String poemId, String idTitle) {
        this.poemId = poemId;
        this.idTitle = idTitle;
    }

    public String getPoemId() {
        return poemId;
    }

    public void setPoemId(String poemId) {
        this.poemId = poemId;
    }

    public String getIdTitle() {
        return idTitle;
    }

    public void setIdTitle(String idTitle) {
        this.idTitle = idTitle;
    }
}
