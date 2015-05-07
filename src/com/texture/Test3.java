package com.texture;

import java.awt.Color; 
import java.awt.Font; 
import java.io.File; 
import java.io.IOException; 

import javax.swing.ImageIcon; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 

import org.jfree.chart.ChartFactory; 
import org.jfree.chart.ChartUtilities; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.axis.NumberAxis; 
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator; 
import org.jfree.chart.plot.CategoryPlot; 
import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.chart.renderer.category.BarRenderer3D; 
import org.jfree.data.category.DefaultCategoryDataset; 

public class Test3 extends JFrame{ 

public  Test3(String k){ 

super.setTitle(k); 
this.setSize(600, 300); 
this.setLocation(200, 300); 
this.setVisible(true); 
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
} 

public static void main(String[] args){ 
Test3 test = new Test3("heheh"); 
for(int i=0;i<20;i++){ 
test.drow(i); 
} 

JPanel panel = new JPanel(); 

//ImageIcon img = new ImageIcon("C:\\0.png"); 
JLabel picturelabel = new JLabel(new ImageIcon("C:\\对比图.png")); 
//picturelabel.setIcon(img); 
panel.add(picturelabel); 
test.add(panel); 
test.show(); 
//test.setVisible(true); 
//testtest.add(); 

} 

public void drow(int n){ 

DefaultCategoryDataset dataset = new DefaultCategoryDataset(); 

  String series2 = "TV"; 
  String series3 = "Washing"; 

  //循环里面加入数据 
  for(int i=0;i<n;i++){ 
  //第一个参数是拐点变化范围，第二个参数是这条折线代表什么， 
  //第三个参数是横轴的刻度 
// dataset.addValue(1.0+Math.random(), series1, Integer.toString(i)); 
  dataset.addValue(3.0+Math.random(), series2, Integer.toString(i)); 
  dataset.addValue(3.5, series3, Integer.toString(i)); 
  //dataset.addValue(4.0, series4, Integer.toString(i)); 

  } 

BarRenderer3D renderer = new BarRenderer3D(); 
JFreeChart chart = null; 
String title = "test drow"; 
//chart = ChartFactory.createBarChart3D("辅导员 "+title+" 比例统计图",title,"数量",dataset,PlotOrientation.VERTICAL,false,false,false); 
chart = ChartFactory.createLineChart( 
"Picture", //图表标题 
"Time", //X轴标题 
"Number", //Y轴标题  
dataset,  //绘图数据集  
PlotOrientation.VERTICAL, //绘制方向 
true, //是否显示图例  
true,  //是否采用标准生成器 
false);//是否生成超链接  
CategoryPlot plot = chart.getCategoryPlot();  //通过plot使柱上方显示具体的数据 
NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis(); 
rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits()); 
rangeAxis.setAutoRangeIncludesZero(true); 
rangeAxis.setUpperMargin(0.3); 
rangeAxis.setLabelAngle(Math.PI ); 
//rangeAxis.setRange(1.5, 1.5); 

try { 
ChartUtilities.saveChartAsPNG(new File("./WebRoot/tjimages/对比图"+n+".png"), chart, 550, 250); 
} catch (IOException e) { 
// TODO Auto-generated catch block 
e.printStackTrace(); 
} 
} 
} 