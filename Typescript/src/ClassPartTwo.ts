class Book {
    private readonly title: string;
    author: string;
    checkedOut: boolean = false;
    constructor(title: string, author: string) {
        this.title = title;
        this.author = author;
    }
    setAuthor(newAuthor: string): void { this.author = newAuthor }
    getTitle = () => { return this.title }
    toggleCheckedOut = () => { this.checkedOut = !this.checkedOut }
}

type Paper = {
    name: string;
    sum: () => void;
    calc():void;
}

interface Bookstore {
    calc(): void;
    sum: () => {};
}

const newBook = new Book("Today is a new day", "Bob Sincler");
// newBook.title = ""
// newBook.setAuthor
// newBook.toggleCheckedOut
console.log(newBook.getTitle());
