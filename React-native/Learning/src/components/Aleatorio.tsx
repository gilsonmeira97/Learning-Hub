import React from 'react';
import { Text } from 'react-native';
import Estilo from './estilo';

export default ({min = 1, max = 10}: {min: number, max: number}) => {
    const delta = max - min + 1
    const random = (Math.random() * delta) + min;
    return <Text style={Estilo.fontG}>{random.toFixed()}</Text>
}