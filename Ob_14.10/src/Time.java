public class Time {
    int hours;
    int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        normalizuj();
    }

    public void normalizuj(){
        if(minutes>59){
            hours+=minutes/60;
            minutes=minutes%60;
        }
        if(hours>23){
            hours=hours%24;
        }
    }

    public Time addTime(Time othertime){
        int newHours = this.hours+=othertime.hours;
        int newMinutes = this.minutes+= othertime.minutes;

        Time result = new Time(newHours,newMinutes);

        return result;
    }

    public static void main(String[] args) {

    }
}
