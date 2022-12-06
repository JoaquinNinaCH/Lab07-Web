/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Usuario
 */
import java.util.Date;

public class Cursos {
    int codigo, duracion, sesiones, inscritos, capacidad;
    String nombre, estado;
    double costo;
    Date fec_ini, fec_fin;

    public Cursos(int codigo, int duracion, int sesiones, int inscritos, int capacidad, String nombre, String estado, double costo, Date fec_ini, Date fec_fin) {
        this.codigo = codigo;
        this.duracion = duracion;
        this.sesiones = sesiones;
        this.inscritos = inscritos;
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.estado = estado;
        this.costo = costo;
        this.fec_ini = fec_ini;
        this.fec_fin = fec_fin;
    }

    public Cursos() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getSesiones() {
        return sesiones;
    }

    public void setSesiones(int sesiones) {
        this.sesiones = sesiones;
    }

    public int getInscritos() {
        return inscritos;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFec_ini() {
        return fec_ini;
    }

    public void setFec_ini(Date fec_ini) {
        this.fec_ini = fec_ini;
    }

    public Date getFec_fin() {
        return fec_fin;
    }

    public void setFec_fin(Date fec_fin) {
        this.fec_fin = fec_fin;
    }
    
    
}
