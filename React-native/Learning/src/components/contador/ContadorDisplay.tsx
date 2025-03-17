import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import Estilo from '../estilo';

export default (props: {num: number}) => {
    
    return (
        <View style={style.Display}>
            <Text style={[Estilo.fontG, style.DisplayText]}>
                {props.num}
            </Text>
        </View>
    );
}

const style = StyleSheet.create({
    Display: {
        backgroundColor: '#000',
        padding: 20,
        width: '85%'
    },
    DisplayText: {
        color: '#FFF'
    }
});