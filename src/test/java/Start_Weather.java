import java.util.List;

public class Start_Weather {
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private Wind wind;
    private Clouds clouds;
    private Rain rain;
    private int dt;
    private Sys sys;
    private int id;
    private String name;
    private int cod;

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getBase() {
        return base;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Main getMain() {
        return main;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Wind getWind() {
        return wind;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Rain getRain() {
        return rain;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public int getDt() {
        return dt;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public Sys getSys() {
        return sys;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }

    @Override
    public String toString(){
        return "Weather\n"
                + "[ coord Longitude: "+coord.getLon()+", coord Latitude: "+coord.getLat()+"\n"
                + "weather id: "+weather.get(0).getId()+", weather main: "+weather.get(0).getMain()+", weather description: "+weather.get(0).getDescription()+", weather icon: "+weather.get(0).getIcon()+"\n"
                + "base: "+base+"\n"
                + "main temp: "+main.getTemp()+", main pressure: "+main.getPressure()+", main humidity: "+main.getHumidity()+", main temp_min: "+main.getTemp_Min()+", main temp_max: "+main.getTemp_Max()+"\n"
                + "wind speed : "+wind.getSpedd()+", wind deg : "+wind.getDeg()+"\n"
                + "clouds all : "+clouds.getAll()+"\n"
                + "dt : "+dt+"\n"
                + "sys type : "+sys.getType()+", sys id : "+sys.getId()+", sys message : "+sys.getMessage()+", sys country : "+sys.getCountry()+", sys sunrise : "+sys.getSunrise()+", sys sunset : "+sys.getSunset()+"\n"
                + "id : "+id+"\n"
                + "name : "+name+"\n"
                + "cod : "+cod+"]";
    }

}

class Coord {
    private int lon;
    private int lat;

    public void setLon(int lon) {
        this.lon = lon;
    }

    public int getLon() {
        return lon;
    }

    public void setLat(int lat) {
        this.lat = lat;
    }

    public int getLat() {
        return lat;
    }
}

class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getMain() {
        return main;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}

class Main{
    private int temp;
    private int pressure;
    private int humidity;
    private int temp_min;
    private int temp_max;

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getPressure() {
        return pressure;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setTemp_Min(int temp_min) {
        this.temp_min = temp_min;
    }

    public int getTemp_Min() {
        return temp_min;
    }

    public void setTemp_Max(int temp_max) {
        this.temp_max = temp_max;
    }

    public int getTemp_Max() {
        return temp_max;
    }
}

class Wind{
    private int speed;
    private int deg;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpedd() {
        return speed;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public int getDeg() {
        return deg;
    }
}

class Clouds{
    private int all;

    public void setAll(int all) {
        this.all = all;
    }

    public int getAll() {
        return all;
    }
}

class Rain{
    private int h;

    public void setH(int h) {
        this.h = h;
    }

    public int getH() {
        return h;
    }
}

class Sys{
    private int type;
    private int id;
    private int message;
    private String country;
    private String sunrise;
    private String sunset;

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public int getMessage() {
        return message;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getSunset() {
        return sunset;
    }
}
