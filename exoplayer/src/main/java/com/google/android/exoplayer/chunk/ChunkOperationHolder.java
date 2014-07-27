/*
 * Copyright (C) 2014 The Android Open Source Project
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
package com.google.android.exoplayer.chunk;

/**
 * Holds a chunk operation, which consists of a {@link com.google.android.exoplayer.chunk.Chunk} to load together with the number of
 * {@link com.google.android.exoplayer.chunk.MediaChunk}s that should be retained on the queue.
 */
public final class ChunkOperationHolder {

  /**
   * The number of {@link com.google.android.exoplayer.chunk.MediaChunk}s to retain in a queue.
   */
  public int queueSize;

  /**
   * The chunk.
   */
  public Chunk chunk;

}
