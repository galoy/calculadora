/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author ADSI014
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private TextField tf_nombre;
    @FXML private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnpunto,btndivicion,btnmultiplicacion,btnresta,btnsuma,btnresultado,btnporcentage,boton;
    @FXML private TextArea tb_caja;
    
    public void accionboton (ActionEvent event){
        if (event.getSource()==btn1){
    System.out.println("1");
    boton=btn1;
    }
        if (event.getSource()==btn2){
    System.out.println("2");
     boton=btn2;
    }
        if (event.getSource()==btn3){
    System.out.println("3");
     boton=btn3;
    }
    if (event.getSource()==btn4){
    System.out.println("4");
     boton=btn4;
    }
        if (event.getSource()==btn5){
    System.out.println("5");
     boton=btn5;
    }
        if (event.getSource()==btn6){
    System.out.println("6");
     boton=btn6;
    }
     if (event.getSource()==btn7){
    System.out.println("7");
     boton=btn7;
    }
        if (event.getSource()==btn8){
    System.out.println("8");
     boton=btn8;
    }
    if (event.getSource()==btn9){
    System.out.println("9");
     boton=btn9;
    }
        if (event.getSource()==btn0){
    System.out.println("0");
     boton=btn0;
    }
        String boton="";
        tb_caja.appendText(boton);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
