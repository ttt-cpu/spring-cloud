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
package com.dg.mall.user.service.impl;

import com.dg.mall.user.entity.DemoVO;
import com.dg.mall.user.mapper.DemoMapperExt;
import com.dg.mall.user.service.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created with default template
 * Author: Joe Benji
 * Date: 2019-04-03
 * Time: 15:42
 * Description:
 */
@Service
public class DemoServiceImpl implements IDemoService {

    @Autowired
    private DemoMapperExt demoMapperExt;

    @Override
    public DemoVO getInformation(Integer id) {
        return demoMapperExt.getInformation(id);
    }
}