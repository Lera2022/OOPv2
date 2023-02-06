class Animal {
    static type = 'ANIMAL';

    constructor(options) {
        this.name = options.name;
        this.age = options.age;
        this.hasTail = options.hasTail;
    }

    voice() {
        console.log(`I am animal!`);

    }
}

const animal = new Animal(
    {
        name: 'Mango',
        age: 2,
        hasTail: true
    }
)

const swimmer = {
    swim() {
      console.log(`${this.name} умеет плавать`)
    }
  }
  
  const goOutside = {
    go() {
      console.log(`${this.name} гуляет на улице`)
    }
  }
