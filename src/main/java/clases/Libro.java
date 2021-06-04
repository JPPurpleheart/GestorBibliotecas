package clases;

import java.util.Comparator;

public class Libro implements Comparable<Libro>, Comparator<Libro> {


	private String titulo;
	private String isbn;
	private Genero genero;
	private String autor;
	private Integer paginas;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String isbn, Genero genero, String autor, Integer paginas) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
		this.genero = genero;
		this.autor = autor;
		this.paginas = paginas;
	}

	public Libro(String isbn) {
		super();
		this.isbn = isbn;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the genero
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the paginas
	 */
	public Integer getPaginas() {
		return paginas;
	}

	/**
	 * @param paginas the paginas to set
	 */
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	
	@Override
	public boolean equals(Object libro) {
		Boolean igual;
		if (libro == null) {
			igual = false;
			System.out.println("El Objeto Libro está vacio");
		} else if (!(libro instanceof Libro)) {
			igual = false;
			System.out.println("El Objeto Libro no es un Objeto de tipo Libro.");
		} else if (this == libro) {
			igual = true;
			System.out.println("Los Objetos Libros son iguales ");
		} else {
			Libro l = (Libro) libro;
			igual = isbn.equals(l.isbn);
			System.out.println("El ISBN del Objeto de tipo Libro coincide con el ISBN del Objeto Libro");
		}
		return igual;
	}
	
	@Override
	public int compareTo(Libro l) {
		int resultado=0;
		if (this.titulo==l.titulo) {
			resultado = 0;
			System.out.println("El Titulo del Libro pasado por parametro no cambia de posicion");
		}
	    else {
	    	if (this.titulo.compareTo(l.titulo)<0) {
	    		resultado = -1;
	    		System.out.println("El Titulo del Libro pasado por parametro va antes del Titulo del Objeto Libro que va en esta posicion");
	    	} else {
	    		resultado = 1;
	    		System.out.println("El Titulo del Libro pasado por parametro va despues del Titulo del Objeto Libro que va en esta posicion");
	    	}    	
	    }
	    return resultado;
	}

	@Override
	public int compare(Libro a, Libro b) {
		return a.getPaginas().compareTo(b.getPaginas());
	}
}
