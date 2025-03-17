import React, { useState } from 'react';
import { Text } from 'react-native';
import Estilo from '../estilo';
import ContadorDisplay from './ContadorDisplay';
import ContadorTeclado from './ContadorTeclado';

export default () => {
    const [num, setNum] = useState(0);

    const inc = () => {
        setNum(num + 1);
    }

    const dec = () => {
        setNum(num - 1);
    }

    return (
        <>
            <Text style={Estilo.fontG}>
                Contador V2
            </Text>
            <ContadorDisplay num={num} />
            <ContadorTeclado dec={dec} inc={inc} />
        </>
    );
}