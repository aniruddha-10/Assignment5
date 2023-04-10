public class Model extends Thread
{
    // to set the environment temperature and other values
    public static double EnvironmentTemp = 20.0;
    public static double EnvironmentHumidity = 40.0;
    public static double EnvironmentSoilMoisture = 30.0;

    // to store the desired values as per the user's need
    private double desiredTemp;
    private double desiredHumidity;
    private double desiredSoilMoisture;

    // input for the rate at which the devices going to work
    private double heatingRate;
    private double coolingRate;

    private double humidifierRate;

    private double sprinklerRate;

    // to store the values of the updated values such as temp,humidity and soil Moisture  as per the rates
    private double updatedTemp;
    private double updatedHumidity;
    private double updatedSoilMoisture;

    // to store the status of the simulation
    private boolean runningStatus;

    // TO store the status of each of the devices
    private boolean furnaceStatus;
    private boolean airConditionerStatus;
    private boolean humidifierStatus;
    private boolean sprinklerStatus;


    private int tempRefreshRate;
    private int humidityRefreshRate;
    private int moistureRefreshRate;

    public Model()
    {
        furnaceStatus = false;
        airConditionerStatus = false;
        humidifierStatus = false;
        sprinklerStatus = false;
    }

    public Model(int temptime1,int humiditytime2,int soilMoisturetime3)
    {
        super();
        tempRefreshRate = temptime1;
        humidityRefreshRate = humiditytime2;
        moistureRefreshRate = soilMoisturetime3;
    }

    public void setHeatingRate(double heatingRate) {
        this.heatingRate = heatingRate;
    }
    public void setCoolingRate(double coolingRate) {
        this.coolingRate = coolingRate;
    }

    @Override
    public void run()
    {
        runningStatus = true;
        try
        {
            while(runningStatus)
            {
                if(furnaceStatus)
                {
                    updatedTemp = EnvironmentTemp + heatingRate;
                }
                else if (airConditionerStatus)
                {
                    updatedTemp = EnvironmentTemp - coolingRate;
                }
                if(humidifierStatus)
                {
                    updatedHumidity = EnvironmentHumidity + humidifierRate;
                }
                else
                {
                    updatedHumidity = EnvironmentHumidity - humidifierRate;
                }
                if(sprinklerStatus)
                {
                    updatedSoilMoisture = EnvironmentSoilMoisture + sprinklerRate;
                }
                else
                {
                    updatedSoilMoisture = EnvironmentSoilMoisture - sprinklerRate;
                }

                if (updatedTemp<desiredTemp-3.0)
                    furnaceStatus = true;
                else
                    furnaceStatus = false;

                if (updatedTemp > desiredTemp + 3.0)
                    airConditionerStatus = true;
                else
                    airConditionerStatus = false;

                if (updatedHumidity<desiredHumidity)
                    humidifierStatus = true;
                else
                    humidifierStatus = false;

                if(updatedSoilMoisture<desiredSoilMoisture)
                    sprinklerStatus = true;
                else
                    sprinklerStatus = false;

                if(updatedTemp == desiredTemp && updatedHumidity == desiredHumidity && updatedSoilMoisture == desiredSoilMoisture)
                {
                    runningStatus = false;
                }
            }

        }catch(Exception e)
        {
            System.exit(0);
        }
    }
}
