import React from 'react';
import { Button, Text } from 'react-native';
import Estilo from '../estilo';

export default (props: {max: number, min: number, func: Function}) => {
    function gerarNumero(min: number, max: number) {
            const fator = max - min ;
            return Math.random() * fator + min;
        }
    
        return (
            <>
                <Button 
                    title='Executar' 
                    onPress={() => {
                        const result = gerarNumero(props.min, props.max).toFixed(0);
                        props.func(result);
                    }}
                    />
            </>
        )
};