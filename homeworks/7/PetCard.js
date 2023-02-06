class PetCard {
    constructor(Animal) {
      this.animal = animal
    }
  
    html() {
      return `
        <div class="news">
          <h1>${this.animal.name}</h1>
          <p>${this.animal.age}</p>
          <p>${this.animal.hasTail}</p>
        </div>
      `
    }
  
    json() {
      return JSON.stringify({
        name: this.animal.name,
        age: this.animal.age,
        hasTail: this.animal.hasTail,
        modified: this.animal.modified
      }, null, 2)
    }
  
    xml() {
      return `
        <animal>
          <name>${this.animal.name}</name>
          <age>${this.animal.age}</age>
          <hasTail>${this.animal.hasTail}</hasTail>
        </animal>
      `
    }
  }
  
  
  const printer = new CardPrinter(
    new Animal('Larry', 3, true)
  )
  
  console.log(printer.html())
  console.log(printer.xml())
  console.log(printer.json())
  