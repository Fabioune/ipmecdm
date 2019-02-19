package fr.ipme.coupe.core;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class AbstractPronosticEliminatoire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private boolean aTeam;
    private boolean bTeam;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isAteam() {
        return aTeam;
    }

    public void setAteam(boolean ateam) {
        this.aTeam = ateam;
    }

    public boolean isBteam() {
        return bTeam;
    }

    public void setBteam(boolean bteam) {
        this.bTeam = bteam;
    }
}
