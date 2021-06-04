package javaapplication2;


public class calc {
    
    private double heart_inc;//variable for setting the the heart increase of sport
    private double t;//variable for calculating the heart rate 
    private double total_heart_rate=80;
    private double calories_burnt=0;
    private double heart_rate_inc;
    
    private double sw_cal;//swimming calories burned 
    private double st_cal;
    private double kb_cal;
    private double ru_cal;
    private double sw_h;//swimming heart rate increased
    private double st_h;
    private double kb_h;
    private double ru_h;
    private int calories;//variable for setting the the calories of sport
    private int time;
    private int sport;// flag
  // getter and setter for time
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
// setters for the calories and heart rate when activty is choosen
    public void setCalories(String x) {
        if( null!=x )
        switch (x) {
            case "swimming":
                calories =4;
                sport=1;
                break;
            case "running":
                calories =5;
                sport=2;
                break;
            case "kickboxing":
                calories =3;
                sport=3;
                break;
            case "strength":
                calories =5;
                sport=4;
                break;
            default:
                break;
        }
    }
    
    public double set_heart_rate(String d) {        
        if( null!=d )
        switch (d) {
            case "swimming":
                heart_inc =0.002;
                break;
            case "running":
                heart_inc =0.003;
                break;
            case "kickboxing":
                heart_inc =0.005;
                break;
            case "strength":
                heart_inc =0.006;
                break;
            default:
                break;
        }
            return heart_inc;
}
    
  // setters for the total calories burned and total heart rate increased and for every activity 
    public void setTotal_heart_rate() {
        t= total_heart_rate;
        total_heart_rate=total_heart_rate +total_heart_rate*heart_inc*time;
        switch (sport) {
            case 1:
                sw_h=sw_h+t*heart_inc*time;
                break;
            case 2:
                ru_h=ru_h+t*heart_inc*time;
                break;
            case 3:
                kb_h=kb_h+t*heart_inc*time;
                break;
            case 4:
                st_h=st_h+t*heart_inc*time;
                break;
            default:
                break;
        }
//        return total_heart_rate;
    }

    public void setCalories_burnt() {
         calories_burnt=calories_burnt +calories*time;
        switch (sport) {
            case 1:
                sw_cal=sw_cal+calories*time;
                break;
            case 2:
                ru_cal=ru_cal+calories*time;
                break;
            case 3:
                kb_cal=kb_cal+calories*time;
                break;
            case 4:
                st_cal=st_cal+calories*time;
                break;
            default:
                break;
        }
//        return calories_burnt;
    }
    
// getters for the total
    public double getCalories_burnt() {
        return calories_burnt;
    }

    public double getTotal_heart_rate() {
        return total_heart_rate;
    }
    
  // getters for all the variables  
    public double getSw_h() {
        return sw_h;
    }

    public double getSt_h() {
        return st_h;
    }

    public double getKb_h() {
        return kb_h;
    }

    public double getRu_h() {
        return ru_h;
    }
    
    public double getSw_cal() {
        return sw_cal;
    }

    public double getSt_cal() {
        return st_cal;
    }

    public double getKb_cal() {
        return kb_cal;
    }

    public double getRu_cal() {
        return ru_cal;
    }
    
}

