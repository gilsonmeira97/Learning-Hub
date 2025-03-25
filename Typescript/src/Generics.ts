function processValue<T extends string | number>(value: T): T {
    console.log(value);
    return value;
}

processValue("Hello");
processValue(4);
// processValue(true) // Just acept string or boolean;