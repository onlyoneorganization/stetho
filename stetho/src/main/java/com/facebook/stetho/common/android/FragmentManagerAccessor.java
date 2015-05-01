/*
 * Copyright (c) 2014-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.facebook.stetho.common.android;

import java.util.List;

import javax.annotation.Nullable;

public interface FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> {
  @Nullable
  public List<FRAGMENT> getAddedFragments(FRAGMENT_MANAGER fragmentManager);
}
