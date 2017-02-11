import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.*;
import java.util.function.*;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.scene.chart.*;
import java.util.stream.*;

public class LineChartDemo extends Application{
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {

		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(10);
		gridPane.setVgap(10);
		gridPane.setPadding(new Insets(25, 25, 25, 25));

		final CategoryAxis xAxis = new CategoryAxis();
		final NumberAxis yAxis = new NumberAxis();
		xAxis.setLabel("Category");
		yAxis.setLabel("Price");
		final LineChart<String,Number> lineChart = 
		  new LineChart<>(xAxis,yAxis);

		XYChart.Series<String,Number> series = 
		  new XYChart.Series<>();
		series.setName("Series 1");
		series.getData().add(
			new XYChart.Data<String, Number>("Cat 1", 10)
		);
		series.getData().add(
			new XYChart.Data<String, Number>("Cat 2", 20)
		);
		series.getData().add(
			new XYChart.Data<String, Number>("Cat 3", 30)
		);
		series.getData().add(
			new XYChart.Data<String, Number>("Cat 4", 40)
		);
		lineChart.getData().add(series);

		XYChart.Series<String, Number> series2 = 
		  new XYChart.Series<>();
		series2.setName("Series 2");
		series2.getData().add(
			new XYChart.Data<String, Number>("Cat 1", 40)
		);
		series2.getData().add(
			new XYChart.Data<String, Number>("Cat 2", 30)
		);
		series2.getData().add(
			new XYChart.Data<String, Number>("Cat 3", 20)
		);
		series2.getData().add(
			new XYChart.Data<String, Number>("Cat 4", 10)
		);
		lineChart.getData().add(series2);

		gridPane.add(lineChart, 1, 1);
		
		Scene scene = new Scene(gridPane, 800, 600);
		stage.setTitle("Line Charts");
		stage.setScene(scene);
		stage.show();
	}

}