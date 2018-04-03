# Examen
package MesPetitExamen;

/**
 * @author JMNavarro
 *
 */
public class MesPetitExamen {
	
	public static int NumMesGran(int llista[]) 
	{
		
		int index, min = Integer.MAX_VALUE;
		for (index = 0; index <= llista.length; index++) 
		{
			if (llista[index] < min)//Si enl nombre de l'array és menor que minim.
			{
				min = llista[index];//minim és igual a el nombre menor de l'array
			}
		}
		return min;
	}
}
