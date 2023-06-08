/*
 * Universidad Politecnica de San Luis Potosi
 * Programación III
 * Programación Orientada a Objetos
 */
package s03p01clasestring;

/**
 * @author Saul Cervantes Candia
 */
public class S03P01ClaseString {

    public static void main(String[] args) {
        String a = "Hola Mundo :|";
        String b = new String("Universidad Politecnica");
        
        //1. charAt -> Devuelve el caracter de el indice especificado
        System.out.println("1.- charAt");
        char c = a.charAt(2);
        System.out.println("El caracter es: "+c+"\n");
        
        //2. compareTo -> Devuelve un entero para comparar las cadenas
        System.out.println("2.- compareTo");
        int x = a.compareTo("hola Mundo :)");
        System.out.println("El resultado es: "+x+"\n");
        
        //3. compareToIgnoreCase -> Compara las cadenas ignorar las case diferencia
        System.out.println("3.- compareToIgnoreCase");
        x = a.compareToIgnoreCase("HoLa MuNdO :)");
        System.out.println("El resultado de: "+x+"\n");
        
        //4. contains -> Devuelve un boolean si la "subString" está en la cadena
        System.out.println("4.- contains");
        boolean d = a.contains("undo");
        System.out.println("Resultado de busqueda: "+d+"\n");
        
        //5. toLowerCase -> Convierte todos los caracteres de la cadena en minúsculas
        System.out.println("5.- toLowerCase");
        String e = a.toLowerCase();
        System.out.println("El resultado es: "+e+"\n");
        
        //Completar hasta 15 metodos diferentes
        System.out.println("6.- endsWith");
        boolean f = b.endsWith("nica");
        System.out.println("El resultado es: "+f+"\n");
        
        System.out.println("7.- toUpperCase");
        String g = a.toUpperCase();
        System.out.println("El resultado es: "+g+"\n");
        
        System.out.println("8.- replaceAll");
        String h = a.replaceAll("Mundo", "Persona");
        System.out.println("El resultado es: "+h+"\n");
        
        System.out.println("9.- length");
        int i = b.length();
        System.out.println("El resultado es: "+i+"\n");
        
        System.out.println("10.- startsWith");
        boolean j = b.startsWith("Uni");
        System.out.println("El resultado es: "+j+"\n");
        
        System.out.println("11.- intern");
        String k = b.intern();
        System.out.println("El resultado es: "+k+"\n");
        
        System.out.println("12.- substring");
        String l = b.substring(3);
        System.out.println("El resultado es: "+l+"\n");
        
        System.out.println("13.- matches");
        boolean m = a.matches("Hola Mundo :|");
        System.out.println("El resultado es: "+m+"\n");
        
        System.out.println("14.- replace");
        String n = b.replace("i", "a");
        System.out.println("El resultado es: "+n+"\n");
        
        System.out.println("15.- subSequence");
        CharSequence o = a.subSequence(2, 8);
        System.out.println("El resultado es: "+o+"\n");
        
        System.out.println("16.- toString");
        String p = b.toString();
        System.out.println("El resultado es: "+p+"\n");
        
        System.out.println("17.- trim");
        String q = a.trim();
        System.out.println("El resultado es: "+q+"\n");
        
        System.out.println("18.- codePointAt");
        int r = a.codePointAt(1);
        System.out.println("El resultado es: "+r+"\n");
        
        System.out.println("19.- codePointBefore");
        int s = b.codePointBefore(5);
        System.out.println("El resultado es: "+s+"\n");
        
        System.out.println("20.- codePointCount");
        int t = b.codePointCount(2, 10);
        System.out.println("El resultado es: "+t+"\n");
    }
    
}
