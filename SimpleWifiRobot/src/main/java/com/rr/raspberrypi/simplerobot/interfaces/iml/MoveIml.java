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

package com.rr.raspberrypi.simplerobot.interfaces.iml;

import com.rr.raspberrypi.piface.facade.PiFaceService;
import com.rr.raspberrypi.piface.facade.PiFaceServiceIml;
import com.rr.raspberrypi.simplerobot.interfaces.Move;
import com.rr.raspberrypi.simplerobot.model.RobotConfig;

import java.io.IOException;

/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
public class MoveIml implements Move {

    private PiFaceService piFace;
    private static RobotConfig robotConfig;

    public MoveIml() throws IOException {
        piFace = PiFaceServiceIml.getPiFaceService();
        robotConfig = new RobotConfig();
    }

    public void stepFront() throws InterruptedException {
        stop();
        piFace.makePinOn(robotConfig.getRightWheelForward());
        piFace.makePinOn(robotConfig.getLeftFheelForward());
        Thread.sleep(robotConfig.getStepDelay());
        stop();
    }

    public void stepBack() throws InterruptedException {
        stop();
        piFace.makePinOn(robotConfig.getLeftWheelReverse());
        piFace.makePinOn(robotConfig.getRightWheelReverse());
        Thread.sleep(robotConfig.getStepDelay());
        stop();
    }

    public void startFront() {
        stop();
        piFace.makePinOn(robotConfig.getRightWheelForward());
        piFace.makePinOn(robotConfig.getLeftFheelForward());
    }

    public void startRevers() {
        stop();
        piFace.makePinOn(robotConfig.getRightWheelReverse());
        piFace.makePinOn(robotConfig.getLeftWheelReverse());
    }

    public void leftTurn() throws InterruptedException {
        stop();
        piFace.makePinOn(robotConfig.getRightWheelForward());
        piFace.makePinOn(robotConfig.getLeftWheelReverse());
        Thread.sleep(robotConfig.getStepDelay());
        stop();
    }

    public void rightTurn() throws InterruptedException {
        stop();
        piFace.makePinOn(robotConfig.getLeftFheelForward());
        piFace.makePinOn(robotConfig.getRightWheelReverse());
        Thread.sleep(robotConfig.getStepDelay());
        stop();
    }

    public void startLeftTurn() throws InterruptedException {
        stop();
        piFace.makePinOn(robotConfig.getRightWheelForward());
        piFace.makePinOn(robotConfig.getLeftWheelReverse());
        Thread.sleep(robotConfig.getStepDelay());
    }

    public void startRightTurn() throws InterruptedException {
        stop();
        piFace.makePinOn(robotConfig.getLeftFheelForward());
        piFace.makePinOn(robotConfig.getRightWheelReverse());
        Thread.sleep(robotConfig.getStepDelay());
    }

    public void stop() {
        piFace.makePinOff(robotConfig.getLeftFheelForward());
        piFace.makePinOff(robotConfig.getRightWheelForward());
        piFace.makePinOff(robotConfig.getLeftWheelReverse());
        piFace.makePinOff(robotConfig.getRightWheelReverse());
    }
}
