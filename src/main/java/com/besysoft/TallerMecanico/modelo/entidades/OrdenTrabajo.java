package com.besysoft.TallerMecanico.modelo.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "ordenes_trabajo")
public class OrdenTrabajo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cantidad_cuotas")
    private Integer cantidadCuotas;

    @Column(name = "detalle_falla")
    private String detalleFalla;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_fin_reparacion")
    private LocalDateTime fechaFinReparacion;

    @Column(name = "fecha_ingreso")
    private LocalDateTime fechaIngreso;

    @Column(name = "fecha_pago")
    private LocalDateTime fechaPago;

    @Column(name = "forma_pago")
    private String formaPago;

    @Column(name = "importe_total")
    private BigDecimal importeTotal;

    @Column(name = "kilometraje")
    private Integer kilometraje;

    @Column(name = "nivel_combustible")
    private String nivelCombustible;

    @Column(name = "tipo_tarjeta")
    private String tipoTarjeta;
//ver aca! Tengo que usar enumerados
    @ManyToOne
    @JoinColumn(name = "administrativo_id")
    private Empleado administrativo;

    @ManyToOne
    @JoinColumn(name = "recepcionista_id")
    private Empleado recepcionista;

    @ManyToOne(
            optional = true,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinColumn(
            name = "vehiculo_id",
            foreignKey = @ForeignKey(name = "FK_VEHICULO_ID")
    )
    private Vehiculo vehiculo;

    public LocalDateTime getFechaFinReparacion() {
        return fechaFinReparacion;
    }

    @PrePersist
    private void antesDePersistir(){
        this.fechaIngreso = LocalDateTime.now();
    }

    @PreUpdate
    private void antesDeUpdate(){
        this.fechaFinReparacion = LocalDateTime.now();
    }
}
