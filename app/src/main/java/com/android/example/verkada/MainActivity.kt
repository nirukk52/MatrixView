/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.example.verkada

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject
/**
 * Comments regarding the VERKADA assignment.
 * App Architecture inspired from Android Arch Samples.
 * Home Fragment is the on boarding screen.
 * Motion log fragment is the list screen with time and duration.
 *
 * Displaying equally spaced grid is done by creating an recycler view gridManager and attaching drag to select listener to it.
 * Created a POJO class Cell to hold row & col and also selected/deselected state.
 * Cell height and width is calculated and applied at runtime. It is calculated such that it should work for any device screen and any n*n matrix.
 *
 * MotionSearchViewModel class for generating cells.
 * Didn't touch the provided retrofit class.
 */
class MainActivity : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    override fun supportFragmentInjector() = dispatchingAndroidInjector
}
