package com.example.doni.matchschedule

import com.google.gson.annotations.SerializedName

data class EventsItem(
        @field:SerializedName("idAwayTeam")
        val idAwayTeam: String? = null,

        @field:SerializedName("intHomeShots")
        val intHomeShots: Any? = null,

        @field:SerializedName("intAwayShots")
        val intAwayShots: Any? = null,

        @field:SerializedName("strEvent")
        val strEvent: String? = null,

        @field:SerializedName("idHomeTeam")
        val idHomeTeam: String? = null,

        @field:SerializedName("intHomeScore")
        val intHomeScore: Any? = null,

        @field:SerializedName("strHomeTeam")
        val strHomeTeam: String? = null,

        @field:SerializedName("dateEvent")
        val dateEvent: String? = null,

        @field:SerializedName("strResult")
        val strResult: Any? = null,

        @field:SerializedName("intAwayScore")
        val intAwayScore: Any? = null,

        @field:SerializedName("strFilename")
        val strFilename: String? = null,

        @field:SerializedName("strTime")
        val strTime: String? = null,

        @field:SerializedName("strAwayTeam")
        val strAwayTeam: String? = null,

        @field:SerializedName("strDate")
        val strDate: String? = null,

        @field:SerializedName("intRound")
        val intRound: Any? = null,

        @field:SerializedName("intSpectators")
        val intSpectators: Any? = null,

        @field:SerializedName("strHomeRedCards")
        val strHomeRedCards: String? = null,

        @field:SerializedName("strHomeYellowCards")
        val strHomeYellowCards: String? = null,

        @field:SerializedName("strHomeLineupGoalkeeper")
        val strHomeLineupGoalkeeper: String? = null,

        @field:SerializedName("strHomeLineupDefense")
        val strHomeLineupDefense: String? = null,

        @field:SerializedName("strHomeLineupMidfield")
        val strHomeLineupMidfield: String? = null,

        @field:SerializedName("strHomeLineupForward")
        val strHomeLineupForward: String? = null,

        @field:SerializedName("strHomeLineupSubstitute")
        val strHomeLineupSubstitute: String? = null,

        @field:SerializedName("strHomeGoalDetails")
        val strHomeGoalDetails: String? = null,

        @field:SerializedName("strHomeFormation")
        val strHomeFormation: String? = null,

        @field:SerializedName("strAwayFormation")
        val strAwayFormation: String? = null,

        @field:SerializedName("strAwayRedCards")
        val strAwayRedCards: String? = null,

        @field:SerializedName("strAwayYellowCards")
        val strAwayYellowCards: String? = null,

        @field:SerializedName("strAwayGoalDetails")
        val strAwayGoalDetails: String? = null,

        @field:SerializedName("strAwayLineupGoalkeeper")
        val strAwayLineupGoalkeeper: String? = null,

        @field:SerializedName("strAwayLineupDefense")
        val strAwayLineupDefense: String? = null,

        @field:SerializedName("strAwayLineupMidfield")
        val strAwayLineupMidfield: String? = null,

        @field:SerializedName("strAwayLineupForward")
        val strAwayLineupForward: String? = null


)

