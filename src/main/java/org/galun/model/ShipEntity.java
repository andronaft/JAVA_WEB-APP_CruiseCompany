package org.galun.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SHIP", schema = "CRUISEDB", catalog = "TEST")
public class ShipEntity {
    private int id;
    private String name;
    private int capacity;

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
    @Column(name = "CAPACITY")
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShipEntity that = (ShipEntity) o;
        return id == that.id &&
                capacity == that.capacity &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, capacity);
    }
}
