package com.oopsScenarioBased.homenest;

class Camera extends Device {

    Camera(String id) {
        super(id, 10);
    }

    @Override
    public void reset() {
        System.out.println("Camera angle reset");
    }
}
