package jfreechart;

 
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;

 
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.ui.RectangleInsets;
/**
 * 实际取色的时候一定要16位的，这样比较准确
 *
 * @author new
 */
public class ch {
 
    private static final String CHART_PATH = "E:/";
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ch pm = new ch();
       
        // 生成折线图
        pm.makeLineAndShapeChart();
    }
 
    /**
     * 生成折线图
     */
    public void makeLineAndShapeChart() {
        double[][] data = new double[][]{
            {6, 6.1, 2, 5, 1},
            {3, 5, 2, 3, 1},
            {3, 2, 5, 2, 5}
        };
        String[] rowKeys = {"food", "live", "play"};
        String[] columnKeys = {"星期一", "星期二", "星期三", "星期四", "星期五"};
        CategoryDataset dataset = getBarData(data, rowKeys, columnKeys);
        createTimeXYChar("折线图", "X", "Y", dataset, "lineAndShap.png");
    }
 
    
    
    // 柱状图,折线图 数据集
    public CategoryDataset getBarData(double[][] data, String[] rowKeys,
            String[] columnKeys) {
        return DatasetUtilities.createCategoryDataset(rowKeys, columnKeys, data);
 
    }
   
    /**
     * 判断文件夹是否存在，如果不存在则新建
     * @param chartPath
     */
    private void isChartPathExist(String chartPath) {
        File file = new File(chartPath);
        if (!file.exists()) {
            file.mkdirs();
        // log.info("CHART_PATH="+CHART_PATH+"create.");
        }
    }
 
    /**
     * 折线图
     *
     * @param chartTitle
     * @param x
     * @param y
     * @param xyDataset
     * @param charName
     * @return
     */
    public String createTimeXYChar(String chartTitle, String x, String y,
            CategoryDataset xyDataset, String charName) {
 
        JFreeChart chart = ChartFactory.createLineChart(chartTitle, x, y,
                xyDataset, PlotOrientation.VERTICAL, true, true, false);
 
        //字体迷糊边界
        chart.setTextAntiAlias(true);
        //背景颜色
        chart.setBackgroundPaint(Color.WHITE);
        // 设置图标题的字体重新设置title
        Font font = new Font("隶书", Font.BOLD, 25);
        //标题
        TextTitle title = new TextTitle(chartTitle);
        //标题字体
        title.setFont(font);
        //标题内容
        chart.setTitle(title);
        // 设置面板字体
        Font labelFont = new Font("黑体", Font.TRUETYPE_FONT, 12);
 
        
        chart.setBackgroundPaint(Color.WHITE);
        //实例化categoryplot对象,获得图标中间部分即,plot
        CategoryPlot categoryplot = (CategoryPlot) chart.getPlot();
        // x轴 // 分类轴网格是否可见
        categoryplot.setDomainGridlinesVisible(true);
        // y轴 //数据轴网格是否可见
        categoryplot.setRangeGridlinesVisible(true);
 
        categoryplot.setRangeGridlinePaint(Color.WHITE);// 虚线色彩
 
        categoryplot.setDomainGridlinePaint(Color.WHITE);// 虚线色彩
 
        categoryplot.setBackgroundPaint(Color.WHITE);// 背景色彩
 
        //设置Y轴的范围（0D~8D）    ValueAxis:y轴交换属性
        ValueAxis valueaxis = categoryplot.getRangeAxis(); 
        //设置范围
        valueaxis.setRange(0D, 8D); 
        //是否自动设置Y轴范围
        valueaxis.setAutoRange(false); 
        
        // 设置轴和面板之间的距离
        //categoryplot.setAxisOffset(new RectangleInsets(5D, 5D, 5D, 5D));
        //获得横坐标（Y轴）
        CategoryAxis domainAxis = categoryplot.getDomainAxis();
 
        domainAxis.setLabelFont(labelFont);// 设置（y轴）横坐标字体
 
        domainAxis.setTickLabelFont(labelFont);// 设置y轴坐标字体
 
        //设置Y轴间隔
        NumberAxis numAxis = (NumberAxis) categoryplot.getRangeAxis();

        numAxis.setTickUnit(new NumberTickUnit(0.5));
        
        //domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45); // 横轴上的
        // Lable
        // 45度倾斜
        
        // 设置距离图片左端距离
        domainAxis.setLowerMargin(0.0);
        // 设置距离图片右端距离
        domainAxis.setUpperMargin(0.0);
        // 纵坐标--范围轴(x轴)
        NumberAxis numberaxis = (NumberAxis) categoryplot.getRangeAxis();
        // 设置刻度单位 为Integer
        numberaxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        //强制在自动选择的数据范围中包含0
        numberaxis.setAutoRangeIncludesZero(true);
 
        // 获得renderer 注意这里是下嗍造型到lineandshaperenderer！！
        LineAndShapeRenderer lineandshaperenderer = (LineAndShapeRenderer) categoryplot.getRenderer();
 
        lineandshaperenderer.setBaseShapesVisible(true); // series 点（即数据点）可见
 
        lineandshaperenderer.setBaseLinesVisible(true); // series 点（即数据点）间有连线可见
 
        // 显示折点数据
        lineandshaperenderer.setBaseItemLabelGenerator(new
        StandardCategoryItemLabelGenerator());
        lineandshaperenderer.setBaseItemLabelsVisible(true);
 
        FileOutputStream fos_jpg = null;
        try {
            isChartPathExist(CHART_PATH);
            String chartName = CHART_PATH + charName;
            fos_jpg = new FileOutputStream(chartName);
 
            // 将报表保存为png文件
            ChartUtilities.writeChartAsPNG(fos_jpg, chart, 700, 380);
 
            return chartName;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                fos_jpg.close();
                System.out.println("create time-createTimeXYChar.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
 
    
}