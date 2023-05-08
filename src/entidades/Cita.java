/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class Cita {

    
    
    
    private int hora;
    private int fecha;
    private Medico medico;
    private Paciente paciente;    
    private Especialidad especialidad;
    
    //Metodo constructor

    public Cita(Medico medico, Paciente paciente, Especialidad especialidad) {
        this.medico = medico;
        this.paciente = paciente;
        this.especialidad = especialidad;
        
        
        
    }
    
    
    
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getFecha() {
        return fecha;
    }

    /**
     * @return the fecha
     */
    public void setFecha(int fecha) {    
        this.fecha = fecha;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String mostrardatos() {
       return this.getPaciente().getNombre() + " - " 
               + gestordecitas.Getor_citas.fechasDisponible.get(getFecha())+ 
               " - " 
               + gestordecitas.Getor_citas.horasDisponible.get(getHora()) +
               " - "
               +
               " | Medico: "+this.getMedico().getNombre();
               
    }
    
    
}
