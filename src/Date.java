public class Date {
    private int day;
    private int month;
    private int year;

    //פעולה בונה
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //פעולות get set
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //פעולת before
    public boolean before(Date other) {
        if (this.year < other.year) {
            return true;
        } else if (this.year == other.year) {
            if (this.month < other.month) {
                return true;
            } else if (this.month == other.month) {
                if (this.day < other.day) {
                    return true;
                }
            }
        }
        return false;
    }

    //פעולת equals
    public boolean equals(Date other) {
        return this.year == other.year && this.month == other.month && this.day == other.day;
    }

    //פעולת to string
    @Override
    public String toString() {
        return "Date [Day=" + this.day + ", Month=" + this.month + ", Year=" + this.year + "]";
    }

}
