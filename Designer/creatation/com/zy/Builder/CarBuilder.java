package com.zy.Builder;

/**
 * The builder abstraction.
 * 接口实现
 * 设备生成器
 */
interface CarBuilder {
    void setWheels(int wheels);
    
    void setColor(String color);

    Car getResult();
}

//造车实现
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