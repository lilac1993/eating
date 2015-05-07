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
	
      
     private static XYDataset createDataset() {  //������ݼ��е�࣬�����������  
            TimeSeries timeseries = new TimeSeries("legal & generalŷ��ָ������",  
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
            TimeSeries timeseries1 = new TimeSeries("legal & generalӢ��ָ������",  
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
    	        JFreeChart jfreechart = ChartFactory.createTimeSeriesChart("Legal & General��λ���л���۸�", "����", "�۸�",xydataset, true, true, true);  
    	        XYPlot xyplot = (XYPlot) jfreechart.getPlot();  
    	        DateAxis dateaxis = (DateAxis) xyplot.getDomainAxis();  
    	        dateaxis.setDateFormatOverride(new SimpleDateFormat("MMM-yyyy"));  
    	        frame1=new ChartPanel(jfreechart,true);  
    	        dateaxis.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����  
    	        dateaxis.setTickLabelFont(new Font("����",Font.BOLD,12));  //��ֱ����  
    	        ValueAxis rangeAxis=xyplot.getRangeAxis();//��ȡ��״  
    	        rangeAxis.setLabelFont(new Font("����",Font.BOLD,15));  
    	        jfreechart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));  
    	        jfreechart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ������� 
    	        JFrame frame=new JFrame("Java����ͳ��ͼ");  
    	      //frame.setLayout(new GridLayout(2,2,10,10));  
    	        frame.add(new chart().getChartPanel());    //�������ͼ  
    	      
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
	              title, // ͼ�����
	              wfield, // �������ʾ��ǩ
	              hfield, // �������ʾ��ǩ
	              dataset, //���ݼ�
	              PlotOrientation.VERTICAL, // ͼ����ˮƽ����ֱ
	              true, // �Ƿ���ʾͼ��
	              true, // �Ƿ�������ʾ���� tooltips
	              false // �Ƿ�����URL����
	         );
	         
	         //����ͼƬ�ı���ɫ
	         chart.setBackgroundPaint(new java.awt.Color(189,235,255));

	         CategoryPlot plot = (CategoryPlot) chart.getPlot();
	         plot.setBackgroundPaint(new Color(239,251,255));//����ͼƬ��ǽ��ı���ɫ
	         plot.setRangeGridlinePaint(Color.black);//����ͼƬ�и����ߵ���ɫ
	         
	         // û������ʱ��ʾ����Ϣ
	         plot.setNoDataMessage("û�����ͳ������");  
	         plot.setNoDataMessageFont(new Font("����", Font.CENTER_BASELINE, 16));
	         plot.setNoDataMessagePaint(Color.RED);
	         
	         NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
	         rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());//����ͼ�еĿ̶��ߵĵ�λ
	         rangeAxis.setAutoRangeIncludesZero(true);//ǿ�����Զ�ѡ������ݷ�Χ�а���0
	         
	         LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
	         renderer.setDrawOutlines(true);//���ߵ����ݵ���ݷ���ʹ�ò�ͬ����״
	         renderer.setItemLabelsVisible(true);//��ʾÿ�����ϵ�����ֵ����ʾ����,���ݱ�ǩ�Ƿ�ɼ�
	         
	         
	         ChartRenderingInfo info = new ChartRenderingInfo(new
	              StandardEntityCollection());
	          //500��ͼƬ���ȣ�300��ͼƬ�߶�
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
