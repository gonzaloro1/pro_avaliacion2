package compilador201_202;

import misClases.avaliacion2.CDameDato;

public class compi201 {

	public static void main(String[] args) {
		CDameDato dato = new CDameDato();
		int numero;
	
		numero = dato.dameOpcion();
		while (numero != 4) {
			switch (numero) {
			case 1:
				dato.recolleInt(); 
				dato.amosaInt();
				break;
			case 2:
				dato.recolleFloat();
				dato.amosaFloat();
				break;
			case 3:
				dato.recolleString();
				dato.amosaString();
				break;
			default:
				System.out.println("OPCION  Erronea");
				break;
			}
			numero = dato.dameOpcion();
		}
		System.out.println("FINAL");
	}
}
