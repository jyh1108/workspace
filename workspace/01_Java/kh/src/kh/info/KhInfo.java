package kh.info;

import java.util.Objects;

public class KhInfo {
	
	private String name;
	private int hp;
	private int stamina;
	
	public void hp1() {
		if(hp==5) {
			System.out.println("♥ ♥ ♥ ♥ ♥");
		}else if(hp==4) {
			System.out.println("♥ ♥ ♥ ♥ ♡");
		}else if(hp==3) {
			System.out.println("♥ ♥ ♥ ♡ ♡");
		}else if(hp==2) {
			System.out.println("♥ ♥ ♡ ♡ ♡");
		}else if(hp==1) {
			System.out.println("♥ ♡ ♡ ♡ ♡");
		}else if(hp==0) {
			System.out.println("♡ ♡ ♡ ♡ ♡");
		}
	}
	public KhInfo() {}

	public KhInfo(String name, int hp, int stamina) {
		super();
		this.name = name;
		this.hp = hp;
		this.stamina = stamina;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "KhInfo [name=" + name + ", hp=" + hp +", stamina=" + stamina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hp, name, stamina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhInfo other = (KhInfo) obj;
		return hp == other.hp && Objects.equals(name, other.name)&& stamina == other.stamina;
	}


}
