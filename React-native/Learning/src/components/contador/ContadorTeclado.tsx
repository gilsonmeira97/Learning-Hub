import React from 'react';
import { Button, StyleSheet, Text, View } from 'react-native';
import Estilo from '../estilo';

export default (props: {inc: ()=>void, dec: ()=>void}) => {
    return (
        <View style={style.btn}>
            <Button title="+" onPress={props.inc} />
            <Button title="-" onPress={props.dec} />
        </View>
    )
}

const style = StyleSheet.create({
    btn: {
        flexDirection: 'row'
    }
})
