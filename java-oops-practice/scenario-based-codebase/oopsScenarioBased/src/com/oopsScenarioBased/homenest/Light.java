package com.oopsScenarioBased.homenest;

class Light extends Device {

    Light(String id) {
        super(id, 5);
    }

    @Override
    public void reset() {
        System.out.println("Light brightness reset");
    }
}

