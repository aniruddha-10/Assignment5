import java.awt.event.*;
public class Controller
{
    private Model model;
    private View view;

    public Controller(View view,Model model)
    {
        this.view = view;
        this.model = model;
        this.view.addStartButtonListener( new addStartButtonListener());
    }
    class addStartButtonListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            Model model1 = new Model();
            model1.start();
            double desiredtemp = view.getdesiredtemperature();
            double desiredhumidity = view.getdesiredhhumidity();
            double desiredsoilmoisture = view.getdesiredSoilMoisture();
            double furnacerate = view.getHeatingRate();
            double coolingrate = view.getCoolingRate();
            double humidityrate = view.getHumidifierRate();
            double sprinklerrate = view.getSprinklerRate();

            model1.setDesiredTemp(desiredtemp);
            model1.setDesiredHumidity(desiredhumidity);
            model1.setDesiredSoilMoisture(desiredsoilmoisture);
            model1.setHeatingRate(furnacerate);
            model1.setCoolingRate(coolingrate);
            model1.setHumidifierRate(humidityrate);
            model1.setSprinklerRate(sprinklerrate);

            view.setCurrentTemp(model1.getUpdatedTemp());
            view.setCurrentHumidity(model1.getUpdatedHumidity());
            view.setCurrentSoilMoisture(model1.getUpdatedSoilMoisture());
        }
    }
    public static void main(String[] args)
    {
        Model model1 = new Model();
        View view1 = new View();
        Controller controller = new Controller(view1,model1);
    }
}
