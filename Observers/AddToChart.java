package Observers;

import Features.Chart;

public class AddToChart extends Observer {
    public AddToChart(Chart chart){
        this.chart = chart;
        this.chart.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Added to Chart!");
    }
}
