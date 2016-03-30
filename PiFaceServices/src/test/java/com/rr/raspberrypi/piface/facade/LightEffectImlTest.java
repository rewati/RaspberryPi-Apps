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
public class LightEffectImlTest {

    private LightEffect lightEffect;

    @Before
    public void setup() throws IOException {
        lightEffect = new LightEffectIml();
    }

    //@Test
    public void runEffect() throws Exception {
        lightEffect.runEffect(1000);
    }
}