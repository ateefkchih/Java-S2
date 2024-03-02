package metier;

public class ImcMetierImpl implements IImcMetier {
	@Override
	public double calculerImc(int poids, double taille)
	{
		double imc= poids/(taille*taille);
		return imc;
	}
}

