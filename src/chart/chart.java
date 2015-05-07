package chart;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.PrintWriter;

import javax.servlet.http.HttpSession;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;

import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.servlet.ServletUtilities;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;

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
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.time.Month;  
import org.jfree.data.time.TimeSeries;  
import org.jfree.data.time.TimeSeriesCollection;  
import org.jfree.data.xy.XYDataset;

public class chart extends HttpServlet {
	
	static ChartPanel frame1;
	
      
     private static XYDataset createDataset() {  //这个数据集有点多，但都不难理解  
            TimeSeries timeseries = new TimeSeries("legal & general欧洲指数信任",  
                    org.jfree.data.time.Month.class);  
            timeseries.add(new Month(2, 2001), 181.80000000000001D);  
            timeseries.add(new Month(3, 2001), 167.30000000000001D);  
            timeseries.add(new Month(4, 2001), 153.80000000000001D);  
            timeseries.add(new Month(5, 2001), 167.59999999999999D);  
            timeseries.add(new Month(6, 2001), 158.80000000000001D);  
            timeseries.add(new Month(7, 2001), 148.30000000000001D);  
            timeseries.add(new Month(8, 2001), 153.90000000000001D);  
            timeseries.add(new Month(9, 2001), 142.69999999999999D);  
            timeseries.add(new Month(10, 2001), 123.2D);  
            timeseries.add(new Month(11, 2001), 131.80000000000001D);  
            timeseries.add(new Month(12, 2001), 139.59999999999999D);  
            timeseries.add(new Month(1, 2002), 142.90000000000001D);  
            timeseries.add(new Month(2, 2002), 138.69999999999999D);  
            timeseries.add(new Month(3, 2002), 137.30000000000001D);  
            timeseries.add(new Month(4, 2002), 143.90000000000001D);  
            timeseries.add(new Month(5, 2002), 139.80000000000001D);  
            timeseries.add(new Month(6, 2002), 137D);  
            timeseries.add(new Month(7, 2002), 132.80000000000001D);  
            TimeSeries timeseries1 = new TimeSeries("legal & general英国指数信任",  
                    org.jfree.data.time.Month.class);  
            timeseries1.add(new Month(2, 2001), 129.59999999999999D);  
            timeseries1.add(new Month(3, 2001), 123.2D);  
            timeseries1.add(new Month(4, 2001), 117.2D);  
            timeseries1.add(new Month(5, 2001), 124.09999999999999D);  
            timeseries1.add(new Month(6, 2001), 122.59999999999999D);  
            timeseries1.add(new Month(7, 2001), 119.2D);  
            timeseries1.add(new Month(8, 2001), 116.5D);  
            timeseries1.add(new Month(9, 2001), 112.7D);  
            timeseries1.add(new Month(10, 2001), 101.5D);  
            timeseries1.add(new Month(11, 2001), 106.09999999999999D);  
            timeseries1.add(new Month(12, 2001), 110.3D);  
            timeseries1.add(new Month(1, 2002), 111.7D);  
            timeseries1.add(new Month(2, 2002), 111D);  
            timeseries1.add(new Month(3, 2002), 109.59999999999999D);  
            timeseries1.add(new Month(4, 2002), 113.2D);  
            timeseries1.add(new Month(5, 2002), 111.59999999999999D);  
            timeseries1.add(new Month(6, 2002), 108.8D);  
            timeseries1.add(new Month(7, 2002), 101.59999999999999D);  
            TimeSeriesCollection timeseriescollection = new TimeSeriesCollection();  
            timeseriescollection.addSeries(timeseries);  
            timeseriescollection.addSeries(timeseries1);  
            return timeseriescollection;  
        }  
      public ChartPanel getChartPanel(){  
            return frame1;  
              
        } 
     
      
    	  public static void main(String args[]){  
    		  	XYDataset xydataset = createDataset();  
    	        JFreeChart jfreechart = ChartFactory.createTimeSeriesChart("Legal & General单位信托基金价格", "日期", "价格",xydataset, true, true, true);  
    	        XYPlot xyplot = (XYPlot) jfreechart.getPlot();  
    	        DateAxis dateaxis = (DateAxis) xyplot.getDomainAxis();  
    	        dateaxis.setDateFormatOverride(new SimpleDateFormat("MMM-yyyy"));  
    	        frame1=new ChartPanel(jfreechart,true);  
    	        dateaxis.setLabelFont(new Font("黑体",Font.BOLD,14));         //水平底部标题  
    	        dateaxis.setTickLabelFont(new Font("宋体",Font.BOLD,12));  //垂直标题  
    	        ValueAxis rangeAxis=xyplot.getRangeAxis();//获取柱状  
    	        rangeAxis.setLabelFont(new Font("黑体",Font.BOLD,15));  
    	        jfreechart.getLegend().setItemFont(new Font("黑体", Font.BOLD, 15));  
    	        jfreechart.getTitle().setFont(new Font("宋体",Font.BOLD,20));//设置标题字体 
    	        JFrame frame=new JFrame("Java数据统计图");  
    	      //frame.setLayout(new GridLayout(2,2,10,10));  
    	        frame.add(new chart().getChartPanel());    //添加折线图  
    	      
    	        frame.setBounds(50, 50, 800, 300);  
    	        frame.setVisible(true);  
    	      
    	        try { 
    	        	 ChartUtilities.saveChartAsPNG(new File("./WebRoot/tjimages/tj"+".png"),jfreechart , 550, 250); 
    	    	  } catch (IOException e) { 
    	    	  // TODO Auto-generated catch block 
    	    		 e.printStackTrace(); 
    	    	  } 
    	      
    	      //String filename=ServletUtilities.saveChartAsJPEG(chart, 800, 300, null, request.getSession());
    	  }  
    	  
