package br.com.fiap.pattern.reportprinter.interfaces;

import br.com.fiap.pattern.reportprinter.State;

public interface IStateDAO {

	public void insert(State state);
	public State update(State state);
	public void delete(State state);
}