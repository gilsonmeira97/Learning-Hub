import React from 'react';
import { Text, Platform } from 'react-native';
import Estilo from './estilo';

export default () => {
    if(Platform.OS == 'android') return <Text>Android</Text>
    else if(Platform.OS == 'ios') return <Text>IOS</Text>
}