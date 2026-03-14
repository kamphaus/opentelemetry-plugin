/*
 * Copyright The Original Author or Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.jenkins.plugins.opentelemetry.semconv;

public enum SemConvStability {
    JENKINS("Jenkins (custom conventions only)"),
    JENKINS_OTEL_DUP("Jenkins + OpenTelemetry (both conventions)"),
    OTEL("OpenTelemetry (standard conventions only)");

    private final String displayName;

    SemConvStability(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
