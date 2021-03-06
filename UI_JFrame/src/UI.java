import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class UI extends JFrame
{
    static JFrame frame1;
    public JLabel JLTelemetry;
    public static JLabel JLBatTemp;
    public static JLabel JLBatPercent;
    public static JLabel JLCar;
    public static JLabel JLBatV;
    public static JLabel JLBatC;
    public static JLabel JLSolarV;
    public static JLabel JLSolarC;
    public static JLabel JLMilesRem;
    public static JLabel JLMilesDriven;
    public static JLabel JLAvgSpd;
    public  JLabel JLSpeedometer;
    public static JLabel JLSpeed;
    public  JLabel JLMap;

    public UI(){createUserInterface();}

    private void createUserInterface()
    {
        Container contentPane = frame1.getContentPane();
        contentPane.setLayout(null);
        contentPane.setBackground(Color.GRAY);
        contentPane.setBounds(0,0,400,500);

        JLayeredPane JLPane = frame1.getLayeredPane();
        JLPane.setBounds(400,0,400,500);
        JLPane.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        frame1.setTitle("UI");
        frame1.setSize(800,500);
        frame1.setVisible(true);

        /*JLTelemetry = new JLabel("Telemetry Data");
        JLTelemetry.setBounds(0,0,400,30);
        JLTelemetry.setHorizontalAlignment(SwingConstants.CENTER);
        JLTelemetry.setBorder(BorderFactory.createLineBorder(Color.black,1));
        JLTelemetry.setFont(new Font("Ariel",Font.BOLD,25));
        contentPane.add(JLTelemetry);*/

        JLBatTemp = new JLabel("Battery Temp: " + 0 + "F");
        JLBatTemp.setBounds(200,10,200,50);
        JLBatTemp.setHorizontalAlignment(SwingConstants.LEFT);
        //JLBatTemp.setBorder(BorderFactory.createLineBorder(Color.black,1));
        JLBatTemp.setFont(new Font("Ariel",Font.PLAIN,20));
        contentPane.add(JLBatTemp);

        JLBatPercent = new JLabel(0 + "%");
        JLBatPercent.setBounds(0,10,100,50);
        JLBatPercent.setHorizontalAlignment(SwingConstants.CENTER);
        //JLBatPercent.setBorder(BorderFactory.createLineBorder(Color.black,1));
        JLBatPercent.setFont(new Font("Ariel",Font.PLAIN,20));
        contentPane.add(JLBatPercent);

        /*JLBatV = new JLabel("Battery Volt: " + 0 + "V");
        JLBatV.setBounds(0,85,150,55);
        JLBatV.setHorizontalAlignment(SwingConstants.LEFT);
        JLBatV.setBorder(BorderFactory.createLineBorder(Color.black,1));
        JLBatV.setFont(new Font("Ariel",Font.PLAIN,15));
        contentPane.add(JLBatV); */

        /*JLBatC = new JLabel("Battery Current: "+ 0 + "A");
        JLBatC.setBounds(0,140,150,55);
        JLBatC.setHorizontalAlignment(SwingConstants.LEFT);
        JLBatC.setBorder(BorderFactory.createLineBorder(Color.black,1));
        JLBatC.setFont(new Font("Ariel",Font.PLAIN,15));
        contentPane.add(JLBatC); */

        /*JLSolarV = new JLabel("Solar Volt: "+ 0 + "V");
        JLSolarV.setBounds(0,195,150,55);
        JLSolarV.setHorizontalAlignment(SwingConstants.LEFT);
        JLSolarV.setBorder(BorderFactory.createLineBorder(Color.black,1));
        JLSolarV.setFont(new Font("Ariel",Font.PLAIN,15));
        JLSolarV.setVisible(true);
        contentPane.add(JLSolarV); */

        /*JLSolarC = new JLabel("Solar Current: " + 0 + "A");
        JLSolarC.setBounds(250,30,150,55);
        JLSolarC.setHorizontalAlignment(SwingConstants.LEFT);
        JLSolarC.setBorder(BorderFactory.createLineBorder(Color.black,1));
        JLSolarC.setFont(new Font("Ariel",Font.PLAIN,15));
        contentPane.add(JLSolarC); */

        JLMilesRem = new JLabel("Miles Remain: " + 0);
        JLMilesRem.setBounds(0,390,200,55);
        JLMilesRem.setHorizontalAlignment(SwingConstants.LEFT);
        //JLMilesRem.setBorder(BorderFactory.createLineBorder(Color.black,1));
        JLMilesRem.setFont(new Font("Ariel",Font.PLAIN,20));
        contentPane.add(JLMilesRem);

        /*JLMilesDriven = new JLabel("Miles Driven: "+ 0);
        JLMilesDriven.setBounds(250,140,150,55);
        JLMilesDriven.setHorizontalAlignment(SwingConstants.LEFT);
        JLMilesDriven.setBorder(BorderFactory.createLineBorder(Color.black,1));
        JLMilesDriven.setFont(new Font("Ariel",Font.PLAIN,15));
        contentPane.add(JLMilesDriven);*/

        /*JLAvgSpd = new JLabel("AVG Speed: "+ 0 + " mph");
        JLAvgSpd.setBounds(250,195,150,55);
        JLAvgSpd.setHorizontalAlignment(SwingConstants.LEFT);
        JLAvgSpd.setBorder(BorderFactory.createLineBorder(Color.black,1));
        JLAvgSpd.setFont(new Font("Ariel",Font.PLAIN,15));
        contentPane.add(JLAvgSpd);*/

        JLMap = new JLabel();
        JLMap.setBounds(400,0,376,458);
        JLMap.setIcon(new ImageIcon("D:\\Other\\UI_JFrame\\mapfinal.jpg"));
        JLMap.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        JLPane.add(JLMap,1);

        /*JLSpeedometer = new JLabel("Battery");
        JLSpeedometer.setBounds(75,260,200,50);
        JLSpeedometer.setHorizontalAlignment(SwingConstants.CENTER);
        JLSpeedometer.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        JLSpeedometer.setFont(new Font("Ariel",Font.BOLD,25));
        contentPane.add(JLSpeedometer); */

        JLSpeed = new JLabel(0 + " mph");
        JLSpeed.setBounds(0,60,400,330);
        JLSpeed.setHorizontalAlignment(SwingConstants.CENTER);
        //JLSpeed.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        JLSpeed.setFont(new Font("Ariel",Font.BOLD,35));
        contentPane.add(JLSpeed);

        JLCar = new JLabel();
        JLCar.setBounds(425,10,10,10);
        JLCar.setBorder(BorderFactory.createLineBorder(Color.black,1));
        JLCar.setOpaque(true);
        JLCar.setBackground(Color.RED);
        JLPane.add(JLCar,0 );

//Speed, bat%, Bat temp, Miles Remaining, Efficiency
    }
    public static void main(String[] args)
    {
        frame1 = new JFrame("UI");
        UI application = new UI();

        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE );

        Timer timer = new Timer();
        TimerTask gen = new TimerTask()
        {
            @Override
            public void run() {
                PsudoValues();
            }
        };

        timer.schedule(gen,0,2000);
    }

    public static void PsudoValues() {
        Random rand = new Random();

        double batTemp = Math.round((0.0 + (50.0 - 0.0) * rand.nextDouble()) * 100.0) / 100.0; //rangeMin + (rangeMax - rangeMin) * random double
        double MRemain = Math.round(((100.0 - 0.0) *rand.nextDouble())*100.0) / 100.0;
        double Lat_In = 40.580190, Long_In = -98.349237; //random double number
        int SPD = rand.nextInt(40) + 10;
        int batPercent = rand.nextInt(100)+1;

        int x = (int)Math.ceil(400+(Long_In-(-98.353633))*53149.08318);
        int y = (int)Math.ceil(458-((Lat_In-40.575737)*74149.62682));

        JLCar.setBounds(x,y,10,10);

        if(SPD >= 40)
            JLSpeed.setForeground(Color.RED);
          else
            JLSpeed.setForeground(Color.BLACK);

        JLBatTemp.setText("Battery Temp: " + batTemp + "F");
        JLBatPercent.setText(batPercent + " % ");
        JLMilesRem.setText("Miles Remain: " + MRemain);
        JLSpeed.setText(SPD + " mph");
    }
}