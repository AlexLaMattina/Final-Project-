package app.controller;

import app.StudentCalc;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import java.net.URL;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import app.helper.Loan;
import app.helper.Payment;

public class LoanCalcViewController implements Initializable   {
	private StudentCalc SC = null;
	
	@FXML
	private TextField LoanAmount;
	private TextField IntRate;
	private TextField Term;
	private TextField ExtraPayment;
	
	@FXML
	private Label lblTotalPayemnts;
	
	@FXML
	private DatePicker PaymentStartDate;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void setMainApp(StudentCalc sc) {
		this.SC = sc;
	}
	
	/**
	 * btnCalcLoan - Fire this event when the button clicks
	 * 
	 * @version 1.0
	 * @param event
	 */
	@FXML
	private void btnCalcLoan(ActionEvent event) {		
		System.out.println("Amount: " + LoanAmount.getText());
		double dLoanAmount = Double.parseDouble(LoanAmount.getText());
		System.out.println("Amount: " + dLoanAmount);	
		
		System.out.println("Interest Rate: " + IntRate);
		double dIntRate = Double.parseDouble(IntRate.getText());
		System.out.println("Interest Rate: " + dIntRate);
		
		System.out.println("Term: " + Term);
		double dTerm = Double.parseDouble(Term.getText());
		System.out.println("Term: " + dTerm);
		
		System.out.println("Additional Payment: " + ExtraPayment);
		double dExtraPayment = Double.parseDouble(ExtraPayment.getText());
		System.out.println("Additional Payment: " + dExtraPayment);	
		
		lblTotalPayemnts.setText("123");				
		LocalDate localDate = PaymentStartDate.getValue();	 
		System.out.println(localDate);
	}
}