	  /*private DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	     
	   public void setValue(int sum, String line, String wfield) 
	   {
	  
	     dataset.addValue(sum, line, wfield);
	     
	   }
	   
	   public String generateLineChart(String title,String wfield, String hfield, HttpSession session, PrintWriter pw,int wPhoto,int hPhoto)
	    {
	     String filename = null;
	    
	    try
	     {
	         final JFreeChart chart = ChartFactory.createLineChart
	           (
	              title, // 图表标题
	              wfield, // 横轴的显示标签
	              hfield, // 纵轴的显示标签
	              dataset, //数据集
	              PlotOrientation.VERTICAL, // 图表方向：水平、垂直
	              true, // 是否显示图例
	              true, // 是否生成提示工具 tooltips
	              false // 是否生成URL链接
	         );
	         
	         //设置图片的背景色
	         chart.setBackgroundPaint(new java.awt.Color(189,235,255));

	         CategoryPlot plot = (CategoryPlot) chart.getPlot();
	         plot.setBackgroundPaint(new Color(239,251,255));//生成图片中墙体的背景色
	         plot.setRangeGridlinePaint(Color.black);//生成图片中格子线的颜色
	         
	         // 没有数据时显示的消息
	         plot.setNoDataMessage("没有相关统计数据");  
	         plot.setNoDataMessageFont(new Font("黑体", Font.CENTER_BASELINE, 16));
	         plot.setNoDataMessagePaint(Color.RED);
	         
	         NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
	         rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());//设置图中的刻度线的单位
	         rangeAxis.setAutoRangeIncludesZero(true);//强制在自动选择的数据范围中包含0
	         
	         LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
	         renderer.setDrawOutlines(true);//折线的数据点根据分类使用不同的形状
	         renderer.setItemLabelsVisible(true);//显示每个点上的数据值的提示工具,数据标签是否可见
	         
	         
	         ChartRenderingInfo info = new ChartRenderingInfo(new
	              StandardEntityCollection());
	          //500是图片长度，300是图片高度
	          filename = ServletUtilities.saveChartAsPNG(chart, wPhoto, hPhoto, info, session);
	          ChartUtilities.writeImageMap(pw, filename, info, false);
	          pw.flush();
	     }
	     catch(Exception e)
	     {
	      e.printStackTrace();
	     }
	     return filename;
	    }
	*/
}
