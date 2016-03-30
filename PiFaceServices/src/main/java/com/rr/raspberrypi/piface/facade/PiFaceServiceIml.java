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
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.Pi
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rr.raspberrypi.piface.facade;

import com.pi4j.component.light.LED;
import com.pi4j.device.piface.PiFace;
import com.pi4j.device.piface.impl.PiFaceDevice;
import com.pi4j.wiringpi.Spi;

import java.io.IOException;

/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
public class PiFaceServiceIml implements PiFaceService {

    private static PiFaceService PI_FACE_SERVICE;
    private static PiFace piface;
    private PiFaceServiceIml(){
    }
    public static PiFaceService getPiFaceService() throws IOException {
        if(PI_FACE_SERVICE==null) {
            PI_FACE_SERVICE = new PiFaceServiceIml();
            piface = new PiFaceDevice(PiFace.DEFAULT_ADDRESS, Spi.CHANNEL_0);
        }
        return PI_FACE_SERVICE;
    }

    /**
     *
     * @param i
     */
    public void LEDon(int i){
        LED led = piface.getLed(i);
        if(led==null || led.isOn()) {
            return;
        }
        led.toggle();
    }

    /**
     *
     * @param i
     */
    public void LEDoff(int i){
        LED led = piface.getLed(i);
        if(led==null || led.isOff()) {
            return;
        }
        led.toggle();
    }

    @Override
    public boolean switchState(int i) {
        return piface.getSwitch(i).isOn();
    }

    @Override
    public void sendPulsePin(int pin,long delay) {
        piface.getOutputPin(pin).pulse(delay);
    }

    @Override
    public void makePinOff(int pin) {
        piface.getOutputPin(pin).low();
    }

    @Override
    public void makePinOn(int pin) {
        piface.getOutputPin(pin).high();
    }

    @Override
    public void closeRelay(int index) {
        piface.getRelay(index).close();
    }

    @Override
    public void openRelay(int index) {
        piface.getRelay(index).open();
    }

    public void test(){
        piface.getRelay(1).getState();
        piface.getSwitch(1).addListener();
        piface.getSwitch(1).getState();
        piface.getOutputPin(1).low();
    }


}
