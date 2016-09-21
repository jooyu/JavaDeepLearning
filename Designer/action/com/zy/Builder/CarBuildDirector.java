package com.zy.Builder;

/**
 * 创建方法返回这个实例本身
 * @author eaves.zhu
 *
 */
public class CarBuildDirector {
    private CarBuilder builder;

    public CarBuildDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car construct() {
        builder.setWheels(4);
        builder.setColor("Red");
        return builder.getResult();
    }

    public static void main(String[] args) {
        CarBuilder builder = new CarBuilderImpl();
        CarBuildDirector carBuildDirector = new CarBuildDirector(builder);
        System.out.println(carBuildDirector.construct());
    }
}