import React, { useState } from "react";
import { Button, StyleSheet, Text, TouchableOpacity, View } from "react-native";
import Estilo from './estilo';

export default ({inicial}: {inicial: number}) => {
    // let numero = inicial;
    const [numero, setNumero] = useState(inicial);

    const inc = () => {
        setNumero(numero + 1);
    }

    const dec = () => {
        setNumero(numero - 1);
    }

    return (
        <>
            <Text style={Estilo.fontG}>{numero}</Text>
            <View style={style.container}>
                {/* <Button title="+" onPress={inc} /> */}
                {/* <Button title="-" onPress={dec} /> */}
                <TouchableOpacity style={style.btn} onPress={inc}>
                    <Text style={style.txtBtn}>+</Text>
                </TouchableOpacity>
                <TouchableOpacity style={style.btn} onPress={dec}>
                    <Text style={style.txtBtn}>-</Text>
                </TouchableOpacity>
            </View>
        </>
    )
}

const style = StyleSheet.create({
    container: {
        display: 'flex',
        flexDirection: "row",
    },
    btn: {
        minWidth: 50,
        minHeight: 50,
        backgroundColor: "#15B5B0",
        borderRadius: 50,
        marginLeft: 10,
    },
    txtBtn: {
        color: "#FFF",
        fontSize: 25,
        margin: 'auto'
    }
})