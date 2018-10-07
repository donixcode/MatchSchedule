package com.example.doni.matchschedule

interface MatchView {
    fun showLoading()
    fun hideLoading()
    fun showEventsList(data: List<EventsItem>?)
}