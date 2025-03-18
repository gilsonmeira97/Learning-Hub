const person: [String, Number] = ["Susan", 25];
const animal: [String, Number?] = ["Cat"];

enum ServerResponseStatus {
    Success = 200, // By default if you dont initialize them it will be 0
    Error = 'Error' // And this will be 1...
}
console.log(ServerResponseStatus);

interface ServerResponse {
    result: ServerResponseStatus;
    data: String[];
}


function getServerResponse(): ServerResponse {
    return {
        result: ServerResponseStatus.Success,
        data: ["John", "Susan"]
    }
}

let response: ServerResponse = getServerResponse();
console.log(response);


// Force type Typescript
let myString: any;
myString = "This is a string";
const numOfChar: Number = (myString as string).length;

type Bird = {
    name: string;
}

let birdString = '{"name": "Eagle"}';
let dogString = '{"breed": "Poodle"}';

let birdObject = JSON.parse(birdString);
let dogObject = JSON.parse(dogString);

let bird: Bird = birdObject as Bird;
let birdTwo = dogObject as Bird; // It will make birdTwo assume that dogObject is a Bird, but not check if it is true

console.log(bird, birdTwo.name);