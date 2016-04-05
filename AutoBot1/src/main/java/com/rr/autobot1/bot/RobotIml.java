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

package com.rr.autobot1.bot;

import com.rr.autobot1.raspi.gpio.GpioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
@Service
public class RobotIml implements Robot {

    @Autowired
    private GpioService gpioService;

    @Autowired
    private Config config;

    public void init() {
        while(true) {
            moveForward();
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void turnLeft() {
        stop();
        gpioService.turnPinOn(config.getLeftReversePin());
        gpioService.turnPinOn(config.getRightForwardPin());
        try {
            Thread.sleep(config.getStepDelay());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop();
    }

    public void turnRight() {
        stop();
        gpioService.turnPinOn(config.getLeftForwardPin());
        gpioService.turnPinOn(config.getRightReversePin());
        try {
            Thread.sleep(config.getStepDelay());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop();
    }

    public void stop() {
        gpioService.turnPinOff(config.getLeftForwardPin());
        gpioService.turnPinOff(config.getRightForwardPin());
        gpioService.turnPinOff(config.getLeftReversePin());
        gpioService.turnPinOff(config.getRightReversePin());
    }

    public void moveForward() {
        stop();
        gpioService.turnPinOn(config.getLeftForwardPin());
        gpioService.turnPinOn(config.getRightForwardPin());
    }

    public void reverse() {
        stop();
        gpioService.turnPinOn(config.getLeftReversePin());
        gpioService.turnPinOn(config.getRightReversePin());
    }
}
