import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {
    private JTextField temp;
    private JTextField humidity;
    private JTextField soilMoisture;

    private JTextField heat;
    private JTextField cool;
    private JTextField humid;
    private JTextField moist;


    private JLabel furnace;
    private JLabel AC;
    private JLabel humidifier;
    private JLabel Sprinkler;
    private JLabel currentTemp;
    private JLabel currentHumidity;
    private JLabel currentSoilMoisture;


    private JButton Start;
    private JButton Stop;
    private JButton Save;

    public View() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setTitle("GreenHouse Simulator");
        frame.setSize(930, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        JLabel label = new JLabel("GreenHouse simulation");
        label.setBounds(380, 8, 150, 25);
        label.setForeground(Color.decode("#006400"));
        panel.add(label);

        JLabel EnvironmentTemp = new JLabel("Environment Temperature: 20°C");
        EnvironmentTemp.setBounds(10, 40, 250, 25);
        panel.add(EnvironmentTemp);

        JLabel EnvironmentHumidity = new JLabel("Environment Humidity: 40%");
        EnvironmentHumidity.setBounds(320, 40, 250, 25);
        panel.add(EnvironmentHumidity);

        JLabel EnvironmentSoilMoisture = new JLabel("Environment Soil Moisture: 30%");
        EnvironmentSoilMoisture.setBounds(620, 40, 250, 25);
        panel.add(EnvironmentSoilMoisture);

        JLabel DesiredTemp = new JLabel("Enter Desired Temperature: ");
        DesiredTemp.setBounds(10, 80, 300, 25);
        panel.add(DesiredTemp);

        temp = new JTextField();
        temp.setBounds(190, 80, 100, 25);
        panel.add(temp);

        JLabel DesiredHumidity = new JLabel("Enter Desired Humidity: ");
        DesiredHumidity.setBounds(320, 80, 250, 25);
        panel.add(DesiredHumidity);

        humidity = new JTextField();
        humidity.setBounds(480, 80, 100, 25);
        panel.add(humidity);

        JLabel DesiredSoilMoisture = new JLabel("Enter Desired Soil Moisture: ");
        DesiredSoilMoisture.setBounds(620, 80, 350, 25);
        panel.add(DesiredSoilMoisture);

        soilMoisture = new JTextField();
        soilMoisture.setBounds(810, 80, 100, 25);
        panel.add(soilMoisture);

        JLabel heating = new JLabel("Furnace Heating Rate: ");
        heating.setBounds(10, 120, 200, 25);
        panel.add(heating);

        heat = new JTextField();
        heat.setBounds(150, 120, 100, 25);
        panel.add(heat);

        JLabel cooling = new JLabel("AC Cooling Rate:");
        cooling.setBounds(270, 120, 280, 25);
        panel.add(cooling);

        cool = new JTextField();
        cool.setBounds(380, 120, 100, 25);
        panel.add(cool);

        JLabel humidierRate = new JLabel("Humidifier Rate: ");
        humidierRate.setBounds(500, 120, 280, 25);
        panel.add(humidierRate);

        humid = new JTextField();
        humid.setBounds(610, 120, 100, 25);
        panel.add(humid);

        JLabel SprinklerRate = new JLabel("Sprinkler Rate: ");
        SprinklerRate.setBounds(725, 120, 280, 25);
        panel.add(SprinklerRate);

        moist = new JTextField();
        moist.setBounds(820, 120, 100, 25);
        panel.add(moist);


        JLabel Devices = new JLabel("Device Status: ");
        Devices.setBounds(75, 190, 250, 25);
        Devices.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(Devices);

        furnace = new JLabel("FURNACE: ");
        furnace.setBounds(75, 220, 250, 25);
        panel.add(furnace);

        AC = new JLabel("AIR CONDITIONER: ");
        AC.setBounds(75, 250, 250, 25);
        panel.add(AC);

        humidifier = new JLabel("HUMIDIFIER: ");
        humidifier.setBounds(75, 280, 250, 25);
        panel.add(humidifier);

        Sprinkler = new JLabel("SPRINKLER:");
        Sprinkler.setBounds(75, 310, 250, 25);
        panel.add(Sprinkler);

        JLabel simulation = new JLabel("Simulation Results");
        simulation.setBounds(360, 190, 280, 25);
        simulation.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(simulation);

        currentTemp = new JLabel("Current Temperature: ");
        currentTemp.setBounds(358, 220, 280, 25);
        panel.add(currentTemp);

        currentHumidity = new JLabel("Current Humidity Level: ");
        currentHumidity.setBounds(358, 250, 300, 25);
        panel.add(currentHumidity);

        currentSoilMoisture = new JLabel("Current Soil Moisture Content: ");
        currentSoilMoisture.setBounds(358, 280, 330, 25);
        panel.add(currentSoilMoisture);

        Start = new JButton("START");
        Start.setBounds(700, 190, 200, 35);
        panel.add(Start);

        Stop = new JButton("STOP");
        Stop.setBounds(700, 230, 200, 35);
        panel.add(Stop);

        Save = new JButton("SAVE");
        Save.setBounds(700, 270, 200, 35);
        panel.add(Save);

        frame.setVisible(true);
    }

    public double getdesiredtemperature() {
        return Double.parseDouble(temp.getText());
    }

    public double getdesiredhhumidity() {
        return Double.parseDouble(humidity.getText());
    }

    public double getdesiredSoilMoisture() {
        return Double.parseDouble(soilMoisture.getText());
    }

    public double getHeatingRate() {
        return Double.parseDouble(heat.getText());
    }

    public double getCoolingRate() {
        return Double.parseDouble(cool.getText());
    }

    public double getHumidifierRate() {
        return Double.parseDouble(humid.getText());
    }

    public double getSprinklerRate() {
        return Double.parseDouble(moist.getText());
    }

    public void setFurnace(Boolean furnacestatus) {
        if (furnacestatus)
            furnace.setText("FURNACE: ON");
        else
            furnace.setText("FURNACE: OFF");
    }

    public void setAirConditioner(Boolean airConditionerStatus)
    {
        if(airConditionerStatus)
            AC.setText("AIR CONDITIONER: ON");
        else
            AC.setText("AIR CONDITIONER: OFF");
    }
     public void setHumidifier(Boolean humidifierStatus)
     {
         if(humidifierStatus)
             humidifier.setText("HUMIDIFIER: ON");
         else
             humidifier.setText("HUMIDIFIER: OFF");
     }
     public void setSprinkler(Boolean sprinklerStatus)
     {
         if(sprinklerStatus)
             Sprinkler.setText("SPRINKLER: ON");
         else
             Sprinkler.setText("SPRINKLER: OFF");
     }

    public void setCurrentTemp(Double updatedTemp) {
        currentTemp.setText("Current Temperature: " + updatedTemp);
    }

    public void setCurrentHumidity(Double updatedHumidity) {
        currentHumidity.setText("Current Humidity Level: " + updatedHumidity);
    }

    public void setCurrentSoilMoisture(Double updatedSoilMoisture) {
        currentSoilMoisture.setText("Current Soil Moisture Content: " + updatedSoilMoisture);
    }
    public void addStartButtonListener(ActionListener listener)
    {
        Start.addActionListener(listener);
    }
}
