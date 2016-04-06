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

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
@Component
public class Config {

    @Value("${stepDelay}")
    private long stepDelay;
    @Value("${leftForwardPin}")
    private int leftForwardPin;
    @Value("${leftReversePin}")
    private int leftReversePin;
    @Value("${rightForwardPin}")
    private int rightForwardPin;
    @Value("${rightReversePin}")
    private int rightReversePin;

    public long getStepDelay() {
        return stepDelay;
    }

    public void setStepDelay(long stepDelay) {
        this.stepDelay = stepDelay;
    }

    public int getLeftForwardPin() {
        return leftForwardPin;
    }

    public void setLeftForwardPin(int leftForwardPin) {
        this.leftForwardPin = leftForwardPin;
    }

    public int getLeftReversePin() {
        return leftReversePin;
    }

    public void setLeftReversePin(int leftReversePin) {
        this.leftReversePin = leftReversePin;
    }

    public int getRightForwardPin() {
        return rightForwardPin;
    }

    public void setRightForwardPin(int rightForwardPin) {
        this.rightForwardPin = rightForwardPin;
    }

    public int getRightReversePin() {
        return rightReversePin;
    }

    public void setRightReversePin(int rightReversePin) {
        this.rightReversePin = rightReversePin;
    }
}
