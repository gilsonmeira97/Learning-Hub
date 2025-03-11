interface Book {
    readonly isbn: number;
    title: string;
    author: string;
    genre?: string;
    printAuthor(): void;
    printTitle(message: string): string;
    printSomething: (someValue: number) => number;
}

const deepWork: Book = {
    isbn: 123,
    author: 'Clair Sans',
    title: 'The deep work',
    printAuthor() {
        console.log(this.author);
    },
    printSomething: (someValue) => {
        return someValue
    },
    printTitle: function(message) {
        return `${this.title} - ${message}`;
    }
}
deepWork.printAuthor()
console.log(deepWork.printTitle("test"));
console.log(deepWork.printSomething(5));
