package com.amazonaws.kinesisvideo.client.mediasource;

/**
 * Configuration for the media source. Each concrete media source
 * has different configuration implementation. E.g. for camera or microphone
 * @deprecated Configuration should be specified as parameters to a {@link com.amazonaws.kinesisvideo.client.mediasource.MediaSource}. Configuration
 *             objects are acceptable as parameters, but shouldn't be generic.
 */
@Deprecated
public interface MediaSourceConfiguration {

    interface Builder<T extends MediaSourceConfiguration> {
        T build();
    }

    /**
     * @return type of the media source, e.g. "AndroidCamera"
     */
    String getMediaSourceType();

    /**
     * @return description of the media source, e.g. "AndroidCamera"
     */
    String getMediaSourceDescription();
}
