type Dog = { type: "Dog"; name: String; bark: () => void }
type Cat = { type: "Cat"; name: String; meow(): void }
type Animal = Dog | Cat

function makeSound(animal: Animal) {
    if('bark' in animal) animal.bark()
    else animal.meow()
}

