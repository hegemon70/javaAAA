 package Concurrency;
 class NoUnidadesException extends Exception
 {
 private final String NO_UNIDADES_MESSAGE = "El Almac�n No Dispone de M�s Unidades";

 public String getMessage()
 {
	 	return this.NO_UNIDADES_MESSAGE;
 }
}
