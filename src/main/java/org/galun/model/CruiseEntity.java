package org.galun.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CRUISE", schema = "CRUISEDB", catalog = "TEST")
public class CruiseEntity {
    private int id;
    private String name;
    private int duration;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CruiseEntity that = (CruiseEntity) o;
        return id == that.id &&
                duration == that.duration &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, duration);
    }
}
