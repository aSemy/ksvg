/*
 * Copyright 2018 nwillc@gmail.com
 *
 * Permission to use, copy, modify, and/or distribute this software for any purpose with or without fee is hereby granted, provided that the above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package com.github.nwillc.ksvg

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SVGTest {
    @Test
    internal fun testSvg() {
        val svg = svg { }
        val sb = StringBuilder()
        svg.render(sb)
        assertThat(sb.toString()).isEqualTo("<svg></svg>")
    }

    @Test
    internal fun testSvgWithAttr() {
        val svg = svg {
            viewBox = "0 0 10 10"
        }

        val sb = StringBuilder()
        svg.render(sb)

        assertThat(sb.toString()).isEqualTo("<svg viewBox='0 0 10 10'></svg>")
    }

    @Test
    internal fun testSvgWithTags() {
        val svg = svg {
            rect {}
            text {}
        }

        val sb = StringBuilder()
        svg.render(sb)

        assertThat(sb.toString()).isEqualTo("<svg><rect></rect><text></text></svg>")
    }
}