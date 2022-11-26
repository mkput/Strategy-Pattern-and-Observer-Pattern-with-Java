package Observers;

import Features.Chart;

public class TotalProductView extends Observer {
    public TotalProductView(Chart chart){
        this.chart = chart;
        this.chart.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Total Product in chart : " + this.chart.getTotalProduct());
    }
    
}
