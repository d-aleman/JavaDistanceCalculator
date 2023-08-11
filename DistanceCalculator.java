import java.io.*;

public class DistanceCalculator {

	private double speed; // speed (mph)
	private double time;  // time (min)

	public DistanceCalculator() {
		this.speed = 0;
		this.time = 0;
	}

	public void getUserInput() throws NumberFormatException, IOException {
		this.speed = this.getDouble("Enter a speed (miles/hour): ");
		this.time = this.getDouble("Enter a time traveled (minutes): ");
	}

	public void printDistance() {
		System.out.format("The distance traveled is %.3f miles.\n", this.calcDist());
	}
	
	public double calcDist() {
		return this.speed * this.time / 60.0;
	}

    // get a double from the user: no error handling
    public double getDouble(String prompt) throws NumberFormatException, IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(prompt);
        double x = Double.parseDouble(cin.readLine());

        return x;
    } // end of getDouble()
	
} // end DistanceCalculator class
