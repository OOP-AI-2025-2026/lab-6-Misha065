package org.example.task4;

public class Car implements Comparable {

    private int price;
    private int year;
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Car)) return 0;
        Car c = (Car) o;

        if (this.price != c.price)
            return this.price < c.price ? 1 : -1; // менша ціна → більше авто

        if (this.year != c.year)
            return this.year > c.year ? 1 : -1;   // новіше → більше авто

        return Integer.compare(this.horsePower, c.horsePower); // більше сил → більше авто
    }

    @Override
    public String toString() {
        return String.format("Car{price=%d$, year=%d, hp=%d}", price, year, horsePower);
    }
}