package frq;

public class Payroll {
  private int[] itemsSold; // number of items sold by each employee
  private double[] wages; // wages to be computed in part (b)

  /*
   * Creates a Payroll object
   * 
   * PRECONDITIONS: items != null, items.length >= 3
   */
  public Payroll(int[] items) {
    itemsSold = items;
    wages = new double[items.length];
  }

  public double[] getWages() {
    return wages;
  }

  /*
   * Returns the bonus threshold as described in part (a).
   */
  public double computeBonusThreshold() {
    int leastSales = itemsSold[0];
    int mostSales = itemsSold[0];
    int totalSales = 0;
    for (int sales : itemsSold) {
      if (sales < leastSales) {
        leastSales = sales;
      }
      if (sales > mostSales) {
        mostSales = sales;
      }
      totalSales += sales;
    }
    totalSales -= leastSales + mostSales;
    return (double) totalSales / (itemsSold.length - 2);
  }

  /*
   * Computes employee wages as described in part (b) and stores
   * them in wages. The parameter fixedWage represents the fixed
   * amount each employee is paid per day. The parameter
   * perItemWage represents the amount each employee is paid per
   * item sold.
   */
  public void computeWages(double fixedWage, double perItemWage) {
    double bonusThreshold = computeBonusThreshold();
    for (int i = 0; i < wages.length; i++) {
      double wage = fixedWage;
      wage += itemsSold[i] * perItemWage;
      if (itemsSold[i] > bonusThreshold) {
        wage *= 1.1;
      }
      wages[i] = wage;
    }
  }
}