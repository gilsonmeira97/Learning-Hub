import React from 'react';
import { Text } from 'react-native';
import Estilo from '../estilo';

export default ({name, lastName}: {name: string, lastName: string}) => {
    return (
        <Text style={Estilo.fontG}>
            {name + ' ' + lastName}
        </Text>
    )
}