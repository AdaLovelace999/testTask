package package2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Currency {
    protected final double dollar = 96.0924;
    protected final double euro = 104.4016;
    protected final double yuan = 13.4733;
    protected final double real = 16.9568;
    protected final double dirham = 26.1654;

    public void convert(double sum){}
}
class Dollar extends Currency{
    @Override
    public void convert(double sum){
        BigDecimal result = new BigDecimal(sum / dollar).setScale(2, RoundingMode.UP);
        System.out.println(result + " в долларах");
    }
}
class Dirham extends Currency{
    @Override
    public void convert(double sum){
        BigDecimal result = new BigDecimal(sum / dirham).setScale(2, RoundingMode.UP);
        System.out.println(result + " в дирхамах");
    }
}
class Euro extends Currency{
    @Override
    public void convert(double sum){
        BigDecimal result = new BigDecimal(sum / euro).setScale(2, RoundingMode.UP);
        System.out.println(result + " в евро");
    }
}
class Yuan extends Currency{
    @Override
    public void convert(double sum){
        BigDecimal result = new BigDecimal(sum / yuan).setScale(2, RoundingMode.UP);
        System.out.println(result + " в юанях");
    }
}
class Real extends Currency{
    @Override
    public void convert(double sum){
        BigDecimal result = new BigDecimal(sum / real).setScale(2, RoundingMode.UP);
        System.out.println(result + " в реалах");
    }
}