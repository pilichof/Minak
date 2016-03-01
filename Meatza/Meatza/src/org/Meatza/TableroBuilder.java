package org.Meatza;

public class TableroBuilder {

	private Tableroa tableroa;

	public TableroBuilder() {
	}

	private void minakJarri() {
		tableroa.minakJarri();	}

	private void zeroakJarri() {
		tableroa.zeroakJarri();	}

	public void tableroaSortu() {
		tableroa = new Tableroa();
		minakJarri();
		zeroakJarri();
	}
	
	public Tableroa getTablero(){
		return tableroa;
	}

}
