package com.ioki.sentry.proguard.gradle.plugin

import org.gradle.api.plugins.ExtensionContainer
import org.gradle.api.provider.Property

fun ExtensionContainer.createSentryProguardExtension(): SentryProguardExtension =
    create("sentryProguard", SentryProguardExtension::class.java)

interface SentryProguardExtension {
    val organization: Property<String>

    val project: Property<String>

    val authToken: Property<String>

    val noUpload: Property<Boolean>
}