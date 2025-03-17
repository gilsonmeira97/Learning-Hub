import React, { useState } from 'react';
import { Text } from 'react-native';
import Estilo from '../estilo';
import Filho from './Filho';

export default () => {
    const [valor, setValor] = useState(0);

    function exibirValor(valor: number) {
        console.warn(valor);
    }

    return (
        <>
            <Text style={Estilo.fontG}>{valor}</Text>
            <Filho min={5} max={10} func={setValor} />
        </>
    )
};