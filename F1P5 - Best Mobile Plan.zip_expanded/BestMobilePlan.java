import java.util.*;

class BestMobilePlan {
	int day, eve, night;

	BestMobilePlan() {
	};

	BestMobilePlan(int a, int b, int c) {
		this.day = a;
		this.eve = b;
		this.night = c;
	}

	private double plan_A() {
		double sum = 0;
		if (day > 100) {
			sum += (day - 100) * 25;
		}
		sum += eve * 15;
		sum += night * 20;
		return sum / 100;
	}

	private double plan_B() {
		double sum = 0;
		if (day > 250) {
			sum += (day - 250) * 45;
		}
		sum += eve * 35;
		sum += night * 25;
		return sum / 100;
	}

	void printPlanDetails() {
		double A = plan_A();
		double B = plan_B();
		System.out.printf("Plan A costs %.2f \n", A);
		System.out.printf("Plan B costs %.2f \n", B);
		if (A > B) {
			System.out.println("Plan B is cheapest");
		} else if (A == B) {
			System.out.println("Plan A and B are the same price");
		} else {
			System.out.println("Plan B is cheapest");
		}
	}
}