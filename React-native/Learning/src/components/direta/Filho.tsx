import React from 'react';
import { Text } from 'react-native';
import Estilo from '../estilo';

export default (props: {a: number, b: number} ) => {
    return (
        <>
            <Text style={Estilo.fontG}>{props.a}</Text>
            <Text style={Estilo.fontG}>{props.b}</Text>
        </>
    );
};