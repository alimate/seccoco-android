/**
 * Copyright 2015  Jan Petendi <jan.petendi@p-acs.com>
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
package de.petendi.seccoco.android

import org.junit.runners.model.InitializationError
import org.robolectric.annotation.Config
import org.robospock.internal.RoboSputnik

class SeccocoSputnik extends RoboSputnik {

    public SeccocoSputnik(Class<?> clazz) throws InitializationError {
        super(clazz);
    }

    @Override
    public Config getConfig(Class<?> clazz) {
        Config classConfig = clazz.getAnnotation(Config.class);
        Properties props = new Properties();
        props.put("manifest", "--none")
        Config config = Config.Implementation.fromProperties(props);
        if (classConfig != null) {
            config = new Config.Implementation(config, classConfig);
        }
        return config;
    }
}