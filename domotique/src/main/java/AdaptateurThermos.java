import thermos.Thermostat;

public class AdaptateurThermos {
    private Thermostat thermos;
    public AdaptateurThermos(Thermostat t){
        this.thermos = t;
    }
    public void allumer(){
        this.thermos.monterTemperature();
    }
    public String toString(){
        return "Thermos";
    }
}
