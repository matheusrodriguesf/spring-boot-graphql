package br.com.arcelino.comprasservice.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "tb_compra")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    Long id;

    @Column(name = "dt_compra", nullable = false)
    LocalDate data;

    @Column(name = "nu_quantidade", nullable = false)
    Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "id_produto", nullable = false)
    Produto produto;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    Cliente cliente;

}
