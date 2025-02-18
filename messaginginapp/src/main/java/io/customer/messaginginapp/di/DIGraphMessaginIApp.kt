package io.customer.messaginginapp.di

import io.customer.messaginginapp.provider.GistApi
import io.customer.messaginginapp.provider.GistApiProvider
import io.customer.messaginginapp.provider.GistInAppMessagesProvider
import io.customer.messaginginapp.provider.InAppMessagesProvider
import io.customer.sdk.di.CustomerIOComponent

internal val CustomerIOComponent.gistApiProvider: GistApi
    get() = override() ?: GistApiProvider()

internal val CustomerIOComponent.gistProvider: InAppMessagesProvider
    get() = override() ?: GistInAppMessagesProvider(gistApiProvider)
