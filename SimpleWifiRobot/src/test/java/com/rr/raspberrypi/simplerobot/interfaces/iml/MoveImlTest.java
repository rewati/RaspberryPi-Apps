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
import java.util.Scanner;

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
    public void integrationTest() throws Exception{
        move.stepFront();
        move.stepFront();
        move.stepFront();
        move.leftTurn();
        move.leftTurn();
        move.stepFront();
        move.stepFront();
        move.stepFront();
        move.rightTurn();
        move.rightTurn();
        move.stepFront();
        move.stepFront();
        move.stepFront();
    }

    @Test
    public void runTest() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        String commant = s.nextLine();
        while(!commant.equals("quit")) {
            if(commant.equals("w"))
                move.stepFront();
            if(commant.equals("a"))
                move.leftTurn();
            if(commant.equals("d"))
                move.rightTurn();
            commant = s.nextLine();
        }
    }

//
//    @Test
//    public void stepFront() throws Exception {
//        move.stepFront();
//    }
//
//    @Test
//    public void stepBack() throws Exception {
//        move.stepBack();
//    }
//
//    @Test
//    public void stepFront() throws Exception {
//        move.stepFront();
//    }
//
//    @Test
//    public void startRevers() throws Exception {
//        move.startRevers();
//    }
//
//    @Test
//    public void leftTurn() throws Exception {
//        move.leftTurn();
//    }
//
//    @Test
//    public void rightTurn() throws Exception {
//        move.rightTurn();
//    }
//
//    @Test
//    public void startLeftTurn() throws Exception {
//        move.startLeftTurn();
//    }
//
//    @Test
//    public void startRightTurn() throws Exception {
//        move.startRightTurn();
//    }
//
//    @Test
//    public void stop() throws Exception {
//        move.stop();
//    }

    @After
    public void tearDown(){
        move.stop();
    }
}