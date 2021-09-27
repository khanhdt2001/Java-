public class Date{
    
    private int day;
    private int month;
    private int year;

    public void setDay(int day){
        this.day= day;
    }

    public void setMonth(int month){
        this.month= month;
    }

    public void setYear(int year){
        this.year= year;
    }
    public String toString(){
        return "day" + day + '/' + month + '/' + year ;
    }
    public Date(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }
}