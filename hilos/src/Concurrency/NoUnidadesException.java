 package Concurrency;
 class NoUnidadesException extends Exception
 {
 private final String NO_UNIDADES_MESSAGE = "El Almacén No Dispone de Más Unidades";

 public String getMessage()
 {
	 	return this.NO_UNIDADES_MESSAGE;
 }
}
