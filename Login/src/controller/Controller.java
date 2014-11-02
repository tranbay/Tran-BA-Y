package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	TextField user;
	@FXML
	PasswordField pass;
	@FXML
	Button login;
	@FXML
	Button cancel;
	@FXML
	public void onClickLogin(ActionEvent e){
		
	}
	@FXML
	public void onClickCancel(ActionEvent e){
		
	}
	
	

}
