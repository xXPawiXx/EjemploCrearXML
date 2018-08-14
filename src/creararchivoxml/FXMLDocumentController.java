/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creararchivoxml;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import modelo.Estudiante;

/**
 *
 * @author andres_fel.calero
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Label Nombre;
    
    @FXML
    private Label Telefono;
    
    @FXML
    private Label Correo;
    
    @FXML
    private Label Codigo;
    
    @FXML
    private Label Carrera;
    
    @FXML
    private TextField TNombre;
    
    @FXML
    private TextField TTelefono;
    
    @FXML
    private TextField TCorreo;
    
    @FXML
    private TextField TCodigo;
    
    @FXML
    private TextField TCarrera;
    
    LinkedList<Estudiante> listaE;
    
    
    @FXML
    private void Limpiar(ActionEvent e)
    {
        TNombre.clear();;
        TTelefono.clear();
        TCorreo.clear();
        TCodigo.clear();
        TCarrera.clear();
    }
    
    @FXML
    private void AgregarEstudiante(ActionEvent event) {
        
        String nombre = TNombre.getText();
        String telefono = TTelefono.getText();
        String correo = TCorreo.getText();
        String codigo = TCodigo.getText();
        String Carrera = TCarrera.getText();
        
        Estudiante objE = new Estudiante(codigo, Carrera, nombre, telefono, correo);
        listaE.add(objE);
    }
    
    @FXML
    private void GuardarArchivo(ActionEvent event) {
        
        Estudiante objeV = new Estudiante();        
        boolean guardar = objeV.crearArchivoXML(listaE);

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listaE = new LinkedList<>();
    }    
    
}
