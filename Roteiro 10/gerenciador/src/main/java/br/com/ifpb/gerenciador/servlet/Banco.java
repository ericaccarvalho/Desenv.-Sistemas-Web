package br.com.ifpb.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Banco {
	
	public static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		Empresa emp1 = new Empresa();
		emp1.setNome("IFPB");
		emp1.setCnpj("01.234.567/0001-10");
		emp1.setDataAbertura(Calendar.getInstance().getTime());
		
		Empresa emp2 = new Empresa();
		emp2.setNome("Apple");
		emp2.setCnpj("01.567.899/0001-10");
		emp2.setDataAbertura(Calendar.getInstance().getTime());
		
		Empresa emp3 = new Empresa();
		emp3.setNome("Google");
		emp3.setCnpj("01.891.011/0001-10");
		emp3.setDataAbertura(Calendar.getInstance().getTime());
		
		lista.add(emp1);
		lista.add(emp2);
		lista.add(emp3);
	}
	
	public void adiciona(Empresa emp) {
		lista.add(emp);
		
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
