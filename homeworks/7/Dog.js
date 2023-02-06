class Dog extends Animal {
    static type = 'DOG';

    constructor(options) {
        super(options);
        this.color = options.color;
    }
    
    voice() {
        super.voice();
        console.log('I am dog');
    }

    get ageInfo() {
        return this.age * 7;
    }

    set ageInfo(newAge) {
        this.age = newAge;
    }
}

const dog = new Dog({
    name: 'Carry',
    age: 5,
    hasTail: true,
    color: 'white',
})

Object.assign(Dog.prototype, swimmer, goOutside)

const myDog = new Dog('Рэкс')
myDog.go()
myDog.swim()