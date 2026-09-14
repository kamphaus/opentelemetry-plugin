/*
 * Copyright The Original Author or Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.jenkins.plugins.opentelemetry.semconv;

import io.opentelemetry.api.common.AttributeKey;

/**
 * VCS attributes not yet released in {@link io.opentelemetry.semconv.incubating.VcsIncubatingAttributes}.
 *
 * @see <a href="https://github.com/open-telemetry/semantic-conventions/blob/main/model/vcs/spans.yaml">VCS client span semantic convention</a>
 */
public final class VcsAttributes {

    public static final AttributeKey<String> VCS_OPERATION_NAME = AttributeKey.stringKey("vcs.operation.name");

    private VcsAttributes() {}
}
