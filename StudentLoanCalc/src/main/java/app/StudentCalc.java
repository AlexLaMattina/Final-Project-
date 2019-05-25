package app;

import java.io.IOException;
import java.util.LinkedList;
import app.controller.LoanCalcViewController;
import app.helper.Payment;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
public class StudentCalc extends Application {

	private Stage primaryStage;
	
	private BorderPane LoanScreen = null;
	
	private LoanCalcViewController LCVC = null;
	//private TableView<Payment> table = new TableView<Payment>();
	//private final ObservableList<Payment> data = (ObservableList<Payment>) FXCollections.observableArrayList(new Payment(0, null, 0, null));
	
	
	public static void main(String[] args) {
		launch(args);
	}/*
	public void buildData() {
		data = FXCollections.observableArrayList();
		while(true) {
			ObservableList<String> row = FXCollections.observableArrayList();
			for(int i=1; i<:i++) {
				row.add(e);
			}
			data.add(row);
		}
		tableview.setItems(data);
	}
	*/
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		
		ShowScreen();
		
	}

	public void ShowScreen() {
		// Parent root;
		try {

			FXMLLoader loader = new FXMLLoader();
			loader = new FXMLLoader(getClass().getResource("/app/view/LoanCalcView.fxml"));
			LoanScreen = (BorderPane) loader.load();
			Scene scene = new Scene(LoanScreen);		
			primaryStage.setScene(scene);
			LCVC = loader.getController();
			LCVC.setMainApp(this);
			primaryStage.show();			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
