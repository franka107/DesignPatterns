//--------------- Product ---------------------
interface Product {
  operation(): string;
}

//--------------- Concrete Products ---------------------
class ConcreteProduct1 implements Product {
  public operation(): string {
    return 'Resultado del producto 1'
  }
}

class ConcreteProduct2 implements Product {
  public operation(): string {
    return 'Resultado del producto 2'
  }
}

// ---------------------- Creator --------------------------
abstract class Creator {
  public abstract factoryMethod(): Product;

  public someOperation(): string {
    const product: Product = this.factoryMethod();
    return `Creator: Este codigo funciono con ${product.operation()}`;
  }
}

// ---------------------- Concrete creators --------------------------
class ConcreteCreator1 extends Creator {
  public factoryMethod(): Product {
    return new ConcreteProduct1();
  }
}


class ConcreteCreator2 extends Creator {
  public factoryMethod(): Product {
    return new ConcreteProduct2();
  }
}

function clientCode(creator: Creator){
  console.log(`Client code , creator description:`);
  console.log(creator.someOperation());
}

console.log('Launched with creator 1');
clientCode(new ConcreteCreator1())

console.log('Launched with creator 2');
clientCode(new ConcreteCreator2())
