/*
 * Copyright 2020 Tailored Media GmbH.
 * Created by Florian Schuster.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tailoredapps.androidapptemplate.detail

import androidx.lifecycle.viewModelScope
import at.florianschuster.control.Controller
import at.florianschuster.control.createController
import com.tailoredapps.androidapptemplate.base.ui.ControllerViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import com.tailoredapps.androidapptemplate.core.model.Example
import com.tailoredapps.androidapptemplate.repository.Repository

@FlowPreview
@ExperimentalCoroutinesApi
class DetailViewModel(
    private val repo: Repository
) : ControllerViewModel<DetailViewModel.Action, DetailViewModel.State>() {

    sealed class Action

    sealed class Mutation

    data class State(
        val model: Example = Example(),
        val logoUrl: String = "https://user-images.githubusercontent.com/2580292/59103107-390a7b80-892e-11e9-9466-774d413697ee.jpg"
    )

    override val controller: Controller<Action, State> = viewModelScope.createController<Action, Mutation, State>(
        initialState = State()
    )
}