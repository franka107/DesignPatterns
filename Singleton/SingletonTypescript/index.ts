class Conexion {
  private static instance: Conexion;
  
  private constructor(){}

  public static getInstance(): Conexion {
    if(!Conexion.instance){
      Conexion.instance = new Conexion();
    }
    return Conexion.instance;
  }

  public conectar(): void{
    console.log("Se abrio la conexion a a la base de datos")
  }
  public desconectar(): void{
    console.log("Se cerro la conexion a a la base de datos")
  }
}

function clientCode() {
  const s1: Conexion = Conexion.getInstance();
  const s2: Conexion = Conexion.getInstance();

  if(s1 === s2) {
    console.log("Singleton esta funcionando exitosamente");
  } else {
    console.log("Singleton fallo");
  }
}

clientCode();
