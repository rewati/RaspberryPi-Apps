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

package com.rr.raspberrypi.piface.facade;

/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
public interface PiFaceService {
    void LEDon(int i);
    void LEDoff(int i);
    boolean switchState(int i);
    void sendPulsePin(int pin,long delay);
    void makePinOff(int pin);
    void makePinOn(int pin);
    void closeRelay(int index);
    void openRelay(int index);
}
