package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			Scene scene = new Scene(root);
			/*
			Parent root2 = FXMLLoader.load(getClass().getResource("/application/ChatMessage.fxml"));
			Scene scene2 = new Scene(root2);
			Parent root3 = FXMLLoader.load(getClass().getResource("/application/ListView.fxml"));
			Scene scene3 = new Scene(root3);*/
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			/*primaryStage.setScene(scene2);
			primaryStage.setScene(scene3);*/

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
