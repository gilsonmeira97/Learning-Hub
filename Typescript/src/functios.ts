function sayHi(name: string) {
    return `Hello ${name.toUpperCase()}`;
}

function calculateDiscount(price: number, hasDiscount: boolean = false): number {
    return hasDiscount ? 0.9 * price : price;
}

console.log(calculateDiscount(25, true));

// typeguard

function processInput(input: number | string) {
    if (typeof input === 'number')
        console.log(input * 2);
    else
        console.log(input.toLowerCase());
}

processInput(10);
processInput("Hello!");

function createEmployee({id}: {id: number}):{id:number;isActive:boolean} {
    return {id: id, isActive: id % 2 === 0}
}

const first = createEmployee({id: 1})
const second = createEmployee({id: 5})
console.log(first, second);