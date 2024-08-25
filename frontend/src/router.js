
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import RecordSearchRecordManager from "./components/listers/RecordSearchRecordCards"
import RecordSearchRecordDetail from "./components/listers/RecordSearchRecordDetail"

import ChampionHistoryChampionManager from "./components/listers/ChampionHistoryChampionCards"
import ChampionHistoryChampionDetail from "./components/listers/ChampionHistoryChampionDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/recordSearches/records',
                name: 'RecordSearchRecordManager',
                component: RecordSearchRecordManager
            },
            {
                path: '/recordSearches/records/:id',
                name: 'RecordSearchRecordDetail',
                component: RecordSearchRecordDetail
            },

            {
                path: '/championHistories/champions',
                name: 'ChampionHistoryChampionManager',
                component: ChampionHistoryChampionManager
            },
            {
                path: '/championHistories/champions/:id',
                name: 'ChampionHistoryChampionDetail',
                component: ChampionHistoryChampionDetail
            },



    ]
})
