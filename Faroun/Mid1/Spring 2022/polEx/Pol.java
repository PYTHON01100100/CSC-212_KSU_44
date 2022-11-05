package polEx;

public interface Pol
{
	int getHighestDeg();
	double getCoef(int d);
	void set(int d, double c);
	void remove(int d);
}