
package org.alejandrolarrave.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    float dato1,dato2,resultado;
    int op;
    @FXML private TextField txtValores;
    @FXML private Button btnSumarrestar;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnIgual;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnSumar;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnResta;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMultiplicacion;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private Button btnBorrar;
    @FXML private Button btnDivision;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnRaiz;
    @FXML private Button btnCuadrado;
    @FXML private Button btnUnoequis;
        
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource()== btnUno)
            txtValores.setText(txtValores.getText()+"1");
            else if (event.getSource()== btnDos)
            txtValores.setText(txtValores.getText()+"2");
        else if (event.getSource()== btnTres)
            txtValores.setText(txtValores.getText()+"3");
        else if (event.getSource()== btnCuatro)
            txtValores.setText(txtValores.getText()+"4");
        else if (event.getSource()== btnCinco)
            txtValores.setText(txtValores.getText()+"5");
        else if (event.getSource()== btnSeis)
            txtValores.setText(txtValores.getText()+"6");
        else if (event.getSource()== btnSiete)
            txtValores.setText(txtValores.getText()+"7");
        else if (event.getSource()== btnOcho)
            txtValores.setText(txtValores.getText()+"8");
        else if (event.getSource()== btnNueve)
            txtValores.setText(txtValores.getText()+"9");
        else if (event.getSource()== btnCero)
            txtValores.setText(txtValores.getText()+"0");
        else if (event.getSource()== btnPunto)
            txtValores.setText(txtValores.getText()+".");
        
        else if (event.getSource()== btnSumar){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 1;       
                    
        }
        else if (event.getSource()== btnResta){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 2;
        }
        else if (event.getSource()== btnMultiplicacion){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 3;
        }
        else if (event.getSource()== btnDivision){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 4;         
        }
        else if (event.getSource()== btnPorcentaje){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 5;
        }
        else if (event.getSource()== btnCuadrado){
            dato1 = Float.parseFloat(txtValores.getText());          
            op = 6;         
        }
        else if (event.getSource()== btnRaiz){
            dato1 = Float.parseFloat(txtValores.getText());
            op = 7;
        }
        else if (event.getSource()== btnUnoequis){
            dato1 = Float.parseFloat(txtValores.getText());
            op = 8;
        }
        else if (event.getSource()== btnSumarrestar){
            dato1 = Float.parseFloat(txtValores.getText());
            op = 9;
        }
        else if(event.getSource()== btnIgual){
            dato2 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            resultado = dato1 + dato2;
            txtValores.setText(String.valueOf(resultado));
                 
            switch(op){
                case 1:
                    resultado = dato1 + dato2;
                    txtValores.setText(String.valueOf(resultado));
                    break;
                case 2:
                    resultado = dato1 - dato2;
                    txtValores.setText(String.valueOf(resultado));
                    break;
                case 3:
                    resultado = dato1 * dato2;
                    txtValores.setText(String.valueOf(resultado));
                    break;
                case 4:
                    resultado = dato1 / dato2;
                    txtValores.setText(String.valueOf(resultado));
                    break;
                case 5:
                    resultado = (dato1 * dato2)/100;
                    txtValores.setText(String.valueOf(resultado));
                    break;  
                case 6:
                    resultado = dato1 * dato1;
                    txtValores.setText(String.valueOf(resultado));
                    break;
                case 7:
                    resultado = (float) Math.sqrt(dato1);
                    txtValores.setText(String.valueOf(resultado));
                    break;
                case 8:
                    resultado = 1 / dato1;
                    txtValores.setText(String.valueOf(resultado));
                    break;
                case 9:
                    resultado = dato1 * -1;
                    txtValores.setText(String.valueOf(resultado));
                    break;
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
