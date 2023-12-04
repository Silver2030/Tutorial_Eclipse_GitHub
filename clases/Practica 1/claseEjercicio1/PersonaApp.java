package claseEjercicio1;

public class PersonaApp {

        public static void main(String[] args) {
        	Persona persona1=new Persona("Maria Jose","Menendez Alvarez", 19);
        	Persona persona2=new Persona("Alberto","Sanchez Rodriguez", 23);
        	if(persona1.getEdad()>persona2.getEdad()) {
        		System.out.println(persona1.toString() + " tiene " + persona1.getEdad() + " años");
        		System.out.println(persona2.toString());
        	}else {
        		System.out.println(persona2.toString() + " tiene " + persona2.getEdad() + " años");
        		System.out.println(persona1.toString());
        	}
        }

	}