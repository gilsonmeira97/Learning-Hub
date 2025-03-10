import React from "react";
import { Button } from "react-native";

export default () => {

    function executar() {
        console.log("Executado!!!");
    }

    return (
        <>
           <Button onPress={executar} title="Executar!"/>
           <Button onPress={() => console.log("Executar 2")} title="Executar2!"/>
        </>
    )
}