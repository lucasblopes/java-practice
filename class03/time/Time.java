
public class Time {

    private int hour;
    private int min;

    public Time() {

    }

    public Time(int hour, int min) {
        setHour(hour);
        setMin(min);
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23)
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        this.hour = hour;
    }

    public void setMin(int min) {
        if (min < 0 || min > 59)
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        this.min = min;
    }

    public boolean isEquals(int hour, int min) {
        if (hour < 0 || hour > 23)
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        if (min < 0 && min > 59)
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        if (hour == this.hour && min == this.min)
            return true;
        return false;
    }

    public boolean isPrevious(int hour, int min) {
        if (isEquals(hour, min) == true)
            return false;
        if (hour < this.hour)
            return true;
        if (hour == this.hour && min < this.min)
            return true;
        return false;
    }

    public boolean isAfter(int hour, int min) {
        if (isPrevious(hour, min) == true)
            return false;
        if (hour > this.hour)
            return true;
        if (hour == this.hour && min > this.min)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, min);
    }
}
