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

import com.rr.raspberrypi.simplerobot.interfaces.Move;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
public class MoveImlTest {

    private Move move;
    @Before
    public void setup() throws IOException {
        move = new MoveIml();
    }

    @Test
    public void stepFront() throws Exception {
        move.stepFront();
    }

    @Test
    public void stepBack() throws Exception {

    }

    @Test
    public void startFront() throws Exception {

    }

    @Test
    public void startRevers() throws Exception {

    }

    @Test
    public void leftTurn() throws Exception {

    }

    @Test
    public void rightTurn() throws Exception {

    }

    @Test
    public void startLeftTurn() throws Exception {

    }

    @Test
    public void startRightTurn() throws Exception {

    }

    @Test
    public void stop() throws Exception {

    }

    @After
    public void tearDown(){
        move.stop();
    }
}