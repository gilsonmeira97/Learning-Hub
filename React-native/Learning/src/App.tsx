import React from 'react'
import { SafeAreaView, Text, StyleSheet } from 'react-native'

import Primeiro from './components/Primeiro'
import Comp from './components/Multi'
const {Comp1, Comp2} = require('./components/Multi')

export default () => (
    <SafeAreaView style={style.App}>
        <Comp />
        <Comp1 />
        <Comp2 />
        <Primeiro />
    </SafeAreaView>
)

const style = StyleSheet.create({
    App: {
        flexGrow: 1,
        justifyContent: 'center',
        alignItems: 'center'
    }
})