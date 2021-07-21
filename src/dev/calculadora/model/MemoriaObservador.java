package dev.calculadora.model;

@FunctionalInterface
public interface MemoriaObservador {
	public void valorAlterado(String novoValor);
}
