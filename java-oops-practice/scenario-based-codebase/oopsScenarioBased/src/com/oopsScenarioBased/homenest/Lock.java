package com.oopsScenarioBased.homenest;

class Lock extends Device {

    Lock(String id) {
        super(id, 2);
    }

    @Override
    public void reset() {
        System.out.println("Lock system reset");
    }
}
