package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

/**
 * Type definition for the context.
 */
public class BbandsContext extends JsObject  {

    
    private Number dequeuedValue;
    private Number deviation;
    private CycledQueue highQueue;
    private Number period;
    private Number prevDeviation;
    private Number prevResult;

    
    public BbandsContext(Number dequeuedValue, Number deviation, CycledQueue highQueue, Number period, Number prevDeviation, Number prevResult) {
        this.dequeuedValue = dequeuedValue;
        this.deviation = deviation;
        this.highQueue = highQueue;
        this.period = period;
        this.prevDeviation = prevDeviation;
        this.prevResult = prevResult;

        js.append(String.format(Locale.US, "{dequeuedValue: %f,deviation: %f,highQueue: %s,period: %f,prevDeviation: %f,prevResult: %f}",  dequeuedValue, deviation, ((highQueue != null) ? highQueue.generateJs() : "null"), period, prevDeviation, prevResult));
    }

    @Override
    public String generateJs() {
        return js.toString();
    }

}