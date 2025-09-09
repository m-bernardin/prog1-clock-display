//q 37
public class ClockDisplay12hV2
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;    
    
    public ClockDisplay12hV2()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplay12hV2(int hour, int minute)
    {
        hours = new NumberDisplay(24);
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
        int time = hours.getValue();
        if(time>12){
            time=time-12;
            displayString = "0" + time + ":" + minutes.getDisplayValue();
        }
        displayString = time + ":" + 
                        minutes.getDisplayValue();
    }
}
