/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.Estudiante;

/**
 *
 * @author Dell
 */
public class Daoestudiantes {
    ArrayList<Estudiante> listado =new ArrayList<>();
     // CREATE
    public void crearEstudiante(Estudiante estudiante) {
        listado.add(estudiante);
    }

    // READ
    public ArrayList<Estudiante> obtenerEstudiantes() {
        return listado;
    }

    public Estudiante obtenerEstudiante(int id) {
        for (Estudiante estudiante : listado) {
            if (estudiante.getId() == id) {
                return estudiante;
            }
        }
        return null;
    }

    // UPDATE
    public void actualizarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).getId() == estudiante.getId()) {
                listado.set(i, estudiante);
                return;
            }
        }
    }

    // DELETE
    public void eliminarEstudiante(int id) {
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).getId() == id) {
                listado.remove(i);
                return;
            }
        }
    }
     public DefaultTableModel mostrar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Carrera");
        modelo.addColumn("Promedio");

        for (Estudiante estudiante : listado) {
            Object[] fila = new Object[5];
            fila[0] = estudiante.getId();
            fila[1] = estudiante.getNombres();
            fila[2] = estudiante.getApellidos();
            fila[3] = estudiante.getCarrera();
            fila[4] = estudiante.getPromedio();
            modelo.addRow(fila);
        }

        return modelo;
    }
}


