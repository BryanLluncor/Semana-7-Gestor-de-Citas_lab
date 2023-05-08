/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordecitas;

import entidades.Cita;
import entidades.Medico;
import entidades.Paciente;
import java.util.ArrayList;
import java.util.List;
import pantallas.JFrameGestordeCitas;

/**
 *
 * @author Estudiante
 */
public class Getor_citas {
    
   
    public static List<Cita> citaEnElSitema;
    public static List<Paciente> listaDePaciente;
    public static List<Medico> listaDeMedico;
    
    
    public static List<String> horasDisponible = new ArrayList<>();
    public static List<String> fechasDisponible = new ArrayList<>();
    
    public static void main(String[] args) {
        
        //generar las lista en blanco para todo el sistema hasta que se cierre
        citaEnElSitema = new ArrayList<>();
        listaDePaciente = new ArrayList<>();
        listaDeMedico = new ArrayList<>();
        
        horasDisponible.add("8:00am");
        horasDisponible.add("8:30am");
        horasDisponible.add("9:00am");
        horasDisponible.add("9:30am");
        horasDisponible.add("10:00am");
        
        
        fechasDisponible.add("10/02/2022");
        fechasDisponible.add("11/02/2022");
        fechasDisponible.add("12/02/2022");
        fechasDisponible.add("13/02/2022");
        fechasDisponible.add("14/02/2022");
        
        
        //Incio la ventana principal de gestor de cita
        JFrameGestordeCitas framePrincipal =new JFrameGestordeCitas();  //llamar la ventana princal
        framePrincipal.setLocationRelativeTo(null); //Para centrar en la ventana 
        framePrincipal.setVisible(true); //Hacer visible el formulario
        
        
    }
    
}
