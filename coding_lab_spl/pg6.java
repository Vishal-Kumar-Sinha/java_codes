interface Cable {
	public String materialType();
}
class CoaxialCable implements Cable {
	public String materialType() {
		return "material :: copper";
	}
}
class FibreOpticCable implements Cable {
	public String materialType() {
		return "material :: glass";
	}
}
class pg6 {
	public static void main(String[] args) {
		Cable c1=new CoaxialCable();
		System.out.println(c1.materialType());
		Cable c2=new FibreOpticCable();
		System.out.println(c2.materialType());
	}
}