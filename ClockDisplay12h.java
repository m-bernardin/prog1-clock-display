//q 36
public class ClockDisplay12h
{
    private HoursDisplay hours;
    private NumberDisplay minutes;
    private String displayString;   
    
    public ClockDisplay12h()
    {
        hours = new HoursDisplay(13);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplay12h(int hour, int minute)
    {
        hours = new HoursDisplay(13);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {
           hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    public String getTime()
    {
        return displayString;
    }
  
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
    }
}
