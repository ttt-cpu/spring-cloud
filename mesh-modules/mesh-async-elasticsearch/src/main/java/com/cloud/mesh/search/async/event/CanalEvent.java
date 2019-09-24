/*
 *  Copyright 2019 https://github.com/romeoblog/spring-cloud.git Group.
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
package com.cloud.mesh.search.async.event;

import com.cloud.mesh.search.async.canal.CanalMsgContent;
import org.springframework.context.ApplicationEvent;

/**
 * Class to be extended by all Canal events.
 *
 * @author willlu.zheng
 * @date 2019-09-24
 */
public abstract class CanalEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public CanalEvent(CanalMsgContent source) {
        super(source);
    }

    public CanalMsgContent getEntry() {
        return (CanalMsgContent) source;
    }
}