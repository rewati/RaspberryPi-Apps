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

package com.rr.raspberrypi.simplerobot.web;

import com.rr.raspberrypi.simplerobot.interfaces.Move;
import com.rr.raspberrypi.simplerobot.interfaces.iml.MoveIml;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
@RestController
@RequestMapping("/move")
public class Controller {

    Move move = new MoveIml();

    public Controller() throws IOException {
    }

    @RequestMapping("/forward")
    public String moveForward() throws InterruptedException {
        move.stepFront();
        return "forward";
    }

    @RequestMapping("/left")
    public String turnLeft() throws InterruptedException {
        move.leftTurn();
        return "left";
    }

    @RequestMapping("/right")
    public String turnRight() throws InterruptedException {
        move.rightTurn();
        return "right";
    }
}
