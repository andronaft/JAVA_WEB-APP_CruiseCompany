package org.galun.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "EXCURSION", schema = "CRUISEDB", catalog = "TEST")
public class ExcursionEntity {
    private int id;
    private String name;
    private int cost;

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
    @Column(name = "COST")
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExcursionEntity that = (ExcursionEntity) o;
        return id == that.id &&
                cost == that.cost &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cost);
    }
}
