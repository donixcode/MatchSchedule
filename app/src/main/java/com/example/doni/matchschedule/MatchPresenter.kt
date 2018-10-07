package com.example.doni.matchschedule

import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MatchPresenter(private val view: MatchView,
                     private val apiRepository: ApiRepository,
                     private val gson: Gson) {

    fun getPastEventsList() {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.getpastEvent("4328")),
                    EventResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showEventsList(data.events)
            }
        }
    }

    fun getNextEventsList() {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(apiRepository
                    .doRequest(TheSportDBApi.getNextEvent("4328")),
                    EventResponse::class.java
            )

            uiThread {
                view.hideLoading()
                view.showEventsList(data.events)
            }
        }
    }
}