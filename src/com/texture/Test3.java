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
JLabel picturelabel = new JLabel(new ImageIcon("C:\\�Ա�ͼ.png")); 
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

  //ѭ������������� 
  for(int i=0;i<n;i++){ 
  //��һ�������ǹյ�仯��Χ���ڶ����������������ߴ���ʲô�� 
  //�����������Ǻ���Ŀ̶� 
// dataset.addValue(1.0+Math.random(), series1, Integer.toString(i)); 
  dataset.addValue(3.0+Math.random(), series2, Integer.toString(i)); 
  dataset.addValue(3.5, series3, Integer.toString(i)); 
  //dataset.addValue(4.0, series4, Integer.toString(i)); 

  } 

BarRenderer3D renderer = new BarRenderer3D(); 
JFreeChart chart = null; 
String title = "test drow"; 
//chart = ChartFactory.createBarChart3D("����Ա "+title+" ����ͳ��ͼ",title,"����",dataset,PlotOrientation.VERTICAL,false,false,false); 
chart = ChartFactory.createLineChart( 
"Picture", //ͼ����� 
"Time", //X����� 
"Number", //Y�����  
dataset,  //��ͼ���ݼ�  
PlotOrientation.VERTICAL, //���Ʒ��� 
true, //�Ƿ���ʾͼ��  
true,  //�Ƿ���ñ�׼������ 
false);//�Ƿ����ɳ�����  
CategoryPlot plot = chart.getCategoryPlot();  //ͨ��plotʹ���Ϸ���ʾ��������� 
NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis(); 
rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits()); 
rangeAxis.setAutoRangeIncludesZero(true); 
rangeAxis.setUpperMargin(0.3); 
rangeAxis.setLabelAngle(Math.PI ); 
//rangeAxis.setRange(1.5, 1.5); 

try { 
ChartUtilities.saveChartAsPNG(new File("./WebRoot/tjimages/�Ա�ͼ"+n+".png"), chart, 550, 250); 
} catch (IOException e) { 
// TODO Auto-generated catch block 
e.printStackTrace(); 
} 
} 
} 