/**
 * Copyright © 2018 FINBOURNE TECHNOLOGY LTD
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */

package com.finbourne.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The CurrencyAndAmount model.
 */
public class CurrencyAndAmount {
    /**
     * The value property.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Double value;

    /**
     * The unit property.
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Double value() {
        return this.value;
    }

    /**
     * Get the unit value.
     *
     * @return the unit value
     */
    public String unit() {
        return this.unit;
    }

}