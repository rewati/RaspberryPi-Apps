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

package com.rr.autobot1;

import com.rr.autobot1.bot.Robot;
import com.rr.autobot1.raspi.gpio.GpioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Rewati Raman(rewati.raman@gmail.com).
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {

    @Autowired
    private Robot robot;

    public static void main(String arg[]) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .sources(Application.class)
                .bannerMode(Banner.Mode.CONSOLE)
                .run(arg);
        Application app = context.getBean(Application.class);
        app.start();
    }

    private void start(){
        System.out.println("#################################");
        System.out.println("#      Starting AutoBot         #");
        System.out.println("#################################\n");
        robot.init();
    }
}
