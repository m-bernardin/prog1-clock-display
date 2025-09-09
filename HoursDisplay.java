//q 36
public class HoursDisplay
{
    private int limit;
    private int value;

    public HoursDisplay(int rollOverLimit)
    {
        limit = rollOverLimit;
        value = 12;
    }

    public int getValue()
    {
        return value;
    }

    public String getDisplayValue()
    {
        if(value < 10) {
            return "0" + value;
        }
        else {
            return "" + value;
        }
    }

    public void setValue(int replacementValue)
    {
        if((replacementValue >= 0) && (replacementValue < limit)) {
            value = replacementValue;
        }
    }

    public void increment()
    {
        value = (value + 1);
        if(value>12){
            setValue(1);
        }
    }
}
