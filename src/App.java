import models.*;

public class App{
    
    public static void main(string[] arg) throws Exception{
        Car Mycar = new Car();

        Mycar.setMake("Range Rover");
        Mycar.setModel("Evoque");
        Mycar.setYear(2024);
        System.out.println("Make: " + Mycar.getmake());
        System.out.println("mode:" + Mycar.getmodel());
        System.out.println("year:" +Mycar.getyear());


        Car momCar = new Car();

        momCar.setMake("Toyota");
        momCar.setModel("x");
        momCar.setYear(2022);
        System.out.println("Make: " + momCar.getmake());
        System.out.println("mode:" + momCar.getmodel());
        System.out.println("year:" +momCar.getyear());

        Car sistercCar =new Car();

        sistercCar.setMake("BMW");
        sistercCar.setModel("x");
        sistercCar.setYear(2020);
        System.out.println("Make: " + sistercCar.getmake());
        System.out.println("mode:" + sistercCar.getmodel());
        System.out.println("year:" +sistercCar.getyear());

        Car frinCar = new Car();

        frinCar.setMake("Mazda");
        frinCar.setModel("2");
        frinCar.setYear(2022);
        System.out.println("Make: " + frinCar.getmake());
        System.out.println("mode:" + frinCar.getmodel());
        System.out.println("year:" +frinCar.getyear());

        Chasis Mychasis = new Chasis();

        Mychasis.settipo("4");
        Mychasis.setdimensiones("4,3 m de largo, 1,8 m de ancho y 1,5 m de alto");
        Mychasis.setpeso(null);
        System.out.println("Tipo: " + Mychasis.gettipo());
        System.out.println("Dimensiones:" + Mychasis.getdimensiones());
        System.out.println("Peso:" +Mychasis.getpeso());

        Chasis momChasis = new Chasis();

        momChasis.settipo("4");
        momChasis.setdimensiones("4,3 m de largo, 1,8 m de ancho y 1,5 m de alto");
        momChasis.setpeso(null);
        System.out.println("Tipo: " + momChasis.gettipo());
        System.out.println("Dimensiones:" + momChasis.getdimensiones());
        System.out.println("Peso:" +momChasis.getpeso());

        Chasis sistercChasis = new Chasis();

        sistercChasis.settipo("4");
        sistercChasis.setdimensiones("4,3 m de largo, 1,8 m de ancho y 1,5 m de alto");
        sistercChasis.setpeso(null);
        System.out.println("Tipo: " + sistercChasis.gettipo());
        System.out.println("Dimensiones:" + sistercChasis.getdimensiones());
        System.out.println("Peso:" +sistercChasis.getpeso());

        Chasis frinChasis =new Chasis();

        frinChasis.settipo("4");
        frinChasis.setdimensiones("4,3 m de largo, 1,8 m de ancho y 1,5 m de alto");
        frinChasis.setpeso(null);
        System.out.println("Tipo: " + frinChasis.gettipo());
        System.out.println("Dimensiones:" + frinChasis.getdimensiones());
        System.out.println("Peso:" +frinChasis.getpeso());

        Mantenimiento mycMantenimiento = new Mantenimiento();

        mycMantenimiento.sethistorial("si");
        mycMantenimiento.setprogramacion("15 agosto");
        System.out.println("historial: " + mycMantenimiento.gethistorial());
        System.out.println("Programacion:" + mycMantenimiento.getprogramacion());
        
        Mantenimiento momMantenimiento = new Mantenimiento();

        momMantenimiento.sethistorial("si");
        momMantenimiento.setprogramacion("15 agosto");
        System.out.println("historial: " + momMantenimiento.gethistorial());
        System.out.println("Programacion:" + momMantenimiento.getprogramacion());
        
        Mantenimiento sisterMantenimiento = new Mantenimiento();

        sisterMantenimiento.sethistorial("si");
        sisterMantenimiento.setprogramacion("15 agosto");
        System.out.println("historial: " + sisterMantenimiento.gethistorial());
        System.out.println("Programacion:" + sisterMantenimiento.getprogramacion());
        
        Mantenimiento frinMantenimiento = new Mantenimiento();

        frinMantenimiento.sethistorial("si");
        frinMantenimiento.setprogramacion("15 agosto");
        System.out.println("historial: " + frinMantenimiento.gethistorial());
        System.out.println("Programacion:" + frinMantenimiento.getprogramacion());

        Motor myMotor = new Motor();

        myMotor.settipo("4");
        myMotor.setcilindraje(null);
        myMotor.setpotencia(null);
        System.out.println("Tipo: " + myMotor.gettipo());
        System.out.println("cilindraje:" + myMotor.getcilindraje());
        System.out.println("potencia:" +myMotor.getpotencia());

        Motor momMotor = new Motor();

        momMotor.settipo("4");
        momMotor.setcilindraje(null);
        momMotor.setpotencia(null);
        System.out.println("Tipo: " + momMotor.gettipo());
        System.out.println("cilindraje:" + momMotor.getcilindraje());
        System.out.println("potencia:" +momMotor.getpotencia());

        Motor sisterMotor = new Motor();

        sisterMotor.settipo("4");
        sisterMotor.setcilindraje(null);
        sisterMotor.setpotencia(null);
        System.out.println("Tipo: " + sisterMotor.gettipo());
        System.out.println("cilindraje:" + sisterMotor.getcilindraje());
        System.out.println("potencia:" +sisterMotor.getpotencia());

        Motor frinMotor = new Motor();

        frinMotor.settipo("4");
        frinMotor.setcilindraje(null);
        frinMotor.setpotencia(null);
        System.out.println("Tipo: " + frinMotor.gettipo());
        System.out.println("cilindraje:" + frinMotor.getcilindraje());
        System.out.println("potencia:" +frinMotor.getpotencia());

        Neumatico myNeumatico =new Neumatico();

        myNeumatico.setmarca("4");
        myNeumatico.settamaño(null);
        myNeumatico.setpresion(null);
        System.out.println("marca: " + myNeumatico.getmarca());
        System.out.println("tamaño:" + myNeumatico.gettamaño());
        System.out.println("presion:" +myNeumatico.getpresion());

        Neumatico momNeumatico =new Neumatico();

        momNeumatico.setmarca("4");
        momNeumatico.settamaño(null);
        momNeumatico.setpresion(null);
        System.out.println("marca: " + momNeumatico.getmarca());
        System.out.println("tamaño:" + momNeumatico.gettamaño());
        System.out.println("presion:" +momNeumatico.getpresion());

        Neumatico sisterNeumatico =new Neumatico();

        sisterNeumatico.setmarca("4");
        sisterNeumatico.settamaño(null);
        sisterNeumatico.setpresion(null);
        System.out.println("marca: " + sisterNeumatico.getmarca());
        System.out.println("tamaño:" + sisterNeumatico.gettamaño());
        System.out.println("presion:" +sisterNeumatico.getpresion());

        Neumatico frinNeumatico =new Neumatico();

        frinNeumatico.setmarca("4");
        frinNeumatico.settamaño(null);
        frinNeumatico.setpresion(null);
        System.out.println("marca: " + frinNeumatico.getmarca());
        System.out.println("tamaño:" + frinNeumatico.gettamaño());
        System.out.println("presion:" +frinNeumatico.getpresion());

        registroVehicular myRegistroVehicular= new registroVehicular();

        myRegistroVehicular.setmatricula("4");
        myRegistroVehicular.setpropietario(null);
        myRegistroVehicular.setfechaRegistro(0);
        System.out.println("matricula: " + myRegistroVehicular.getmatricula());
        System.out.println("propietario:" + myRegistroVehicular.getpropietario());
        System.out.println("fecha de Registro:" +myRegistroVehicular.getfechaRegistro());

        registroVehicular momRegistroVehicular= new registroVehicular();

        momRegistroVehicular.setmatricula("4");
        momRegistroVehicular.setpropietario(null);
        momRegistroVehicular.setfechaRegistro(0);
        System.out.println("matricula: " + momRegistroVehicular.getmatricula());
        System.out.println("propietario:" + momRegistroVehicular.getpropietario());
        System.out.println("fecha de Registro:" +momRegistroVehicular.getfechaRegistro());

        registroVehicular sisterRegistroVehicular= new registroVehicular();

        sisterRegistroVehicular.setmatricula("4");
        sisterRegistroVehicular.setpropietario(null);
        sisterRegistroVehicular.setfechaRegistro(0);
        System.out.println("matricula: " + sisterRegistroVehicular.getmatricula());
        System.out.println("propietario:" + sisterRegistroVehicular.getpropietario());
        System.out.println("fecha de Registro:" +sisterRegistroVehicular.getfechaRegistro());

        registroVehicular frinRegistroVehicular= new registroVehicular();

        frinRegistroVehicular.setmatricula("4");
        frinRegistroVehicular.setpropietario(null);
        frinRegistroVehicular.setfechaRegistro(0);
        System.out.println("matricula: " + frinRegistroVehicular.getmatricula());
        System.out.println("propietario:" + frinRegistroVehicular.getpropietario());
        System.out.println("fecha de Registro:" +frinRegistroVehicular.getfechaRegistro());

        Sensor mySensor = new Sensor();

        mySensor.setvelocidad("4");
        mySensor.settemperatura(null);
        mySensor.setpresion(null);
        System.out.println("velocidad: " + mySensor.getvelocidad());
        System.out.println("temprsettemperatura:" + mySensor.gettemperatura());
        System.out.println("presion:" +mySensor.getpresion());

        Sensor momSensor = new Sensor();

        momSensor.setvelocidad("4");
        momSensor.settemperatura(null);
        momSensor.setpresion(null);
        System.out.println("velocidad: " + momSensor.getvelocidad());
        System.out.println("temprsettemperatura:" + momSensor.gettemperatura());
        System.out.println("presion:" +momSensor.getpresion());

        Sensor sisterSensor = new Sensor();

        sisterSensor.setvelocidad("4");
        sisterSensor.settemperatura(null);
        sisterSensor.setpresion(null);
        System.out.println("velocidad: " + sisterSensor.getvelocidad());
        System.out.println("temprsettemperatura:" + sisterSensor.gettemperatura());
        System.out.println("presion:" +sisterSensor.getpresion());

        Sensor frinSensor = new Sensor();

        frinSensor.setvelocidad("4");
        frinSensor.settemperatura(null);
        frinSensor.setpresion(null);
        System.out.println("velocidad: " + frinSensor.getvelocidad());
        System.out.println("temprsettemperatura:" + frinSensor.gettemperatura());
        System.out.println("presion:" +frinSensor.getpresion());


        SistemaElectrico mySistemaElectrico = new SistemaElectrico();

        mySistemaElectrico.setbateria("4");
        mySistemaElectrico.setluces(null);
        mySistemaElectrico.setsensores(null);
        System.out.println("bateria: " + mySistemaElectrico.getbateria());
        System.out.println("luces:" + mySistemaElectrico.getluces());
        System.out.println("sensores:" +mySistemaElectrico.getsensores());

        SistemaElectrico momSistemaElectrico = new SistemaElectrico();

        momSistemaElectrico.setbateria("4");
        momSistemaElectrico.setluces(null);
        momSistemaElectrico.setsensores(null);
        System.out.println("bateria: " + momSistemaElectrico.getbateria());
        System.out.println("luces:" + momSistemaElectrico.getluces());
        System.out.println("sensores:" +momSistemaElectrico.getsensores());
        
        SistemaElectrico sisterSistemaElectrico = new SistemaElectrico();

        sisterSistemaElectrico.setbateria("4");
        sisterSistemaElectrico.setluces(null);
        sisterSistemaElectrico.setsensores(null);
        System.out.println("bateria: " + sisterSistemaElectrico.getbateria());
        System.out.println("luces:" + sisterSistemaElectrico.getluces());
        System.out.println("sensores:" +sisterSistemaElectrico.getsensores());

        SistemaElectrico frinSistemaElectrico = new SistemaElectrico();

        frinSistemaElectrico.setbateria("4");
        frinSistemaElectrico.setluces(null);
        frinSistemaElectrico.setsensores(null);
        System.out.println("bateria: " + frinSistemaElectrico.getbateria());
        System.out.println("luces:" + frinSistemaElectrico.getluces());
        System.out.println("sensores:" +frinSistemaElectrico.getsensores());

        Transmision myTransmision =new Transmision();

        myTransmision.settipo("4");
        myTransmision.setmarchas(5);;
        myTransmision.settraccion(null);
        System.out.println("tipo: " + myTransmision.gettipo());
        System.out.println("marchas:" + myTransmision.getmarchas());
        System.out.println("traccion:" +myTransmision.gettraccion());    
    
        Transmision momTransmision =new Transmision();

        momTransmision.settipo("4");
        momTransmision.setmarchas(5);;
        momTransmision.settraccion(null);
        System.out.println("tipo: " + momTransmision.gettipo());
        System.out.println("marchas:" + momTransmision.getmarchas());
        System.out.println("traccion:" +momTransmision.gettraccion()); 

        Transmision sisTransmision =new Transmision();

        sisTransmision.settipo("4");
        sisTransmision.setmarchas(5);;
        sisTransmision.settraccion(null);
        System.out.println("tipo: " + sisTransmision.gettipo());
        System.out.println("marchas:" + sisTransmision.getmarchas());
        System.out.println("traccion:" +sisTransmision.gettraccion()); 

        Transmision frinTransmision =new Transmision();

        frinTransmision.settipo("4");
        frinTransmision.setmarchas(5);;
        frinTransmision.settraccion(null);
        System.out.println("tipo: " + frinTransmision.gettipo());
        System.out.println("marchas:" + frinTransmision.getmarchas());
        System.out.println("traccion:" + frinTransmision.gettraccion()); 
    }
}