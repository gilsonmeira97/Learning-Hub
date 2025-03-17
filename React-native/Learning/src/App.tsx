import React from 'react'
import { SafeAreaView, Text, StyleSheet } from 'react-native'

import Primeiro from './components/Primeiro'
import Comp from './components/Multi'
import MinMax from './components/MinMax'
import Aleatorio from './components/Aleatorio'
import Titulo from './components/Titulo'
import Botao from './components/Botao'
import Contador from './components/Contador'
import Pai from './components/direta/Pai'
import PaiIndireta from './components/indireta/Pai'
import ContadorV2 from './components/contador/ContadorV2'
const {Comp1, Comp2} = require('./components/Multi')

export default () => (
    <SafeAreaView style={style.App}>
        <ContadorV2 />
        {/* <PaiIndireta /> */}
        {/* <Pai /> */}
        {/* <Contador inicial={100}/> */}
        {/* <Botao /> */}
        {/* <Titulo principal='Cadastro Produto' secundario='Tela de cadastro do produto' /> */}
        {/* <Aleatorio min={1} max={60} />
        <Aleatorio min={1} max={60} />
        <Aleatorio min={1} max={60} />
        <Aleatorio min={1} max={60} />
        <Aleatorio min={1} max={60} />
        <Aleatorio min={1} max={60} /> */}
        {/* <MinMax min={3} max={20} /> */}
        {/* <Comp /> */}
        {/* <Comp1 /> */}
        {/* <Comp2 /> */}
        {/* <Primeiro /> */}
    </SafeAreaView>
)

const style = StyleSheet.create({
    App: {
        flexGrow: 1,
        justifyContent: 'center',
        alignItems: 'center',
        padding: 20
    }
})