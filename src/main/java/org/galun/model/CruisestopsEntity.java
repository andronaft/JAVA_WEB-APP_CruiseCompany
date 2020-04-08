package org.galun.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CRUISESTOPS", schema = "CRUISEDB", catalog = "TEST")
public class CruisestopsEntity {
    private int idCruise;
    private int idPort;

    @Basic
    @Column(name = "ID_CRUISE")
    public int getIdCruise() {
        return idCruise;
    }

    public void setIdCruise(int idCruise) {
        this.idCruise = idCruise;
    }

    @Basic
    @Column(name = "ID_PORT")
    public int getIdPort() {
        return idPort;
    }

    public void setIdPort(int idPort) {
        this.idPort = idPort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CruisestopsEntity that = (CruisestopsEntity) o;
        return idCruise == that.idCruise &&
                idPort == that.idPort;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCruise, idPort);
    }
}
