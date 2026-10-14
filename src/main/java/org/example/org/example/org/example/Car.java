package org.example;

public class Car implements Comparable {
    private int price;
    private int year; // рік виготовлення
    private int horsePower;

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Car) {
            Car other = (Car) o;

            // 1. Спочатку ціна: "більше" той автомобіль, у якого менша ціна
            if (this.price != other.price) {
                return other.price - this.price;
            }

            // 2. Якщо ціни рівні: "більше" той, який менший за віком (рік випуску більший)
            if (this.year != other.year) {
                return this.year - other.year;
            }

            // 3. Якщо вік однаковий: "більше" той, у якого кінських сил більше
            return this.horsePower - other.horsePower;
        }
        return 0;
    }
}