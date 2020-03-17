package paivakirja.paivakirja;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
//@Table(name = "topic", catalog="postgres", schema="public")
public class Topic {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    private String additionalsource;
    private boolean complete;
    private Timestamp creationdate;
    private Timestamp completedate;
    private Timestamp alerttime;
    private boolean alarmstatus;

    public Topic() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditionalsource() {
        return additionalsource;
    }

    public void setAdditionalsource(String additionalsource) {
        this.additionalsource = additionalsource;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public Timestamp getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Timestamp creationdate) {
        this.creationdate = creationdate;
    }

    public Timestamp getCompletedate() {
        return completedate;
    }

    public void setCompletedate(Timestamp completedate) {
        this.completedate = completedate;
    }

    public Timestamp getAlerttime() {
        return alerttime;
    }

    public void setAlerttime(Timestamp alerttime) {
        this.alerttime = alerttime;
    }

    public boolean isAlarmstatus() {
        return alarmstatus;
    }

    public void setAlarmstatus(boolean alarmstatus) {
        this.alarmstatus = alarmstatus;
    }


}
