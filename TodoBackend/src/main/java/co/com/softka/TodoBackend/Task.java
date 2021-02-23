package co.com.softka.TodoBackend;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private  long id;
    @NotNull
    private String name;
    @NotNull
    private long idList;
    private Boolean stateTask;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdList() {
        return idList;
    }

    public void setIdList(long idList) {
        this.idList = idList;
    }

    public Boolean getStateTask() {
        return stateTask;
    }

    public void setStateTask(Boolean stateTask) {
        this.stateTask = stateTask;
    }
}
