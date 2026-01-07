package com.oopsScenarioBased.EventEase;

interface ISchedulable {
    void schedule();
    void reschedule(String newDate);
    void cancel();
}
