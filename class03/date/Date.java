public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (day < 1 || day > daysInMonth(month, year))
            throw new IllegalArgumentException("Invalid day for the given month and year");
        this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
            throw new IllegalArgumentException("Month must be between 1 and 12");
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(int day, int month, int year) {
        return this.day == day && this.month == month && this.year == year;
    }

    public boolean isPrevious(int day, int month, int year) {
        if (equals(day, month, year))
            return false;
        if (year < this.year)
            return true;
        if (year == this.year && month < this.month)
            return true;
        if (year == this.year && month == this.month && day < this.day)
            return true;
        return false;
    }

    public boolean isAfter(int day, int month, int year) {
        if (isPrevious(day, month, year))
            return false;
        return !equals(day, month, year);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    private int daysInMonth(int month, int year) {
        switch (month) {
            case 2: // February
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                return 30;
            default:
                return 31;
        }
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

