import React from 'react';
import { Text } from 'react-native';
import Estilo from './estilo';

export default ({value = 0}: {value?: number}) => {
    return (
        <>
            <Text>O resultado é</Text>
            <Text style={Estilo.fontG}>{value % 2 == 0 ? "Par" : "Ímpar"}</Text>
        </>
    )
}