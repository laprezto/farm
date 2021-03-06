/*
 * Copyright (c) 2016-2019 Zerocracy
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to read
 * the Software only. Permissions is hereby NOT GRANTED to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.zerocracy.entry;

import com.zerocracy.farm.props.PropsFarm;
import java.util.concurrent.TimeUnit;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Test case for {@link ExtGithub}.
 * @since 1.0
 * @checkstyle JavadocMethodCheck (500 lines)
 */
public final class ExtTelegramITCase {
    /**
     * Telegram bot token.
     */
    private static final String TOKEN = "<token>";

    /**
     * Telegram bot name.
     */
    private static final String NAME = "<bot-name>";

    @Test
    @Ignore
    public void runTelegramBot() throws Exception {
        new ExtTelegram(
            new PropsFarm(),
            String.format(
                "%s@%s",
                ExtTelegramITCase.NAME,
                ExtTelegramITCase.TOKEN
            )
        ).value();
        Thread.sleep(TimeUnit.MINUTES.toMillis(1L));
    }
}
