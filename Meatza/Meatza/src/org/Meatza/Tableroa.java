package org.Meatza;

public class Tableroa {
	
	private Gelaxka[][] gelaxkak;

	public Tableroa() {
		this.gelaxkak = new Gelaxka[10][10];
	}

	public void inguruaIreki(int i, int j) {
		if (tableroBarruan(i,j)){
			gelaxkaIreki(i, j);
		}
	}

	public void gelaxkaIreki(int i, int j) {
		// TODO
	}
	
	public void minakJarri() {
		int m = 0;
		int i;
		int j;
		while (m != gelaxkak[0].length){
			i = (int)((double)this.gelaxkak.length*Math.random());
			j = (int)((double)this.gelaxkak[0].length*Math.random());
			if (!(gelaxkak[i] [j] instanceof Mina)){
				gelaxkak[i][j]=new Mina();
				ingurukoeiBatGehitu(i, j);
				m ++;
			}
		}
	}
	
	private void ingurukoeiBatGehitu(int i, int j){
		gelaxkariBatGehitu(i-1,j-1);
		gelaxkariBatGehitu(i,j-1);
		gelaxkariBatGehitu(i+1,j-1);
		gelaxkariBatGehitu(i-1,j);
		gelaxkariBatGehitu(i+1,j);
		gelaxkariBatGehitu(i-1,j+1);
		gelaxkariBatGehitu(i,j+1);
		gelaxkariBatGehitu(i+1,j+1);
	}
	
	private void gelaxkariBatGehitu(int i, int j){
		if (tableroBarruan(i, j) && !(gelaxkak[i][j] instanceof Mina)){
			if (gelaxkak[i][j] == null){
				gelaxkak[i][j] =new Zenbakia();
			}
			else {
				Zenbakia a = (Zenbakia)gelaxkak[i][j];
				a.zenbakiaGehitu();
			}
		}
	}
	
	public void zeroakJarri() {
		int i = 0;
		while (tableroBarruan(i,0)){
			int j = 0;
			while(tableroBarruan(i,j)){
				if (gelaxkak[i][j] == null){
					gelaxkak[i][j]=new Zero(i, j);
				}
				j++;
			}
			i++;
		}
	}
	
	private boolean tableroBarruan(int i, int j){
		if (((i>=0)&&(i<gelaxkak.length))&&((j>=0)&&(j<gelaxkak[0].length))){
			return true;
		}
		else{
			return false;
		}
	}
	
}
