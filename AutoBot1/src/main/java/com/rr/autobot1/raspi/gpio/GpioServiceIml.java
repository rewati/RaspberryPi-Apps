/*
 * Copyright (c) 2016 Rewati Raman(rewati.raman@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rr.autobot1.raspi.gpio;

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import com.rr.autobot1.bot.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
@Service
public class GpioServiceIml implements GpioService{

    @Autowired
    Config config;

    private final GpioController gpio = GpioFactory.getInstance();
    private GpioPinDigitalOutput[] outputPins;

    public void turnPinOn(int index) {
        getOutputPins(index).high();
    }

    public void turnPinOff(int index) {
        getOutputPins(index).low();
    }

    /**
     * index should be between 0 to 3
     * @param index
     * @return
     */
    private GpioPinDigitalOutput getOutputPins(int index) {
        try {
            return outputPins[index];
        } catch (NullPointerException e) {
            provisionOutputPins();
            return getOutputPins(index);
        }
    }
    private void provisionOutputPins() {
        //Should be improved later with more dynamic Config class.
        //For now it is platform specific.
        outputPins = new GpioPinDigitalOutput[4];
        outputPins[0] = gpio.provisionDigitalOutputPin(RaspiPin.getPinByName("GPIO "+config.getLeftForwardPin()));
        outputPins[1] = gpio.provisionDigitalOutputPin(RaspiPin.getPinByName("GPIO "+config.getLeftReversePin()));
        outputPins[2] = gpio.provisionDigitalOutputPin(RaspiPin.getPinByName("GPIO "+config.getRightForwardPin()));
        outputPins[3] = gpio.provisionDigitalOutputPin(RaspiPin.getPinByName("GPIO "+config.getRightReversePin()));
    }

    private void test(){
        GpioPinDigitalInput input = gpio.provisionDigitalInputPin(RaspiPin.getPinByName("GPIO 2"));
        input.addListener(new GpioPinListenerDigital() {
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {

            }
        });
    }
}
