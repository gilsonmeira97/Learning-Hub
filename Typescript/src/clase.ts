let awesomeName:string = 'shakeAndBake';
awesomeName = 'something';
awesomeName.toUpperCase();
// console.log(awesomeName);

// awesomeName = 20;

let amount:number = 20;
amount = 12 - 1;
// amount = 'pants'

let isAwesome: boolean = true;
isAwesome = false;
// isAwesome = 'shakeAndBake';

let obj = 'Ana';
//obj = 3;

let tax:number | string = 10;
tax = 'ten';

let requestStatus: 'pending' | 'success' | 'error' = 'pending';
requestStatus = 'success';

let notSure: any = 4;
notSure = false;
notSure = 'Ana';

let books = ['1984', 'Brave New World', 'Fahrenheit 451']

let foundBook: string | undefined;

for (let book of books) {
    if(book === '1984') {
        foundBook = book;
        break;
    }
}

// console.log(foundBook);

let prices: number[] = [100, 75, 42];
//prices.push('hello');

// OBJECTS
let car: { brand: string; year:number } = { brand:'Toyota', year: 2013 };

let book = {title: 'book', price: 20};
let pen = {title: 'pen', price: 3};
let notebook = {title: 'notebook'};

let items: {readonly title: string; price?: number}[] = [book, pen, notebook];
// items[0].title = 'New book';
items[0].price = 25;
