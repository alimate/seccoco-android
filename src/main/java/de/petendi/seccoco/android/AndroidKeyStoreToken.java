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
package de.petendi.seccoco.android;

import java.security.PrivateKey;

import de.petendi.seccoco.android.model.Identity;

class AndroidKeyStoreToken extends Token {
    private final PrivateKey privateKey;
    AndroidKeyStoreToken(Identity identity, PrivateKey privateKey) {
        super(identity);
        this.privateKey = privateKey;
    }

    PrivateKey getPrivateKey() {
        return privateKey;
    }
}