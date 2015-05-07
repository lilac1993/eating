package chart;

import java.awt.Font;  
import java.text.SimpleDateFormat;  
  
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;  
import org.jfree.chart.axis.ValueAxis;  
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;  
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.time.Month;  
import org.jfree.data.time.TimeSeries;  
import org.jfree.data.time.TimeSeriesCollection;  
import org.jfree.data.xy.XYDataset;

public class ChartUtil {
	
	private static CategoryDataset getCategoryDataset(){
		DefaultKeyedValues keyedValues= new DefaultKeyedValues();
		keyedValues.addValue("1", 310);
		keyedValues.addValue("2", 489);
		keyedValues.addValue("3", 512);
		keyedValues.addValue("4", 589);
		keyedValues.addValue("5", 359);
		keyedValues.addValue("6", 444);
		CategoryDataset dataset=DatasetUtilities.createCategoryDataset("丁灿标折线图", keyedValues);
		return dataset;
		
	}
	public static JFreeChart getJFreeChart(){
		CategoryDataset dataset=getCategoryDataset();
		JFreeChart chart=ChartFactory.createLineChart("销售量", "月份", "单位：个", dataset, PlotOrientation.VERTICAL, true, false, false);
	return chart;
	}
	public static void updateFont(JFreeChart chart){
		TextTitle textTitle= chart.getTitle();
		textTitle.setFont(new Font("宋体",Font.PLAIN,20));
		LegendTitle legendTitle=chart.getLegend();
		legendTitle.setItemFont(new Font("宋体",Font.PLAIN,14));
		CategoryPlot categoryPlot = chart.getCategoryPlot();
		CategoryAxis categoryAxis=categoryPlot.getDomainAxis();
		categoryAxis.setTickLabelFont(new Font("宋体",Font.PLAIN,14));
		categoryAxis.setLabelFont(new Font("宋体",Font.PLAIN,14));
		ValueAxis valueAxis=categoryPlot.getRangeAxis();
		valueAxis.setTickLabelFont(new Font("宋体",Font.PLAIN,14));
		valueAxis.setLabelFont(new Font("宋体",Font.PLAIN,14));
		
	}
	
}
