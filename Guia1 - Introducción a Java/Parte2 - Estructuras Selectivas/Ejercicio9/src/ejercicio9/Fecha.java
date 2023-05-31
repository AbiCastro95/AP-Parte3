package ejercicio9;

public class Fecha {
    private int day;
    private int month;
    private int year;

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

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
    
    public boolean esBisiesto(){
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    
    public int calcularAños(Fecha fecha1){
        // Acá traigo el objeto fecha1
        int cantAños = this.year - fecha1.getYear();
        
        if (cantAños < 0) {
            return Math.abs(cantAños);
        } else {
            return cantAños;
        }
    }
}
