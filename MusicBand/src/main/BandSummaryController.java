/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author ghosh
 */
public class BandSummaryController implements Initializable {

   
    @FXML
    private BarChart<String, Number> chart;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void barChart(ActionEvent event) throws IOException {
        XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
        series.getData().add(new XYChart.Data<String,Number>("Metallica",225500));
        series.getData().add(new XYChart.Data<String,Number>("LRB",335670));
        series.getData().add(new XYChart.Data<String,Number>("Black",256678));
        series.getData().add(new XYChart.Data<String,Number>("Shironaamhin",345988));
        series.setName("Profits Earned");
        chart.getData().add(series);
    }    
    

 }
