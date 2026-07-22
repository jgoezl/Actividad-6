package actividad6.pkg2;

public class ArticuloCientifico {
    public String titulo;
    public String autor;
    public String[] palabrasClaves = new String[3];
    public String publicacion;
    public int año;
    public String resumen;

    public ArticuloCientifico(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public ArticuloCientifico(String titulo, String autor, String[] palabrasClaves, String publicacion, int año) {
        this(titulo, autor);
        this.palabrasClaves = palabrasClaves;
        this.publicacion = publicacion;
        this.año = año;
    }

    public ArticuloCientifico(String titulo, String autor, String[] palabrasClaves, String publicacion, int año, String resumen) {
        this(titulo, autor, palabrasClaves, publicacion, año);
        this.resumen = resumen;
    }
    
    public void imprimir() {
    System.out.println("Título del artículo = " + titulo);
    System.out.println("Autor del artículo = " + autor);
    System.out.println("Palabras clave = ");
   
        for (int i = 0; i < palabrasClaves.length; i=i+1) {
        System.out.println(palabrasClaves[i]);
        }
    System.out.println("Publicación = " + publicacion);
    System.out.println("Año = " + año);
    System.out.println("Resumen = " + resumen);
    
    
    }
    public void espacio(){
        System.out.println("==============");
        System.out.println("\n");
    }
}
