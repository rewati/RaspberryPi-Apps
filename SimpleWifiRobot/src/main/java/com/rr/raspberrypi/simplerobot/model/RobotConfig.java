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

package com.rr.raspberrypi.simplerobot.model;

/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
public class RobotConfig {
    private int leftFheelForward=0;
    private int rightWheelForward=1;
    private int leftWheelReverse=2;
    private int rightWheelReverse=3;

    public int getLeftFheelForward() {
        return leftFheelForward;
    }

    public void setLeftFheelForward(int leftFheelForward) {
        this.leftFheelForward = leftFheelForward;
    }

    public int getRightWheelForward() {
        return rightWheelForward;
    }

    public void setRightWheelForward(int rightWheelForward) {
        this.rightWheelForward = rightWheelForward;
    }

    public int getLeftWheelReverse() {
        return leftWheelReverse;
    }

    public void setLeftWheelReverse(int leftWheelReverse) {
        this.leftWheelReverse = leftWheelReverse;
    }

    public int getRightWheelReverse() {
        return rightWheelReverse;
    }

    public void setRightWheelReverse(int rightWheelReverse) {
        this.rightWheelReverse = rightWheelReverse;
    }
}