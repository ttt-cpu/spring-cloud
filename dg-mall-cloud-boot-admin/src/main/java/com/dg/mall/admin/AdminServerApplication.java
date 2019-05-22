/*
 *  Copyright 2015-2019 dg-mall.com Group.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.dg.mall.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * Admin Server Application run
 *
 * @author Benji
 * @date 2019-04-03
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
@Slf4j
public class AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AdminServerApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        log.info("AdminServerApplication is running!");
    }
}