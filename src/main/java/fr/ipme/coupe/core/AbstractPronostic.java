package fr.ipme.coupe.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

abstract class AbstractPronostic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private boolean ateam;
    private boolean bteam;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isAteam() {
        return ateam;
    }

    public void setAteam(boolean ateam) {
        this.ateam = ateam;
    }

    public boolean isBteam() {
        return bteam;
    }

    public void setBteam(boolean bteam) {
        this.bteam = bteam;
    }
}
