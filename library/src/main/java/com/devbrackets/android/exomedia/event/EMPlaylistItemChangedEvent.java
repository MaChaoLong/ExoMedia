/*
 * Copyright (C) 2015 Brian Wernick
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.devbrackets.android.exomedia.event;

import com.devbrackets.android.exomedia.manager.EMPlaylistManager;

public class EMPlaylistItemChangedEvent<T extends EMPlaylistManager.PlaylistItem> {
    public final T currentItem;
    public final EMPlaylistManager.MediaType mediaType;
    public final boolean hasNext;
    public final boolean hasPrevious;

    public EMPlaylistItemChangedEvent(T currentItem, EMPlaylistManager.MediaType mediaType, boolean hasPrevious, boolean hasNext) {
        this.currentItem = currentItem;
        this.mediaType = mediaType;
        this.hasPrevious = hasPrevious;
        this.hasNext = hasNext;
    }
}
