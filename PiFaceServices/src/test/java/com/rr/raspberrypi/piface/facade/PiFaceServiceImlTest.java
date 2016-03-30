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

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
public class PiFaceServiceImlTest {

    private PiFaceService pi;

    @Before
    public void setup(){
        try {
            pi = PiFaceServiceIml.getPiFaceService();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getPiFaceService() throws Exception {

    }

    //@Test
    public void LEDon() throws Exception {
        pi.LEDon(3);
    }

    //@Test
    public void LEDoff() throws Exception {
        pi.LEDoff(3);
    }

    @Test
    public void switchState() throws Exception {

    }
}