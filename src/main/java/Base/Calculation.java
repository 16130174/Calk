package Base;

public class Calculation {
    /**
     * С капитализацией
     * @param percent Процент
     * @param cash Сумма
     * @param time Срок
     * @return Сумма с капитализацией
     */
    public static String sumWithCapitalize(String percent, String cash, String time){
        return String.format("%.2f", Double.parseDouble(cash) * Math.pow(1 + Integer.parseInt(time) * Double.parseDouble(percent) / 12 / 100, Integer.parseInt(time)));
    }

    /**
     * Без капитализации
     * @param percent Процент
     * @param cash Сумма
     * @param time Срок
     * @return Сумма без капитализации
     */
    public static String sumWithoutCapitalize(String percent, String cash, String time){
        return String.format("%.2f", Double.parseDouble(cash) + (((Double.parseDouble(cash) * Double.parseDouble(percent) * Integer.parseInt(time)) / 100) / 12));
    }
}
