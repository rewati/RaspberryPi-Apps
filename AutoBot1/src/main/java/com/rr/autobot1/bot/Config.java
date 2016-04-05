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

import org.springframework.stereotype.Component;

/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
@Component
public class Config {
    private long stepDelay;
    private int leftForwardPin;
    private int leftReversePin;
    private int rightForwardPin;
    private int rightReversePin;

    public long getStepDelay() {
        return stepDelay;
    }

    public int getLeftForwardPin() {
        return leftForwardPin;
    }

    public int getLeftReversePin() {
        return leftReversePin;
    }

    public int getRightForwardPin() {
        return rightForwardPin;
    }

    public int getRightReversePin() {
        return rightReversePin;
    }
}