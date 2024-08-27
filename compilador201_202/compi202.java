package compilador201_202;

import misClases.avaliacion2.CDameDato;

class compi202 {

	public static void main(String[] args) {
		CDameDato dato = new CDameDato();
		int numero;

		do {
			numero = dato.dameOpcion();
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
			case 4:
				System.out.println("FINAL");
				break;
			default:
				System.out.println("OPCION   Erronea");
				break;
			}
		} while (numero != 4);

	}
}
