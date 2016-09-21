package com.zy.Builder;

/**
 * The builder abstraction.
 */
interface CarBuilder {
    void setWheels(int wheels);
    
    void setColor(String color);

    Car getResult();
}

class CarBuilderImpl implements CarBuilder {
    private Car car;

    public CarBuilderImpl() {
        car = new Car();
    }
    
    @Override
    public void setWheels(int wheels) {
        car.setWheels(wheels);
    }
    
    @Override
    public void setColor(String color) {
        car.setColor(color);
    }

    @Override
    public Car getResult() {
        return car;
    }
}