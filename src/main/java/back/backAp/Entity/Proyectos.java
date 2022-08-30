package back.backAp.Entity;

import javax.persistence.*;

@Entity
public class Proyectos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProy;
    private String tituloProy;

    private String fechaProy;
    @Column(length = 1000)
    private String descProy;
    private String imagenProy;

    public Proyectos() {
    }

    public Proyectos(Long idProy, String tituloProy, String fechaProy, String descProy, String imagenProy) {
        this.idProy = idProy;
        this.tituloProy = tituloProy;
        this.fechaProy = fechaProy;
        this.descProy = descProy;
        this.imagenProy = imagenProy;
    }

    public Long getIdProy() {
        return idProy;
    }

    public void setIdProy(Long idProy) {
        this.idProy = idProy;
    }

    public String getTituloProy() {
        return tituloProy;
    }

    public void setTituloProy(String tituloProy) {
        this.tituloProy = tituloProy;
    }

    public String getFechaProy() {
        return fechaProy;
    }

    public void setFechaProy(String fechaProy) {
        this.fechaProy = fechaProy;
    }

    public String getDescProy() {
        return descProy;
    }

    public void setDescProy(String descProy) {
        this.descProy = descProy;
    }

    public String getImagenProy() {
        return imagenProy;
    }

    public void setImagenProy(String imagenProy) {
        this.imagenProy = imagenProy;
    }
}
